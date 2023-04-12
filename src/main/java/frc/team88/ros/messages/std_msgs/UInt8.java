// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class UInt8 extends frc.team88.ros.messages.RosMessage {

    private char data = '';

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/UInt8";

    public UInt8() {

    }

    public UInt8(char data) {
        this.data = data;
    }

    public UInt8(JsonObject jsonObj) {
        this.data = (char)jsonObj.get("data").getAsByte();
    }

    public char getData() {
        return this.data;
    }

    public void setData(char data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
