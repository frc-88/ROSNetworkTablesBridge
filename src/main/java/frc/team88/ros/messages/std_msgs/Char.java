// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Char extends frc.team88.ros.messages.RosMessage {

    private char data = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Char";

    public Char() {

    }

    public Char(char data) {
        this.data = data;
    }

    public Char(JsonObject jsonObj) {
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

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
