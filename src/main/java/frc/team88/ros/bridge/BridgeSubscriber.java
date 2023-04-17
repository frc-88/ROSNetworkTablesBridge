package frc.team88.ros.bridge;

import java.lang.reflect.InvocationTargetException;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

import frc.team88.ros.Pair;
import edu.wpi.first.networktables.StringPublisher;
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
    private StringPublisher pub = null;
    private long prevAtomic = 0;

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
        // Initialize the StringSubscriber and StringPublisher if they haven't been
        // already
        if (this.sub == null) {
            Pair<StringSubscriber, StringPublisher> pair = this.bridge.subscribe(this.topicName);
            this.sub = pair.getFirst();
            this.pub = pair.getSecond();
            this.pub.set("");
        }
        // Check if the subscribed topic exists, and create it if necessary
        if (!this.sub.exists()) {
            System.out.println("Creating topic " + this.topicName);
            // Push an empty value so ROS knows to populate this entry.
            this.pub.set("");
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
}
