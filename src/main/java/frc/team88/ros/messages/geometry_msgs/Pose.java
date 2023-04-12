// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Pose extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Point position = new frc.team88.ros.messages.geometry_msgs.Point();
    private frc.team88.ros.messages.geometry_msgs.Quaternion orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Pose";

    public Pose() {

    }

    public Pose(frc.team88.ros.messages.geometry_msgs.Point position, frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.position = position;
        this.orientation = orientation;
    }

    public Pose(JsonObject jsonObj) {
        this.position = new frc.team88.ros.messages.geometry_msgs.Point(jsonObj.get("position").getAsJsonObject());
        this.orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion(jsonObj.get("orientation").getAsJsonObject());
    }

    public frc.team88.ros.messages.geometry_msgs.Point getPosition() {
        return this.position;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getOrientation() {
        return this.orientation;
    }

    public void setPosition(frc.team88.ros.messages.geometry_msgs.Point position) {
        this.position = position;
    }
    public void setOrientation(frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.orientation = orientation;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
