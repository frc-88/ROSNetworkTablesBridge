// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class GridCells extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private float cell_width = 0.0f;
    private float cell_height = 0.0f;
    private ArrayList<frc.team88.ros.messages.geometry_msgs.Point> cells = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GridCells";

    public GridCells() {

    }

    public GridCells(frc.team88.ros.messages.std_msgs.Header header, float cell_width, float cell_height, frc.team88.ros.messages.geometry_msgs.Point[] cells) {
        this.header = header;
        this.cell_width = cell_width;
        this.cell_height = cell_height;
        this.cells = new ArrayList<>(Arrays.asList(cells));
    }

    public GridCells(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.cell_width = jsonObj.get("cell_width").getAsFloat();
        this.cell_height = jsonObj.get("cell_height").getAsFloat();
        for (JsonElement cells_element : jsonObj.getAsJsonArray("cells")) {
            this.cells.add(new frc.team88.ros.messages.geometry_msgs.Point(cells_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public float getCellWidth() {
        return this.cell_width;
    }
    public float getCellHeight() {
        return this.cell_height;
    }
    public ArrayList<frc.team88.ros.messages.geometry_msgs.Point> getCells() {
        return this.cells;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setCellWidth(float cell_width) {
        this.cell_width = cell_width;
    }
    public void setCellHeight(float cell_height) {
        this.cell_height = cell_height;
    }
    public void setCells(ArrayList<frc.team88.ros.messages.geometry_msgs.Point> cells) {
        this.cells = cells;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
