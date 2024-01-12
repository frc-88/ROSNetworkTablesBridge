// Auto generated!! Do not modify.
package frc.team88.ros.messages.tf2_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class LookupTransformActionGoal extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.actionlib_msgs.GoalID goal_id = new frc.team88.ros.messages.actionlib_msgs.GoalID();
    private frc.team88.ros.messages.tf2_msgs.LookupTransformGoal goal = new frc.team88.ros.messages.tf2_msgs.LookupTransformGoal();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "tf2_msgs/LookupTransformActionGoal";

    public LookupTransformActionGoal() {

    }

    public LookupTransformActionGoal(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.actionlib_msgs.GoalID goal_id, frc.team88.ros.messages.tf2_msgs.LookupTransformGoal goal) {
        this.header = header;
        this.goal_id = goal_id;
        this.goal = goal;
    }

    public LookupTransformActionGoal(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.goal_id = new frc.team88.ros.messages.actionlib_msgs.GoalID(jsonObj.get("goal_id").getAsJsonObject());
        this.goal = new frc.team88.ros.messages.tf2_msgs.LookupTransformGoal(jsonObj.get("goal").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.actionlib_msgs.GoalID getGoalId() {
        return this.goal_id;
    }
    public frc.team88.ros.messages.tf2_msgs.LookupTransformGoal getGoal() {
        return this.goal;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setGoalId(frc.team88.ros.messages.actionlib_msgs.GoalID goal_id) {
        this.goal_id = goal_id;
    }
    public void setGoal(frc.team88.ros.messages.tf2_msgs.LookupTransformGoal goal) {
        this.goal = goal;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
