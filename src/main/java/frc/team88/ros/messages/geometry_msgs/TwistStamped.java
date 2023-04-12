// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class TwistStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Twist twist = new frc.team88.ros.messages.geometry_msgs.Twist();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/TwistStamped";

    public TwistStamped() {

    }

    public TwistStamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Twist twist) {
        this.header = header;
        this.twist = twist;
    }

    public TwistStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.twist = new frc.team88.ros.messages.geometry_msgs.Twist(jsonObj.get("twist").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Twist getTwist() {
        return this.twist;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setTwist(frc.team88.ros.messages.geometry_msgs.Twist twist) {
        this.twist = twist;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
