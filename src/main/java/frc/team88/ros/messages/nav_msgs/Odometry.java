// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Odometry extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private java.lang.String child_frame_id = "";
    private frc.team88.ros.messages.geometry_msgs.PoseWithCovariance pose = new frc.team88.ros.messages.geometry_msgs.PoseWithCovariance();
    private frc.team88.ros.messages.geometry_msgs.TwistWithCovariance twist = new frc.team88.ros.messages.geometry_msgs.TwistWithCovariance();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/Odometry";

    public Odometry() {

    }

    public Odometry(frc.team88.ros.messages.std_msgs.Header header, java.lang.String child_frame_id, frc.team88.ros.messages.geometry_msgs.PoseWithCovariance pose, frc.team88.ros.messages.geometry_msgs.TwistWithCovariance twist) {
        this.header = header;
        this.child_frame_id = child_frame_id;
        this.pose = pose;
        this.twist = twist;
    }

    public Odometry(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.child_frame_id = jsonObj.get("child_frame_id").getAsString();
        this.pose = new frc.team88.ros.messages.geometry_msgs.PoseWithCovariance(jsonObj.get("pose").getAsJsonObject());
        this.twist = new frc.team88.ros.messages.geometry_msgs.TwistWithCovariance(jsonObj.get("twist").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public java.lang.String getChildFrameId() {
        return this.child_frame_id;
    }
    public frc.team88.ros.messages.geometry_msgs.PoseWithCovariance getPose() {
        return this.pose;
    }
    public frc.team88.ros.messages.geometry_msgs.TwistWithCovariance getTwist() {
        return this.twist;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setChildFrameId(java.lang.String child_frame_id) {
        this.child_frame_id = child_frame_id;
    }
    public void setPose(frc.team88.ros.messages.geometry_msgs.PoseWithCovariance pose) {
        this.pose = pose;
    }
    public void setTwist(frc.team88.ros.messages.geometry_msgs.TwistWithCovariance twist) {
        this.twist = twist;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
