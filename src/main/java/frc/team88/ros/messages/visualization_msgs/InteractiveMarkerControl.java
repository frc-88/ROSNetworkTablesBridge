// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class InteractiveMarkerControl extends frc.team88.ros.messages.RosMessage {
    public static int FIXED = 1;
    public static int MOVE_ROTATE = 6;
    public static int INHERIT = 0;
    public static int MENU = 1;
    public static int MOVE_PLANE = 4;
    public static int ROTATE_AXIS = 5;
    public static int BUTTON = 2;
    public static int NONE = 0;
    public static int MOVE_3D = 7;
    public static int MOVE_AXIS = 3;
    public static int VIEW_FACING = 2;
    public static int MOVE_ROTATE_3D = 9;
    public static int ROTATE_3D = 8;

    private String name = "";
    private frc.team88.ros.messages.geometry_msgs.Quaternion orientation = new frc.team88.ros.messages.geometry_msgs.Quaternion();
    private char orientation_mode = '';
    private char interaction_mode = '';
    private boolean always_visible = false;
    private ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> markers = new ArrayList<>();
    private boolean independent_marker_orientation = false;
    private String description = "";

    @Expose(serialize = false, deserialize = false)
    public final String _type = "visualization_msgs/InteractiveMarkerControl";

    public InteractiveMarkerControl() {

    }

    public InteractiveMarkerControl(String name, frc.team88.ros.messages.geometry_msgs.Quaternion orientation, char orientation_mode, char interaction_mode, boolean always_visible, frc.team88.ros.messages.visualization_msgs.Marker[] markers, boolean independent_marker_orientation, String description) {
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
        this.orientation_mode = (char)jsonObj.get("orientation_mode").getAsByte();
        this.interaction_mode = (char)jsonObj.get("interaction_mode").getAsByte();
        this.always_visible = jsonObj.get("always_visible").getAsBoolean();
        for (JsonElement markers_element : jsonObj.getAsJsonArray("markers")) {
            this.markers.add(new frc.team88.ros.messages.visualization_msgs.Marker(markers_element.getAsJsonObject()));
        }
        this.independent_marker_orientation = jsonObj.get("independent_marker_orientation").getAsBoolean();
        this.description = jsonObj.get("description").getAsString();
    }

    public String getName() {
        return this.name;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getOrientation() {
        return this.orientation;
    }
    public char getOrientationMode() {
        return this.orientation_mode;
    }
    public char getInteractionMode() {
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
    public String getDescription() {
        return this.description;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setOrientation(frc.team88.ros.messages.geometry_msgs.Quaternion orientation) {
        this.orientation = orientation;
    }
    public void setOrientationMode(char orientation_mode) {
        this.orientation_mode = orientation_mode;
    }
    public void setInteractionMode(char interaction_mode) {
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
    public void setDescription(String description) {
        this.description = description;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
