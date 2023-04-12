// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class WrenchStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Wrench wrench = new frc.team88.ros.messages.geometry_msgs.Wrench();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/WrenchStamped";

    public WrenchStamped() {

    }

    public WrenchStamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Wrench wrench) {
        this.header = header;
        this.wrench = wrench;
    }

    public WrenchStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.wrench = new frc.team88.ros.messages.geometry_msgs.Wrench(jsonObj.get("wrench").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Wrench getWrench() {
        return this.wrench;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setWrench(frc.team88.ros.messages.geometry_msgs.Wrench wrench) {
        this.wrench = wrench;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
