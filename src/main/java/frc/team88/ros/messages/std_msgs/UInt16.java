// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class UInt16 extends frc.team88.ros.messages.RosMessage {

    private short data = 0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/UInt16";

    public UInt16() {

    }

    public UInt16(short data) {
        this.data = data;
    }

    public UInt16(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsShort();
    }

    public short getData() {
        return this.data;
    }

    public void setData(short data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
