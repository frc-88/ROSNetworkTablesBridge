// Auto generated!! Do not modify.
package frc.team88.ros.messages.diagnostic_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class KeyValue extends frc.team88.ros.messages.RosMessage {

    private java.lang.String key = "";
    private java.lang.String value = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "diagnostic_msgs/KeyValue";

    public KeyValue() {

    }

    public KeyValue(java.lang.String key, java.lang.String value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue(JsonObject jsonObj) {
        this.key = jsonObj.get("key").getAsString();
        this.value = jsonObj.get("value").getAsString();
    }

    public java.lang.String getKey() {
        return this.key;
    }
    public java.lang.String getValue() {
        return this.value;
    }

    public void setKey(java.lang.String key) {
        this.key = key;
    }
    public void setValue(java.lang.String value) {
        this.value = value;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
