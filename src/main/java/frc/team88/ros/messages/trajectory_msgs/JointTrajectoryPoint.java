// Auto generated!! Do not modify.
package frc.team88.ros.messages.trajectory_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class JointTrajectoryPoint extends frc.team88.ros.messages.RosMessage {

    private ArrayList<java.lang.Double> positions = new ArrayList<>();
    private ArrayList<java.lang.Double> velocities = new ArrayList<>();
    private ArrayList<java.lang.Double> accelerations = new ArrayList<>();
    private ArrayList<java.lang.Double> effort = new ArrayList<>();
    private frc.team88.ros.messages.DurationPrimitive time_from_start = new frc.team88.ros.messages.DurationPrimitive();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "trajectory_msgs/JointTrajectoryPoint";

    public JointTrajectoryPoint() {

    }

    public JointTrajectoryPoint(java.lang.Double[] positions, java.lang.Double[] velocities, java.lang.Double[] accelerations, java.lang.Double[] effort, frc.team88.ros.messages.DurationPrimitive time_from_start) {
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
        this.time_from_start = new frc.team88.ros.messages.DurationPrimitive(jsonObj.get("time_from_start").getAsJsonObject());
    }

    public ArrayList<java.lang.Double> getPositions() {
        return this.positions;
    }
    public ArrayList<java.lang.Double> getVelocities() {
        return this.velocities;
    }
    public ArrayList<java.lang.Double> getAccelerations() {
        return this.accelerations;
    }
    public ArrayList<java.lang.Double> getEffort() {
        return this.effort;
    }
    public frc.team88.ros.messages.DurationPrimitive getTimeFromStart() {
        return this.time_from_start;
    }

    public void setPositions(ArrayList<java.lang.Double> positions) {
        this.positions = positions;
    }
    public void setVelocities(ArrayList<java.lang.Double> velocities) {
        this.velocities = velocities;
    }
    public void setAccelerations(ArrayList<java.lang.Double> accelerations) {
        this.accelerations = accelerations;
    }
    public void setEffort(ArrayList<java.lang.Double> effort) {
        this.effort = effort;
    }
    public void setTimeFromStart(frc.team88.ros.messages.DurationPrimitive time_from_start) {
        this.time_from_start = time_from_start;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
