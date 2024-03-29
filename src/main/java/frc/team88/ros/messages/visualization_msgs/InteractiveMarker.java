// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class InteractiveMarker extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.geometry_msgs.Pose pose = new frc.team88.ros.messages.geometry_msgs.Pose();
    private java.lang.String name = "";
    private java.lang.String description = "";
    private float scale = 0.0f;
    private ArrayList<frc.team88.ros.messages.visualization_msgs.MenuEntry> menu_entries = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarkerControl> controls = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/InteractiveMarker";

    public InteractiveMarker() {

    }

    public InteractiveMarker(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.geometry_msgs.Pose pose, java.lang.String name, java.lang.String description, float scale, frc.team88.ros.messages.visualization_msgs.MenuEntry[] menu_entries, frc.team88.ros.messages.visualization_msgs.InteractiveMarkerControl[] controls) {
        this.header = header;
        this.pose = pose;
        this.name = name;
        this.description = description;
        this.scale = scale;
        this.menu_entries = new ArrayList<>(Arrays.asList(menu_entries));
        this.controls = new ArrayList<>(Arrays.asList(controls));
    }

    public InteractiveMarker(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.pose = new frc.team88.ros.messages.geometry_msgs.Pose(jsonObj.get("pose").getAsJsonObject());
        this.name = jsonObj.get("name").getAsString();
        this.description = jsonObj.get("description").getAsString();
        this.scale = jsonObj.get("scale").getAsFloat();
        for (JsonElement menu_entries_element : jsonObj.getAsJsonArray("menu_entries")) {
            this.menu_entries.add(new frc.team88.ros.messages.visualization_msgs.MenuEntry(menu_entries_element.getAsJsonObject()));
        }
        for (JsonElement controls_element : jsonObj.getAsJsonArray("controls")) {
            this.controls.add(new frc.team88.ros.messages.visualization_msgs.InteractiveMarkerControl(controls_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.geometry_msgs.Pose getPose() {
        return this.pose;
    }
    public java.lang.String getName() {
        return this.name;
    }
    public java.lang.String getDescription() {
        return this.description;
    }
    public float getScale() {
        return this.scale;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.MenuEntry> getMenuEntries() {
        return this.menu_entries;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarkerControl> getControls() {
        return this.controls;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        this.pose = pose;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public void setDescription(java.lang.String description) {
        this.description = description;
    }
    public void setScale(float scale) {
        this.scale = scale;
    }
    public void setMenuEntries(ArrayList<frc.team88.ros.messages.visualization_msgs.MenuEntry> menu_entries) {
        this.menu_entries = menu_entries;
    }
    public void setControls(ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarkerControl> controls) {
        this.controls = controls;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
