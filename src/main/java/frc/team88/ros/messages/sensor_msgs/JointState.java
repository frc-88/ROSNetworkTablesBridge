// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class JointState extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<java.lang.String> name = new ArrayList<>();
    private ArrayList<java.lang.Double> position = new ArrayList<>();
    private ArrayList<java.lang.Double> velocity = new ArrayList<>();
    private ArrayList<java.lang.Double> effort = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/JointState";

    public JointState() {

    }

    public JointState(frc.team88.ros.messages.std_msgs.Header header, java.lang.String[] name, java.lang.Double[] position, java.lang.Double[] velocity, java.lang.Double[] effort) {
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
    public ArrayList<java.lang.String> getName() {
        return this.name;
    }
    public ArrayList<java.lang.Double> getPosition() {
        return this.position;
    }
    public ArrayList<java.lang.Double> getVelocity() {
        return this.velocity;
    }
    public ArrayList<java.lang.Double> getEffort() {
        return this.effort;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setName(ArrayList<java.lang.String> name) {
        this.name = name;
    }
    public void setPosition(ArrayList<java.lang.Double> position) {
        this.position = position;
    }
    public void setVelocity(ArrayList<java.lang.Double> velocity) {
        this.velocity = velocity;
    }
    public void setEffort(ArrayList<java.lang.Double> effort) {
        this.effort = effort;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
