import re
from importlib import import_module
from typing import Dict
from .constants import ROS_TO_JAVA_PRIMITIVE_MAPPING, RosPrimitive
from .java_class_spec import JavaClassSpec, JavaTimeSpec, JavaDurationSpec


def get_msg_class(cache, msg_type_name: str):
    if msg_type_name not in cache:
        connection_header = msg_type_name.split("/")
        ros_pkg = connection_header[0] + ".msg"
        msg_type = connection_header[1]
        msg_class = getattr(import_module(ros_pkg), msg_type)
        cache[msg_type_name] = msg_class
    return cache[msg_type_name]


def is_msg_type_list(msg_type_name: str) -> bool:
    return msg_type_name.endswith("]")


def get_list_size(msg_type_name: str) -> int:
    pattern = r"^.+\[(\d+)\]"
    match = re.search(pattern, msg_type_name)
    if match is None:
        return 0
    else:
        return int(match.group(1))


def get_list_type(msg_type_name: str) -> str:
    if is_msg_type_list(msg_type_name):
        index = msg_type_name.rfind("[")
        return msg_type_name[:index]
    else:
        return msg_type_name


MSG_CLASS_CACHE = {}


def get_message_constants(msg_instance):
    slots = set(msg_instance.__slots__)
    props = set()
    for name, value in vars(msg_instance.__class__).items():
        if name.startswith("_"):
            continue
        if callable(value):
            continue
        props.add(name)
    constants = props.difference(slots)
    constants_map = {}
    for name in constants:
        constants_map[name] = getattr(msg_instance, name)
    return constants_map


def java_class_spec_generator(class_spec: JavaClassSpec, msg_instance):
    for name, data_type in zip(msg_instance.__slots__, msg_instance._slot_types):
        if is_msg_type_list(data_type):
            size = get_list_size(data_type)
            data_type = get_list_type(data_type)
        else:
            size = -1

        try:
            data_primitive = RosPrimitive(data_type)
        except ValueError:
            data_primitive = None
        value = getattr(msg_instance, name)
        if data_primitive is None:
            msg_class = get_msg_class(MSG_CLASS_CACHE, data_type)
            sub_class_spec = class_spec.add_sub_msg(name, data_type, size)
            java_class_spec_generator(sub_class_spec, msg_class())
        elif data_primitive == RosPrimitive.time:
            class_spec.add_sub_spec(name, JavaTimeSpec())
        elif data_primitive == RosPrimitive.duration:
            class_spec.add_sub_spec(name, JavaDurationSpec())
        else:
            class_spec.add_field(
                name, value, ROS_TO_JAVA_PRIMITIVE_MAPPING[data_primitive], size
            )
    for name, value in get_message_constants(msg_instance).items():
        class_spec.add_constant(name, value)


def filter_unique_objects(
    unique_objects: Dict[str, JavaClassSpec], class_spec: JavaClassSpec
):
    if class_spec.msg_type in unique_objects:
        assert unique_objects[class_spec.msg_type] == class_spec, (
            "Found class specs that don't match: %s != %s"
            % (unique_objects[class_spec.msg_type], class_spec)
        )
    else:
        unique_objects[class_spec.msg_type] = class_spec
    for field in class_spec.fields.values():
        if type(field) == JavaClassSpec:
            filter_unique_objects(unique_objects, field)
