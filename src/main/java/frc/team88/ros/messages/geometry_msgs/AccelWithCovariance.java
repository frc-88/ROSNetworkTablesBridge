// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class AccelWithCovariance extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Accel accel = new frc.team88.ros.messages.geometry_msgs.Accel();
    private java.lang.Double[] covariance = new java.lang.Double[] {
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
    public final java.lang.String _type = "geometry_msgs/AccelWithCovariance";

    public AccelWithCovariance() {

    }

    public AccelWithCovariance(frc.team88.ros.messages.geometry_msgs.Accel accel, java.lang.Double[] covariance) {
        this.accel = accel;
        for (int index = 0; index < 36; index++) {
            this.covariance[index] = covariance[index];
        }
    }

    public AccelWithCovariance(JsonObject jsonObj) {
        this.accel = new frc.team88.ros.messages.geometry_msgs.Accel(jsonObj.get("accel").getAsJsonObject());
        int covariance_element_index = 0;
        for (JsonElement covariance_element : jsonObj.getAsJsonArray("covariance")) {
            this.covariance[covariance_element_index] = covariance_element.getAsDouble();
        }
    }

    public frc.team88.ros.messages.geometry_msgs.Accel getAccel() {
        return this.accel;
    }
    public java.lang.Double[] getCovariance() {
        return this.covariance;
    }

    public void setAccel(frc.team88.ros.messages.geometry_msgs.Accel accel) {
        this.accel = accel;
    }
    public void setCovariance(java.lang.Double[] covariance) {
        this.covariance = covariance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
