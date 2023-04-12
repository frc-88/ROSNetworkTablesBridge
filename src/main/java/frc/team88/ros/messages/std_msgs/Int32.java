// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Int32 extends frc.team88.ros.messages.RosMessage {

    private int data = 0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/Int32";

    public Int32() {

    }

    public Int32(int data) {
        this.data = data;
    }

    public Int32(JsonObject jsonObj) {
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

    public String toString() {
        return ginst.toJson(this);
    }
}
