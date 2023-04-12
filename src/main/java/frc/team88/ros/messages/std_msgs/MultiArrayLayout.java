// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class MultiArrayLayout extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.std_msgs.MultiArrayDimension> dim = new ArrayList<>();
    private int data_offset = 0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/MultiArrayLayout";

    public MultiArrayLayout() {

    }

    public MultiArrayLayout(frc.team88.ros.messages.std_msgs.MultiArrayDimension[] dim, int data_offset) {
        this.dim = new ArrayList<>(Arrays.asList(dim));
        this.data_offset = data_offset;
    }

    public MultiArrayLayout(JsonObject jsonObj) {
        for (JsonElement dim_element : jsonObj.getAsJsonArray("dim")) {
            this.dim.add(new frc.team88.ros.messages.std_msgs.MultiArrayDimension(dim_element.getAsJsonObject()));
        }
        this.data_offset = jsonObj.get("data_offset").getAsInt();
    }

    public ArrayList<frc.team88.ros.messages.std_msgs.MultiArrayDimension> getDim() {
        return this.dim;
    }
    public int getDataOffset() {
        return this.data_offset;
    }

    public void setDim(ArrayList<frc.team88.ros.messages.std_msgs.MultiArrayDimension> dim) {
        this.dim = dim;
    }
    public void setDataOffset(int data_offset) {
        this.data_offset = data_offset;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
