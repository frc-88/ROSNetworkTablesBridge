// Auto generated!! Do not modify.
package frc.team88.ros.messages.diagnostic_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class KeyValue extends frc.team88.ros.messages.RosMessage {

    private String key = "";
    private String value = "";

    @Expose(serialize = false, deserialize = false)
    public final String _type = "diagnostic_msgs/KeyValue";

    public KeyValue() {

    }

    public KeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public KeyValue(JsonObject jsonObj) {
        this.key = jsonObj.get("key").getAsString();
        this.value = jsonObj.get("value").getAsString();
    }

    public String getKey() {
        return this.key;
    }
    public String getValue() {
        return this.value;
    }

    public void setKey(String key) {
        this.key = key;
    }
    public void setValue(String value) {
        this.value = value;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
