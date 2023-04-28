// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Duration extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.DurationPrimitive data = new frc.team88.ros.messages.DurationPrimitive();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Duration";

    public Duration() {

    }

    public Duration(frc.team88.ros.messages.DurationPrimitive data) {
        this.data = data;
    }

    public Duration(JsonObject jsonObj) {
        this.data = new frc.team88.ros.messages.DurationPrimitive(jsonObj.get("data").getAsJsonObject());
    }

    public frc.team88.ros.messages.DurationPrimitive getData() {
        return this.data;
    }

    public void setData(frc.team88.ros.messages.DurationPrimitive data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
