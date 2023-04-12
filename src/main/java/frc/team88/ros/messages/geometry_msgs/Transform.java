// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Transform extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.Vector3 translation = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private frc.team88.ros.messages.geometry_msgs.Quaternion rotation = new frc.team88.ros.messages.geometry_msgs.Quaternion();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Transform";

    public Transform() {

    }

    public Transform(frc.team88.ros.messages.geometry_msgs.Vector3 translation, frc.team88.ros.messages.geometry_msgs.Quaternion rotation) {
        this.translation = translation;
        this.rotation = rotation;
    }

    public Transform(JsonObject jsonObj) {
        this.translation = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("translation").getAsJsonObject());
        this.rotation = new frc.team88.ros.messages.geometry_msgs.Quaternion(jsonObj.get("rotation").getAsJsonObject());
    }

    public frc.team88.ros.messages.geometry_msgs.Vector3 getTranslation() {
        return this.translation;
    }
    public frc.team88.ros.messages.geometry_msgs.Quaternion getRotation() {
        return this.rotation;
    }

    public void setTranslation(frc.team88.ros.messages.geometry_msgs.Vector3 translation) {
        this.translation = translation;
    }
    public void setRotation(frc.team88.ros.messages.geometry_msgs.Quaternion rotation) {
        this.rotation = rotation;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
