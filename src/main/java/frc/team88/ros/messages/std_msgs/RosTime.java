// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RosTime extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.TimePrimitive data = new frc.team88.ros.messages.TimePrimitive();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Time";

    public RosTime() {

    }

    public RosTime(frc.team88.ros.messages.TimePrimitive data) {
        this.data = data;
    }

    public RosTime(JsonObject jsonObj) {
        this.data = new frc.team88.ros.messages.TimePrimitive(jsonObj.get("data").getAsJsonObject());
    }

    public frc.team88.ros.messages.TimePrimitive getData() {
        return this.data;
    }

    public void setData(frc.team88.ros.messages.TimePrimitive data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
