package frc.team88.ros.messages;

import com.google.gson.JsonObject;
import com.google.gson.Gson;

public abstract class RosMessage {
    protected static final Gson ginst = new Gson();

    public RosMessage() {
    }

    public RosMessage(JsonObject jsonObj) {
    }

    public abstract JsonObject toJSON();
}
