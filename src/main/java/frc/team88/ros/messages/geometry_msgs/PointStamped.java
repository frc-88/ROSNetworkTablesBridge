// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class PointStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Point point = new frc.team88.ros.messages.geometry_msgs.Point();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/PointStamped";

    public PointStamped() {

    }

    public PointStamped(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Point point) {
        this.header = header;
        this.point = point;
    }

    public PointStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.point = new frc.team88.ros.messages.geometry_msgs.Point(jsonObj.get("point").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Point getPoint() {
        return this.point;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setPoint(frc.team88.ros.messages.geometry_msgs.Point point) {
        this.point = point;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
