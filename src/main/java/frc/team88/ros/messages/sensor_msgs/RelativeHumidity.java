// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RelativeHumidity extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private double relative_humidity = 0.0;
    private double variance = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/RelativeHumidity";

    public RelativeHumidity() {

    }

    public RelativeHumidity(frc.team88.ros.messages.std_msgs.RosHeader header, double relative_humidity, double variance) {
        this.header = header;
        this.relative_humidity = relative_humidity;
        this.variance = variance;
    }

    public RelativeHumidity(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.relative_humidity = jsonObj.get("relative_humidity").getAsDouble();
        this.variance = jsonObj.get("variance").getAsDouble();
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public double getRelativeHumidity() {
        return this.relative_humidity;
    }
    public double getVariance() {
        return this.variance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
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

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
