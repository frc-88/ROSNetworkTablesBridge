package frc.team88.ros.bridge;

import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.PubSubOption;
import edu.wpi.first.networktables.StringPublisher;
import edu.wpi.first.networktables.StringSubscriber;

/**
 * The ROSNetworkTablesBridge class is responsible for creating and managing the
 * ros_to_nt and nt_to_ros NetworkTables. It facilitates communication between
 * ROS and the client by allowing data to be published and subscribed to using
 * NetworkTables.
 */
public class ROSNetworkTablesBridge {
    private final NetworkTable rosToNtSubtable;
    private final NetworkTable ntToRosSubtable;
    private final NetworkTable rosToNtRequestedTopicsTable;
    private final NetworkTable ntToRosRequestedTopicsTable;
    private final TimeSyncManager timeSync;
    private final long updateInterval;
    public final String TOPICS_ENTRY_KEY = "@topics";
    public final String TIME_ENTRY_KEY = "@time";

    /**
     * Constructor that takes a single NetworkTable and creates ros_to_nt and
     * nt_to_ros subtables.
     *
     * @param table          The parent NetworkTable to create the subtables from
     * @param updateInterval The desired update interval for publishing and
     *                       subscribing to data in milliseconds
     */
    public ROSNetworkTablesBridge(NetworkTable table, long updateInterval) {
        this.updateInterval = updateInterval;

        rosToNtSubtable = table.getSubTable("ros_to_nt");
        ntToRosSubtable = table.getSubTable("nt_to_ros");
        rosToNtRequestedTopicsTable = rosToNtSubtable.getSubTable(TOPICS_ENTRY_KEY);
        ntToRosRequestedTopicsTable = ntToRosSubtable.getSubTable(TOPICS_ENTRY_KEY);
        timeSync = new TimeSyncManager(makeTimeSyncSub());
    }

    private DoubleSubscriber makeTimeSyncSub() {
        return rosToNtSubtable.getDoubleTopic(TIME_ENTRY_KEY).subscribe(0.0, PubSubOption.sendAll(true),
                PubSubOption.periodic((double) this.updateInterval / 1000.0));
    }

    /**
     * Constructor that takes separate ros_to_nt and nt_to_ros NetworkTables.
     * If these tables are not the default keys (/ros_to_nt and /nt_to_ros), make
     * sure the corresponding ROS node is configured to point to the requested
     * entries.
     *
     * @param rosToNtSubtable The ros_to_nt NetworkTable for subscribing to ROS data
     * @param ntToRosSubtable The nt_to_ros NetworkTable for publishing data to ROS
     * @param updateInterval  The desired update interval for publishing and
     *                        subscribing to data in milliseconds
     */
    public ROSNetworkTablesBridge(NetworkTable rosToNtSubtable, NetworkTable ntToRosSubtable, long updateInterval) {
        this.updateInterval = updateInterval;

        this.rosToNtSubtable = rosToNtSubtable;
        this.ntToRosSubtable = ntToRosSubtable;
        rosToNtRequestedTopicsTable = rosToNtSubtable.getSubTable(TOPICS_ENTRY_KEY);
        ntToRosRequestedTopicsTable = ntToRosSubtable.getSubTable(TOPICS_ENTRY_KEY);
        timeSync = new TimeSyncManager(makeTimeSyncSub());
    }

    /**
     * Set topic state on the request list table
     */
    private void setTopicEnable(NetworkTable topicsTable, String topic, boolean state) {
        topicsTable.getEntry(topic).setBoolean(state);
    }

    /**
     * Advertises a topic to the nt_to_ros NetworkTable and creates a
     * StringPublisher for that topic.
     * 
     * Topic format should match ROS. ex. /tj2/odom.
     * Relative topic names are interpreted at the discretion of the ROS host. ex.
     * odom will be put the namespace of the ROS host node's namespace. If the
     * ROS host node is in the tj2 namespace, it will behave the same as supplying
     * /tj2/odom
     *
     * @param topicName The name of the topic to be advertised
     * @return A new StringPublisher for the specified topic
     */
    public StringPublisher advertise(String topicName) {
        System.out.println("Publishing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        StringPublisher pub = ntToRosSubtable.getStringTopic(ntTopic)
                .publish(PubSubOption.periodic((double) this.updateInterval / 1000.0));
        pub.set("");
        setTopicEnable(ntToRosRequestedTopicsTable, ntTopic, true);
        return pub;
    }

    /**
     * Closes a subscriber or publisher topic
     *
     * @param topicName The name of the topic to be closed
     */
    public void unregister(String topicName) {
        System.out.println("Closing topic " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        setTopicEnable(ntToRosRequestedTopicsTable, ntTopic, false);
    }

    /**
     * Subscribes to a topic in the ros_to_nt NetworkTable and creates a
     * StringSubscriber and StringPublisher for that topic. The StringPublisher is
     * used to create the NetworkTable entry so that ROS knows the client wants
     * this topic and starts publishing data to it.
     * 
     * Topic format should match ROS. ex. /tj2/odom.
     * Relative topic names are interpreted at the discretion of the ROS host. ex.
     * odom will be put the namespace of the ROS host node's namespace. If the
     * ROS host node is in the tj2 namespace, it will behave the same as supplying
     * /tj2/odom
     *
     * @param topicName The name of the topic to be subscribed to
     * @return A StringSubscriber for the specified topic
     */
    public StringSubscriber subscribe(String topicName) {
        System.out.println("Subscribing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        StringSubscriber sub = rosToNtSubtable.getStringTopic(ntTopic).subscribe("", PubSubOption.sendAll(true),
                PubSubOption.periodic((double) this.updateInterval / 1000.0));
        setTopicEnable(rosToNtRequestedTopicsTable, ntTopic, true);
        return sub;
    }

    /**
     * Gets the TimeSyncManager instance used for time synchronization.
     *
     * @return The TimeSyncManager instance
     */
    public TimeSyncManager getTimeSync() {
        return timeSync;
    }

    /**
     * Check if the host is alive. The host is considered alive if it has received
     * a message within the last aliveThreshold milliseconds.
     * 
     * @param aliveThreshold The time in milliseconds that the host is considered
     *                       alive
     * 
     * @return True if the host is alive, false otherwise
     */
    public boolean isAlive(long aliveThreshold) {
        long lastReceived = timeSync.lastReceived();
        if (lastReceived == 0) {
            return false;
        }
        return timeSync.getLocalTime() - lastReceived < aliveThreshold;
    }

    /**
     * Check if the host is alive. The host is considered alive if it has received
     * a message within the last 10 * updateInterval milliseconds.
     * 
     * @return True if the host is alive, false otherwise
     */
    public boolean isAlive() {
        return isAlive(10 * updateInterval);
    }
}
