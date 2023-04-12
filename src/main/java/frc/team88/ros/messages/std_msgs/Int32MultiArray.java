// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class Int32MultiArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.MultiArrayLayout layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout();
    private ArrayList<Int> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/Int32MultiArray";

    public Int32MultiArray() {

    }

    public Int32MultiArray(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout, Int[] data) {
        this.layout = layout;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public Int32MultiArray(JsonObject jsonObj) {
        this.layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout(jsonObj.get("layout").getAsJsonObject());
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add(data_element.getAsInt());
        }
    }

    public frc.team88.ros.messages.std_msgs.MultiArrayLayout getLayout() {
        return this.layout;
    }
    public ArrayList<Int> getData() {
        return this.data;
    }

    public void setLayout(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout) {
        this.layout = layout;
    }
    public void setData(ArrayList<Int> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
