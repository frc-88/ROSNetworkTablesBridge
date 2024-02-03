package frc.team88.ros.bridge;

import edu.wpi.first.networktables.StringPublisher;
import frc.team88.ros.messages.RosMessage;
import frc.team88.ros.messages.TimePrimitive;
import frc.team88.ros.messages.std_msgs.RosHeader;

/**
 * The BridgePublisher class is responsible for publishing data from the client
 * to ROS using NetworkTables.
 * Using an instance of ROSNetworkTablesBridge, it creates and manages a
 * StringPublisher for a specified topic.
 *
 * @param <T> The type of RosMessage to be published
 */
public class BridgePublisher<T extends RosMessage> {
    private final ROSNetworkTablesBridge bridge;
    private final String topicName;
    private final TimeSyncManager timeSync;
    private StringPublisher pub = null;
    private int seq = 0;
    private boolean enabled = true;

    /**
     * Constructor that initializes the BridgePublisher with a
     * ROSNetworkTablesBridge instance and topic name.
     *
     * @param bridge    The ROSNetworkTablesBridge instance to use for communication
     * @param topicName The name of the topic to be published
     */
    public BridgePublisher(ROSNetworkTablesBridge bridge, String topicName) {
        this.bridge = bridge;
        this.topicName = topicName;
        this.timeSync = bridge.getTimeSync();
    }

    /**
     * Generates a Header with the current sequence number, current time, and
     * specified frame_id.
     *
     * @param frame_id The frame_id to be set in the Header
     * @return A new Header object
     */
    public RosHeader getHeader(String frame_id) {
        return new RosHeader(getSeq(), getNow(), frame_id);
    }

    /**
     * Gets time as remote time
     *
     * @return A new Time object representing the current remote time
     */
    public TimePrimitive getNow() {
        return timeSync.getNow();
    }

    /**
     * Generates a Header with the current sequence number, specified time, and
     * specified frame_id.
     *
     * @param time     The time to be set in the Header
     * @param frame_id The frame_id to be set in the Header
     * @return A new Header object
     */
    public RosHeader getHeader(TimePrimitive time, String frame_id) {
        return new RosHeader(getSeq(), time, frame_id);
    }

    /**
     * Gets the current sequence number and increments it for the next use.
     *
     * @return The current sequence number
     */
    public int getSeq() {
        return seq++;
    }

    /**
     * Sends a RosMessage to the specified topic.
     *
     * @param msg The RosMessage to be sent
     */
    public void send(T msg) {
        if (!this.enabled) {
            return;
        }
        if (this.pub == null) {
            this.pub = this.bridge.advertise(this.topicName);
        }

        String input = msg.toString();
        if (input.length() == 0) {
            return;
        }
        this.pub.set(input);
    }

    /**
     * Enable publisher (Publisher are enabled on initialization).
     */
    public void register() {
        this.enabled = true;
    }

    /**
     * Disable publisher (Publisher are enabled on initialization).
     */
    public void unregister() {
        this.enabled = false;
        this.bridge.unregister(topicName);
    }
}
