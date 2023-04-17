package frc.team88.ros.bridge;

import frc.team88.ros.Pair;
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
    private final double updateInterval;

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
        StringPublisher pub = ntToRosSubtable.getStringTopic(ntTopic)
                .publish(PubSubOption.periodic(this.updateInterval));
        pub.set("");
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
     * @return A Pair containing the StringSubscriber and StringPublisher for the
     *         specified topic
     */
    public Pair<StringSubscriber, StringPublisher> subscribe(String topicName) {
        System.out.println("Subscribing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        StringSubscriber sub = rosToNtSubtable.getStringTopic(ntTopic).subscribe("", PubSubOption.sendAll(true),
                PubSubOption.periodic(this.updateInterval));
        StringPublisher pub = rosToNtSubtable.getStringTopic(ntTopic).publish();
        return new Pair<>(sub, pub);
    }
}
