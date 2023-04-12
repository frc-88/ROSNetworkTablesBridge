// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class QuaternionStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Quaternion quaternion = new frc.team88.ros.messages.geometry_msgs.Quaternion();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/QuaternionStamped";

    public QuaternionStamped() {

    }

    public QuaternionStamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Quaternion quaternion) {
        this.header = header;
        this.quaternion = quaternion;
    }

    public QuaternionStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.quaternion = new frc.team88.ros.messages.geometry_msgs.Quaternion(jsonObj.get("quaternion").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getQuaternion() {
        return this.quaternion;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setQuaternion(frc.team88.ros.messages.geometry_msgs.Quaternion quaternion) {
        this.quaternion = quaternion;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
