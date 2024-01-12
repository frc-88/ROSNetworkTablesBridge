// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class Image extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private int height = 0;
    private int width = 0;
    private java.lang.String encoding = "";
    private byte is_bigendian = 0;
    private int step = 0;
    private ArrayList<java.lang.Byte> data = new ArrayList<>();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/Image";

    public Image() {

    }

    public Image(frc.team88.ros.messages.std_msgs.RosHeader header, int height, int width, java.lang.String encoding, byte is_bigendian, int step, java.lang.Byte[] data) {
        this.header = header;
        this.height = height;
        this.width = width;
        this.encoding = encoding;
        this.is_bigendian = is_bigendian;
        this.step = step;
        this.data = new ArrayList<>(Arrays.asList(data));
    }

    public Image(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.height = jsonObj.get("height").getAsInt();
        this.width = jsonObj.get("width").getAsInt();
        this.encoding = jsonObj.get("encoding").getAsString();
        this.is_bigendian = jsonObj.get("is_bigendian").getAsByte();
        this.step = jsonObj.get("step").getAsInt();
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add(data_element.getAsByte());
        }
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
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
    public byte getIsBigendian() {
        return this.is_bigendian;
    }
    public int getStep() {
        return this.step;
    }
    public ArrayList<java.lang.Byte> getData() {
        return this.data;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
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
    public void setIsBigendian(byte is_bigendian) {
        this.is_bigendian = is_bigendian;
    }
    public void setStep(int step) {
        this.step = step;
    }
    public void setData(ArrayList<java.lang.Byte> data) {
        this.data = data;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
