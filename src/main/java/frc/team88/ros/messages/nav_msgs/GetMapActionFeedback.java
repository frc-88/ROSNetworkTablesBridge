// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GetMapActionFeedback extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.actionlib_msgs.GoalStatus status = new frc.team88.ros.messages.actionlib_msgs.GoalStatus();
    private frc.team88.ros.messages.nav_msgs.GetMapFeedback feedback = new frc.team88.ros.messages.nav_msgs.GetMapFeedback();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GetMapActionFeedback";

    public GetMapActionFeedback() {

    }

    public GetMapActionFeedback(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.actionlib_msgs.GoalStatus status, frc.team88.ros.messages.nav_msgs.GetMapFeedback feedback) {
        this.header = header;
        this.status = status;
        this.feedback = feedback;
    }

    public GetMapActionFeedback(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.status = new frc.team88.ros.messages.actionlib_msgs.GoalStatus(jsonObj.get("status").getAsJsonObject());
        this.feedback = new frc.team88.ros.messages.nav_msgs.GetMapFeedback(jsonObj.get("feedback").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.actionlib_msgs.GoalStatus getStatus() {
        return this.status;
    }
    public frc.team88.ros.messages.nav_msgs.GetMapFeedback getFeedback() {
        return this.feedback;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setStatus(frc.team88.ros.messages.actionlib_msgs.GoalStatus status) {
        this.status = status;
    }
    public void setFeedback(frc.team88.ros.messages.nav_msgs.GetMapFeedback feedback) {
        this.feedback = feedback;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
