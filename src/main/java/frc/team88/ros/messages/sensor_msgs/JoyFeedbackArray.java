// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class JoyFeedbackArray extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.sensor_msgs.JoyFeedback> array = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/JoyFeedbackArray";

    public JoyFeedbackArray() {

    }

    public JoyFeedbackArray(frc.team88.ros.messages.sensor_msgs.JoyFeedback[] array) {
        this.array = new ArrayList<>(Arrays.asList(array));
    }

    public JoyFeedbackArray(JsonObject jsonObj) {
        for (JsonElement array_element : jsonObj.getAsJsonArray("array")) {
            this.array.add(new frc.team88.ros.messages.sensor_msgs.JoyFeedback(array_element.getAsJsonObject()));
        }
    }

    public ArrayList<frc.team88.ros.messages.sensor_msgs.JoyFeedback> getArray() {
        return this.array;
    }

    public void setArray(ArrayList<frc.team88.ros.messages.sensor_msgs.JoyFeedback> array) {
        this.array = array;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
