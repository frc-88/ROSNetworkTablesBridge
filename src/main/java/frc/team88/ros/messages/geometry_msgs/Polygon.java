// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class Polygon extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.geometry_msgs.Point32> points = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "geometry_msgs/Polygon";

    public Polygon() {

    }

    public Polygon(frc.team88.ros.messages.geometry_msgs.Point32[] points) {
        this.points = new ArrayList<>(Arrays.asList(points));
    }

    public Polygon(JsonObject jsonObj) {
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points.add(new frc.team88.ros.messages.geometry_msgs.Point32(points_element.getAsJsonObject()));
        }
    }

    public ArrayList<frc.team88.ros.messages.geometry_msgs.Point32> getPoints() {
        return this.points;
    }

    public void setPoints(ArrayList<frc.team88.ros.messages.geometry_msgs.Point32> points) {
        this.points = points;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
