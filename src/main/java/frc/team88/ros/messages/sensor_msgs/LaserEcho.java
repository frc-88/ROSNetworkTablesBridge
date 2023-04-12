// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class LaserEcho extends frc.team88.ros.messages.RosMessage {

    private ArrayList<Float> echoes = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/LaserEcho";

    public LaserEcho() {

    }

    public LaserEcho(Float[] echoes) {
        this.echoes = new ArrayList<>(Arrays.asList(echoes));
    }

    public LaserEcho(JsonObject jsonObj) {
        for (JsonElement echoes_element : jsonObj.getAsJsonArray("echoes")) {
            this.echoes.add(echoes_element.getAsFloat());
        }
    }

    public ArrayList<Float> getEchoes() {
        return this.echoes;
    }

    public void setEchoes(ArrayList<Float> echoes) {
        this.echoes = echoes;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
