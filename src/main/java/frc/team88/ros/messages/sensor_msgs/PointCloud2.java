// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class PointCloud2 extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private int height = 0;
    private int width = 0;
    private ArrayList<frc.team88.ros.messages.sensor_msgs.PointField> fields = new ArrayList<>();
    private boolean is_bigendian = false;
    private int point_step = 0;
    private int row_step = 0;
    private ArrayList<java.lang.Byte> data = new ArrayList<>();
    private boolean is_dense = false;

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/PointCloud2";

    public PointCloud2() {

    }

    public PointCloud2(frc.team88.ros.messages.std_msgs.RosHeader header, int height, int width, frc.team88.ros.messages.sensor_msgs.PointField[] fields, boolean is_bigendian, int point_step, int row_step, java.lang.Byte[] data, boolean is_dense) {
        this.header = header;
        this.height = height;
        this.width = width;
        this.fields = new ArrayList<>(Arrays.asList(fields));
        this.is_bigendian = is_bigendian;
        this.point_step = point_step;
        this.row_step = row_step;
        this.data = new ArrayList<>(Arrays.asList(data));
        this.is_dense = is_dense;
    }

    public PointCloud2(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.height = jsonObj.get("height").getAsInt();
        this.width = jsonObj.get("width").getAsInt();
        for (JsonElement fields_element : jsonObj.getAsJsonArray("fields")) {
            this.fields.add(new frc.team88.ros.messages.sensor_msgs.PointField(fields_element.getAsJsonObject()));
        }
        this.is_bigendian = jsonObj.get("is_bigendian").getAsBoolean();
        this.point_step = jsonObj.get("point_step").getAsInt();
        this.row_step = jsonObj.get("row_step").getAsInt();
        for (JsonElement data_element : jsonObj.getAsJsonArray("data")) {
            this.data.add(data_element.getAsByte());
        }
        this.is_dense = jsonObj.get("is_dense").getAsBoolean();
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
    public ArrayList<frc.team88.ros.messages.sensor_msgs.PointField> getFields() {
        return this.fields;
    }
    public boolean getIsBigendian() {
        return this.is_bigendian;
    }
    public int getPointStep() {
        return this.point_step;
    }
    public int getRowStep() {
        return this.row_step;
    }
    public ArrayList<java.lang.Byte> getData() {
        return this.data;
    }
    public boolean getIsDense() {
        return this.is_dense;
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
    public void setFields(ArrayList<frc.team88.ros.messages.sensor_msgs.PointField> fields) {
        this.fields = fields;
    }
    public void setIsBigendian(boolean is_bigendian) {
        this.is_bigendian = is_bigendian;
    }
    public void setPointStep(int point_step) {
        this.point_step = point_step;
    }
    public void setRowStep(int row_step) {
        this.row_step = row_step;
    }
    public void setData(ArrayList<java.lang.Byte> data) {
        this.data = data;
    }
    public void setIsDense(boolean is_dense) {
        this.is_dense = is_dense;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
