package frc.team88.ros.messages;

import com.google.gson.JsonObject;

public class TimePrimitive extends frc.team88.ros.messages.RosMessage {

    private int secs = 0;
    private int nsecs = 0;

    public TimePrimitive() {

    }

    public TimePrimitive(int secs, int nsecs) {
        this.secs = secs;
        this.nsecs = nsecs;
    }

    public TimePrimitive(double seconds) {
        this.secs = (int) seconds;
        this.nsecs = (int) (seconds * 1e9);
    }

    public TimePrimitive(JsonObject jsonObj) {
        this.secs = jsonObj.get("secs").getAsInt();
        this.nsecs = jsonObj.get("nsecs").getAsInt();
    }

    public TimePrimitive(DurationPrimitive duration) {
        this.secs = duration.getSecs();
        this.nsecs = duration.getNsecs();
    }

    public int getSecs() {
        return this.secs;
    }

    public int getNsecs() {
        return this.nsecs;
    }

    public void setSecs(int secs) {
        this.secs = secs;
    }

    public void setNsecs(int nsecs) {
        this.nsecs = nsecs;
    }

    public double toSeconds() {
        return (double) secs + (1e-9 * nsecs);
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }

    public DurationPrimitive minus(TimePrimitive other) {
        return new DurationPrimitive(this.secs - other.getSecs(), this.nsecs - other.getNsecs());
    }

    public TimePrimitive plus(DurationPrimitive other) {
        return new TimePrimitive(this.secs + other.getSecs(), this.nsecs + other.getNsecs());
    }
}
