// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class CompressedImage extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private String format = "";
    private ArrayList<Char> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "sensor_msgs/CompressedImage";

    public CompressedImage() {

    }

    public CompressedImage(frc.team88.ros.messages.std_msgs.Header header, String format, Char[] data) {
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
    public String getFormat() {
        return this.format;
    }
    public ArrayList<Char> getData() {
        return this.data;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setFormat(String format) {
        this.format = format;
    }
    public void setData(ArrayList<Char> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
