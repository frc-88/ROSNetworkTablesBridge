// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class PointCloud extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Point32> points = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.sensor_msgs.ChannelFloat32> channels = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/PointCloud";

    public PointCloud() {

    }

    public PointCloud(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Point32[] points, frc.team88.ros.messages.sensor_msgs.ChannelFloat32[] channels) {
        this.header = header;
        this.points = new ArrayList<>(Arrays.asList(points));
        this.channels = new ArrayList<>(Arrays.asList(channels));
    }

    public PointCloud(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points.add(new frc.team88.ros.messages.geometry_msgs.Point32(points_element.getAsJsonObject()));
        }
        for (JsonElement channels_element : jsonObj.getAsJsonArray("channels")) {
            this.channels.add(new frc.team88.ros.messages.sensor_msgs.ChannelFloat32(channels_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Point32> getPoints() {
        return this.points;
    }
    public ArrayList<frc.team88.ros.messages.sensor_msgs.ChannelFloat32> getChannels() {
        return this.channels;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setPoints(ArrayList<frc.team88.ros.messages.geometry_msgs.Point32> points) {
        this.points = points;
    }
    public void setChannels(ArrayList<frc.team88.ros.messages.sensor_msgs.ChannelFloat32> channels) {
        this.channels = channels;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
