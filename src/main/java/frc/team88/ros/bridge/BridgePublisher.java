package frc.team88.ros.bridge;

import edu.wpi.first.networktables.StringPublisher;
import edu.wpi.first.wpilibj.RobotController;
import frc.team88.ros.messages.RosMessage;
import frc.team88.ros.messages.Time;
import frc.team88.ros.messages.std_msgs.Header;

/**
 * The BridgePublisher class is responsible for publishing data from the client
 * to ROS using NetworkTables.
 * Using an instance of ROSNetworkTablesBridge, it creates and manages a
 * StringPublisher for a specified topic.
 *
 * @param <T> The type of RosMessage to be published
 */
public class BridgePublisher<T extends RosMessage> {
    private ROSNetworkTablesBridge bridge;
    private String topicName;
    private StringPublisher pub = null;
    private int seq = 0;

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
    }

    /**
     * Generates a Header with the current sequence number, current time, and
     * specified frame_id.
     *
     * @param frame_id The frame_id to be set in the Header
     * @return A new Header object
     */
    public Header getHeader(String frame_id) {
        return new Header(getSeq(), getNow(), frame_id);
    }

    /**
     * Generates a Header with the current sequence number, specified time, and
     * specified frame_id.
     *
     * @param time     The time to be set in the Header
     * @param frame_id The frame_id to be set in the Header
     * @return A new Header object
     */
    public Header getHeader(Time time, String frame_id) {
        return new Header(getSeq(), time, frame_id);
    }

    /**
     * Gets the current time from the FPGA clock in a Time object.
     *
     * @return A new Time object representing the current time
     */
    public Time getNow() {
        long localTime = RobotController.getFPGATime();
        int secs = (int) (localTime * 1e-6);
        int nsecs = (int) ((localTime - secs * 1e6) * 1e3);
        return new Time(secs, nsecs);
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
        if (this.pub == null) {
            this.pub = this.bridge.advertise(this.topicName);
        }
        String input = msg.toString();
        if (input.length() == 0) {
            return;
        }
        this.pub.set(input);
    }
}
