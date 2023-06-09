// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class Image extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private int height = 0;
    private int width = 0;
    private java.lang.String encoding = "";
    private char is_bigendian = 0;
    private int step = 0;
    private ArrayList<java.lang.Character> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/Image";

    public Image() {

    }

    public Image(frc.team88.ros.messages.std_msgs.Header header, int height, int width, java.lang.String encoding, char is_bigendian, int step, java.lang.Character[] data) {
        this.header = header;
        this.height = height;
        this.width = width;
        this.encoding = encoding;
        this.is_bigendian = is_bigendian;
        this.step = step;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public Image(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
        this.height = jsonObj.get("height").getAsInt();
        this.width = jsonObj.get("width").getAsInt();
        this.encoding = jsonObj.get("encoding").getAsString();
        this.is_bigendian = (char)jsonObj.get("is_bigendian").getAsByte();
        this.step = jsonObj.get("step").getAsInt();
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add((char)data_element.getAsByte());
        }
    }

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public java.lang.String getEncoding() {
        return this.encoding;
    }
    public char getIsBigendian() {
        return this.is_bigendian;
    }
    public int getStep() {
        return this.step;
    }
    public ArrayList<java.lang.Character> getData() {
        return this.data;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setEncoding(java.lang.String encoding) {
        this.encoding = encoding;
    }
    public void setIsBigendian(char is_bigendian) {
        this.is_bigendian = is_bigendian;
    }
    public void setStep(int step) {
        this.step = step;
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
