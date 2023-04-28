// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class PointField extends frc.team88.ros.messages.RosMessage {
    public static int INT8 = 1;
    public static int UINT8 = 2;
    public static int INT16 = 3;
    public static int UINT16 = 4;
    public static int INT32 = 5;
    public static int UINT32 = 6;
    public static int FLOAT32 = 7;
    public static int FLOAT64 = 8;

    private java.lang.String name = "";
    private int offset = 0;
    private char datatype = 0;
    private int count = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/PointField";

    public PointField() {

    }

    public PointField(java.lang.String name, int offset, char datatype, int count) {
        this.name = name;
        this.offset = offset;
        this.datatype = datatype;
        this.count = count;
    }

    public PointField(JsonObject jsonObj) {
        this.name = jsonObj.get("name").getAsString();
        this.offset = jsonObj.get("offset").getAsInt();
        this.datatype = (char)jsonObj.get("datatype").getAsByte();
        this.count = jsonObj.get("count").getAsInt();
    }

    public java.lang.String getName() {
        return this.name;
    }
    public int getOffset() {
        return this.offset;
    }
    public char getDatatype() {
        return this.datatype;
    }
    public int getCount() {
        return this.count;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    public void setOffset(int offset) {
        this.offset = offset;
    }
    public void setDatatype(char datatype) {
        this.datatype = datatype;
    }
    public void setCount(int count) {
        this.count = count;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
