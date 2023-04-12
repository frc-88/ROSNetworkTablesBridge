// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Float64 extends frc.team88.ros.messages.RosMessage {

    private double data = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Float64";

    public Float64() {

    }

    public Float64(double data) {
        this.data = data;
    }

    public Float64(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsDouble();
    }

    public double getData() {
        return this.data;
    }

    public void setData(double data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
