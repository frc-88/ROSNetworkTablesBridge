// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class JoyFeedback extends frc.team88.ros.messages.RosMessage {
    public static int TYPE_LED = 0;
    public static int TYPE_RUMBLE = 1;
    public static int TYPE_BUZZER = 2;

    private byte type = 0;
    private byte id = 0;
    private float intensity = 0.0f;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/JoyFeedback";

    public JoyFeedback() {

    }

    public JoyFeedback(byte type, byte id, float intensity) {
        this.type = type;
        this.id = id;
        this.intensity = intensity;
    }

    public JoyFeedback(JsonObject jsonObj) {
        this.type = jsonObj.get("type").getAsByte();
        this.id = jsonObj.get("id").getAsByte();
        this.intensity = jsonObj.get("intensity").getAsFloat();
    }

    public byte getType() {
        return this.type;
    }
    public byte getId() {
        return this.id;
    }
    public float getIntensity() {
        return this.intensity;
    }

    public void setType(byte type) {
        this.type = type;
    }
    public void setId(byte id) {
        this.id = id;
    }
    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
