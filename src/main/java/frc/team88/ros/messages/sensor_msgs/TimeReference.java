// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class TimeReference extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private frc.team88.ros.messages.TimePrimitive time_ref = new frc.team88.ros.messages.TimePrimitive();
    private java.lang.String source = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/TimeReference";

    public TimeReference() {

    }

    public TimeReference(frc.team88.ros.messages.std_msgs.Header header, frc.team88.ros.messages.TimePrimitive time_ref, java.lang.String source) {
        this.header = header;
        this.time_ref = time_ref;
        this.source = source;
    }

    public TimeReference(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.time_ref = new frc.team88.ros.messages.TimePrimitive(jsonObj.get("time_ref").getAsJsonObject());
        this.source = jsonObj.get("source").getAsString();
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public frc.team88.ros.messages.TimePrimitive getTimeRef() {
        return this.time_ref;
    }
    public java.lang.String getSource() {
        return this.source;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setTimeRef(frc.team88.ros.messages.TimePrimitive time_ref) {
        this.time_ref = time_ref;
    }
    public void setSource(java.lang.String source) {
        this.source = source;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
