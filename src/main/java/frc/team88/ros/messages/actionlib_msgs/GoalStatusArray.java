// Auto generated!! Do not modify.
package frc.team88.ros.messages.actionlib_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class GoalStatusArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private ArrayList<frc.team88.ros.messages.actionlib_msgs.GoalStatus> status_list = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "actionlib_msgs/GoalStatusArray";

    public GoalStatusArray() {

    }

    public GoalStatusArray(frc.team88.ros.messages.std_msgs.RosHeader header, frc.team88.ros.messages.actionlib_msgs.GoalStatus[] status_list) {
        this.header = header;
        this.status_list = new ArrayList<>(Arrays.asList(status_list));
    }

    public GoalStatusArray(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        for (JsonElement status_list_element : jsonObj.getAsJsonArray("status_list")) {
            this.status_list.add(new frc.team88.ros.messages.actionlib_msgs.GoalStatus(status_list_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public ArrayList<frc.team88.ros.messages.actionlib_msgs.GoalStatus> getStatusList() {
        return this.status_list;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setStatusList(ArrayList<frc.team88.ros.messages.actionlib_msgs.GoalStatus> status_list) {
        this.status_list = status_list;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
