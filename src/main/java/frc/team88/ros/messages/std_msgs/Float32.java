// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Float32 extends frc.team88.ros.messages.RosMessage {

    private float data = 0.0f;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Float32";

    public Float32() {

    }

    public Float32(float data) {
        this.data = data;
    }

    public Float32(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsFloat();
    }

    public float getData() {
        return this.data;
    }

    public void setData(float data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
