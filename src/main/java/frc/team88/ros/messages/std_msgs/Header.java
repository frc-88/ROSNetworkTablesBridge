// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Header extends frc.team88.ros.messages.RosMessage {

    private int seq = 0;
    private frc.team88.ros.messages.TimePrimitive stamp = new frc.team88.ros.messages.TimePrimitive();
    private java.lang.String frame_id = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Header";

    public Header() {

    }

    public Header(int seq, frc.team88.ros.messages.TimePrimitive stamp, java.lang.String frame_id) {
        this.seq = seq;
        this.stamp = stamp;
        this.frame_id = frame_id;
    }

    public Header(JsonObject jsonObj) {
        this.seq = jsonObj.get("seq").getAsInt();
        this.stamp = new frc.team88.ros.messages.TimePrimitive(jsonObj.get("stamp").getAsJsonObject());
        this.frame_id = jsonObj.get("frame_id").getAsString();
    }

    public int getSeq() {
        return this.seq;
    }
    public frc.team88.ros.messages.TimePrimitive getStamp() {
        return this.stamp;
    }
    public java.lang.String getFrameId() {
        return this.frame_id;
    }

    public void setSeq(int seq) {
        this.seq = seq;
    }
    public void setStamp(frc.team88.ros.messages.TimePrimitive stamp) {
        this.stamp = stamp;
    }
    public void setFrameId(java.lang.String frame_id) {
        this.frame_id = frame_id;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
