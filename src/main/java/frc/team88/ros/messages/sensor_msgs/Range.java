// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Range extends frc.team88.ros.messages.RosMessage {
    public static int ULTRASOUND = 0;
    public static int INFRARED = 1;

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private byte radiation_type = 0;
    private float field_of_view = 0.0f;
    private float min_range = 0.0f;
    private float max_range = 0.0f;
    private float range = 0.0f;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/Range";

    public Range() {

    }

    public Range(frc.team88.ros.messages.std_msgs.RosHeader header, byte radiation_type, float field_of_view, float min_range, float max_range, float range) {
        this.header = header;
        this.radiation_type = radiation_type;
        this.field_of_view = field_of_view;
        this.min_range = min_range;
        this.max_range = max_range;
        this.range = range;
    }

    public Range(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.radiation_type = jsonObj.get("radiation_type").getAsByte();
        this.field_of_view = jsonObj.get("field_of_view").getAsFloat();
        this.min_range = jsonObj.get("min_range").getAsFloat();
        this.max_range = jsonObj.get("max_range").getAsFloat();
        this.range = jsonObj.get("range").getAsFloat();
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public byte getRadiationType() {
        return this.radiation_type;
    }
    public float getFieldOfView() {
        return this.field_of_view;
    }
    public float getMinRange() {
        return this.min_range;
    }
    public float getMaxRange() {
        return this.max_range;
    }
    public float getRange() {
        return this.range;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setRadiationType(byte radiation_type) {
        this.radiation_type = radiation_type;
    }
    public void setFieldOfView(float field_of_view) {
        this.field_of_view = field_of_view;
    }
    public void setMinRange(float min_range) {
        this.min_range = min_range;
    }
    public void setMaxRange(float max_range) {
        this.max_range = max_range;
    }
    public void setRange(float range) {
        this.range = range;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
