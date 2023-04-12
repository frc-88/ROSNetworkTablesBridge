// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Twist extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Vector3 linear = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private frc.team88.ros.messages.geometry_msgs.Vector3 angular = new frc.team88.ros.messages.geometry_msgs.Vector3();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Twist";

    public Twist() {

    }

    public Twist(frc.team88.ros.messages.geometry_msgs.Vector3 linear, frc.team88.ros.messages.geometry_msgs.Vector3 angular) {
        this.linear = linear;
        this.angular = angular;
    }

    public Twist(JsonObject jsonObj) {
        this.linear = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("linear").getAsJsonObject());
        this.angular = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("angular").getAsJsonObject());
    }

    public frc.team88.ros.messages.geometry_msgs.Vector3 getLinear() {
        return this.linear;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getAngular() {
        return this.angular;
    }

    public void setLinear(frc.team88.ros.messages.geometry_msgs.Vector3 linear) {
        this.linear = linear;
    }
    public void setAngular(frc.team88.ros.messages.geometry_msgs.Vector3 angular) {
        this.angular = angular;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
