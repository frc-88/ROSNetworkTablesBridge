package frc.team88.ros.messages;

import com.google.gson.JsonObject;

public class Duration extends frc.team88.ros.messages.RosMessage {

    private int secs = 0;
    private int nsecs = 0;

    public final String _type = "std_msgs/Duration";

    public Duration() {

    }

    public Duration(int secs, int nsecs) {
        this.secs = secs;
        this.nsecs = nsecs;
    }

    public Duration(double seconds) {
        this.secs = (int) seconds;
        this.nsecs = (int) (seconds * 1e9);
    }

    public Duration(JsonObject jsonObj) {
        this.secs = jsonObj.get("secs").getAsInt();
        this.nsecs = jsonObj.get("nsecs").getAsInt();
    }

    public Duration(Time time) {
        this.secs = time.getSecs();
        this.nsecs = time.getNsecs();
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

    public Duration minus(Duration other) {
        return new Duration(this.secs - other.getSecs(), this.nsecs - other.getNsecs());
    }

    public Duration plus(Duration other) {
        return new Duration(this.secs + other.getSecs(), this.nsecs + other.getNsecs());
    }
}
