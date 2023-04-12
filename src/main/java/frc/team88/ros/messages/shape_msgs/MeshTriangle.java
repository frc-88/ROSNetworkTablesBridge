// Auto generated!! Do not modify.
package frc.team88.ros.messages.shape_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class MeshTriangle extends frc.team88.ros.messages.RosMessage {

    private java.lang.Integer[] vertex_indices = new java.lang.Integer[] {
        0,
        0,
        0
    };

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "shape_msgs/MeshTriangle";

    public MeshTriangle() {

    }

    public MeshTriangle(java.lang.Integer[] vertex_indices) {
        for (int index = 0; index < 3; index++) {
            this.vertex_indices[index] = vertex_indices[index];
        }
    }

    public MeshTriangle(JsonObject jsonObj) {
        int vertex_indices_element_index = 0;
        for (JsonElement vertex_indices_element : jsonObj.getAsJsonArray("vertex_indices")) {
            this.vertex_indices[vertex_indices_element_index] = vertex_indices_element.getAsInt();
        }
    }

    public java.lang.Integer[] getVertexIndices() {
        return this.vertex_indices;
    }

    public void setVertexIndices(java.lang.Integer[] vertex_indices) {
        this.vertex_indices = vertex_indices;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
