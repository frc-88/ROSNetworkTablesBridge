// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Bool extends frc.team88.ros.messages.RosMessage {

    private boolean data = false;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/Bool";

    public Bool() {

    }

    public Bool(boolean data) {
        this.data = data;
    }

    public Bool(JsonObject jsonObj) {
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

    public String toString() {
        return ginst.toJson(this);
    }
}
