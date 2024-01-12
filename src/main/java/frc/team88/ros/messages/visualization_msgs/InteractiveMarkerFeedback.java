// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class InteractiveMarkerFeedback extends frc.team88.ros.messages.RosMessage {
    public static int KEEP_ALIVE = 0;
    public static int POSE_UPDATE = 1;
    public static int MENU_SELECT = 2;
    public static int BUTTON_CLICK = 3;
    public static int MOUSE_DOWN = 4;
    public static int MOUSE_UP = 5;

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private java.lang.String client_id = "";
    private java.lang.String marker_name = "";
    private java.lang.String control_name = "";
    private byte event_type = 0;
    private frc.team88.ros.messages.geometry_msgs.Pose pose = new frc.team88.ros.messages.geometry_msgs.Pose();
    private int menu_entry_id = 0;
    private frc.team88.ros.messages.geometry_msgs.Point mouse_point = new frc.team88.ros.messages.geometry_msgs.Point();
    private boolean mouse_point_valid = false;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/InteractiveMarkerFeedback";

    public InteractiveMarkerFeedback() {

    }

    public InteractiveMarkerFeedback(frc.team88.ros.messages.std_msgs.RosHeader header, java.lang.String client_id, java.lang.String marker_name, java.lang.String control_name, byte event_type, frc.team88.ros.messages.geometry_msgs.Pose pose, int menu_entry_id, frc.team88.ros.messages.geometry_msgs.Point mouse_point, boolean mouse_point_valid) {
        this.header = header;
        this.client_id = client_id;
        this.marker_name = marker_name;
        this.control_name = control_name;
        this.event_type = event_type;
        this.pose = pose;
        this.menu_entry_id = menu_entry_id;
        this.mouse_point = mouse_point;
        this.mouse_point_valid = mouse_point_valid;
    }

    public InteractiveMarkerFeedback(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.client_id = jsonObj.get("client_id").getAsString();
        this.marker_name = jsonObj.get("marker_name").getAsString();
        this.control_name = jsonObj.get("control_name").getAsString();
        this.event_type = jsonObj.get("event_type").getAsByte();
        this.pose = new frc.team88.ros.messages.geometry_msgs.Pose(jsonObj.get("pose").getAsJsonObject());
        this.menu_entry_id = jsonObj.get("menu_entry_id").getAsInt();
        this.mouse_point = new frc.team88.ros.messages.geometry_msgs.Point(jsonObj.get("mouse_point").getAsJsonObject());
        this.mouse_point_valid = jsonObj.get("mouse_point_valid").getAsBoolean();
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public java.lang.String getClientId() {
        return this.client_id;
    }
    public java.lang.String getMarkerName() {
        return this.marker_name;
    }
    public java.lang.String getControlName() {
        return this.control_name;
    }
    public byte getEventType() {
        return this.event_type;
    }
    public frc.team88.ros.messages.geometry_msgs.Pose getPose() {
        return this.pose;
    }
    public int getMenuEntryId() {
        return this.menu_entry_id;
    }
    public frc.team88.ros.messages.geometry_msgs.Point getMousePoint() {
        return this.mouse_point;
    }
    public boolean getMousePointValid() {
        return this.mouse_point_valid;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setClientId(java.lang.String client_id) {
        this.client_id = client_id;
    }
    public void setMarkerName(java.lang.String marker_name) {
        this.marker_name = marker_name;
    }
    public void setControlName(java.lang.String control_name) {
        this.control_name = control_name;
    }
    public void setEventType(byte event_type) {
        this.event_type = event_type;
    }
    public void setPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        this.pose = pose;
    }
    public void setMenuEntryId(int menu_entry_id) {
        this.menu_entry_id = menu_entry_id;
    }
    public void setMousePoint(frc.team88.ros.messages.geometry_msgs.Point mouse_point) {
        this.mouse_point = mouse_point;
    }
    public void setMousePointValid(boolean mouse_point_valid) {
        this.mouse_point_valid = mouse_point_valid;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
