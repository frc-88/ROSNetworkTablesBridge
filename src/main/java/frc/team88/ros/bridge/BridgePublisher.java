package frc.team88.ros.bridge;

import edu.wpi.first.networktables.StringPublisher;
import edu.wpi.first.wpilibj.RobotController;
import frc.team88.ros.messages.RosMessage;
import frc.team88.ros.messages.Time;
import frc.team88.ros.messages.std_msgs.Header;

public class BridgePublisher<T extends RosMessage> {
    private ROSNetworkTablesBridge bridge;
    private String topicName;
    private StringPublisher pub = null;
    private int seq = 0;

    public BridgePublisher(ROSNetworkTablesBridge bridge, String topicName) {
        this.bridge = bridge;
        this.topicName = topicName;
    }

    public Header getHeader(String frame_id) {
        return new Header(getSeq(), getNow(), frame_id);
    }

    public Header getHeader(Time time, String frame_id) {
        return new Header(getSeq(), time, frame_id);
    }

    public Time getNow() {
        long localTime = RobotController.getFPGATime();
        int secs = (int) (localTime * 1e-6);
        int nsecs = (int) ((localTime - secs * 1e6) * 1e3);
        return new Time(secs, nsecs);
    }

    public int getSeq() {
        return seq++;
    }

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
