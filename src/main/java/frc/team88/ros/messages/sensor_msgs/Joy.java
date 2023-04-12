// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class Joy extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<Float> axes = new ArrayList<>();
    private ArrayList<Int> buttons = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/Joy";

    public Joy() {

    }

    public Joy(frc.team88.ros.messages.std_msgs.Header header, Float[] axes, Int[] buttons) {
        this.header = header;
        this.axes = new ArrayList<>(Arrays.asList(axes));
        this.buttons = new ArrayList<>(Arrays.asList(buttons));
    }

    public Joy(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        for (JsonElement axes_element : jsonObj.getAsJsonArray("axes")) {
            this.axes.add(axes_element.getAsFloat());
        }
        for (JsonElement buttons_element : jsonObj.getAsJsonArray("buttons")) {
            this.buttons.add(buttons_element.getAsInt());
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public ArrayList<Float> getAxes() {
        return this.axes;
    }
    public ArrayList<Int> getButtons() {
        return this.buttons;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setAxes(ArrayList<Float> axes) {
        this.axes = axes;
    }
    public void setButtons(ArrayList<Int> buttons) {
        this.buttons = buttons;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
