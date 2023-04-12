// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Temperature extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private double temperature = 0.0;
    private double variance = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/Temperature";

    public Temperature() {

    }

    public Temperature(frc.team88.ros.messages.std_msgs.Header header, double temperature, double variance) {
        this.header = header;
        this.temperature = temperature;
        this.variance = variance;
    }

    public Temperature(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.temperature = jsonObj.get("temperature").getAsDouble();
        this.variance = jsonObj.get("variance").getAsDouble();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public double getTemperature() {
        return this.temperature;
    }
    public double getVariance() {
        return this.variance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }
    public void setVariance(double variance) {
        this.variance = variance;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
