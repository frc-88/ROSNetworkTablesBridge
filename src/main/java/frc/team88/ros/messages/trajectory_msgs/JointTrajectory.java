// Auto generated!! Do not modify.
package frc.team88.ros.messages.trajectory_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class JointTrajectory extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private ArrayList<java.lang.String> joint_names = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.trajectory_msgs.JointTrajectoryPoint> points = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "trajectory_msgs/JointTrajectory";

    public JointTrajectory() {

    }

    public JointTrajectory(frc.team88.ros.messages.std_msgs.RosHeader header, java.lang.String[] joint_names, frc.team88.ros.messages.trajectory_msgs.JointTrajectoryPoint[] points) {
        this.header = header;
        this.joint_names = new ArrayList<>(Arrays.asList(joint_names));
        this.points = new ArrayList<>(Arrays.asList(points));
    }

    public JointTrajectory(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        for (JsonElement joint_names_element : jsonObj.getAsJsonArray("joint_names")) {
            this.joint_names.add(joint_names_element.getAsString());
        }
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points.add(new frc.team88.ros.messages.trajectory_msgs.JointTrajectoryPoint(points_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public ArrayList<java.lang.String> getJointNames() {
        return this.joint_names;
    }
    public ArrayList<frc.team88.ros.messages.trajectory_msgs.JointTrajectoryPoint> getPoints() {
        return this.points;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setJointNames(ArrayList<java.lang.String> joint_names) {
        this.joint_names = joint_names;
    }
    public void setPoints(ArrayList<frc.team88.ros.messages.trajectory_msgs.JointTrajectoryPoint> points) {
        this.points = points;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
