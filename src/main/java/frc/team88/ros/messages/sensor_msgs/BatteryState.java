// Auto generated!! Do not modify.
package frc.team88.ros.messages.sensor_msgs;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;
import java.util.ArrayList;
import java.util.Arrays;

public class BatteryState extends frc.team88.ros.messages.RosMessage {
    public static int POWER_SUPPLY_STATUS_UNKNOWN = 0;
    public static int POWER_SUPPLY_STATUS_CHARGING = 1;
    public static int POWER_SUPPLY_STATUS_DISCHARGING = 2;
    public static int POWER_SUPPLY_STATUS_NOT_CHARGING = 3;
    public static int POWER_SUPPLY_STATUS_FULL = 4;
    public static int POWER_SUPPLY_HEALTH_UNKNOWN = 0;
    public static int POWER_SUPPLY_HEALTH_GOOD = 1;
    public static int POWER_SUPPLY_HEALTH_OVERHEAT = 2;
    public static int POWER_SUPPLY_HEALTH_DEAD = 3;
    public static int POWER_SUPPLY_HEALTH_OVERVOLTAGE = 4;
    public static int POWER_SUPPLY_HEALTH_UNSPEC_FAILURE = 5;
    public static int POWER_SUPPLY_HEALTH_COLD = 6;
    public static int POWER_SUPPLY_HEALTH_WATCHDOG_TIMER_EXPIRE = 7;
    public static int POWER_SUPPLY_HEALTH_SAFETY_TIMER_EXPIRE = 8;
    public static int POWER_SUPPLY_TECHNOLOGY_UNKNOWN = 0;
    public static int POWER_SUPPLY_TECHNOLOGY_NIMH = 1;
    public static int POWER_SUPPLY_TECHNOLOGY_LION = 2;
    public static int POWER_SUPPLY_TECHNOLOGY_LIPO = 3;
    public static int POWER_SUPPLY_TECHNOLOGY_LIFE = 4;
    public static int POWER_SUPPLY_TECHNOLOGY_NICD = 5;
    public static int POWER_SUPPLY_TECHNOLOGY_LIMN = 6;

    private frc.team88.ros.messages.std_msgs.RosHeader header = new frc.team88.ros.messages.std_msgs.RosHeader();
    private float voltage = 0.0f;
    private float temperature = 0.0f;
    private float current = 0.0f;
    private float charge = 0.0f;
    private float capacity = 0.0f;
    private float design_capacity = 0.0f;
    private float percentage = 0.0f;
    private byte power_supply_status = 0;
    private byte power_supply_health = 0;
    private byte power_supply_technology = 0;
    private boolean present = false;
    private ArrayList<java.lang.Float> cell_voltage = new ArrayList<>();
    private ArrayList<java.lang.Float> cell_temperature = new ArrayList<>();
    private java.lang.String location = "";
    private java.lang.String serial_number = "";

    @Expose(serialize = false, deserialize = false)
    public final java.lang.String _type = "sensor_msgs/BatteryState";

    public BatteryState() {

    }

    public BatteryState(frc.team88.ros.messages.std_msgs.RosHeader header, float voltage, float temperature, float current, float charge, float capacity, float design_capacity, float percentage, byte power_supply_status, byte power_supply_health, byte power_supply_technology, boolean present, java.lang.Float[] cell_voltage, java.lang.Float[] cell_temperature, java.lang.String location, java.lang.String serial_number) {
        this.header = header;
        this.voltage = voltage;
        this.temperature = temperature;
        this.current = current;
        this.charge = charge;
        this.capacity = capacity;
        this.design_capacity = design_capacity;
        this.percentage = percentage;
        this.power_supply_status = power_supply_status;
        this.power_supply_health = power_supply_health;
        this.power_supply_technology = power_supply_technology;
        this.present = present;
        this.cell_voltage = new ArrayList<>(Arrays.asList(cell_voltage));
        this.cell_temperature = new ArrayList<>(Arrays.asList(cell_temperature));
        this.location = location;
        this.serial_number = serial_number;
    }

    public BatteryState(JsonObject jsonObj) {
        this.header = new frc.team88.ros.messages.std_msgs.RosHeader(jsonObj.get("header").getAsJsonObject());
        this.voltage = jsonObj.get("voltage").getAsFloat();
        this.temperature = jsonObj.get("temperature").getAsFloat();
        this.current = jsonObj.get("current").getAsFloat();
        this.charge = jsonObj.get("charge").getAsFloat();
        this.capacity = jsonObj.get("capacity").getAsFloat();
        this.design_capacity = jsonObj.get("design_capacity").getAsFloat();
        this.percentage = jsonObj.get("percentage").getAsFloat();
        this.power_supply_status = jsonObj.get("power_supply_status").getAsByte();
        this.power_supply_health = jsonObj.get("power_supply_health").getAsByte();
        this.power_supply_technology = jsonObj.get("power_supply_technology").getAsByte();
        this.present = jsonObj.get("present").getAsBoolean();
        for (JsonElement cell_voltage_element : jsonObj.getAsJsonArray("cell_voltage")) {
            this.cell_voltage.add(cell_voltage_element.getAsFloat());
        }
        for (JsonElement cell_temperature_element : jsonObj.getAsJsonArray("cell_temperature")) {
            this.cell_temperature.add(cell_temperature_element.getAsFloat());
        }
        this.location = jsonObj.get("location").getAsString();
        this.serial_number = jsonObj.get("serial_number").getAsString();
    }

    public frc.team88.ros.messages.std_msgs.RosHeader getHeader() {
        return this.header;
    }
    public float getVoltage() {
        return this.voltage;
    }
    public float getTemperature() {
        return this.temperature;
    }
    public float getCurrent() {
        return this.current;
    }
    public float getCharge() {
        return this.charge;
    }
    public float getCapacity() {
        return this.capacity;
    }
    public float getDesignCapacity() {
        return this.design_capacity;
    }
    public float getPercentage() {
        return this.percentage;
    }
    public byte getPowerSupplyStatus() {
        return this.power_supply_status;
    }
    public byte getPowerSupplyHealth() {
        return this.power_supply_health;
    }
    public byte getPowerSupplyTechnology() {
        return this.power_supply_technology;
    }
    public boolean getPresent() {
        return this.present;
    }
    public ArrayList<java.lang.Float> getCellVoltage() {
        return this.cell_voltage;
    }
    public ArrayList<java.lang.Float> getCellTemperature() {
        return this.cell_temperature;
    }
    public java.lang.String getLocation() {
        return this.location;
    }
    public java.lang.String getSerialNumber() {
        return this.serial_number;
    }

    public void setHeader(frc.team88.ros.messages.std_msgs.RosHeader header) {
        this.header = header;
    }
    public void setVoltage(float voltage) {
        this.voltage = voltage;
    }
    public void setTemperature(float temperature) {
        this.temperature = temperature;
    }
    public void setCurrent(float current) {
        this.current = current;
    }
    public void setCharge(float charge) {
        this.charge = charge;
    }
    public void setCapacity(float capacity) {
        this.capacity = capacity;
    }
    public void setDesignCapacity(float design_capacity) {
        this.design_capacity = design_capacity;
    }
    public void setPercentage(float percentage) {
        this.percentage = percentage;
    }
    public void setPowerSupplyStatus(byte power_supply_status) {
        this.power_supply_status = power_supply_status;
    }
    public void setPowerSupplyHealth(byte power_supply_health) {
        this.power_supply_health = power_supply_health;
    }
    public void setPowerSupplyTechnology(byte power_supply_technology) {
        this.power_supply_technology = power_supply_technology;
    }
    public void setPresent(boolean present) {
        this.present = present;
    }
    public void setCellVoltage(ArrayList<java.lang.Float> cell_voltage) {
        this.cell_voltage = cell_voltage;
    }
    public void setCellTemperature(ArrayList<java.lang.Float> cell_temperature) {
        this.cell_temperature = cell_temperature;
    }
    public void setLocation(java.lang.String location) {
        this.location = location;
    }
    public void setSerialNumber(java.lang.String serial_number) {
        this.serial_number = serial_number;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public java.lang.String toString() {
        return ginst.toJson(this);
    }
}
