// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Time extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.Time data = new frc.team88.ros.messages.Time();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/Time";

    public Time() {

    }

    public Time(frc.team88.ros.messages.Time data) {
        this.data = data;
    }

    public Time(JsonObject jsonObj) {
        this.data = new frc.team88.ros.messages.Time(jsonObj.get("data").getAsJsonObject());
    }

    public frc.team88.ros.messages.Time getData() {
        return this.data;
    }

    public void setData(frc.team88.ros.messages.Time data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
