// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class JointState extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<String> name = new ArrayList<>();
    private ArrayList<Double> position = new ArrayList<>();
    private ArrayList<Double> velocity = new ArrayList<>();
    private ArrayList<Double> effort = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/JointState";

    public JointState() {

    }

    public JointState(frc.team88.ros.messages.std_msgs.Header header, String[] name, Double[] position, Double[] velocity, Double[] effort) {
        this.header = header;
        this.name = new ArrayList<>(Arrays.asList(name));
        this.position = new ArrayList<>(Arrays.asList(position));
        this.velocity = new ArrayList<>(Arrays.asList(velocity));
        this.effort = new ArrayList<>(Arrays.asList(effort));
    }

    public JointState(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        for (JsonElement name_element : jsonObj.getAsJsonArray("name")) {
            this.name.add(name_element.getAsString());
        }
        for (JsonElement position_element : jsonObj.getAsJsonArray("position")) {
            this.position.add(position_element.getAsDouble());
        }
        for (JsonElement velocity_element : jsonObj.getAsJsonArray("velocity")) {
            this.velocity.add(velocity_element.getAsDouble());
        }
        for (JsonElement effort_element : jsonObj.getAsJsonArray("effort")) {
            this.effort.add(effort_element.getAsDouble());
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public ArrayList<String> getName() {
        return this.name;
    }
    public ArrayList<Double> getPosition() {
        return this.position;
    }
    public ArrayList<Double> getVelocity() {
        return this.velocity;
    }
    public ArrayList<Double> getEffort() {
        return this.effort;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setName(ArrayList<String> name) {
        this.name = name;
    }
    public void setPosition(ArrayList<Double> position) {
        this.position = position;
    }
    public void setVelocity(ArrayList<Double> velocity) {
        this.velocity = velocity;
    }
    public void setEffort(ArrayList<Double> effort) {
        this.effort = effort;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
