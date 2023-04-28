// Auto generated!! Do not modify.
package frc.team88.ros.messages.actionlib_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GoalID extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.TimePrimitive stamp = new frc.team88.ros.messages.TimePrimitive();
    private java.lang.String id = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "actionlib_msgs/GoalID";

    public GoalID() {

    }

    public GoalID(frc.team88.ros.messages.TimePrimitive stamp, java.lang.String id) {
        this.stamp = stamp;
        this.id = id;
    }

    public GoalID(JsonObject jsonObj) {
        this.stamp = new frc.team88.ros.messages.TimePrimitive(jsonObj.get("stamp").getAsJsonObject());
        this.id = jsonObj.get("id").getAsString();
    }

    public frc.team88.ros.messages.TimePrimitive getStamp() {
        return this.stamp;
    }
    public java.lang.String getId() {
        return this.id;
    }

    public void setStamp(frc.team88.ros.messages.TimePrimitive stamp) {
        this.stamp = stamp;
    }
    public void setId(java.lang.String id) {
        this.id = id;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
