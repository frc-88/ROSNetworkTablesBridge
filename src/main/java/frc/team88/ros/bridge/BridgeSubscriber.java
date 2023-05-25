package frc.team88.ros.bridge;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import edu.wpi.first.networktables.StringSubscriber;
import edu.wpi.first.networktables.TimestampedString;
import frc.team88.ros.messages.RosMessage;

/**
 * The BridgePublisher class is responsible for subscibing to data from the ROS
 * host using NetworkTables.
 * Using an instance of ROSNetworkTablesBridge, it creates and manages a
 * StringSubscriber and StringPublisher for a specified topic.
 *
 * @param <T> The type of RosMessage to receive
 */
public class BridgeSubscriber<T extends RosMessage> {
    private ROSNetworkTablesBridge bridge;
    private String topicName;
    private Class<T> reference;
    private StringSubscriber sub = null;
    private long prevAtomic = 0;
    private boolean enabled = true;

    /**
     * Constructor that initializes the BridgeSubscriber with a
     * ROSNetworkTablesBridge instance, topic name, and Class type.
     *
     * @param bridge    The ROSNetworkTablesBridge instance to use for communication
     * @param topicName The name of the topic to be published
     */
    public BridgeSubscriber(ROSNetworkTablesBridge bridge, String topicName, Class<T> reference) {
        this.bridge = bridge;
        this.topicName = topicName;
        this.reference = reference;
    }

    /**
     * Receives the latest data from the ROS topic and converts it to an instance of
     * the specified class.
     *
     * @return An instance of the specified class containing the received data, or
     *         null if no new data is available.
     */
    public T receive() {
        if (!this.enabled) {
            return null;
        }

        // Initialize the data subscriber if it hasn't been already
        if (this.sub == null) {
            this.sub = this.bridge.subscribe(this.topicName);
        }

        // Retrieve the latest data with a timestamp from the StringSubscriber
        TimestampedString stampedString = this.sub.getAtomic();

        // If the timestamp is the same as the previous one, no new data is available
        if (stampedString.timestamp == prevAtomic) {
            return null;
        }

        // Update the timestamp of the last received data
        prevAtomic = stampedString.timestamp;

        // Extract the JSON string from the received data
        String jsonString = stampedString.value;

        // If the JSON string is empty, no data is available
        if (jsonString.length() == 0) {
            return null;
        }

        // Parse the JSON string into a JsonObject
        JsonObject jsonObject;
        try {
            jsonObject = JsonParser.parseString(jsonString).getAsJsonObject();
        } catch (java.lang.IllegalStateException e) {
            e.printStackTrace();
            return null;
        }

        // Create a new instance of the specified class using the JsonObject
        try {
            return reference.getConstructor(JsonObject.class).newInstance(jsonObject);
        } catch (InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException | NoSuchMethodException | SecurityException e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * Enable subscriber (Subscribers are enabled on initialization).
     */
    public void register() {
        this.enabled = true;
    }

    /**
     * Disable subscriber (Subscribers are enabled on initialization).
     */
    public void unregister() {
        this.enabled = false;
        this.bridge.unregister(topicName);
    }
}
