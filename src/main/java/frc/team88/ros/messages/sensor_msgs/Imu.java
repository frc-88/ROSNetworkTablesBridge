// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Imu extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.geometry_msgs.Quaternion orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion();
    private java.lang.Double[] orientation_covariance = new java.lang.Double[] {
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
    private frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private java.lang.Double[] angular_velocity_covariance = new java.lang.Double[] {
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
    private frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private java.lang.Double[] linear_acceleration_covariance = new java.lang.Double[] {
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
    public final java.lang.String _type = "sensor_msgs/Imu";

    public Imu() {

    }

    public Imu(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.geometry_msgs.Quaternion orientation, java.lang.Double[] orientation_covariance, frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity, java.lang.Double[] angular_velocity_covariance, frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration, java.lang.Double[] linear_acceleration_covariance) {
        this.header = header;
        this.orientation = orientation;
        for (int index = 0; index < 9; index++) {
            this.orientation_covariance[index] = orientation_covariance[index];
        }
        this.angular_velocity = angular_velocity;
        for (int index = 0; index < 9; index++) {
            this.angular_velocity_covariance[index] = angular_velocity_covariance[index];
        }
        this.linear_acceleration = linear_acceleration;
        for (int index = 0; index < 9; index++) {
            this.linear_acceleration_covariance[index] = linear_acceleration_covariance[index];
        }
    }

    public Imu(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion(jsonObj.get("orientation").getAsJsonObject());
        int orientation_covariance_element_index = 0;
        for (JsonElement orientation_covariance_element : jsonObj.getAsJsonArray("orientation_covariance")) {
            this.orientation_covariance[orientation_covariance_element_index] = orientation_covariance_element.getAsDouble();
        }
        this.angular_velocity = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("angular_velocity").getAsJsonObject());
        int angular_velocity_covariance_element_index = 0;
        for (JsonElement angular_velocity_covariance_element : jsonObj.getAsJsonArray("angular_velocity_covariance")) {
            this.angular_velocity_covariance[angular_velocity_covariance_element_index] = angular_velocity_covariance_element.getAsDouble();
        }
        this.linear_acceleration = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("linear_acceleration").getAsJsonObject());
        int linear_acceleration_covariance_element_index = 0;
        for (JsonElement linear_acceleration_covariance_element : jsonObj.getAsJsonArray("linear_acceleration_covariance")) {
            this.linear_acceleration_covariance[linear_acceleration_covariance_element_index] = linear_acceleration_covariance_element.getAsDouble();
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getOrientation() {
        return this.orientation;
    }
    public java.lang.Double[] getOrientationCovariance() {
        return this.orientation_covariance;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getAngularVelocity() {
        return this.angular_velocity;
    }
    public java.lang.Double[] getAngularVelocityCovariance() {
        return this.angular_velocity_covariance;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getLinearAcceleration() {
        return this.linear_acceleration;
    }
    public java.lang.Double[] getLinearAccelerationCovariance() {
        return this.linear_acceleration_covariance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setOrientation(frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.orientation = orientation;
    }
    public void setOrientationCovariance(java.lang.Double[] orientation_covariance) {
        this.orientation_covariance = orientation_covariance;
    }
    public void setAngularVelocity(frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity) {
        this.angular_velocity = angular_velocity;
    }
    public void setAngularVelocityCovariance(java.lang.Double[] angular_velocity_covariance) {
        this.angular_velocity_covariance = angular_velocity_covariance;
    }
    public void setLinearAcceleration(frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration) {
        this.linear_acceleration = linear_acceleration;
    }
    public void setLinearAccelerationCovariance(java.lang.Double[] linear_acceleration_covariance) {
        this.linear_acceleration_covariance = linear_acceleration_covariance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
