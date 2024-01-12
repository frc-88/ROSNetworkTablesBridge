// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class InteractiveMarkerControl extends frc.team88.ros.messages.RosMessage {
    public static int INHERIT = 0;
    public static int FIXED = 1;
    public static int VIEW_FACING = 2;
    public static int NONE = 0;
    public static int MENU = 1;
    public static int BUTTON = 2;
    public static int MOVE_AXIS = 3;
    public static int MOVE_PLANE = 4;
    public static int ROTATE_AXIS = 5;
    public static int MOVE_ROTATE = 6;
    public static int MOVE_3D = 7;
    public static int ROTATE_3D = 8;
    public static int MOVE_ROTATE_3D = 9;

    private java.lang.String name = "";
    private frc.team88.ros.messages.geometry_msgs.Quaternion orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion();
    private byte orientation_mode = 0;
    private byte interaction_mode = 0;
    private boolean always_visible = false;
    private ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> markers = new ArrayList<>();
    private boolean independent_marker_orientation = false;
    private java.lang.String description = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/InteractiveMarkerControl";

    public InteractiveMarkerControl() {

    }

    public InteractiveMarkerControl(java.lang.String name, frc.team88.ros.messages.geometry_msgs.Quaternion orientation, byte orientation_mode, byte interaction_mode, boolean always_visible, frc.team88.ros.messages.visualization_msgs.Marker[] markers, boolean independent_marker_orientation, java.lang.String description) {
        this.name = name;
        this.orientation = orientation;
        this.orientation_mode = orientation_mode;
        this.interaction_mode = interaction_mode;
        this.always_visible = always_visible;
        this.markers = new ArrayList<>(Arrays.asList(markers));
        this.independent_marker_orientation = independent_marker_orientation;
        this.description = description;
    }

    public InteractiveMarkerControl(JsonObject jsonObj) {
        this.name = jsonObj.get("name").getAsString();
        this.orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion(jsonObj.get("orientation").getAsJsonObject());
        this.orientation_mode = jsonObj.get("orientation_mode").getAsByte();
        this.interaction_mode = jsonObj.get("interaction_mode").getAsByte();
        this.always_visible = jsonObj.get("always_visible").getAsBoolean();
        for (JsonElement markers_element : jsonObj.getAsJsonArray("markers")) {
            this.markers.add(new frc.team88.ros.messages.visualization_msgs.Marker(markers_element.getAsJsonObject()));
        }
        this.independent_marker_orientation = jsonObj.get("independent_marker_orientation").getAsBoolean();
        this.description = jsonObj.get("description").getAsString();
    }

    public java.lang.String getName() {
        return this.name;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getOrientation() {
        return this.orientation;
    }
    public byte getOrientationMode() {
        return this.orientation_mode;
    }
    public byte getInteractionMode() {
        return this.interaction_mode;
    }
    public boolean getAlwaysVisible() {
        return this.always_visible;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> getMarkers() {
        return this.markers;
    }
    public boolean getIndependentMarkerOrientation() {
        return this.independent_marker_orientation;
    }
    public java.lang.String getDescription() {
        return this.description;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    public void setOrientation(frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.orientation = orientation;
    }
    public void setOrientationMode(byte orientation_mode) {
        this.orientation_mode = orientation_mode;
    }
    public void setInteractionMode(byte interaction_mode) {
        this.interaction_mode = interaction_mode;
    }
    public void setAlwaysVisible(boolean always_visible) {
        this.always_visible = always_visible;
    }
    public void setMarkers(ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> markers) {
        this.markers = markers;
    }
    public void setIndependentMarkerOrientation(boolean independent_marker_orientation) {
        this.independent_marker_orientation = independent_marker_orientation;
    }
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
