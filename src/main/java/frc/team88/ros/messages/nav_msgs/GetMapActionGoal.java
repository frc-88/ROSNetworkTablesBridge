// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GetMapActionGoal extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.actionlib_msgs.GoalID goal_id = new frc.team88.ros.messages.actionlib_msgs.GoalID();
    private frc.team88.ros.messages.nav_msgs.GetMapGoal goal = new frc.team88.ros.messages.nav_msgs.GetMapGoal();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GetMapActionGoal";

    public GetMapActionGoal() {

    }

    public GetMapActionGoal(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.actionlib_msgs.GoalID goal_id, frc.team88.ros.messages.nav_msgs.GetMapGoal goal) {
        this.header = header;
        this.goal_id = goal_id;
        this.goal = goal;
    }

    public GetMapActionGoal(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.goal_id = new frc.team88.ros.messages.actionlib_msgs.GoalID(jsonObj.get("goal_id").getAsJsonObject());
        this.goal = new frc.team88.ros.messages.nav_msgs.GetMapGoal(jsonObj.get("goal").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.actionlib_msgs.GoalID getGoalId() {
        return this.goal_id;
    }
    public frc.team88.ros.messages.nav_msgs.GetMapGoal getGoal() {
        return this.goal;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setGoalId(frc.team88.ros.messages.actionlib_msgs.GoalID goal_id) {
        this.goal_id = goal_id;
    }
    public void setGoal(frc.team88.ros.messages.nav_msgs.GetMapGoal goal) {
        this.goal = goal;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
