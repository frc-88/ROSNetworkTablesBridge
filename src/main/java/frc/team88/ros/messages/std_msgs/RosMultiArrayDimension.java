// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class RosMultiArrayDimension extends frc.team88.ros.messages.RosMessage {

    private java.lang.String label = "";
    private int size = 0;
    private int stride = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/MultiArrayDimension";

    public RosMultiArrayDimension() {

    }

    public RosMultiArrayDimension(java.lang.String label, int size, int stride) {
        this.label = label;
        this.size = size;
        this.stride = stride;
    }

    public RosMultiArrayDimension(JsonObject jsonObj) {
        this.label = jsonObj.get("label").getAsString();
        this.size = jsonObj.get("size").getAsInt();
        this.stride = jsonObj.get("stride").getAsInt();
    }

    public java.lang.String getLabel() {
        return this.label;
    }
    public int getSize() {
        return this.size;
    }
    public int getStride() {
        return this.stride;
    }

    public void setLabel(java.lang.String label) {
        this.label = label;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public void setStride(int stride) {
        this.stride = stride;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
