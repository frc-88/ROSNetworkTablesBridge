// Auto generated!! Do not modify.
package frc.team88.ros.messages.shape_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class Mesh extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.shape_msgs.MeshTriangle> triangles = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Point> vertices = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "shape_msgs/Mesh";

    public Mesh() {

    }

    public Mesh(frc.team88.ros.messages.shape_msgs.MeshTriangle[] triangles, frc.team88.ros.messages.geometry_msgs.Point[] vertices) {
        this.triangles = new ArrayList<>(Arrays.asList(triangles));
        this.vertices = new ArrayList<>(Arrays.asList(vertices));
    }

    public Mesh(JsonObject jsonObj) {
        for (JsonElement triangles_element : jsonObj.getAsJsonArray("triangles")) {
            this.triangles.add(new frc.team88.ros.messages.shape_msgs.MeshTriangle(triangles_element.getAsJsonObject()));
        }
        for (JsonElement vertices_element : jsonObj.getAsJsonArray("vertices")) {
            this.vertices.add(new frc.team88.ros.messages.geometry_msgs.Point(vertices_element.getAsJsonObject()));
        }
    }

    public ArrayList<frc.team88.ros.messages.shape_msgs.MeshTriangle> getTriangles() {
        return this.triangles;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Point> getVertices() {
        return this.vertices;
    }

    public void setTriangles(ArrayList<frc.team88.ros.messages.shape_msgs.MeshTriangle> triangles) {
        this.triangles = triangles;
    }
    public void setVertices(ArrayList<frc.team88.ros.messages.geometry_msgs.Point> vertices) {
        this.vertices = vertices;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
