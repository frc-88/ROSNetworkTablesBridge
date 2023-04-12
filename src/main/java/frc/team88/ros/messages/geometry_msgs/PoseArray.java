// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class PoseArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Pose> poses = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/PoseArray";

    public PoseArray() {

    }

    public PoseArray(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.geometry_msgs.Pose[] poses) {
        this.header = header;
        this.poses = new ArrayList<>(Arrays.asList(poses));
    }

    public PoseArray(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        for (JsonElement poses_element : jsonObj.getAsJsonArray("poses")) {
            this.poses.add(new frc.team88.ros.messages.geometry_msgs.Pose(poses_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Pose> getPoses() {
        return this.poses;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setPoses(ArrayList<frc.team88.ros.messages.geometry_msgs.Pose> poses) {
        this.poses = poses;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
