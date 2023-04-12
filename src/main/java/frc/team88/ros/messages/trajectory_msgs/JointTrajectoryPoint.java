// Auto generated!! Do not modify.
package frc.team88.ros.messages.trajectory_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class JointTrajectoryPoint extends frc.team88.ros.messages.RosMessage {

    private ArrayList<Double> positions = new ArrayList<>();
    private ArrayList<Double> velocities = new ArrayList<>();
    private ArrayList<Double> accelerations = new ArrayList<>();
    private ArrayList<Double> effort = new ArrayList<>();
    private frc.team88.ros.messages.Duration time_from_start = new frc.team88.ros.messages.Duration();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "trajectory_msgs/JointTrajectoryPoint";

    public JointTrajectoryPoint() {

    }

    public JointTrajectoryPoint(Double[] positions, Double[] velocities, Double[] accelerations, Double[] effort, frc.team88.ros.messages.Duration time_from_start) {
        this.positions = new ArrayList<>(Arrays.asList(positions));
        this.velocities = new ArrayList<>(Arrays.asList(velocities));
        this.accelerations = new ArrayList<>(Arrays.asList(accelerations));
        this.effort = new ArrayList<>(Arrays.asList(effort));
        this.time_from_start = time_from_start;
    }

    public JointTrajectoryPoint(JsonObject jsonObj) {
        for (JsonElement positions_element : jsonObj.getAsJsonArray("positions")) {
            this.positions.add(positions_element.getAsDouble());
        }
        for (JsonElement velocities_element : jsonObj.getAsJsonArray("velocities")) {
            this.velocities.add(velocities_element.getAsDouble());
        }
        for (JsonElement accelerations_element : jsonObj.getAsJsonArray("accelerations")) {
            this.accelerations.add(accelerations_element.getAsDouble());
        }
        for (JsonElement effort_element : jsonObj.getAsJsonArray("effort")) {
            this.effort.add(effort_element.getAsDouble());
        }
        this.time_from_start = new frc.team88.ros.messages.Duration(jsonObj.get("time_from_start").getAsJsonObject());
    }

    public ArrayList<Double> getPositions() {
        return this.positions;
    }
    public ArrayList<Double> getVelocities() {
        return this.velocities;
    }
    public ArrayList<Double> getAccelerations() {
        return this.accelerations;
    }
    public ArrayList<Double> getEffort() {
        return this.effort;
    }
    public frc.team88.ros.messages.Duration getTimeFromStart() {
        return this.time_from_start;
    }

    public void setPositions(ArrayList<Double> positions) {
        this.positions = positions;
    }
    public void setVelocities(ArrayList<Double> velocities) {
        this.velocities = velocities;
    }
    public void setAccelerations(ArrayList<Double> accelerations) {
        this.accelerations = accelerations;
    }
    public void setEffort(ArrayList<Double> effort) {
        this.effort = effort;
    }
    public void setTimeFromStart(frc.team88.ros.messages.Duration time_from_start) {
        this.time_from_start = time_from_start;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
