// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RegionOfInterest extends frc.team88.ros.messages.RosMessage {

    private int x_offset = 0;
    private int y_offset = 0;
    private int height = 0;
    private int width = 0;
    private boolean do_rectify = false;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/RegionOfInterest";

    public RegionOfInterest() {

    }

    public RegionOfInterest(int x_offset, int y_offset, int height, int width, boolean do_rectify) {
        this.x_offset = x_offset;
        this.y_offset = y_offset;
        this.height = height;
        this.width = width;
        this.do_rectify = do_rectify;
    }

    public RegionOfInterest(JsonObject jsonObj) {
        this.x_offset = jsonObj.get("x_offset").getAsInt();
        this.y_offset = jsonObj.get("y_offset").getAsInt();
        this.height = jsonObj.get("height").getAsInt();
        this.width = jsonObj.get("width").getAsInt();
        this.do_rectify = jsonObj.get("do_rectify").getAsBoolean();
    }

    public int getXOffset() {
        return this.x_offset;
    }
    public int getYOffset() {
        return this.y_offset;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public boolean getDoRectify() {
        return this.do_rectify;
    }

    public void setXOffset(int x_offset) {
        this.x_offset = x_offset;
    }
    public void setYOffset(int y_offset) {
        this.y_offset = y_offset;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setDoRectify(boolean do_rectify) {
        this.do_rectify = do_rectify;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
