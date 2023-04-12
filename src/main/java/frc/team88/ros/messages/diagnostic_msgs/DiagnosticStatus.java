// Auto generated!! Do not modify.
package frc.team88.ros.messages.diagnostic_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class DiagnosticStatus extends frc.team88.ros.messages.RosMessage {
    public static int OK = 0;
    public static int WARN = 1;
    public static int ERROR = 2;
    public static int STALE = 3;

    private byte level = 0;
    private java.lang.String name = "";
    private java.lang.String message = "";
    private java.lang.String hardware_id = "";
    private ArrayList<frc.team88.ros.messages.diagnostic_msgs.KeyValue> values = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "diagnostic_msgs/DiagnosticStatus";

    public DiagnosticStatus() {

    }

    public DiagnosticStatus(byte level, java.lang.String name, java.lang.String message, java.lang.String hardware_id, frc.team88.ros.messages.diagnostic_msgs.KeyValue[] values) {
        this.level = level;
        this.name = name;
        this.message = message;
        this.hardware_id = hardware_id;
        this.values = new ArrayList<>(Arrays.asList(values));
    }

    public DiagnosticStatus(JsonObject jsonObj) {
        this.level = jsonObj.get("level").getAsByte();
        this.name = jsonObj.get("name").getAsString();
        this.message = jsonObj.get("message").getAsString();
        this.hardware_id = jsonObj.get("hardware_id").getAsString();
        for (JsonElement values_element : jsonObj.getAsJsonArray("values")) {
            this.values.add(new frc.team88.ros.messages.diagnostic_msgs.KeyValue(values_element.getAsJsonObject()));
        }
    }

    public byte getLevel() {
        return this.level;
    }
    public java.lang.String getName() {
        return this.name;
    }
    public java.lang.String getMessage() {
        return this.message;
    }
    public java.lang.String getHardwareId() {
        return this.hardware_id;
    }
    public ArrayList<frc.team88.ros.messages.diagnostic_msgs.KeyValue> getValues() {
        return this.values;
    }

    public void setLevel(byte level) {
        this.level = level;
    }
    public void setName(java.lang.String name) {
        this.name = name;
    }
    public void setMessage(java.lang.String message) {
        this.message = message;
    }
    public void setHardwareId(java.lang.String hardware_id) {
        this.hardware_id = hardware_id;
    }
    public void setValues(ArrayList<frc.team88.ros.messages.diagnostic_msgs.KeyValue> values) {
        this.values = values;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
