// Auto generated!! Do not modify.
package frc.team88.ros.messages.stereo_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class DisparityImage extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.sensor_msgs.Image image = new frc.team88.ros.messages.sensor_msgs.Image();
    private float f = 0.0f;
    private float T = 0.0f;
    private frc.team88.ros.messages.sensor_msgs.RegionOfInterest valid_window = new frc.team88.ros.messages.sensor_msgs.RegionOfInterest();
    private float min_disparity = 0.0f;
    private float max_disparity = 0.0f;
    private float delta_d = 0.0f;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "stereo_msgs/DisparityImage";

    public DisparityImage() {

    }

    public DisparityImage(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.sensor_msgs.Image image, float f, float T, frc.team88.ros.messages.sensor_msgs.RegionOfInterest valid_window, float min_disparity, float max_disparity, float delta_d) {
        this.header = header;
        this.image = image;
        this.f = f;
        this.T = T;
        this.valid_window = valid_window;
        this.min_disparity = min_disparity;
        this.max_disparity = max_disparity;
        this.delta_d = delta_d;
    }

    public DisparityImage(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.image = new frc.team88.ros.messages.sensor_msgs.Image(jsonObj.get("image").getAsJsonObject());
        this.f = jsonObj.get("f").getAsFloat();
        this.T = jsonObj.get("T").getAsFloat();
        this.valid_window = new frc.team88.ros.messages.sensor_msgs.RegionOfInterest(jsonObj.get("valid_window").getAsJsonObject());
        this.min_disparity = jsonObj.get("min_disparity").getAsFloat();
        this.max_disparity = jsonObj.get("max_disparity").getAsFloat();
        this.delta_d = jsonObj.get("delta_d").getAsFloat();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.sensor_msgs.Image getImage() {
        return this.image;
    }
    public float getF() {
        return this.f;
    }
    public float getT() {
        return this.T;
    }
    public frc.team88.ros.messages.sensor_msgs.RegionOfInterest getValidWindow() {
        return this.valid_window;
    }
    public float getMinDisparity() {
        return this.min_disparity;
    }
    public float getMaxDisparity() {
        return this.max_disparity;
    }
    public float getDeltaD() {
        return this.delta_d;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setImage(frc.team88.ros.messages.sensor_msgs.Image image) {
        this.image = image;
    }
    public void setF(float f) {
        this.f = f;
    }
    public void setT(float T) {
        this.T = T;
    }
    public void setValidWindow(frc.team88.ros.messages.sensor_msgs.RegionOfInterest valid_window) {
        this.valid_window = valid_window;
    }
    public void setMinDisparity(float min_disparity) {
        this.min_disparity = min_disparity;
    }
    public void setMaxDisparity(float max_disparity) {
        this.max_disparity = max_disparity;
    }
    public void setDeltaD(float delta_d) {
        this.delta_d = delta_d;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
