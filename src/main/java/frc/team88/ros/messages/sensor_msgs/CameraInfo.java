// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class CameraInfo extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private int height = 0;
    private int width = 0;
    private java.lang.String distortion_model = "";
    private ArrayList<java.lang.Double> D = new ArrayList<>();
    private java.lang.Double[] K = new java.lang.Double[] {
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0
    };
    private java.lang.Double[] R = new java.lang.Double[] {
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0
    };
    private java.lang.Double[] P = new java.lang.Double[] {
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0,
        0.0
    };
    private int binning_x = 0;
    private int binning_y = 0;
    private frc.team88.ros.messages.sensor_msgs.RegionOfInterest roi = new frc.team88.ros.messages.sensor_msgs.RegionOfInterest();

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/CameraInfo";

    public CameraInfo() {

    }

    public CameraInfo(frc.team88.ros.messages.std_msgs.RosHeader header, int height, int width, java.lang.String distortion_model, java.lang.Double[] D, java.lang.Double[] K, java.lang.Double[] R, java.lang.Double[] P, int binning_x, int binning_y, frc.team88.ros.messages.sensor_msgs.RegionOfInterest roi) {
        this.header = header;
        this.height = height;
        this.width = width;
        this.distortion_model = distortion_model;
        this.D = new ArrayList<>(Arrays.asList(D));
        for (int index = 0; index < 9; index++) {
            this.K[index] = K[index];
        }
        for (int index = 0; index < 9; index++) {
            this.R[index] = R[index];
        }
        for (int index = 0; index < 12; index++) {
            this.P[index] = P[index];
        }
        this.binning_x = binning_x;
        this.binning_y = binning_y;
        this.roi = roi;
    }

    public CameraInfo(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.height = jsonObj.get("height").getAsInt();
        this.width = jsonObj.get("width").getAsInt();
        this.distortion_model = jsonObj.get("distortion_model").getAsString();
        for (JsonElement D_element : jsonObj.getAsJsonArray("D")) {
            this.D.add(D_element.getAsDouble());
        }
        int K_element_index = 0;
        for (JsonElement K_element : jsonObj.getAsJsonArray("K")) {
            this.K[K_element_index] = K_element.getAsDouble();
        }
        int R_element_index = 0;
        for (JsonElement R_element : jsonObj.getAsJsonArray("R")) {
            this.R[R_element_index] = R_element.getAsDouble();
        }
        int P_element_index = 0;
        for (JsonElement P_element : jsonObj.getAsJsonArray("P")) {
            this.P[P_element_index] = P_element.getAsDouble();
        }
        this.binning_x = jsonObj.get("binning_x").getAsInt();
        this.binning_y = jsonObj.get("binning_y").getAsInt();
        this.roi = new frc.team88.ros.messages.sensor_msgs.RegionOfInterest(jsonObj.get("roi").getAsJsonObject());
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
    public java.lang.String getDistortionModel() {
        return this.distortion_model;
    }
    public ArrayList<java.lang.Double> getD() {
        return this.D;
    }
    public java.lang.Double[] getK() {
        return this.K;
    }
    public java.lang.Double[] getR() {
        return this.R;
    }
    public java.lang.Double[] getP() {
        return this.P;
    }
    public int getBinningX() {
        return this.binning_x;
    }
    public int getBinningY() {
        return this.binning_y;
    }
    public frc.team88.ros.messages.sensor_msgs.RegionOfInterest getRoi() {
        return this.roi;
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
    public void setDistortionModel(java.lang.String distortion_model) {
        this.distortion_model = distortion_model;
    }
    public void setD(ArrayList<java.lang.Double> D) {
        this.D = D;
    }
    public void setK(java.lang.Double[] K) {
        this.K = K;
    }
    public void setR(java.lang.Double[] R) {
        this.R = R;
    }
    public void setP(java.lang.Double[] P) {
        this.P = P;
    }
    public void setBinningX(int binning_x) {
        this.binning_x = binning_x;
    }
    public void setBinningY(int binning_y) {
        this.binning_y = binning_y;
    }
    public void setRoi(frc.team88.ros.messages.sensor_msgs.RegionOfInterest roi) {
        this.roi = roi;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
