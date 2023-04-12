import re
from dataclasses import dataclass
from typing import Iterable
from .constants import (
    JAVA_OBJECT_TO_PRIMITIVE,
    PRIMITIVE_DEFAULTS,
    PRIMITIVE_JSON_FUNCTIONS,
    PRIMITIVE_TO_JAVA_OBJECT,
    PYTHON_TO_JAVA_PRIMITIVE_MAPPING,
    JavaPrimitive,
)
from .java_class_spec import (
    JavaClassSpec,
    JavaDurationSpec,
    JavaMessageField,
    JavaTimeSpec,
)


def camel_case(s):
    s = re.sub(r"(_|-)+", " ", s).title().replace(" ", "")
    return "".join([s[0].lower(), s[1:]])


@dataclass
class GeneratedCodeArtifacts:
    fields_code: str
    arg: str
    arg_assignment: str
    getter: str
    setter: str
    json_constructor: str


def get_full_type(package_root: str, field: JavaClassSpec) -> str:
    field_java_type = field.msg_type.replace("/", ".")
    full_type = f"{package_root}{field_java_type}"
    return full_type


def getter_template(full_type: str, name: str) -> str:
    return f"""    public {full_type} {camel_case('get_' + name)}() {{
        return this.{name};
    }}
"""


def setter_template(full_type: str, name: str) -> str:
    return f"""    public void {camel_case('set_' + name)}({full_type} {name}) {{
        this.{name} = {name};
    }}
"""


def generate_code_from_field(
    imports: set, package_root: str, name: str, field: JavaMessageField
) -> GeneratedCodeArtifacts:
    field_java_type = field.msg_type.value
    fields_code = f"    private {field_java_type} {name} = {PRIMITIVE_DEFAULTS[field.msg_type]};\n"
    arg = f"{field_java_type} {name}"
    arg_assignment = f"        this.{name} = {name};\n"
    getter = getter_template(field_java_type, name)
    setter = setter_template(field_java_type, name)

    json_parse = PRIMITIVE_JSON_FUNCTIONS[field.msg_type].format(
        obj=f'jsonObj.get("{name}")'
    )
    json_constructor = f"        this.{name} = {json_parse};\n"

    return GeneratedCodeArtifacts(
        fields_code=fields_code,
        arg=arg,
        arg_assignment=arg_assignment,
        getter=getter,
        setter=setter,
        json_constructor=json_constructor,
    )


def generate_code_from_arraylist_type(
    imports: set, name: str, full_type: str
) -> GeneratedCodeArtifacts:
    imports.add("import java.util.ArrayList;")
    imports.add("import java.util.Arrays;")
    imports.add("import com.google.gson.JsonElement;")

    array_type = f"ArrayList<{full_type}>"
    if full_type in JAVA_OBJECT_TO_PRIMITIVE:
        primitive = JavaPrimitive(JAVA_OBJECT_TO_PRIMITIVE[full_type].value)
        new_from_json_code = PRIMITIVE_JSON_FUNCTIONS[primitive]
    else:
        new_from_json_code = f"new {full_type}({{obj}}.getAsJsonObject())"

    fields_code = f"    private {array_type} {name} = new ArrayList<>();\n"
    arg = f"{full_type}[] {name}"
    arg_assignment = f"        this.{name} = new ArrayList<>(Arrays.asList({name}));\n"
    getter = getter_template(array_type, name)
    setter = setter_template(array_type, name)

    json_constructor = f"""        for (JsonElement {name}_element : jsonObj.getAsJsonArray("{name}")) {{
            this.{name}.add({new_from_json_code.format(obj=f"{name}_element")});
        }}
"""

    return GeneratedCodeArtifacts(
        fields_code=fields_code,
        arg=arg,
        arg_assignment=arg_assignment,
        getter=getter,
        setter=setter,
        json_constructor=json_constructor,
    )


def generate_code_from_static_array_type(
    imports: set, name: str, full_type: str, size: int
) -> GeneratedCodeArtifacts:
    imports.add("import com.google.gson.JsonElement;")
    static_array_values = ""
    if full_type in JAVA_OBJECT_TO_PRIMITIVE:
        primitive = JavaPrimitive(JAVA_OBJECT_TO_PRIMITIVE[full_type].value)
        value = PRIMITIVE_DEFAULTS[primitive]
        new_value_code = str(value)
        new_from_json_code = PRIMITIVE_JSON_FUNCTIONS[primitive]
    else:
        new_value_code = f"new {full_type}()"
        new_from_json_code = f"new {full_type}({{obj}}.getAsJsonObject())"

    for index in range(size):
        static_array_values += f"\n        {new_value_code},"
    static_array_values = static_array_values[:-1] + "\n    "

    array_type = f"{full_type}[]"

    fields_code = f"    private {array_type} {name} = new {array_type} {{{static_array_values}}};\n"
    arg = f"{array_type} {name}"
    arg_assignment = f"""        for (int index = 0; index < {size}; index++) {{
            this.{name}[index] = {name}[index];
        }}
"""
    getter = getter_template(array_type, name)
    setter = setter_template(array_type, name)

    json_constructor = f"""        int {name}_element_index = 0;
        for (JsonElement {name}_element : jsonObj.getAsJsonArray("{name}")) {{
            this.{name}[{name}_element_index] = {new_from_json_code.format(obj=f"{name}_element")};
        }}
"""

    return GeneratedCodeArtifacts(
        fields_code=fields_code,
        arg=arg,
        arg_assignment=arg_assignment,
        getter=getter,
        setter=setter,
        json_constructor=json_constructor,
    )


def generate_code_from_field_variable_list(
    imports: set, package_root: str, name: str, field: JavaMessageField
) -> GeneratedCodeArtifacts:
    return generate_code_from_arraylist_type(
        imports, name, PRIMITIVE_TO_JAVA_OBJECT[field.msg_type]
    )


def generate_code_from_field_static_list(
    imports: set, package_root: str, name: str, field: JavaMessageField
) -> GeneratedCodeArtifacts:
    return generate_code_from_static_array_type(
        imports, name, PRIMITIVE_TO_JAVA_OBJECT[field.msg_type], field.size
    )


def generate_code_from_spec_sub_msg(
    imports: set, package_root: str, name: str, field: JavaClassSpec
) -> GeneratedCodeArtifacts:
    full_type = get_full_type(package_root, field)
    fields_code = f"    private {full_type} {name} = new {full_type}();\n"
    arg = f"{full_type} {name}"
    arg_assignment = f"        this.{name} = {name};\n"
    getter = getter_template(full_type, name)
    setter = setter_template(full_type, name)
    json_constructor = f'        this.{name} = new {full_type}(jsonObj.get("{name}").getAsJsonObject());\n'

    return GeneratedCodeArtifacts(
        fields_code=fields_code,
        arg=arg,
        arg_assignment=arg_assignment,
        getter=getter,
        setter=setter,
        json_constructor=json_constructor,
    )


def generate_code_from_spec_variable_list(
    imports: set, package_root: str, name: str, field: JavaClassSpec
) -> GeneratedCodeArtifacts:
    return generate_code_from_arraylist_type(
        imports, name, get_full_type(package_root, field)
    )


def generate_code_from_spec_static_list(
    imports: set, package_root: str, name: str, field: JavaClassSpec
) -> GeneratedCodeArtifacts:
    return generate_code_from_static_array_type(
        imports, name, get_full_type(package_root, field), field.size
    )


def get_package_root(path: str) -> str:
    package_root = path.replace("/", ".")
    if len(package_root) > 0:
        package_root += "."
    return package_root


def generate_java_code_from_spec(path: str, spec: JavaClassSpec):
    package_name, class_name = spec.msg_type.split("/")
    package_root = get_package_root(path)

    arg_strings = []
    imports = set()

    fields_code = ""
    args = ""
    arg_assignment = ""
    getters = ""
    setters = ""
    json_constructor = ""
    for name, field in spec.fields.items():
        if type(field) == JavaMessageField:
            if field.size == -1:
                results = generate_code_from_field(imports, package_root, name, field)
            elif field.size == 0:
                results = generate_code_from_field_variable_list(
                    imports, package_root, name, field
                )
            else:
                results = generate_code_from_field_static_list(
                    imports, package_root, name, field
                )
        elif isinstance(field, JavaClassSpec):
            if field.size == -1:
                results = generate_code_from_spec_sub_msg(
                    imports, package_root, name, field
                )
            elif field.size == 0:
                results = generate_code_from_spec_variable_list(
                    imports, package_root, name, field
                )
            else:
                results = generate_code_from_spec_static_list(
                    imports, package_root, name, field
                )
        else:
            raise ValueError(f"Invalid object found in fields: {field}")

        fields_code += results.fields_code
        arg_strings.append(results.arg)
        arg_assignment += results.arg_assignment
        getters += results.getter
        setters += results.setter
        json_constructor += results.json_constructor

    constants_code = ""
    for name, value in spec.constants.items():
        java_type = PYTHON_TO_JAVA_PRIMITIVE_MAPPING[type(value)]
        constants_code += f"    public static {java_type.value} {name} = {value};\n"

    args = ", ".join(arg_strings)
    arg_assignment = arg_assignment[:-1]
    json_constructor = json_constructor[:-1]

    imports.add("import com.google.gson.JsonObject;")
    imports.add("import com.google.gson.annotations.Expose;")

    import_code = "\n".join(imports)

    code = f"""// Auto generated!! Do not modify.
package {package_root}{package_name};

{import_code}

public class {class_name} extends {package_root}RosMessage {{
{constants_code}
{fields_code}
    @Expose(serialize = false, deserialize = false)
    public final String _type = "{spec.msg_type}";

    public {class_name}() {{

    }}

    public {class_name}({args}) {{
{arg_assignment}
    }}

    public {class_name}(JsonObject jsonObj) {{
{json_constructor}
    }}

{getters}
{setters}
    public JsonObject toJSON() {{
        return ginst.toJsonTree(this).getAsJsonObject();
    }}

    public String toString() {{
        return ginst.toJson(this);
    }}
}}
"""

    path = f"{package_name}/{class_name}.java"

    return path, code
