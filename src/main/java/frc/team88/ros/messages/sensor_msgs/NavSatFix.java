// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class NavSatFix extends frc.team88.ros.messages.RosMessage {
    public static int COVARIANCE_TYPE_UNKNOWN = 0;
    public static int COVARIANCE_TYPE_APPROXIMATED = 1;
    public static int COVARIANCE_TYPE_DIAGONAL_KNOWN = 2;
    public static int COVARIANCE_TYPE_KNOWN = 3;

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.sensor_msgs.NavSatStatus status = new frc.team88.ros.messages.sensor_msgs.NavSatStatus();
    private double latitude = 0.0;
    private double longitude = 0.0;
    private double altitude = 0.0;
    private java.lang.Double[] position_covariance = new java.lang.Double[] {
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
    private char position_covariance_type = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/NavSatFix";

    public NavSatFix() {

    }

    public NavSatFix(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.sensor_msgs.NavSatStatus status, double latitude, double longitude, double altitude, java.lang.Double[] position_covariance, char position_covariance_type) {
        this.header = header;
        this.status = status;
        this.latitude = latitude;
        this.longitude = longitude;
        this.altitude = altitude;
        for (int index = 0; index < 9; index++) {
            this.position_covariance[index] = position_covariance[index];
        }
        this.position_covariance_type = position_covariance_type;
    }

    public NavSatFix(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.status = new frc.team88.ros.messages.sensor_msgs.NavSatStatus(jsonObj.get("status").getAsJsonObject());
        this.latitude = jsonObj.get("latitude").getAsDouble();
        this.longitude = jsonObj.get("longitude").getAsDouble();
        this.altitude = jsonObj.get("altitude").getAsDouble();
        int position_covariance_element_index = 0;
        for (JsonElement position_covariance_element : jsonObj.getAsJsonArray("position_covariance")) {
            this.position_covariance[position_covariance_element_index] = position_covariance_element.getAsDouble();
        }
        this.position_covariance_type = (char)jsonObj.get("position_covariance_type").getAsByte();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.sensor_msgs.NavSatStatus getStatus() {
        return this.status;
    }
    public double getLatitude() {
        return this.latitude;
    }
    public double getLongitude() {
        return this.longitude;
    }
    public double getAltitude() {
        return this.altitude;
    }
    public java.lang.Double[] getPositionCovariance() {
        return this.position_covariance;
    }
    public char getPositionCovarianceType() {
        return this.position_covariance_type;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setStatus(frc.team88.ros.messages.sensor_msgs.NavSatStatus status) {
        this.status = status;
    }
    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }
    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }
    public void setPositionCovariance(java.lang.Double[] position_covariance) {
        this.position_covariance = position_covariance;
    }
    public void setPositionCovarianceType(char position_covariance_type) {
        this.position_covariance_type = position_covariance_type;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
