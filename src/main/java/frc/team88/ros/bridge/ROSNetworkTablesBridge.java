package frc.team88.ros.bridge;

import java.util.ArrayList;
import java.util.List;

import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.PubSubOption;
import edu.wpi.first.networktables.StringArrayPublisher;
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
    private final StringArrayPublisher rosToNtRequestedTopicsEntry;
    private final StringArrayPublisher ntToRosRequestedTopicsEntry;
    private final List<String> rosToNtRequestedTopics = new ArrayList<>();
    private final List<String> ntToRosRequestedTopics = new ArrayList<>();
    private final double updateInterval;
    public final String TOPICS_ENTRY_KEY = "@topics";

    /**
     * Constructor that takes a single NetworkTable and creates ros_to_nt and
     * nt_to_ros subtables.
     *
     * @param table          The parent NetworkTable to create the subtables from
     * @param updateInterval The desired update interval for publishing and
     *                       subscribing to data
     */
    public ROSNetworkTablesBridge(NetworkTable table, double updateInterval) {
        this.updateInterval = updateInterval;

        rosToNtSubtable = table.getSubTable("ros_to_nt");
        ntToRosSubtable = table.getSubTable("nt_to_ros");
        rosToNtRequestedTopicsEntry = getTopicRequestPublisher(rosToNtSubtable);
        ntToRosRequestedTopicsEntry = getTopicRequestPublisher(ntToRosSubtable);
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
     *                        subscribing to data
     */
    public ROSNetworkTablesBridge(NetworkTable rosToNtSubtable, NetworkTable ntToRosSubtable, double updateInterval) {
        this.updateInterval = updateInterval;

        this.rosToNtSubtable = rosToNtSubtable;
        this.ntToRosSubtable = ntToRosSubtable;
        rosToNtRequestedTopicsEntry = getTopicRequestPublisher(rosToNtSubtable);
        ntToRosRequestedTopicsEntry = getTopicRequestPublisher(ntToRosSubtable);
    }

    /**
     * Get topic request entry. This topic signals ROS what topics to subscribe to.
     * 
     * @return An StringArrayPublisher object
     */
    private StringArrayPublisher getTopicRequestPublisher(NetworkTable table) {
        table.getEntry(TOPICS_ENTRY_KEY).clearPersistent();
        return table.getStringArrayTopic(TOPICS_ENTRY_KEY).publish(PubSubOption.periodic(this.updateInterval));
    }

    /**
     * Send all currently requested topics to the topics request entries.
     */
    public void sendTopicRequests() {
        rosToNtRequestedTopicsEntry.set(rosToNtRequestedTopics.toArray(String[]::new));
        ntToRosRequestedTopicsEntry.set(ntToRosRequestedTopics.toArray(String[]::new));
    }

    /**
     * Advertises a topic to the nt_to_ros NetworkTable and creates a
     * StringPublisher for that topic.
     * 
     * Topic format should match ROS. ex. /tj2/odom.
     * Relative topic names are interpreted at the discretion of the ROS host. ex.
     * tj2/odom will be put the namespace of the ROS host node's namespace. If the
     * ROS host node is in the root namespace, it will behave the same as supplying
     * /tj2/odom
     *
     * @param topicName The name of the topic to be advertised
     * @return A new StringPublisher for the specified topic
     */
    public StringPublisher advertise(String topicName) {
        System.out.println("Publishing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        ntToRosSubtable.getEntry(ntTopic).clearPersistent();
        StringPublisher pub = ntToRosSubtable.getStringTopic(ntTopic)
                .publish(PubSubOption.periodic(this.updateInterval));
        pub.set("");
        ntToRosRequestedTopics.add(ntTopic);
        sendTopicRequests();
        return pub;
    }

    /**
     * Subscribes to a topic in the ros_to_nt NetworkTable and creates a
     * StringSubscriber and StringPublisher for that topic. The StringPublisher is
     * used to create the NetworkTable entry so that ROS knows the client wants
     * this topic and starts publishing data to it.
     * 
     * Topic format should match ROS. ex. /tj2/odom.
     * Relative topic names are interpreted at the discretion of the ROS host. ex.
     * tj2/odom will be put the namespace of the ROS host node's namespace. If the
     * ROS host node is in the root namespace, it will behave the same as supplying
     * /tj2/odom
     *
     * @param topicName The name of the topic to be subscribed to
     * @return A StringSubscriber for the specified topic
     */
    public StringSubscriber subscribe(String topicName) {
        System.out.println("Subscribing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        rosToNtSubtable.getEntry(ntTopic).clearPersistent();
        StringSubscriber sub = rosToNtSubtable.getStringTopic(ntTopic).subscribe("", PubSubOption.sendAll(true),
                PubSubOption.periodic(this.updateInterval));
        rosToNtRequestedTopics.add(ntTopic);
        sendTopicRequests();
        return sub;
    }
}
