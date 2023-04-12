// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class ChannelFloat32 extends frc.team88.ros.messages.RosMessage {

    private String name = "";
    private ArrayList<Float> values = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/ChannelFloat32";

    public ChannelFloat32() {

    }

    public ChannelFloat32(String name, Float[] values) {
        this.name = name;
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public ChannelFloat32(JsonObject jsonObj) {
        this.name = jsonObj.get("name").getAsString();
        for (JsonElement values_element : jsonObj.getAsJsonArray("values")) {
            this.values.add(values_element.getAsFloat());
        }
    }

    public String getName() {
        return this.name;
    }
    public ArrayList<Float> getValues() {
        return this.values;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setValues(ArrayList<Float> values) {
        this.values = values;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
