// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Duration extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.Duration data = new frc.team88.ros.messages.Duration();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/Duration";

    public Duration() {

    }

    public Duration(frc.team88.ros.messages.Duration data) {
        this.data = data;
    }

    public Duration(JsonObject jsonObj) {
        this.data = new frc.team88.ros.messages.Duration(jsonObj.get("data").getAsJsonObject());
    }

    public frc.team88.ros.messages.Duration getData() {
        return this.data;
    }

    public void setData(frc.team88.ros.messages.Duration data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
