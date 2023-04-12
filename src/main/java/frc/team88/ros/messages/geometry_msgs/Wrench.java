// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Wrench extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Vector3 force = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private frc.team88.ros.messages.geometry_msgs.Vector3 torque = new frc.team88.ros.messages.geometry_msgs.Vector3();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Wrench";

    public Wrench() {

    }

    public Wrench(frc.team88.ros.messages.geometry_msgs.Vector3 force, frc.team88.ros.messages.geometry_msgs.Vector3 torque) {
        this.force = force;
        this.torque = torque;
    }

    public Wrench(JsonObject jsonObj) {
        this.force = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("force").getAsJsonObject());
        this.torque = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("torque").getAsJsonObject());
    }

    public frc.team88.ros.messages.geometry_msgs.Vector3 getForce() {
        return this.force;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getTorque() {
        return this.torque;
    }

    public void setForce(frc.team88.ros.messages.geometry_msgs.Vector3 force) {
        this.force = force;
    }
    public void setTorque(frc.team88.ros.messages.geometry_msgs.Vector3 torque) {
        this.torque = torque;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
