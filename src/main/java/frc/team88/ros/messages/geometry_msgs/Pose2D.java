// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Pose2D extends frc.team88.ros.messages.RosMessage {

    private double x = 0.0;
    private double y = 0.0;
    private double theta = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Pose2D";

    public Pose2D() {

    }

    public Pose2D(double x, double y, double theta) {
        this.x = x;
        this.y = y;
        this.theta = theta;
    }

    public Pose2D(JsonObject jsonObj) {
        this.x = jsonObj.get("x").getAsDouble();
        this.y = jsonObj.get("y").getAsDouble();
        this.theta = jsonObj.get("theta").getAsDouble();
    }

    public double getX() {
        return this.x;
    }
    public double getY() {
        return this.y;
    }
    public double getTheta() {
        return this.theta;
    }

    public void setX(double x) {
        this.x = x;
    }
    public void setY(double y) {
        this.y = y;
    }
    public void setTheta(double theta) {
        this.theta = theta;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
