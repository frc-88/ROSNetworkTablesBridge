// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class InteractiveMarkerInit extends frc.team88.ros.messages.RosMessage {

    private String server_id = "";
    private long seq_num = 0;
    private ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> markers = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "visualization_msgs/InteractiveMarkerInit";

    public InteractiveMarkerInit() {

    }

    public InteractiveMarkerInit(String server_id, long seq_num, frc.team88.ros.messages.visualization_msgs.InteractiveMarker[] markers) {
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

    public String getServerId() {
        return this.server_id;
    }
    public long getSeqNum() {
        return this.seq_num;
    }
    public ArrayList<frc.team88.ros.messages.visualization_msgs.InteractiveMarker> getMarkers() {
        return this.markers;
    }

    public void setServerId(String server_id) {
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

    public String toString() {
        return ginst.toJson(this);
    }
}
