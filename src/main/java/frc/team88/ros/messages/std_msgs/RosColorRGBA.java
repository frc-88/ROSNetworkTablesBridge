// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RosColorRGBA extends frc.team88.ros.messages.RosMessage {

    private float r = 0.0f;
    private float g = 0.0f;
    private float b = 0.0f;
    private float a = 0.0f;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/ColorRGBA";

    public RosColorRGBA() {

    }

    public RosColorRGBA(float r, float g, float b, float a) {
        this.r = r;
        this.g = g;
        this.b = b;
        this.a = a;
    }

    public RosColorRGBA(JsonObject jsonObj) {
        this.r = jsonObj.get("r").getAsFloat();
        this.g = jsonObj.get("g").getAsFloat();
        this.b = jsonObj.get("b").getAsFloat();
        this.a = jsonObj.get("a").getAsFloat();
    }

    public float getR() {
        return this.r;
    }
    public float getG() {
        return this.g;
    }
    public float getB() {
        return this.b;
    }
    public float getA() {
        return this.a;
    }

    public void setR(float r) {
        this.r = r;
    }
    public void setG(float g) {
        this.g = g;
    }
    public void setB(float b) {
        this.b = b;
    }
    public void setA(float a) {
        this.a = a;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
