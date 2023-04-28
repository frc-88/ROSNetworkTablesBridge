// Auto generated!! Do not modify.
package frc.team88.ros.messages.visualization_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class MenuEntry extends frc.team88.ros.messages.RosMessage {
    public static int FEEDBACK = 0;
    public static int ROSRUN = 1;
    public static int ROSLAUNCH = 2;

    private int id = 0;
    private int parent_id = 0;
    private java.lang.String title = "";
    private java.lang.String command = "";
    private char command_type = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "visualization_msgs/MenuEntry";

    public MenuEntry() {

    }

    public MenuEntry(int id, int parent_id, java.lang.String title, java.lang.String command, char command_type) {
        this.id = id;
        this.parent_id = parent_id;
        this.title = title;
        this.command = command;
        this.command_type = command_type;
    }

    public MenuEntry(JsonObject jsonObj) {
        this.id = jsonObj.get("id").getAsInt();
        this.parent_id = jsonObj.get("parent_id").getAsInt();
        this.title = jsonObj.get("title").getAsString();
        this.command = jsonObj.get("command").getAsString();
        this.command_type = (char)jsonObj.get("command_type").getAsByte();
    }

    public int getId() {
        return this.id;
    }
    public int getParentId() {
        return this.parent_id;
    }
    public java.lang.String getTitle() {
        return this.title;
    }
    public java.lang.String getCommand() {
        return this.command;
    }
    public char getCommandType() {
        return this.command_type;
    }

    public void setId(int id) {
        this.id = id;
    }
    public void setParentId(int parent_id) {
        this.parent_id = parent_id;
    }
    public void setTitle(java.lang.String title) {
        this.title = title;
    }
    public void setCommand(java.lang.String command) {
        this.command = command;
    }
    public void setCommandType(char command_type) {
        this.command_type = command_type;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
