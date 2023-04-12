// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class CompressedImage extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private java.lang.String format = "";
    private ArrayList<java.lang.Character> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/CompressedImage";

    public CompressedImage() {

    }

    public CompressedImage(frc.team88.ros.messages.std_msgs.Header header, java.lang.String format, java.lang.Character[] data) {
        this.header = header;
        this.format = format;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public CompressedImage(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.format = jsonObj.get("format").getAsString();
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add((char)data_element.getAsByte());
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public java.lang.String getFormat() {
        return this.format;
    }
    public ArrayList<java.lang.Character> getData() {
        return this.data;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setFormat(java.lang.String format) {
        this.format = format;
    }
    public void setData(ArrayList<java.lang.Character> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
