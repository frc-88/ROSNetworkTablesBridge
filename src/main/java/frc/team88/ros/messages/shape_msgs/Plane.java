// Auto generated!! Do not modify.
package frc.team88.ros.messages.shape_msgs;

import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.annotations.Expose;

public class Plane extends frc.team88.ros.messages.RosMessage {

    private Double[] coef = new Double[] {
        0.0,
        0.0,
        0.0,
        0.0
    };

    @Expose(serialize = false, deserialize = false)
    public final String _type = "shape_msgs/Plane";

    public Plane() {

    }

    public Plane(Double[] coef) {
        for (int index = 0; index < 4; index++) {
            this.coef[index] = coef[index];
        }
    }

    public Plane(JsonObject jsonObj) {
        int coef_element_index = 0;
        for (JsonElement coef_element : jsonObj.getAsJsonArray("coef")) {
            this.coef[coef_element_index] = coef_element.getAsDouble();
        }
    }

    public Double[] getCoef() {
        return this.coef;
    }

    public void setCoef(Double[] coef) {
        this.coef = coef;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
