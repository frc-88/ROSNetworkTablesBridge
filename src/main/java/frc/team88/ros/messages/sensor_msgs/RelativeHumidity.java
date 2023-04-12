// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RelativeHumidity extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private double relative_humidity = 0.0;
    private double variance = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/RelativeHumidity";

    public RelativeHumidity() {

    }

    public RelativeHumidity(frc.team88.ros.messages.std_msgs.Header header, double relative_humidity, double variance) {
        this.header = header;
        this.relative_humidity = relative_humidity;
        this.variance = variance;
    }

    public RelativeHumidity(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.relative_humidity = jsonObj.get("relative_humidity").getAsDouble();
        this.variance = jsonObj.get("variance").getAsDouble();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public double getRelativeHumidity() {
        return this.relative_humidity;
    }
    public double getVariance() {
        return this.variance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setRelativeHumidity(double relative_humidity) {
        this.relative_humidity = relative_humidity;
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
