// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RosInt8 extends frc.team88.ros.messages.RosMessage {

    private byte data = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Int8";

    public RosInt8() {

    }

    public RosInt8(byte data) {
        this.data = data;
    }

    public RosInt8(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsByte();
    }

    public byte getData() {
        return this.data;
    }

    public void setData(byte data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
