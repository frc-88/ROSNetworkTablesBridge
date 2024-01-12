// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class RosByteMultiArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.MultiArrayLayout layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout();
    private ArrayList<java.lang.Byte> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/ByteMultiArray";

    public RosByteMultiArray() {

    }

    public RosByteMultiArray(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout, java.lang.Byte[] data) {
        this.layout = layout;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public RosByteMultiArray(JsonObject jsonObj) {
        this.layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout(jsonObj.get("layout").getAsJsonObject());
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add(data_element.getAsByte());
        }
    }

    public frc.team88.ros.messages.std_msgs.MultiArrayLayout getLayout() {
        return this.layout;
    }
    public ArrayList<java.lang.Byte> getData() {
        return this.data;
    }

    public void setLayout(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout) {
        this.layout = layout;
    }
    public void setData(ArrayList<java.lang.Byte> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
