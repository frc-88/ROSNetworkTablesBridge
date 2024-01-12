// Auto generated!! Do not modify.
package frc.team88.ros.messages.actionlib_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GoalStatus extends frc.team88.ros.messages.RosMessage {
    public static int PENDING = 0;
    public static int ACTIVE = 1;
    public static int PREEMPTED = 2;
    public static int SUCCEEDED = 3;
    public static int ABORTED = 4;
    public static int REJECTED = 5;
    public static int PREEMPTING = 6;
    public static int RECALLING = 7;
    public static int RECALLED = 8;
    public static int LOST = 9;

    private frc.team88.ros.messages.actionlib_msgs.GoalID goal_id = new frc.team88.ros.messages.actionlib_msgs.GoalID();
    private byte status = 0;
    private java.lang.String text = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "actionlib_msgs/GoalStatus";

    public GoalStatus() {

    }

    public GoalStatus(frc.team88.ros.messages.actionlib_msgs.GoalID goal_id, byte status, java.lang.String text) {
        this.goal_id = goal_id;
        this.status = status;
        this.text = text;
    }

    public GoalStatus(JsonObject jsonObj) {
        this.goal_id = new frc.team88.ros.messages.actionlib_msgs.GoalID(jsonObj.get("goal_id").getAsJsonObject());
        this.status = jsonObj.get("status").getAsByte();
        this.text = jsonObj.get("text").getAsString();
    }

    public frc.team88.ros.messages.actionlib_msgs.GoalID getGoalId() {
        return this.goal_id;
    }
    public byte getStatus() {
        return this.status;
    }
    public java.lang.String getText() {
        return this.text;
    }

    public void setGoalId(frc.team88.ros.messages.actionlib_msgs.GoalID goal_id) {
        this.goal_id = goal_id;
    }
    public void setStatus(byte status) {
        this.status = status;
    }
    public void setText(java.lang.String text) {
        this.text = text;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
