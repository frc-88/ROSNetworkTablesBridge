// Auto generated!! Do not modify.
package frc.team88.ros.messages.diagnostic_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class DiagnosticArray extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private ArrayList<frc.team88.ros.messages.diagnostic_msgs.DiagnosticStatus> status = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "diagnostic_msgs/DiagnosticArray";

    public DiagnosticArray() {

    }

    public DiagnosticArray(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.diagnostic_msgs.DiagnosticStatus[] status) {
        this.header = header;
        this.status = new ArrayList<>(Arrays.asList(status));
    }

    public DiagnosticArray(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        for (JsonElement status_element : jsonObj.getAsJsonArray("status")) {
            this.status.add(new frc.team88.ros.messages.diagnostic_msgs.DiagnosticStatus(status_element.getAsJsonObject()));
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public ArrayList<frc.team88.ros.messages.diagnostic_msgs.DiagnosticStatus> getStatus() {
        return this.status;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setStatus(ArrayList<frc.team88.ros.messages.diagnostic_msgs.DiagnosticStatus> status) {
        this.status = status;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
