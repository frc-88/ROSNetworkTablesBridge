// Auto generated!! Do not modify.
package frc.team88.ros.messages.tj2_interfaces;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class NavX extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Quaternion orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion();
    private frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration = new frc.team88.ros.messages.geometry_msgs.Vector3();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "tj2_interfaces/NavX";

    public NavX() {

    }

    public NavX(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Quaternion orientation, frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity, frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration) {
        this.header = header;
        this.orientation = orientation;
        this.angular_velocity = angular_velocity;
        this.linear_acceleration = linear_acceleration;
    }

    public NavX(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion(jsonObj.get("orientation").getAsJsonObject());
        this.angular_velocity = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("angular_velocity").getAsJsonObject());
        this.linear_acceleration = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("linear_acceleration").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getOrientation() {
        return this.orientation;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getAngularVelocity() {
        return this.angular_velocity;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getLinearAcceleration() {
        return this.linear_acceleration;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setOrientation(frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.orientation = orientation;
    }
    public void setAngularVelocity(frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity) {
        this.angular_velocity = angular_velocity;
    }
    public void setLinearAcceleration(frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration) {
        this.linear_acceleration = linear_acceleration;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
