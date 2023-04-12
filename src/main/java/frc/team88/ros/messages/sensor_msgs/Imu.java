// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;

public class Imu extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.geometry_msgs.Quaternion orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion();
    private Double[] orientation_covariance = new Double[] {
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
    private Double[] angular_velocity_covariance = new Double[] {
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
    private Double[] linear_acceleration_covariance = new Double[] {
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
    public final String _type = "sensor_msgs/Imu";

    public Imu() {

    }

    public Imu(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Quaternion orientation, Double[] orientation_covariance, frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity, Double[] angular_velocity_covariance, frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration, Double[] linear_acceleration_covariance) {
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
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
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

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getOrientation() {
        return this.orientation;
    }
    public Double[] getOrientationCovariance() {
        return this.orientation_covariance;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getAngularVelocity() {
        return this.angular_velocity;
    }
    public Double[] getAngularVelocityCovariance() {
        return this.angular_velocity_covariance;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getLinearAcceleration() {
        return this.linear_acceleration;
    }
    public Double[] getLinearAccelerationCovariance() {
        return this.linear_acceleration_covariance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setOrientation(frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.orientation = orientation;
    }
    public void setOrientationCovariance(Double[] orientation_covariance) {
        this.orientation_covariance = orientation_covariance;
    }
    public void setAngularVelocity(frc.team88.ros.messages.geometry_msgs.Vector3 angular_velocity) {
        this.angular_velocity = angular_velocity;
    }
    public void setAngularVelocityCovariance(Double[] angular_velocity_covariance) {
        this.angular_velocity_covariance = angular_velocity_covariance;
    }
    public void setLinearAcceleration(frc.team88.ros.messages.geometry_msgs.Vector3 linear_acceleration) {
        this.linear_acceleration = linear_acceleration;
    }
    public void setLinearAccelerationCovariance(Double[] linear_acceleration_covariance) {
        this.linear_acceleration_covariance = linear_acceleration_covariance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
