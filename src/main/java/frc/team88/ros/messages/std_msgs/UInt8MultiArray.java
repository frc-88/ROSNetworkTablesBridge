// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class UInt8MultiArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.MultiArrayLayout layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout();
    private ArrayList<Char> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "std_msgs/UInt8MultiArray";

    public UInt8MultiArray() {

    }

    public UInt8MultiArray(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout, Char[] data) {
        this.layout = layout;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public UInt8MultiArray(JsonObject jsonObj) {
        this.layout = new frc.team88.ros.messages.std_msgs.MultiArrayLayout(jsonObj.get("layout").getAsJsonObject());
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add((char)data_element.getAsByte());
        }
    }

    public frc.team88.ros.messages.std_msgs.MultiArrayLayout getLayout() {
        return this.layout;
    }
    public ArrayList<Char> getData() {
        return this.data;
    }

    public void setLayout(frc.team88.ros.messages.std_msgs.MultiArrayLayout layout) {
        this.layout = layout;
    }
    public void setData(ArrayList<Char> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
