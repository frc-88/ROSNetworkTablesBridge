// Auto generated!! Do not modify.
package frc.team88.ros.messages.trajectory_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class MultiDOFJointTrajectoryPoint extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.geometry_msgs.Transform> transforms = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Twist> velocities = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Twist> accelerations = new ArrayList<>();
    private frc.team88.ros.messages.Duration time_from_start = new frc.team88.ros.messages.Duration();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "trajectory_msgs/MultiDOFJointTrajectoryPoint";

    public MultiDOFJointTrajectoryPoint() {

    }

    public MultiDOFJointTrajectoryPoint(frc.team88.ros.messages.geometry_msgs.Transform[] transforms, frc.team88.ros.messages.geometry_msgs.Twist[] velocities, frc.team88.ros.messages.geometry_msgs.Twist[] accelerations, frc.team88.ros.messages.Duration time_from_start) {
        this.transforms = new ArrayList<>(Arrays.asList(transforms));
        this.velocities = new ArrayList<>(Arrays.asList(velocities));
        this.accelerations = new ArrayList<>(Arrays.asList(accelerations));
        this.time_from_start = time_from_start;
    }

    public MultiDOFJointTrajectoryPoint(JsonObject jsonObj) {
        for (JsonElement transforms_element : jsonObj.getAsJsonArray("transforms")) {
            this.transforms.add(new frc.team88.ros.messages.geometry_msgs.Transform(transforms_element.getAsJsonObject()));
        }
        for (JsonElement velocities_element : jsonObj.getAsJsonArray("velocities")) {
            this.velocities.add(new frc.team88.ros.messages.geometry_msgs.Twist(velocities_element.getAsJsonObject()));
        }
        for (JsonElement accelerations_element : jsonObj.getAsJsonArray("accelerations")) {
            this.accelerations.add(new frc.team88.ros.messages.geometry_msgs.Twist(accelerations_element.getAsJsonObject()));
        }
        this.time_from_start = new frc.team88.ros.messages.Duration(jsonObj.get("time_from_start").getAsJsonObject());
    }

    public ArrayList<frc.team88.ros.messages.geometry_msgs.Transform> getTransforms() {
        return this.transforms;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Twist> getVelocities() {
        return this.velocities;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Twist> getAccelerations() {
        return this.accelerations;
    }
    public frc.team88.ros.messages.Duration getTimeFromStart() {
        return this.time_from_start;
    }

    public void setTransforms(ArrayList<frc.team88.ros.messages.geometry_msgs.Transform> transforms) {
        this.transforms = transforms;
    }
    public void setVelocities(ArrayList<frc.team88.ros.messages.geometry_msgs.Twist> velocities) {
        this.velocities = velocities;
    }
    public void setAccelerations(ArrayList<frc.team88.ros.messages.geometry_msgs.Twist> accelerations) {
        this.accelerations = accelerations;
    }
    public void setTimeFromStart(frc.team88.ros.messages.Duration time_from_start) {
        this.time_from_start = time_from_start;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
