// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class FluidPressure extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private double fluid_pressure = 0.0;
    private double variance = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/FluidPressure";

    public FluidPressure() {

    }

    public FluidPressure(frc.team88.ros.messages.std_msgs.Header header, double fluid_pressure, double variance) {
        this.header = header;
        this.fluid_pressure = fluid_pressure;
        this.variance = variance;
    }

    public FluidPressure(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.fluid_pressure = jsonObj.get("fluid_pressure").getAsDouble();
        this.variance = jsonObj.get("variance").getAsDouble();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public double getFluidPressure() {
        return this.fluid_pressure;
    }
    public double getVariance() {
        return this.variance;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setFluidPressure(double fluid_pressure) {
        this.fluid_pressure = fluid_pressure;
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
