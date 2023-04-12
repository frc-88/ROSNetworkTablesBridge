// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class UInt16MultiArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.MultiArrayLayout layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout();
    private ArrayList<Short> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/UInt16MultiArray";

    public UInt16MultiArray() {

    }

    public UInt16MultiArray(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout, Short[] data) {
        this.layout = layout;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public UInt16MultiArray(JsonObject jsonObj) {
        this.layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout(jsonObj.get("layout").getAsJsonObject());
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add(data_element.getAsShort());
        }
    }

    public frc.team88.ros.messages.std_msgs.MultiArrayLayout getLayout() {
        return this.layout;
    }
    public ArrayList<Short> getData() {
        return this.data;
    }

    public void setLayout(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout) {
        this.layout = layout;
    }
    public void setData(ArrayList<Short> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
