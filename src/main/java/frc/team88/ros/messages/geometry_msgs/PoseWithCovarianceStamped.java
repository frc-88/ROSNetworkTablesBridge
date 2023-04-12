// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class PoseWithCovarianceStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.PoseWithCovariance pose = new frc.team88.ros.messages.geometry_msgs.PoseWithCovariance();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/PoseWithCovarianceStamped";

    public PoseWithCovarianceStamped() {

    }

    public PoseWithCovarianceStamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.PoseWithCovariance pose) {
        this.header = header;
        this.pose = pose;
    }

    public PoseWithCovarianceStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.pose = new frc.team88.ros.messages.geometry_msgs.PoseWithCovariance(jsonObj.get("pose").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.PoseWithCovariance getPose() {
        return this.pose;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setPose(frc.team88.ros.messages.geometry_msgs.PoseWithCovariance pose) {
        this.pose = pose;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
