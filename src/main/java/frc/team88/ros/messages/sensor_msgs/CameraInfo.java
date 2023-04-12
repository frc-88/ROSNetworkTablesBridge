// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import java.util.ArrayList;
import com.google.gson.annotations.Expose;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import java.util.Arrays;

public class CameraInfo extends frc.team88.ros.messages.RosMessage {

    private frc.team88.ros.messages.std_msgs.Header header = new frc.team88.ros.messages.std_msgs.Header();
    private int height = 0;
    private int width = 0;
    private String distortion_model = "";
    private ArrayList<Double> D = new ArrayList<>();
    private Double[] K = new Double[] {
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
    private Double[] R = new Double[] {
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
    private Double[] P = new Double[] {
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
    public final String _type = "sensor_msgs/CameraInfo";

    public CameraInfo() {

    }

    public CameraInfo(frc.team88.ros.messages.std_msgs.Header header, int height, int width, String distortion_model, Double[] D, Double[] K, Double[] R, Double[] P, int binning_x, int binning_y, frc.team88.ros.messages.sensor_msgs.RegionOfInterest roi) {
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
        this.header = new frc.team88.ros.messages.std_msgs.Header(jsonObj.get("header").getAsJsonObject());
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

    public frc.team88.ros.messages.std_msgs.Header getHeader() {
        return this.header;
    }
    public int getHeight() {
        return this.height;
    }
    public int getWidth() {
        return this.width;
    }
    public String getDistortionModel() {
        return this.distortion_model;
    }
    public ArrayList<Double> getD() {
        return this.D;
    }
    public Double[] getK() {
        return this.K;
    }
    public Double[] getR() {
        return this.R;
    }
    public Double[] getP() {
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

    public void setHeader(frc.team88.ros.messages.std_msgs.Header header) {
        this.header = header;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public void setWidth(int width) {
        this.width = width;
    }
    public void setDistortionModel(String distortion_model) {
        this.distortion_model = distortion_model;
    }
    public void setD(ArrayList<Double> D) {
        this.D = D;
    }
    public void setK(Double[] K) {
        this.K = K;
    }
    public void setR(Double[] R) {
        this.R = R;
    }
    public void setP(Double[] P) {
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

    public String toString() {
        return ginst.toJson(this);
    }
}
