package frc.team88.ros.bridge;

import edu.wpi.first.math.Pair;
import edu.wpi.first.networktables.NetworkTable;
import edu.wpi.first.networktables.NetworkTableInstance;
import edu.wpi.first.networktables.PubSubOption;
import edu.wpi.first.networktables.StringPublisher;
import edu.wpi.first.networktables.StringSubscriber;

public class ROSNetworkTablesBridge {
    private NetworkTableInstance instance;
    private NetworkTable rosToNtSubtable;
    private NetworkTable ntToRosSubtable;
    private double updateInterval;

    public ROSNetworkTablesBridge(String address, int port, double updateInterval) {
        instance = NetworkTableInstance.create();
        instance.startClient3("bridge");
        instance.setServer(address, port);
        this.updateInterval = updateInterval;

        rosToNtSubtable = instance.getTable("ros_to_nt");
        ntToRosSubtable = instance.getTable("nt_to_ros");
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
