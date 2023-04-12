// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class MapMetaData extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.Time map_load_time = new frc.team88.ros.messages.Time();
    private float resolution = 0.0f;
    private int width = 0;
    private int height = 0;
    private frc.team88.ros.messages.geometry_msgs.Pose origin = new frc.team88.ros.messages.geometry_msgs.Pose();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "nav_msgs/MapMetaData";

    public MapMetaData() {

    }

    public MapMetaData(frc.team88.ros.messages.Time map_load_time, float resolution, int width, int height, frc.team88.ros.messages.geometry_msgs.Pose origin) {
        this.map_load_time = map_load_time;
        this.resolution = resolution;
        this.width = width;
        this.height = height;
        this.origin = origin;
    }

    public MapMetaData(JsonObject jsonObj) {
        this.map_load_time = new frc.team88.ros.messages.Time(jsonObj.get("map_load_time").getAsJsonObject());
        this.resolution = jsonObj.get("resolution").getAsFloat();
        this.width = jsonObj.get("width").getAsInt();
        this.height = jsonObj.get("height").getAsInt();
        this.origin = new frc.team88.ros.messages.geometry_msgs.Pose(jsonObj.get("origin").getAsJsonObject());
    }

    public frc.team88.ros.messages.Time getMapLoadTime() {
        return this.map_load_time;
    }
    public float getResolution() {
        return this.resolution;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }
    public frc.team88.ros.messages.geometry_msgs.Pose getOrigin() {
        return this.origin;
    }

    public void setMapLoadTime(frc.team88.ros.messages.Time map_load_time) {
        this.map_load_time = map_load_time;
    }
    public void setResolution(float resolution) {
        this.resolution = resolution;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setOrigin(frc.team88.ros.messages.geometry_msgs.Pose origin) {
        this.origin = origin;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
