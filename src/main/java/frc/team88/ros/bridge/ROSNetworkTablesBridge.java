package frc.team88.ros.bridge;

import frc.team88.ros.Pair;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.PubSubOption;
import edu.wpi.first.networktables.StringPublisher;
import edu.wpi.first.networktables.StringSubscriber;

public class ROSNetworkTablesBridge {
    private final NetworkTable rosToNtSubtable;
    private final NetworkTable ntToRosSubtable;
    private final double updateInterval;

    public ROSNetworkTablesBridge(NetworkTable table, double updateInterval) {
        this.updateInterval = updateInterval;

        rosToNtSubtable = table.getSubTable("ros_to_nt");
        ntToRosSubtable = table.getSubTable("nt_to_ros");
    }

    public ROSNetworkTablesBridge(NetworkTable rosToNtSubtable, NetworkTable ntToRosSubtable, double updateInterval) {
        this.updateInterval = updateInterval;

        this.rosToNtSubtable = rosToNtSubtable;
        this.ntToRosSubtable = ntToRosSubtable;
    }

    public StringPublisher advertise(String topicName) {
        System.out.println("Publishing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        StringPublisher pub = ntToRosSubtable.getStringTopic(ntTopic)
                .publish(PubSubOption.periodic(this.updateInterval));
        pub.set("");
        return pub;
    }

    public Pair<StringSubscriber, StringPublisher> subscribe(String topicName) {
        System.out.println("Subscribing to " + topicName);
        String ntTopic = topicName.replace('/', '\\');
        StringSubscriber sub = rosToNtSubtable.getStringTopic(ntTopic).subscribe("", PubSubOption.sendAll(true),
                PubSubOption.periodic(this.updateInterval));
        StringPublisher pub = rosToNtSubtable.getStringTopic(ntTopic).publish();
        return new Pair<>(sub, pub);
    }
}
