// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class MagneticField extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.geometry_msgs.Vector3 magnetic_field = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private java.lang.Double[] magnetic_field_covariance = new java.lang.Double[] {
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
    public final java.lang.String _type = "sensor_msgs/MagneticField";

    public MagneticField() {

    }

    public MagneticField(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.geometry_msgs.Vector3 magnetic_field, java.lang.Double[] magnetic_field_covariance) {
        this.header = header;
        this.magnetic_field = magnetic_field;
        for (int index = 0; index < 9; index++) {
            this.magnetic_field_covariance[index] = magnetic_field_covariance[index];
        }
    }

    public MagneticField(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.magnetic_field = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("magnetic_field").getAsJsonObject());
        int magnetic_field_covariance_element_index = 0;
        for (JsonElement magnetic_field_covariance_element : jsonObj.getAsJsonArray("magnetic_field_covariance")) {
            this.magnetic_field_covariance[magnetic_field_covariance_element_index++] = magnetic_field_covariance_element.getAsDouble();
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getMagneticField() {
        return this.magnetic_field;
    }
    public java.lang.Double[] getMagneticFieldCovariance() {
        return this.magnetic_field_covariance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setMagneticField(frc.team88.ros.messages.geometry_msgs.Vector3 magnetic_field) {
        this.magnetic_field = magnetic_field;
    }
    public void setMagneticFieldCovariance(java.lang.Double[] magnetic_field_covariance) {
        this.magnetic_field_covariance = magnetic_field_covariance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
