// Auto generated!! Do not modify.
package frc.team88.ros.messages.tf2_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class TFMessage extends frc.team88.ros.messages.RosMessage {

    private ArrayList<frc.team88.ros.messages.geometry_msgs.TransformStamped> transforms = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "tf2_msgs/TFMessage";

    public TFMessage() {

    }

    public TFMessage(frc.team88.ros.messages.geometry_msgs.TransformStamped[] transforms) {
        this.transforms = new ArrayList<>(Arrays.asList(transforms));
    }

    public TFMessage(JsonObject jsonObj) {
        for (JsonElement transforms_element : jsonObj.getAsJsonArray("transforms")) {
            this.transforms.add(new frc.team88.ros.messages.geometry_msgs.TransformStamped(transforms_element.getAsJsonObject()));
        }
    }

    public ArrayList<frc.team88.ros.messages.geometry_msgs.TransformStamped> getTransforms() {
        return this.transforms;
    }

    public void setTransforms(ArrayList<frc.team88.ros.messages.geometry_msgs.TransformStamped> transforms) {
        this.transforms = transforms;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
