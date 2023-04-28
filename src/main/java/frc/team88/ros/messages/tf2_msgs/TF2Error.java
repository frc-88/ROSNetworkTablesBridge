// Auto generated!! Do not modify.
package frc.team88.ros.messages.tf2_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class TF2Error extends frc.team88.ros.messages.RosMessage {
    public static int NO_ERROR = 0;
    public static int LOOKUP_ERROR = 1;
    public static int CONNECTIVITY_ERROR = 2;
    public static int EXTRAPOLATION_ERROR = 3;
    public static int INVALID_ARGUMENT_ERROR = 4;
    public static int TIMEOUT_ERROR = 5;
    public static int TRANSFORM_ERROR = 6;

    private char error = 0;
    private java.lang.String error_string = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "tf2_msgs/TF2Error";

    public TF2Error() {

    }

    public TF2Error(char error, java.lang.String error_string) {
        this.error = error;
        this.error_string = error_string;
    }

    public TF2Error(JsonObject jsonObj) {
        this.error = (char)jsonObj.get("error").getAsByte();
        this.error_string = jsonObj.get("error_string").getAsString();
    }

    public char getError() {
        return this.error;
    }
    public java.lang.String getErrorString() {
        return this.error_string;
    }

    public void setError(char error) {
        this.error = error;
    }
    public void setErrorString(java.lang.String error_string) {
        this.error_string = error_string;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
