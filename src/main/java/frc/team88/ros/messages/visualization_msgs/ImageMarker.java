// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class ImageMarker extends frc.team88.ros.messages.RosMessage {
    public static int CIRCLE = 0;
    public static int LINE_STRIP = 1;
    public static int LINE_LIST = 2;
    public static int POLYGON = 3;
    public static int POINTS = 4;
    public static int ADD = 0;
    public static int REMOVE = 1;

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private java.lang.String ns = "";
    private int id = 0;
    private int type = 0;
    private int action = 0;
    private frc.team88.ros.messages.geometry_msgs.Point position = new frc.team88.ros.messages.geometry_msgs.Point();
    private float scale = 0.0f;
    private frc.team88.ros.messages.std_msgs.RosColorRGBA outline_color = new frc.team88.ros.messages.std_msgs.RosColorRGBA();
    private byte filled = 0;
    private frc.team88.ros.messages.std_msgs.RosColorRGBA fill_color = new frc.team88.ros.messages.std_msgs.RosColorRGBA();
    private frc.team88.ros.messages.DurationPrimitive lifetime = new frc.team88.ros.messages.DurationPrimitive();
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Point> points = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.std_msgs.RosColorRGBA> outline_colors = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/ImageMarker";

    public ImageMarker() {

    }

    public ImageMarker(frc.team88.ros.messages.std_msgs.RosHeader header, java.lang.String ns, int id, int type, int action, frc.team88.ros.messages.geometry_msgs.Point position, float scale, frc.team88.ros.messages.std_msgs.RosColorRGBA outline_color, byte filled, frc.team88.ros.messages.std_msgs.RosColorRGBA fill_color, frc.team88.ros.messages.DurationPrimitive lifetime, frc.team88.ros.messages.geometry_msgs.Point[] points, frc.team88.ros.messages.std_msgs.RosColorRGBA[] outline_colors) {
        this.header = header;
        this.ns = ns;
        this.id = id;
        this.type = type;
        this.action = action;
        this.position = position;
        this.scale = scale;
        this.outline_color = outline_color;
        this.filled = filled;
        this.fill_color = fill_color;
        this.lifetime = lifetime;
        this.points = new ArrayList<>(Arrays.asList(points));
        this.outline_colors = new ArrayList<>(Arrays.asList(outline_colors));
    }

    public ImageMarker(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.ns = jsonObj.get("ns").getAsString();
        this.id = jsonObj.get("id").getAsInt();
        this.type = jsonObj.get("type").getAsInt();
        this.action = jsonObj.get("action").getAsInt();
        this.position = new frc.team88.ros.messages.geometry_msgs.Point(jsonObj.get("position").getAsJsonObject());
        this.scale = jsonObj.get("scale").getAsFloat();
        this.outline_color = new frc.team88.ros.messages.std_msgs.RosColorRGBA(jsonObj.get("outline_color").getAsJsonObject());
        this.filled = jsonObj.get("filled").getAsByte();
        this.fill_color = new frc.team88.ros.messages.std_msgs.RosColorRGBA(jsonObj.get("fill_color").getAsJsonObject());
        this.lifetime = new frc.team88.ros.messages.DurationPrimitive(jsonObj.get("lifetime").getAsJsonObject());
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points.add(new frc.team88.ros.messages.geometry_msgs.Point(points_element.getAsJsonObject()));
        }
        for (JsonElement outline_colors_element : jsonObj.getAsJsonArray("outline_colors")) {
            this.outline_colors.add(new frc.team88.ros.messages.std_msgs.RosColorRGBA(outline_colors_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public java.lang.String getNs() {
        return this.ns;
    }
    public int getId() {
        return this.id;
    }
    public int getType() {
        return this.type;
    }
    public int getAction() {
        return this.action;
    }
    public frc.team88.ros.messages.geometry_msgs.Point getPosition() {
        return this.position;
    }
    public float getScale() {
        return this.scale;
    }
    public frc.team88.ros.messages.std_msgs.RosColorRGBA getOutlineColor() {
        return this.outline_color;
    }
    public byte getFilled() {
        return this.filled;
    }
    public frc.team88.ros.messages.std_msgs.RosColorRGBA getFillColor() {
        return this.fill_color;
    }
    public frc.team88.ros.messages.DurationPrimitive getLifetime() {
        return this.lifetime;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Point> getPoints() {
        return this.points;
    }
    public ArrayList<frc.team88.ros.messages.std_msgs.RosColorRGBA> getOutlineColors() {
        return this.outline_colors;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setNs(java.lang.String ns) {
        this.ns = ns;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setType(int type) {
        this.type = type;
    }
    public void setAction(int action) {
        this.action = action;
    }
    public void setPosition(frc.team88.ros.messages.geometry_msgs.Point position) {
        this.position = position;
    }
    public void setScale(float scale) {
        this.scale = scale;
    }
    public void setOutlineColor(frc.team88.ros.messages.std_msgs.RosColorRGBA outline_color) {
        this.outline_color = outline_color;
    }
    public void setFilled(byte filled) {
        this.filled = filled;
    }
    public void setFillColor(frc.team88.ros.messages.std_msgs.RosColorRGBA fill_color) {
        this.fill_color = fill_color;
    }
    public void setLifetime(frc.team88.ros.messages.DurationPrimitive lifetime) {
        this.lifetime = lifetime;
    }
    public void setPoints(ArrayList<frc.team88.ros.messages.geometry_msgs.Point> points) {
        this.points = points;
    }
    public void setOutlineColors(ArrayList<frc.team88.ros.messages.std_msgs.RosColorRGBA> outline_colors) {
        this.outline_colors = outline_colors;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
