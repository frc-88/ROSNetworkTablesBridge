// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class NavSatStatus extends frc.team88.ros.messages.RosMessage {
    public static int SERVICE_GPS = 1;
    public static int SERVICE_GALILEO = 8;
    public static int STATUS_FIX = 0;
    public static int STATUS_GBAS_FIX = 2;
    public static int STATUS_SBAS_FIX = 1;
    public static int SERVICE_GLONASS = 2;
    public static int SERVICE_COMPASS = 4;
    public static int STATUS_NO_FIX = -1;

    private byte status = 0;
    private short service = 0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/NavSatStatus";

    public NavSatStatus() {

    }

    public NavSatStatus(byte status, short service) {
        this.status = status;
        this.service = service;
    }

    public NavSatStatus(JsonObject jsonObj) {
        this.status = jsonObj.get("status").getAsByte();
        this.service = jsonObj.get("service").getAsShort();
    }

    public byte getStatus() {
        return this.status;
    }
    public short getService() {
        return this.service;
    }

    public void setStatus(byte status) {
        this.status = status;
    }
    public void setService(short service) {
        this.service = service;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
