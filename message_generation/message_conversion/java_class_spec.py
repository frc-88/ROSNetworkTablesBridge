from dataclasses import dataclass
from typing import Dict, Union

from .constants import JavaPrimitive, PythonPrimitive


@dataclass
class JavaMessageField:
    value: PythonPrimitive
    msg_type: JavaPrimitive
    size: int


class JavaClassSpec:
    def __init__(self, msg_type_name: str, size=-1) -> None:
        self.fields: Dict[str, Union[JavaMessageField, JavaClassSpec]] = {}
        self.constants: Dict[str, PythonPrimitive] = {}
        self.msg_type = msg_type_name
        self.size = size
        # -1 = not a list
        # 0 = variable list
        # >0 = fixed size list

    def add_constant(self, name: str, value: PythonPrimitive) -> None:
        self.constants[name] = value

    def add_field(
        self, name: str, value: PythonPrimitive, msg_type: JavaPrimitive, size=-1
    ) -> None:
        self.fields[name] = JavaMessageField(value, msg_type, size)

    def add_sub_msg(self, name: str, msg_type_name: str, size=-1) -> "JavaClassSpec":
        spec = JavaClassSpec(msg_type_name, size)
        self.add_sub_spec(name, spec)
        return spec

    def add_sub_spec(self, name: str, spec: "JavaClassSpec"):
        self.fields[name] = spec

    def _to_str(self, indent=0) -> str:
        indent += 1
        field_indent_str = "    " * (indent)
        string = f"{self.msg_type}:\n"
        for name, value in self.fields.items():
            if type(value) == JavaMessageField:
                string += f"{field_indent_str}{name}: {value}\n"
            elif isinstance(value, JavaClassSpec):
                string += f"{field_indent_str}{name} {value._to_str(indent)}"
            else:
                raise ValueError(f"Invalid object found in fields: {value}")
        return string

    def __eq__(self, __value: object) -> bool:
        if type(__value) == JavaClassSpec:
            if self.fields.keys() != __value.fields.keys():
                return False
            for name, field in self.fields.items():
                other_field = __value.fields[name]
                if type(field) != type(other_field):
                    return False
                if type(field) == JavaMessageField and (
                    field.value != other_field.value
                    or field.msg_type != other_field.msg_type
                ):  # type: ignore
                    return False
                elif type(field) == JavaClassSpec and field != other_field:
                    return False
            return True
        else:
            return False

    def __repr__(self) -> str:
        return self._to_str()


class JavaTimeSpec(JavaClassSpec):
    def __init__(self) -> None:
        super().__init__("Time", -1)

        self.add_field("secs", 0, JavaPrimitive.int, -1)
        self.add_field("nsecs", 0, JavaPrimitive.int, -1)


class JavaDurationSpec(JavaClassSpec):
    def __init__(self) -> None:
        super().__init__("Duration", -1)

        self.add_field("secs", 0, JavaPrimitive.int, -1)
        self.add_field("nsecs", 0, JavaPrimitive.int, -1)
