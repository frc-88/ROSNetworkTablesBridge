// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class ChannelFloat32 extends frc.team88.ros.messages.RosMessage {

    private java.lang.String name = "";
    private ArrayList<java.lang.Float> values = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/ChannelFloat32";

    public ChannelFloat32() {

    }

    public ChannelFloat32(java.lang.String name, java.lang.Float[] values) {
        this.name = name;
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public ChannelFloat32(JsonObject jsonObj) {
        this.name = jsonObj.get("name").getAsString();
        for (JsonElement values_element : jsonObj.getAsJsonArray("values")) {
            this.values.add(values_element.getAsFloat());
        }
    }

    public java.lang.String getName() {
        return this.name;
    }
    public ArrayList<java.lang.Float> getValues() {
        return this.values;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    public void setValues(ArrayList<java.lang.Float> values) {
        this.values = values;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
