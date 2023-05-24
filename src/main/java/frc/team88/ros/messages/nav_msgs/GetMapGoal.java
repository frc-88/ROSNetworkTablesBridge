// Auto generated!! Do not modify.
package frc.team88.ros.messages.nav_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class GetMapGoal extends frc.team88.ros.messages.RosMessage {


    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "nav_msgs/GetMapGoal";

    public GetMapGoal() {

    }

    public GetMapGoal(JsonObject jsonObj) {

    }



    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
