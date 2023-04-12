// Auto generated!! Do not modify.
package frc.team88.ros.messages.actionlib_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GoalID extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.Time stamp = new frc.team88.ros.messages.Time();
    private String id = "";

    @Expose(serialize = false, deserialize = false)
    public final String _type = "actionlib_msgs/GoalID";

    public GoalID() {

    }

    public GoalID(frc.team88.ros.messages.Time stamp, String id) {
        this.stamp = stamp;
        this.id = id;
    }

    public GoalID(JsonObject jsonObj) {
        this.stamp = new frc.team88.ros.messages.Time(jsonObj.get("stamp").getAsJsonObject());
        this.id = jsonObj.get("id").getAsString();
    }

    public frc.team88.ros.messages.Time getStamp() {
        return this.stamp;
    }
    public String getId() {
        return this.id;
    }

    public void setStamp(frc.team88.ros.messages.Time stamp) {
        this.stamp = stamp;
    }
    public void setId(String id) {
        this.id = id;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
