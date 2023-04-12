// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Vector3Stamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Vector3 vector = new frc.team88.ros.messages.geometry_msgs.Vector3();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/Vector3Stamped";

    public Vector3Stamped() {

    }

    public Vector3Stamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Vector3 vector) {
        this.header = header;
        this.vector = vector;
    }

    public Vector3Stamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.vector = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("vector").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getVector() {
        return this.vector;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setVector(frc.team88.ros.messages.geometry_msgs.Vector3 vector) {
        this.vector = vector;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
