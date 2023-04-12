// Auto generated!! Do not modify.
package frc.team88.ros.messages.tj2_interfaces;

import com.google.gson.JsonObject;
import com.google.gson.annotations.Expose;

public class Match extends frc.team88.ros.messages.RosMessage {

    private double match_time = 0.0;
    private String team_color = "";
    private byte team_position = 0;
    private frc.team88.ros.messages.tj2_interfaces.MatchPeriod match_period = new frc.team88.ros.messages.tj2_interfaces.MatchPeriod();

    @Expose(serialize = false, deserialize = false)
    public final String _type = "tj2_interfaces/Match";

    public Match() {

    }

    public Match(double match_time, String team_color, byte team_position, frc.team88.ros.messages.tj2_interfaces.MatchPeriod match_period) {
        this.match_time = match_time;
        this.team_color = team_color;
        this.team_position = team_position;
        this.match_period = match_period;
    }

    public Match(JsonObject jsonObj) {
        this.match_time = jsonObj.get("match_time").getAsDouble();
        this.team_color = jsonObj.get("team_color").getAsString();
        this.team_position = jsonObj.get("team_position").getAsByte();
        this.match_period = new frc.team88.ros.messages.tj2_interfaces.MatchPeriod(jsonObj.get("match_period").getAsJsonObject());
    }

    public double getMatchTime() {
        return this.match_time;
    }
    public String getTeamColor() {
        return this.team_color;
    }
    public byte getTeamPosition() {
        return this.team_position;
    }
    public frc.team88.ros.messages.tj2_interfaces.MatchPeriod getMatchPeriod() {
        return this.match_period;
    }

    public void setMatchTime(double match_time) {
        this.match_time = match_time;
    }
    public void setTeamColor(String team_color) {
        this.team_color = team_color;
    }
    public void setTeamPosition(byte team_position) {
        this.team_position = team_position;
    }
    public void setMatchPeriod(frc.team88.ros.messages.tj2_interfaces.MatchPeriod match_period) {
        this.match_period = match_period;
    }

    public JsonObject toJSON() {
        return ginst.toJsonTree(this).getAsJsonObject();
    }

    public String toString() {
        return ginst.toJson(this);
    }
}
