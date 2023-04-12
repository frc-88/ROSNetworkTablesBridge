// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class LaserEcho extends frc.team88.ros.messages.RosMessage {

    private ArrayList<java.lang.Float> echoes = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/LaserEcho";

    public LaserEcho() {

    }

    public LaserEcho(java.lang.Float[] echoes) {
        this.echoes = new ArrayList<>(Arrays.asList(echoes));
    }

    public LaserEcho(JsonObject jsonObj) {
        for (JsonElement echoes_element : jsonObj.getAsJsonArray("echoes")) {
            this.echoes.add(echoes_element.getAsFloat());
        }
    }

    public ArrayList<java.lang.Float> getEchoes() {
        return this.echoes;
    }

    public void setEchoes(ArrayList<java.lang.Float> echoes) {
        this.echoes = echoes;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
