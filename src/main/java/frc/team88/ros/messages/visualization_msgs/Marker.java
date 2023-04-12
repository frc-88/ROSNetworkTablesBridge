// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.annotations.Expose;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.Arrays;

public class Marker extends frc.team88.ros.messages.RosMessage {
    public static int LINE_STRIP = 4;
    public static int TRIANGLE_LIST = 11;
    public static int DELETE = 2;
    public static int CYLINDER = 3;
    public static int SPHERE = 2;
    public static int ARROW = 0;
    public static int CUBE = 1;
    public static int MESH_RESOURCE = 10;
    public static int SPHERE_LIST = 7;
    public static int ADD = 0;
    public static int TEXT_VIEW_FACING = 9;
    public static int DELETEALL = 3;
    public static int CUBE_LIST = 6;
    public static int MODIFY = 0;
    public static int LINE_LIST = 5;
    public static int POINTS = 8;

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private String ns = "";
    private int id = 0;
    private int type = 0;
    private int action = 0;
    private frc.team88.ros.messages.geometry_msgs.Pose pose = new frc.team88.ros.messages.geometry_msgs.Pose();
    private frc.team88.ros.messages.geometry_msgs.Vector3 scale = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private frc.team88.ros.messages.std_msgs.ColorRGBA color = new frc.team88.ros.messages.std_msgs.ColorRGBA();
    private frc.team88.ros.messages.Duration lifetime = new frc.team88.ros.messages.Duration();
    private boolean frame_locked = false;
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Point> points = new ArrayList<>();
    private ArrayList<frc.team88.ros.messages.std_msgs.ColorRGBA> colors = new ArrayList<>();
    private String text = "";
    private String mesh_resource = "";
    private boolean mesh_use_embedded_materials = false;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "visualization_msgs/Marker";

    public Marker() {

    }

    public Marker(frc.team88.ros.messages.std_msgs.Header header, String ns, int id, int type, int action, frc.team88.ros.messages.geometry_msgs.Pose pose, frc.team88.ros.messages.geometry_msgs.Vector3 scale, frc.team88.ros.messages.std_msgs.ColorRGBA color, frc.team88.ros.messages.Duration lifetime, boolean frame_locked, frc.team88.ros.messages.geometry_msgs.Point[] points, frc.team88.ros.messages.std_msgs.ColorRGBA[] colors, String text, String mesh_resource, boolean mesh_use_embedded_materials) {
        this.header = header;
        this.ns = ns;
        this.id = id;
        this.type = type;
        this.action = action;
        this.pose = pose;
        this.scale = scale;
        this.color = color;
        this.lifetime = lifetime;
        this.frame_locked = frame_locked;
        this.points = new ArrayList<>(Arrays.asList(points));
        this.colors = new ArrayList<>(Arrays.asList(colors));
        this.text = text;
        this.mesh_resource = mesh_resource;
        this.mesh_use_embedded_materials = mesh_use_embedded_materials;
    }

    public Marker(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.ns = jsonObj.get("ns").getAsString();
        this.id = jsonObj.get("id").getAsInt();
        this.type = jsonObj.get("type").getAsInt();
        this.action = jsonObj.get("action").getAsInt();
        this.pose = new frc.team88.ros.messages.geometry_msgs.Pose(jsonObj.get("pose").getAsJsonObject());
        this.scale = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("scale").getAsJsonObject());
        this.color = new frc.team88.ros.messages.std_msgs.ColorRGBA(jsonObj.get("color").getAsJsonObject());
        this.lifetime = new frc.team88.ros.messages.Duration(jsonObj.get("lifetime").getAsJsonObject());
        this.frame_locked = jsonObj.get("frame_locked").getAsBoolean();
        for (JsonElement points_element : jsonObj.getAsJsonArray("points")) {
            this.points.add(new frc.team88.ros.messages.geometry_msgs.Point(points_element.getAsJsonObject()));
        }
        for (JsonElement colors_element : jsonObj.getAsJsonArray("colors")) {
            this.colors.add(new frc.team88.ros.messages.std_msgs.ColorRGBA(colors_element.getAsJsonObject()));
        }
        this.text = jsonObj.get("text").getAsString();
        this.mesh_resource = jsonObj.get("mesh_resource").getAsString();
        this.mesh_use_embedded_materials = jsonObj.get("mesh_use_embedded_materials").getAsBoolean();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public String getNs() {
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
    public frc.team88.ros.messages.geometry_msgs.Pose getPose() {
        return this.pose;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getScale() {
        return this.scale;
    }
    public frc.team88.ros.messages.std_msgs.ColorRGBA getColor() {
        return this.color;
    }
    public frc.team88.ros.messages.Duration getLifetime() {
        return this.lifetime;
    }
    public boolean getFrameLocked() {
        return this.frame_locked;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Point> getPoints() {
        return this.points;
    }
    public ArrayList<frc.team88.ros.messages.std_msgs.ColorRGBA> getColors() {
        return this.colors;
    }
    public String getText() {
        return this.text;
    }
    public String getMeshResource() {
        return this.mesh_resource;
    }
    public boolean getMeshUseEmbeddedMaterials() {
        return this.mesh_use_embedded_materials;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setNs(String ns) {
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
    public void setPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        this.pose = pose;
    }
    public void setScale(frc.team88.ros.messages.geometry_msgs.Vector3 scale) {
        this.scale = scale;
    }
    public void setColor(frc.team88.ros.messages.std_msgs.ColorRGBA color) {
        this.color = color;
    }
    public void setLifetime(frc.team88.ros.messages.Duration lifetime) {
        this.lifetime = lifetime;
    }
    public void setFrameLocked(boolean frame_locked) {
        this.frame_locked = frame_locked;
    }
    public void setPoints(ArrayList<frc.team88.ros.messages.geometry_msgs.Point> points) {
        this.points = points;
    }
    public void setColors(ArrayList<frc.team88.ros.messages.std_msgs.ColorRGBA> colors) {
        this.colors = colors;
    }
    public void setText(String text) {
        this.text = text;
    }
    public void setMeshResource(String mesh_resource) {
        this.mesh_resource = mesh_resource;
    }
    public void setMeshUseEmbeddedMaterials(boolean mesh_use_embedded_materials) {
        this.mesh_use_embedded_materials = mesh_use_embedded_materials;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
