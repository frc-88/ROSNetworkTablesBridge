// Auto generated!! Do not modify.
package frc.team88.ros.messages.shape_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class SolidPrimitive extends frc.team88.ros.messages.RosMessage {
    public static int BOX_Z = 2;
    public static int CONE = 4;
    public static int BOX = 1;
    public static int CONE_HEIGHT = 0;
    public static int CYLINDER = 3;
    public static int SPHERE_RADIUS = 0;
    public static int CYLINDER_RADIUS = 1;
    public static int SPHERE = 2;
    public static int BOX_Y = 1;
    public static int CYLINDER_HEIGHT = 0;
    public static int CONE_RADIUS = 1;
    public static int BOX_X = 0;

    private char type = '';
    private ArrayList<Double> dimensions = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "shape_msgs/SolidPrimitive";

    public SolidPrimitive() {

    }

    public SolidPrimitive(char type, Double[] dimensions) {
        this.type = type;
        this.dimensions = new ArrayList<>(Arrays.asList(dimensions));
    }

    public SolidPrimitive(JsonObject jsonObj) {
        this.type = (char)jsonObj.get("type").getAsByte();
        for (JsonElement dimensions_element : jsonObj.getAsJsonArray("dimensions")) {
            this.dimensions.add(dimensions_element.getAsDouble());
        }
    }

    public char getType() {
        return this.type;
    }
    public ArrayList<Double> getDimensions() {
        return this.dimensions;
    }

    public void setType(char type) {
        this.type = type;
    }
    public void setDimensions(ArrayList<Double> dimensions) {
        this.dimensions = dimensions;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
