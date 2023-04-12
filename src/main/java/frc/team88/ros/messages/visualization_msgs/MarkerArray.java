// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class MarkerArray extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> markers = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "visualization_msgs/MarkerArray";

    public MarkerArray() {

    }

    public MarkerArray(frc.team88.ros.messages.visualization_msgs.Marker[] markers) {
        this.markers = new ArrayList<>(Arrays.asList(markers));
    }

    public MarkerArray(JsonObject jsonObj) {
        for (JsonElement markers_element : jsonObj.getAsJsonArray("markers")) {
            this.markers.add(new frc.team88.ros.messages.visualization_msgs.Marker(markers_element.getAsJsonObject()));
        }
    }

    public ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> getMarkers() {
        return this.markers;
    }

    public void setMarkers(ArrayList<frc.team88.ros.messages.visualization_msgs.Marker> markers) {
        this.markers = markers;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
