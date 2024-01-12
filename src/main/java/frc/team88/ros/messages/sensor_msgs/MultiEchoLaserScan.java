// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiEchoLaserScan extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private float angle_min = 0.0f;
    private float angle_max = 0.0f;
    private float angle_increment = 0.0f;
    private float time_increment = 0.0f;
    private float scan_time = 0.0f;
    private float range_min = 0.0f;
    private float range_max = 0.0f;
    private ArrayList<frc.team88.ros.messages.sensor_msgs.LaserEcho> ranges = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.sensor_msgs.LaserEcho> intensities = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/MultiEchoLaserScan";

    public MultiEchoLaserScan() {

    }

    public MultiEchoLaserScan(frc.team88.ros.messages.std_msgs.RosHeader header, float angle_min, float angle_max, float angle_increment, float time_increment, float scan_time, float range_min, float range_max, frc.team88.ros.messages.sensor_msgs.LaserEcho[] ranges, frc.team88.ros.messages.sensor_msgs.LaserEcho[] intensities) {
        this.header = header;
        this.angle_min = angle_min;
        this.angle_max = angle_max;
        this.angle_increment = angle_increment;
        this.time_increment = time_increment;
        this.scan_time = scan_time;
        this.range_min = range_min;
        this.range_max = range_max;
        this.ranges = new ArrayList<>(Arrays.asList(ranges));
        this.intensities = new ArrayList<>(Arrays.asList(intensities));
    }

    public MultiEchoLaserScan(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.angle_min = jsonObj.get("angle_min").getAsFloat();
        this.angle_max = jsonObj.get("angle_max").getAsFloat();
        this.angle_increment = jsonObj.get("angle_increment").getAsFloat();
        this.time_increment = jsonObj.get("time_increment").getAsFloat();
        this.scan_time = jsonObj.get("scan_time").getAsFloat();
        this.range_min = jsonObj.get("range_min").getAsFloat();
        this.range_max = jsonObj.get("range_max").getAsFloat();
        for (JsonElement ranges_element : jsonObj.getAsJsonArray("ranges")) {
            this.ranges.add(new frc.team88.ros.messages.sensor_msgs.LaserEcho(ranges_element.getAsJsonObject()));
        }
        for (JsonElement intensities_element : jsonObj.getAsJsonArray("intensities")) {
            this.intensities.add(new frc.team88.ros.messages.sensor_msgs.LaserEcho(intensities_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public float getAngleMin() {
        return this.angle_min;
    }
    public float getAngleMax() {
        return this.angle_max;
    }
    public float getAngleIncrement() {
        return this.angle_increment;
    }
    public float getTimeIncrement() {
        return this.time_increment;
    }
    public float getScanTime() {
        return this.scan_time;
    }
    public float getRangeMin() {
        return this.range_min;
    }
    public float getRangeMax() {
        return this.range_max;
    }
    public ArrayList<frc.team88.ros.messages.sensor_msgs.LaserEcho> getRanges() {
        return this.ranges;
    }
    public ArrayList<frc.team88.ros.messages.sensor_msgs.LaserEcho> getIntensities() {
        return this.intensities;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setAngleMin(float angle_min) {
        this.angle_min = angle_min;
    }
    public void setAngleMax(float angle_max) {
        this.angle_max = angle_max;
    }
    public void setAngleIncrement(float angle_increment) {
        this.angle_increment = angle_increment;
    }
    public void setTimeIncrement(float time_increment) {
        this.time_increment = time_increment;
    }
    public void setScanTime(float scan_time) {
        this.scan_time = scan_time;
    }
    public void setRangeMin(float range_min) {
        this.range_min = range_min;
    }
    public void setRangeMax(float range_max) {
        this.range_max = range_max;
    }
    public void setRanges(ArrayList<frc.team88.ros.messages.sensor_msgs.LaserEcho> ranges) {
        this.ranges = ranges;
    }
    public void setIntensities(ArrayList<frc.team88.ros.messages.sensor_msgs.LaserEcho> intensities) {
        this.intensities = intensities;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
