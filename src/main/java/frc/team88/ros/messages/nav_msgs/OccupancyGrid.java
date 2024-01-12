// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class OccupancyGrid extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private frc.team88.ros.messages.nav_msgs.MapMetaData info = new frc.team88.ros.messages.nav_msgs.MapMetaData();
    private ArrayList<java.lang.Byte> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/OccupancyGrid";

    public OccupancyGrid() {

    }

    public OccupancyGrid(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.nav_msgs.MapMetaData info, java.lang.Byte[] data) {
        this.header = header;
        this.info = info;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public OccupancyGrid(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.info = new frc.team88.ros.messages.nav_msgs.MapMetaData(jsonObj.get("info").getAsJsonObject());
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add(data_element.getAsByte());
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.nav_msgs.MapMetaData getInfo() {
        return this.info;
    }
    public ArrayList<java.lang.Byte> getData() {
        return this.data;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setInfo(frc.team88.ros.messages.nav_msgs.MapMetaData info) {
        this.info = info;
    }
    public void setData(ArrayList<java.lang.Byte> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
