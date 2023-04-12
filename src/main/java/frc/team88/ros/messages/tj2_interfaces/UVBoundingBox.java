// Auto generated!! Do not modify.
package frc.team88.ros.messages.tj2_interfaces;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class UVBoundingBox extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.tj2_interfaces.UVKeypoint[] points = new frc.team88.ros.messages.tj2_interfaces.UVKeypoint[] {
        new frc.team88.ros.messages.tj2_interfaces.UVKeypoint(),
        new frc.team88.ros.messages.tj2_interfaces.UVKeypoint(),
        new frc.team88.ros.messages.tj2_interfaces.UVKeypoint(),
        new frc.team88.ros.messages.tj2_interfaces.UVKeypoint()
    };
    private int width = 0;
    private int height = 0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "tj2_interfaces/UVBoundingBox";

    public UVBoundingBox() {

    }

    public UVBoundingBox(frc.team88.ros.messages.tj2_interfaces.UVKeypoint[] points, int width, int height) {
        for (int index = 0; index < 4; index++) {
            this.points[index] = points[index];
        }
        this.width = width;
        this.height = height;
    }

    public UVBoundingBox(JsonObject jsonObj) {
        int points_element_index = 0;
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points[points_element_index] = new frc.team88.ros.messages.tj2_interfaces.UVKeypoint(points_element.getAsJsonObject());
        }
        this.width = jsonObj.get("width").getAsInt();
        this.height = jsonObj.get("height").getAsInt();
    }

    public frc.team88.ros.messages.tj2_interfaces.UVKeypoint[] getPoints() {
        return this.points;
    }
    public int getWidth() {
        return this.width;
    }
    public int getHeight() {
        return this.height;
    }

    public void setPoints(frc.team88.ros.messages.tj2_interfaces.UVKeypoint[] points) {
        this.points = points;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setHeight(int height) {
        this.height = height;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
