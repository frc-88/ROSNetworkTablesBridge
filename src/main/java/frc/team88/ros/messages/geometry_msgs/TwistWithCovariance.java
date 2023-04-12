// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class TwistWithCovariance extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Twist twist = new frc.team88.ros.messages.geometry_msgs.Twist();
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
    public final String _type = "geometry_msgs/TwistWithCovariance";

    public TwistWithCovariance() {

    }

    public TwistWithCovariance(frc.team88.ros.messages.geometry_msgs.Twist twist, Double[] covariance) {
        this.twist = twist;
        for (int index = 0; index < 36; index++) {
            this.covariance[index] = covariance[index];
        }
    }

    public TwistWithCovariance(JsonObject jsonObj) {
        this.twist = new frc.team88.ros.messages.geometry_msgs.Twist(jsonObj.get("twist").getAsJsonObject());
        int covariance_element_index = 0;
        for (JsonElement covariance_element : jsonObj.getAsJsonArray("covariance")) {
            this.covariance[covariance_element_index] = covariance_element.getAsDouble();
        }
    }

    public frc.team88.ros.messages.geometry_msgs.Twist getTwist() {
        return this.twist;
    }
    public Double[] getCovariance() {
        return this.covariance;
    }

    public void setTwist(frc.team88.ros.messages.geometry_msgs.Twist twist) {
        this.twist = twist;
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
