// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GetMapResult extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.nav_msgs.OccupancyGrid map = new frc.team88.ros.messages.nav_msgs.OccupancyGrid();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GetMapResult";

    public GetMapResult() {

    }

    public GetMapResult(frc.team88.ros.messages.nav_msgs.OccupancyGrid map) {
        this.map = map;
    }

    public GetMapResult(JsonObject jsonObj) {
        this.map = new frc.team88.ros.messages.nav_msgs.OccupancyGrid(jsonObj.get("map").getAsJsonObject());
    }

    public frc.team88.ros.messages.nav_msgs.OccupancyGrid getMap() {
        return this.map;
    }

    public void setMap(frc.team88.ros.messages.nav_msgs.OccupancyGrid map) {
        this.map = map;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
