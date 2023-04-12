package frc.team88.ros.conversions;

import java.util.HashMap;
import java.util.Map;

import edu.wpi.first.math.Pair;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.wpilibj.RobotController;
import frc.team88.ros.bridge.BridgeSubscriber;
import frc.team88.ros.bridge.ROSNetworkTablesBridge;
import frc.team88.ros.messages.geometry_msgs.TransformStamped;
import frc.team88.ros.messages.tf2_msgs.TFMessage;

public class TFListenerCompact {
    private final BridgeSubscriber<TFMessage> m_tfCompactSub;
    private final Map<Pair<String, String>, Transform3dStamped> lookup = new HashMap<>();

    public TFListenerCompact(ROSNetworkTablesBridge bridge, String topicName) {
        m_tfCompactSub = new BridgeSubscriber<>(bridge, topicName, TFMessage.class);
    }

    private long getTime() {
        return RobotController.getFPGATime();
    }

    public void update() {
        TFMessage msg;
        if ((msg = m_tfCompactSub.receive()) != null) {
            long now = getTime();
            for (TransformStamped tfStamped : msg.getTransforms()) {
                Transform3d transform = ROSConversions.rosToWpiTransform(tfStamped);
                Pair<String, String> key = new Pair<>(tfStamped.getHeader().getFrameId(), tfStamped.getChildFrameId());
                Transform3dStamped transformStamped = new Transform3dStamped(now, transform);
                lookup.put(key, transformStamped);
            }
        }
    }

    public boolean canTransform(String parent_frame_id, String child_frame_id) {
        return lookup.containsKey(new Pair<String, String>(parent_frame_id, child_frame_id));
    }

    public boolean canTransform(String parent_frame_id, String child_frame_id, long timeLimit) {
        if (!canTransform(parent_frame_id, child_frame_id)) {
            return false;
        } else {
            return getTime() - lookupTransform(parent_frame_id, child_frame_id).timestamp < timeLimit;
        }
    }

    public Transform3dStamped lookupTransform(String parent_frame_id, String child_frame_id) {
        return lookup.get(new Pair<String, String>(parent_frame_id, child_frame_id));
    }
}
