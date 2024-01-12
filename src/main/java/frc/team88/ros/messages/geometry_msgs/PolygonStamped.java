// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class PolygonStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.geometry_msgs.Polygon polygon = new frc.team88.ros.messages.geometry_msgs.Polygon();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/PolygonStamped";

    public PolygonStamped() {

    }

    public PolygonStamped(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.geometry_msgs.Polygon polygon) {
        this.header = header;
        this.polygon = polygon;
    }

    public PolygonStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.polygon = new frc.team88.ros.messages.geometry_msgs.Polygon(jsonObj.get("polygon").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Polygon getPolygon() {
        return this.polygon;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setPolygon(frc.team88.ros.messages.geometry_msgs.Polygon polygon) {
        this.polygon = polygon;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
