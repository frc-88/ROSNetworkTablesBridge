// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class InteractiveMarkerInit extends frc.team88.ros.messages.RosMessage {

    private java.lang.String server_id = "";
    private long seq_num = 0;
    private ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> markers = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/InteractiveMarkerInit";

    public InteractiveMarkerInit() {

    }

    public InteractiveMarkerInit(java.lang.String server_id, long seq_num, frc.team88.ros.messages.visualization_msgs.InteractiveMarker[] markers) {
        this.server_id = server_id;
        this.seq_num = seq_num;
        this.markers = new ArrayList<>(Arrays.asList(markers));
    }

    public InteractiveMarkerInit(JsonObject jsonObj) {
        this.server_id = jsonObj.get("server_id").getAsString();
        this.seq_num = jsonObj.get("seq_num").getAsLong();
        for (JsonElement markers_element : jsonObj.getAsJsonArray("markers")) {
            this.markers.add(new frc.team88.ros.messages.visualization_msgs.InteractiveMarker(markers_element.getAsJsonObject()));
        }
    }

    public java.lang.String getServerId() {
        return this.server_id;
    }
    public long getSeqNum() {
        return this.seq_num;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> getMarkers() {
        return this.markers;
    }

    public void setServerId(java.lang.String server_id) {
        this.server_id = server_id;
    }
    public void setSeqNum(long seq_num) {
        this.seq_num = seq_num;
    }
    public void setMarkers(ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> markers) {
        this.markers = markers;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
