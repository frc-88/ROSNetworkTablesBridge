// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Range extends frc.team88.ros.messages.RosMessage {
    public static int INFRARED = 1;
    public static int ULTRASOUND = 0;

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private char radiation_type = '';
    private float field_of_view = 0.0f;
    private float min_range = 0.0f;
    private float max_range = 0.0f;
    private float range = 0.0f;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/Range";

    public Range() {

    }

    public Range(frc.team88.ros.messages.std_msgs.Header header, char radiation_type, float field_of_view, float min_range, float max_range, float range) {
        this.header = header;
        this.radiation_type = radiation_type;
        this.field_of_view = field_of_view;
        this.min_range = min_range;
        this.max_range = max_range;
        this.range = range;
    }

    public Range(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.radiation_type = (char)jsonObj.get("radiation_type").getAsByte();
        this.field_of_view = jsonObj.get("field_of_view").getAsFloat();
        this.min_range = jsonObj.get("min_range").getAsFloat();
        this.max_range = jsonObj.get("max_range").getAsFloat();
        this.range = jsonObj.get("range").getAsFloat();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public char getRadiationType() {
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

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setRadiationType(char radiation_type) {
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

    public String toString() {
        return ginst.toJson(this);
    }
}
