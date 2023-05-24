// Auto generated!! Do not modify.
package frc.team88.ros.messages.tf2_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class LookupTransformAction extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.tf2_msgs.LookupTransformActionGoal action_goal = new frc.team88.ros.messages.tf2_msgs.LookupTransformActionGoal();
    private frc.team88.ros.messages.tf2_msgs.LookupTransformActionResult action_result = new frc.team88.ros.messages.tf2_msgs.LookupTransformActionResult();
    private frc.team88.ros.messages.tf2_msgs.LookupTransformActionFeedback action_feedback = new frc.team88.ros.messages.tf2_msgs.LookupTransformActionFeedback();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "tf2_msgs/LookupTransformAction";

    public LookupTransformAction() {

    }

    public LookupTransformAction(frc.team88.ros.messages.tf2_msgs.LookupTransformActionGoal action_goal, frc.team88.ros.messages.tf2_msgs.LookupTransformActionResult action_result, frc.team88.ros.messages.tf2_msgs.LookupTransformActionFeedback action_feedback) {
        this.action_goal = action_goal;
        this.action_result = action_result;
        this.action_feedback = action_feedback;
    }

    public LookupTransformAction(JsonObject jsonObj) {
        this.action_goal = new frc.team88.ros.messages.tf2_msgs.LookupTransformActionGoal(jsonObj.get("action_goal").getAsJsonObject());
        this.action_result = new frc.team88.ros.messages.tf2_msgs.LookupTransformActionResult(jsonObj.get("action_result").getAsJsonObject());
        this.action_feedback = new frc.team88.ros.messages.tf2_msgs.LookupTransformActionFeedback(jsonObj.get("action_feedback").getAsJsonObject());
    }

    public frc.team88.ros.messages.tf2_msgs.LookupTransformActionGoal getActionGoal() {
        return this.action_goal;
    }
    public frc.team88.ros.messages.tf2_msgs.LookupTransformActionResult getActionResult() {
        return this.action_result;
    }
    public frc.team88.ros.messages.tf2_msgs.LookupTransformActionFeedback getActionFeedback() {
        return this.action_feedback;
    }

    public void setActionGoal(frc.team88.ros.messages.tf2_msgs.LookupTransformActionGoal action_goal) {
        this.action_goal = action_goal;
    }
    public void setActionResult(frc.team88.ros.messages.tf2_msgs.LookupTransformActionResult action_result) {
        this.action_result = action_result;
    }
    public void setActionFeedback(frc.team88.ros.messages.tf2_msgs.LookupTransformActionFeedback action_feedback) {
        this.action_feedback = action_feedback;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
