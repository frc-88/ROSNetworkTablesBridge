// Auto generated!! Do not modify.
package frc.team88.ros.messages.tf2_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class LookupTransformActionResult extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.actionlib_msgs.GoalStatus status = new frc.team88.ros.messages.actionlib_msgs.GoalStatus();
    private frc.team88.ros.messages.tf2_msgs.LookupTransformResult result = new frc.team88.ros.messages.tf2_msgs.LookupTransformResult();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "tf2_msgs/LookupTransformActionResult";

    public LookupTransformActionResult() {

    }

    public LookupTransformActionResult(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.actionlib_msgs.GoalStatus status, frc.team88.ros.messages.tf2_msgs.LookupTransformResult result) {
        this.header = header;
        this.status = status;
        this.result = result;
    }

    public LookupTransformActionResult(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.status = new frc.team88.ros.messages.actionlib_msgs.GoalStatus(jsonObj.get("status").getAsJsonObject());
        this.result = new frc.team88.ros.messages.tf2_msgs.LookupTransformResult(jsonObj.get("result").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.actionlib_msgs.GoalStatus getStatus() {
        return this.status;
    }
    public frc.team88.ros.messages.tf2_msgs.LookupTransformResult getResult() {
        return this.result;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setStatus(frc.team88.ros.messages.actionlib_msgs.GoalStatus status) {
        this.status = status;
    }
    public void setResult(frc.team88.ros.messages.tf2_msgs.LookupTransformResult result) {
        this.result = result;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
