

from enum import Enum
from typing import Union


class JavaPrimitive(Enum):
    boolean = "boolean"
    byte = "byte"
    char = "char"
    short = "short"
    int = "int"
    long = "long"
    float = "float"
    double = "double"
    String = "String"


class RosPrimitive(Enum):
    bool = "bool"
    int8 = "int8"
    uint8 = "uint8"
    int16 = "int16"
    uint16 = "uint16"
    int32 = "int32"
    uint32 = "uint32"
    int64 = "int64"
    uint64 = "uint64"
    float32 = "float32"
    float64 = "float64"
    string = "string"
    time = "time"
    duration = "duration"


PythonPrimitive = Union[bool, bytes, int, float, str]

ROS_TO_JAVA_PRIMITIVE_MAPPING = {
    RosPrimitive.bool: JavaPrimitive.boolean,
    RosPrimitive.int8: JavaPrimitive.byte,
    RosPrimitive.uint8: JavaPrimitive.char,
    RosPrimitive.int16: JavaPrimitive.short,
    RosPrimitive.uint16: JavaPrimitive.short,
    RosPrimitive.int32: JavaPrimitive.int,
    RosPrimitive.uint32: JavaPrimitive.int,
    RosPrimitive.int64: JavaPrimitive.long,
    RosPrimitive.uint64: JavaPrimitive.long,
    RosPrimitive.float32: JavaPrimitive.float,
    RosPrimitive.float64: JavaPrimitive.double,
    RosPrimitive.string: JavaPrimitive.String,
    RosPrimitive.time: JavaPrimitive.long,
    RosPrimitive.duration: JavaPrimitive.long,
}
PYTHON_TO_JAVA_PRIMITIVE_MAPPING = {
    bool: JavaPrimitive.boolean,
    int: JavaPrimitive.int,
    float: JavaPrimitive.double,
    str: JavaPrimitive.String,
    # this may be a problem if there are constants defined with bytes
    bytes: JavaPrimitive.String,
}
PRIMITIVE_DEFAULTS = {
    JavaPrimitive.boolean: "false",
    JavaPrimitive.byte: "0",
    JavaPrimitive.char: "''",
    JavaPrimitive.short: "0",
    JavaPrimitive.int: "0",
    JavaPrimitive.long: "0",
    JavaPrimitive.float: "0.0f",
    JavaPrimitive.double: "0.0",
    JavaPrimitive.String: "\"\"",
}

PRIMITIVE_TO_JAVA_OBJECT = {
    JavaPrimitive.boolean: "Boolean",
    JavaPrimitive.byte: "Byte",
    JavaPrimitive.char: "Char",
    JavaPrimitive.short: "Short",
    JavaPrimitive.int: "Int",
    JavaPrimitive.long: "Long",
    JavaPrimitive.float: "Float",
    JavaPrimitive.double: "Double",
    JavaPrimitive.String: "String",
}
JAVA_OBJECT_TO_PRIMITIVE = {v: k for k, v in PRIMITIVE_TO_JAVA_OBJECT.items()}
PRIMITIVE_JSON_FUNCTIONS = {
    JavaPrimitive.boolean: "{obj}.getAsBoolean()",
    JavaPrimitive.byte: "{obj}.getAsByte()",
    JavaPrimitive.char: "(char){obj}.getAsByte()",
    JavaPrimitive.short: "{obj}.getAsShort()",
    JavaPrimitive.int: "{obj}.getAsInt()",
    JavaPrimitive.long: "{obj}.getAsLong()",
    JavaPrimitive.float: "{obj}.getAsFloat()",
    JavaPrimitive.double: "{obj}.getAsDouble()",
    JavaPrimitive.String: "{obj}.getAsString()",
}
