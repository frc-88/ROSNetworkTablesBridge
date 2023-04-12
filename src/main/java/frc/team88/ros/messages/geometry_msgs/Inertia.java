// Auto generated!! Do not modify.
package frc.team88.ros.messages.geometry_msgs;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Inertia extends frc.team88.ros.messages.RosMessage {

    private double m = 0.0;
    private frc.team88.ros.messages.geometry_msgs.Vector3 com = new frc.team88.ros.messages.geometry_msgs.Vector3();
    private double ixx = 0.0;
    private double ixy = 0.0;
    private double ixz = 0.0;
    private double iyy = 0.0;
    private double iyz = 0.0;
    private double izz = 0.0;

    @Expose(serialize = false, deserialize = false)
    public final String _type = "geometry_msgs/Inertia";

    public Inertia() {

    }

    public Inertia(double m, frc.team88.ros.messages.geometry_msgs.Vector3 com, double ixx, double ixy, double ixz, double iyy, double iyz, double izz) {
        this.m = m;
        this.com = com;
        this.ixx = ixx;
        this.ixy = ixy;
        this.ixz = ixz;
        this.iyy = iyy;
        this.iyz = iyz;
        this.izz = izz;
    }

    public Inertia(JsonObject jsonObj) {
        this.m = jsonObj.get("m").getAsDouble();
        this.com = new frc.team88.ros.messages.geometry_msgs.Vector3(jsonObj.get("com").getAsJsonObject());
        this.ixx = jsonObj.get("ixx").getAsDouble();
        this.ixy = jsonObj.get("ixy").getAsDouble();
        this.ixz = jsonObj.get("ixz").getAsDouble();
        this.iyy = jsonObj.get("iyy").getAsDouble();
        this.iyz = jsonObj.get("iyz").getAsDouble();
        this.izz = jsonObj.get("izz").getAsDouble();
    }

    public double getM() {
        return this.m;
    }
    public frc.team88.ros.messages.geometry_msgs.Vector3 getCom() {
        return this.com;
    }
    public double getIxx() {
        return this.ixx;
    }
    public double getIxy() {
        return this.ixy;
    }
    public double getIxz() {
        return this.ixz;
    }
    public double getIyy() {
        return this.iyy;
    }
    public double getIyz() {
        return this.iyz;
    }
    public double getIzz() {
        return this.izz;
    }

    public void setM(double m) {
        this.m = m;
    }
    public void setCom(frc.team88.ros.messages.geometry_msgs.Vector3 com) {
        this.com = com;
    }
    public void setIxx(double ixx) {
        this.ixx = ixx;
    }
    public void setIxy(double ixy) {
        this.ixy = ixy;
    }
    public void setIxz(double ixz) {
        this.ixz = ixz;
    }
    public void setIyy(double iyy) {
        this.iyy = iyy;
    }
    public void setIyz(double iyz) {
        this.iyz = iyz;
    }
    public void setIzz(double izz) {
        this.izz = izz;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
