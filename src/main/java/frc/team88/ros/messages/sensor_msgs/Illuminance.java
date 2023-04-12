// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Illuminance extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private double illuminance = 0.0;
    private double variance = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/Illuminance";

    public Illuminance() {

    }

    public Illuminance(frc.team88.ros.messages.std_msgs.Header header, double illuminance, double variance) {
        this.header = header;
        this.illuminance = illuminance;
        this.variance = variance;
    }

    public Illuminance(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.illuminance = jsonObj.get("illuminance").getAsDouble();
        this.variance = jsonObj.get("variance").getAsDouble();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public double getIlluminance() {
        return this.illuminance;
    }
    public double getVariance() {
        return this.variance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setIlluminance(double illuminance) {
        this.illuminance = illuminance;
    }
    public void setVariance(double variance) {
        this.variance = variance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
