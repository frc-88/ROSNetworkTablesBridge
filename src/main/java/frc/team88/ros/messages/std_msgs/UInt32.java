// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class UInt32 extends frc.team88.ros.messages.RosMessage {

    private int data = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/UInt32";

    public UInt32() {

    }

    public UInt32(int data) {
        this.data = data;
    }

    public UInt32(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsInt();
    }

    public int getData() {
        return this.data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
