// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RosInt16 extends frc.team88.ros.messages.RosMessage {

    private short data = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Int16";

    public RosInt16() {

    }

    public RosInt16(short data) {
        this.data = data;
    }

    public RosInt16(JsonObject jsonObj) {
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

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
