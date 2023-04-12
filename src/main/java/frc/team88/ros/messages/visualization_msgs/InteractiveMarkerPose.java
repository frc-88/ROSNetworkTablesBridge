// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class InteractiveMarkerPose extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Pose pose = new frc.team88.ros.messages.geometry_msgs.Pose();
    private String name = "";

    @Expose(serialize = false, deserialize = false)
    public final String _type = "visualization_msgs/InteractiveMarkerPose";

    public InteractiveMarkerPose() {

    }

    public InteractiveMarkerPose(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Pose pose, String name) {
        this.header = header;
        this.pose = pose;
        this.name = name;
    }

    public InteractiveMarkerPose(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.pose = new frc.team88.ros.messages.geometry_msgs.Pose(jsonObj.get("pose").getAsJsonObject());
        this.name = jsonObj.get("name").getAsString();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Pose getPose() {
        return this.pose;
    }
    public String getName() {
        return this.name;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        this.pose = pose;
    }
    public void setName(String name) {
        this.name = name;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
