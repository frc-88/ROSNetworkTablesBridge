// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class AccelStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Accel accel = new frc.team88.ros.messages.geometry_msgs.Accel();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/AccelStamped";

    public AccelStamped() {

    }

    public AccelStamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Accel accel) {
        this.header = header;
        this.accel = accel;
    }

    public AccelStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.accel = new frc.team88.ros.messages.geometry_msgs.Accel(jsonObj.get("accel").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Accel getAccel() {
        return this.accel;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setAccel(frc.team88.ros.messages.geometry_msgs.Accel accel) {
        this.accel = accel;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
