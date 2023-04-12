// Auto generated!! Do not modify.
package frc.team88.ros.messages.diagnostic_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class DiagnosticStatus extends frc.team88.ros.messages.RosMessage {
    public static int STALE = 3;
    public static int WARN = 1;
    public static int OK = 0;
    public static int ERROR = 2;

    private byte level = 0;
    private String name = "";
    private String message = "";
    private String hardware_id = "";
    private ArrayList<frc.team88.ros.messages.diagnostic_msgs.KeyValue> values = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "diagnostic_msgs/DiagnosticStatus";

    public DiagnosticStatus() {

    }

    public DiagnosticStatus(byte level, String name, String message, String hardware_id, frc.team88.ros.messages.diagnostic_msgs.KeyValue[] values) {
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
    public String getName() {
        return this.name;
    }
    public String getMessage() {
        return this.message;
    }
    public String getHardwareId() {
        return this.hardware_id;
    }
    public ArrayList<frc.team88.ros.messages.diagnostic_msgs.KeyValue> getValues() {
        return this.values;
    }

    public void setLevel(byte level) {
        this.level = level;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setMessage(String message) {
        this.message = message;
    }
    public void setHardwareId(String hardware_id) {
        this.hardware_id = hardware_id;
    }
    public void setValues(ArrayList<frc.team88.ros.messages.diagnostic_msgs.KeyValue> values) {
        this.values = values;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
