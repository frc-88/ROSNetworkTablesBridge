// Auto generated!! Do not modify.
package frc.team88.ros.messages.trajectory_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class MultiDOFJointTrajectory extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<String> joint_names = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.trajectory_msgs.MultiDOFJointTrajectoryPoint> points = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "trajectory_msgs/MultiDOFJointTrajectory";

    public MultiDOFJointTrajectory() {

    }

    public MultiDOFJointTrajectory(frc.team88.ros.messages.std_msgs.Header header, String[] joint_names, frc.team88.ros.messages.trajectory_msgs.MultiDOFJointTrajectoryPoint[] points) {
        this.header = header;
        this.joint_names = new ArrayList<>(Arrays.asList(joint_names));
        this.points = new ArrayList<>(Arrays.asList(points));
    }

    public MultiDOFJointTrajectory(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        for (JsonElement joint_names_element : jsonObj.getAsJsonArray("joint_names")) {
            this.joint_names.add(joint_names_element.getAsString());
        }
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points.add(new frc.team88.ros.messages.trajectory_msgs.MultiDOFJointTrajectoryPoint(points_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public ArrayList<String> getJointNames() {
        return this.joint_names;
    }
    public ArrayList<frc.team88.ros.messages.trajectory_msgs.MultiDOFJointTrajectoryPoint> getPoints() {
        return this.points;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setJointNames(ArrayList<String> joint_names) {
        this.joint_names = joint_names;
    }
    public void setPoints(ArrayList<frc.team88.ros.messages.trajectory_msgs.MultiDOFJointTrajectoryPoint> points) {
        this.points = points;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
