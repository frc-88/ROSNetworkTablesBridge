// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RosBool extends frc.team88.ros.messages.RosMessage {

    private boolean data = false;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Bool";

    public RosBool() {

    }

    public RosBool(boolean data) {
        this.data = data;
    }

    public RosBool(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsBoolean();
    }

    public boolean getData() {
        return this.data;
    }

    public void setData(boolean data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
