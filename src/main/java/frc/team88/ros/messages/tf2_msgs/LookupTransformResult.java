// Auto generated!! Do not modify.
package frc.team88.ros.messages.tf2_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class LookupTransformResult extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.geometry_msgs.TransformStamped transform = new frc.team88.ros.messages.geometry_msgs.TransformStamped();
    private frc.team88.ros.messages.tf2_msgs.TF2Error error = new frc.team88.ros.messages.tf2_msgs.TF2Error();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "tf2_msgs/LookupTransformResult";

    public LookupTransformResult() {

    }

    public LookupTransformResult(frc.team88.ros.messages.geometry_msgs.TransformStamped transform, frc.team88.ros.messages.tf2_msgs.TF2Error error) {
        this.transform = transform;
        this.error = error;
    }

    public LookupTransformResult(JsonObject jsonObj) {
        this.transform = new frc.team88.ros.messages.geometry_msgs.TransformStamped(jsonObj.get("transform").getAsJsonObject());
        this.error = new frc.team88.ros.messages.tf2_msgs.TF2Error(jsonObj.get("error").getAsJsonObject());
    }

    public frc.team88.ros.messages.geometry_msgs.TransformStamped getTransform() {
        return this.transform;
    }
    public frc.team88.ros.messages.tf2_msgs.TF2Error getError() {
        return this.error;
    }

    public void setTransform(frc.team88.ros.messages.geometry_msgs.TransformStamped transform) {
        this.transform = transform;
    }
    public void setError(frc.team88.ros.messages.tf2_msgs.TF2Error error) {
        this.error = error;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
