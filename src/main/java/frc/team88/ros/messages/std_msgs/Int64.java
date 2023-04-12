// Auto generated!! Do not modify.
package frc.team88.ros.messages.std_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Int64 extends frc.team88.ros.messages.RosMessage {

    private long data = 0;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "std_msgs/Int64";

    public Int64() {

    }

    public Int64(long data) {
        this.data = data;
    }

    public Int64(JsonObject jsonObj) {
        this.data = jsonObj.get("data").getAsLong();
    }

    public long getData() {
        return this.data;
    }

    public void setData(long data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
