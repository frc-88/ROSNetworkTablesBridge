// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GetMapAction extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.nav_msgs.GetMapActionGoal action_goal = new frc.team88.ros.messages.nav_msgs.GetMapActionGoal();
    private frc.team88.ros.messages.nav_msgs.GetMapActionResult action_result = new frc.team88.ros.messages.nav_msgs.GetMapActionResult();
    private frc.team88.ros.messages.nav_msgs.GetMapActionFeedback action_feedback = new frc.team88.ros.messages.nav_msgs.GetMapActionFeedback();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GetMapAction";

    public GetMapAction() {

    }

    public GetMapAction(frc.team88.ros.messages.nav_msgs.GetMapActionGoal action_goal, frc.team88.ros.messages.nav_msgs.GetMapActionResult action_result, frc.team88.ros.messages.nav_msgs.GetMapActionFeedback action_feedback) {
        this.action_goal = action_goal;
        this.action_result = action_result;
        this.action_feedback = action_feedback;
    }

    public GetMapAction(JsonObject jsonObj) {
        this.action_goal = new frc.team88.ros.messages.nav_msgs.GetMapActionGoal(jsonObj.get("action_goal").getAsJsonObject());
        this.action_result = new frc.team88.ros.messages.nav_msgs.GetMapActionResult(jsonObj.get("action_result").getAsJsonObject());
        this.action_feedback = new frc.team88.ros.messages.nav_msgs.GetMapActionFeedback(jsonObj.get("action_feedback").getAsJsonObject());
    }

    public frc.team88.ros.messages.nav_msgs.GetMapActionGoal getActionGoal() {
        return this.action_goal;
    }
    public frc.team88.ros.messages.nav_msgs.GetMapActionResult getActionResult() {
        return this.action_result;
    }
    public frc.team88.ros.messages.nav_msgs.GetMapActionFeedback getActionFeedback() {
        return this.action_feedback;
    }

    public void setActionGoal(frc.team88.ros.messages.nav_msgs.GetMapActionGoal action_goal) {
        this.action_goal = action_goal;
    }
    public void setActionResult(frc.team88.ros.messages.nav_msgs.GetMapActionResult action_result) {
        this.action_result = action_result;
    }
    public void setActionFeedback(frc.team88.ros.messages.nav_msgs.GetMapActionFeedback action_feedback) {
        this.action_feedback = action_feedback;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
