// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class InertiaStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.geometry_msgs.Inertia inertia = new frc.team88.ros.messages.geometry_msgs.Inertia();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/InertiaStamped";

    public InertiaStamped() {

    }

    public InertiaStamped(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.geometry_msgs.Inertia inertia) {
        this.header = header;
        this.inertia = inertia;
    }

    public InertiaStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.inertia = new frc.team88.ros.messages.geometry_msgs.Inertia(jsonObj.get("inertia").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Inertia getInertia() {
        return this.inertia;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setInertia(frc.team88.ros.messages.geometry_msgs.Inertia inertia) {
        this.inertia = inertia;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
