// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GetMapActionResult extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.actionlib_msgs.GoalStatus status = new frc.team88.ros.messages.actionlib_msgs.GoalStatus();
    private frc.team88.ros.messages.nav_msgs.GetMapResult result = new frc.team88.ros.messages.nav_msgs.GetMapResult();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GetMapActionResult";

    public GetMapActionResult() {

    }

    public GetMapActionResult(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.actionlib_msgs.GoalStatus status, frc.team88.ros.messages.nav_msgs.GetMapResult result) {
        this.header = header;
        this.status = status;
        this.result = result;
    }

    public GetMapActionResult(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.status = new frc.team88.ros.messages.actionlib_msgs.GoalStatus(jsonObj.get("status").getAsJsonObject());
        this.result = new frc.team88.ros.messages.nav_msgs.GetMapResult(jsonObj.get("result").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.actionlib_msgs.GoalStatus getStatus() {
        return this.status;
    }
    public frc.team88.ros.messages.nav_msgs.GetMapResult getResult() {
        return this.result;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setStatus(frc.team88.ros.messages.actionlib_msgs.GoalStatus status) {
        this.status = status;
    }
    public void setResult(frc.team88.ros.messages.nav_msgs.GetMapResult result) {
        this.result = result;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
