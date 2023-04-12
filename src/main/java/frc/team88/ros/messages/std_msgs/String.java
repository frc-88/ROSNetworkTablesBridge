// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class String extends frc.team88.ros.messages.RosMessage {

    private String data = "";

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/String";

    public String() {

    }

    public String(String data) {
        this.data = data;
    }

    public String(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsString();
    }

    public String getData() {
        return this.data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
