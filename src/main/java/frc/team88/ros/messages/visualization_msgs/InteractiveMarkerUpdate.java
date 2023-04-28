// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class InteractiveMarkerUpdate extends frc.team88.ros.messages.RosMessage {
    public static int KEEP_ALIVE = 0;
    public static int UPDATE = 1;

    private java.lang.String server_id = "";
    private long seq_num = 0;
    private char type = 0;
    private ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> markers = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarkerPose> poses = new ArrayList<>();
    private ArrayList<java.lang.String> erases = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/InteractiveMarkerUpdate";

    public InteractiveMarkerUpdate() {

    }

    public InteractiveMarkerUpdate(java.lang.String server_id, long seq_num, char type, frc.team88.ros.messages.visualization_msgs.InteractiveMarker[] markers, frc.team88.ros.messages.visualization_msgs.InteractiveMarkerPose[] poses, java.lang.String[] erases) {
        this.server_id = server_id;
        this.seq_num = seq_num;
        this.type = type;
        this.markers = new ArrayList<>(Arrays.asList(markers));
        this.poses = new ArrayList<>(Arrays.asList(poses));
        this.erases = new ArrayList<>(Arrays.asList(erases));
    }

    public InteractiveMarkerUpdate(JsonObject jsonObj) {
        this.server_id = jsonObj.get("server_id").getAsString();
        this.seq_num = jsonObj.get("seq_num").getAsLong();
        this.type = (char)jsonObj.get("type").getAsByte();
        for (JsonElement markers_element : jsonObj.getAsJsonArray("markers")) {
            this.markers.add(new frc.team88.ros.messages.visualization_msgs.InteractiveMarker(markers_element.getAsJsonObject()));
        }
        for (JsonElement poses_element : jsonObj.getAsJsonArray("poses")) {
            this.poses.add(new frc.team88.ros.messages.visualization_msgs.InteractiveMarkerPose(poses_element.getAsJsonObject()));
        }
        for (JsonElement erases_element : jsonObj.getAsJsonArray("erases")) {
            this.erases.add(erases_element.getAsString());
        }
    }

    public java.lang.String getServerId() {
        return this.server_id;
    }
    public long getSeqNum() {
        return this.seq_num;
    }
    public char getType() {
        return this.type;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> getMarkers() {
        return this.markers;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarkerPose> getPoses() {
        return this.poses;
    }
    public ArrayList<java.lang.String> getErases() {
        return this.erases;
    }

    public void setServerId(java.lang.String server_id) {
        this.server_id = server_id;
    }
    public void setSeqNum(long seq_num) {
        this.seq_num = seq_num;
    }
    public void setType(char type) {
        this.type = type;
    }
    public void setMarkers(ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> markers) {
        this.markers = markers;
    }
    public void setPoses(ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarkerPose> poses) {
        this.poses = poses;
    }
    public void setErases(ArrayList<java.lang.String> erases) {
        this.erases = erases;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
