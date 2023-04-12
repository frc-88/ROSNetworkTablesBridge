// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class TransformStamped extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private String child_frame_id = "";
    private frc.team88.ros.messages.geometry_msgs.Transform transform = new frc.team88.ros.messages.geometry_msgs.Transform();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/TransformStamped";

    public TransformStamped() {

    }

    public TransformStamped(frc.team88.ros.messages.std_msgs.Header header, String child_frame_id, frc.team88.ros.messages.geometry_msgs.Transform transform) {
        this.header = header;
        this.child_frame_id = child_frame_id;
        this.transform = transform;
    }

    public TransformStamped(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.child_frame_id = jsonObj.get("child_frame_id").getAsString();
        this.transform = new frc.team88.ros.messages.geometry_msgs.Transform(jsonObj.get("transform").getAsJsonObject());
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public String getChildFrameId() {
        return this.child_frame_id;
    }
    public frc.team88.ros.messages.geometry_msgs.Transform getTransform() {
        return this.transform;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setChildFrameId(String child_frame_id) {
        this.child_frame_id = child_frame_id;
    }
    public void setTransform(frc.team88.ros.messages.geometry_msgs.Transform transform) {
        this.transform = transform;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
