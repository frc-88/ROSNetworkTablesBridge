// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;

public class PoseWithCovariance extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Pose pose = new frc.team88.ros.messages.geometry_msgs.Pose();
    private Double[] covariance = new Double[] {
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0
    };

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/PoseWithCovariance";

    public PoseWithCovariance() {

    }

    public PoseWithCovariance(frc.team88.ros.messages.geometry_msgs.Pose pose, Double[] covariance) {
        this.pose = pose;
        for (int index = 0; index < 36; index++) {
            this.covariance[index] = covariance[index];
        }
    }

    public PoseWithCovariance(JsonObject jsonObj) {
        this.pose = new frc.team88.ros.messages.geometry_msgs.Pose(jsonObj.get("pose").getAsJsonObject());
        int covariance_element_index = 0;
        for (JsonElement covariance_element : jsonObj.getAsJsonArray("covariance")) {
            this.covariance[covariance_element_index] = covariance_element.getAsDouble();
        }
    }

    public frc.team88.ros.messages.geometry_msgs.Pose getPose() {
        return this.pose;
    }
    public Double[] getCovariance() {
        return this.covariance;
    }

    public void setPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        this.pose = pose;
    }
    public void setCovariance(Double[] covariance) {
        this.covariance = covariance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
