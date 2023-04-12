// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Point extends frc.team88.ros.messages.RosMessage {

    private double x = 0.0;
    private double y = 0.0;
    private double z = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Point";

    public Point() {

    }

    public Point(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public Point(JsonObject jsonObj) {
        this.x = jsonObj.get("x").getAsDouble();
        this.y = jsonObj.get("y").getAsDouble();
        this.z = jsonObj.get("z").getAsDouble();
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getZ() {
        return this.z;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setZ(double z) {
        this.z = z;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
