// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class AccelWithCovarianceStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.geometry_msgs.AccelWithCovariance accel = new frc.team88.ros.messages.geometry_msgs.AccelWithCovariance();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/AccelWithCovarianceStamped";

    public AccelWithCovarianceStamped() {

    }

    public AccelWithCovarianceStamped(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.geometry_msgs.AccelWithCovariance accel) {
        this.header = header;
        this.accel = accel;
    }

    public AccelWithCovarianceStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.accel = new frc.team88.ros.messages.geometry_msgs.AccelWithCovariance(jsonObj.get("accel").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.AccelWithCovariance getAccel() {
        return this.accel;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setAccel(frc.team88.ros.messages.geometry_msgs.AccelWithCovariance accel) {
        this.accel = accel;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
