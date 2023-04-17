package frc.team88.ros.conversions;

import java.util.HashMap;
import java.util.Map;

import frc.team88.ros.Pair;
import edu.wpi.first.math.geometry.Transform3d;
import edu.wpi.first.wpilibj.RobotController;
import frc.team88.ros.bridge.BridgeSubscriber;
import frc.team88.ros.bridge.ROSNetworkTablesBridge;
import frc.team88.ros.messages.geometry_msgs.TransformStamped;
import frc.team88.ros.messages.tf2_msgs.TFMessage;

/**
 * The purpose of TFListenerCompact is to subscribe to /tf_compact.
 * The ROS host will publish certain transforms. For example, if the ROS host is
 * configured to publish map to base_link, TFMessages that encode this transform
 * will be received on this topic.
 */
public class TFListenerCompact {
    private final BridgeSubscriber<TFMessage> m_tfCompactSub;
    // A map to store the lookup of Transform3dStamped objects using parent and
    // child frame IDs as key
    private final Map<Pair<String, String>, Transform3dStamped> lookup = new HashMap<>();

    /**
     * Constructor initializes the BridgeSubscriber with the given
     * ROSNetworkTablesBridge and topic name
     *
     * @param bridge    The ROSNetworkTablesBridge instance to use for subscribing
     * @param topicName The topic name to subscribe to for receiving TFMessages
     */
    public TFListenerCompact(ROSNetworkTablesBridge bridge, String topicName) {
        m_tfCompactSub = new BridgeSubscriber<>(bridge, topicName, TFMessage.class);
    }

    // Helper method to get the current FPGA time
    private long getTime() {
        return RobotController.getFPGATime();
    }

    /**
     * Updates the lookup table with new transforms received from the /tf_compact
     * topic. Call this before canTransform or lookupTransform.
     */
    public void update() {
        TFMessage msg;
        // Receive the latest TFMessage from the BridgeSubscriber
        if ((msg = m_tfCompactSub.receive()) != null) {
            long now = getTime();
            // Iterate through all the transforms in the TFMessage
            for (TransformStamped tfStamped : msg.getTransforms()) {
                // Convert the ROS transform to a WPI transform
                Transform3d transform = ROSConversions.rosToWpiTransform(tfStamped);

                // Create a key using the parent and child frame IDs
                Pair<String, String> key = new Pair<>(tfStamped.getHeader().getFrameId(), tfStamped.getChildFrameId());

                // Create a Transform3dStamped object with the current time and the WPI
                // transform
                Transform3dStamped transformStamped = new Transform3dStamped(now, transform);

                // Store the Transform3dStamped object in the lookup map
                lookup.put(key, transformStamped);
            }
        }
    }

    /**
     * Checks if a transform exists between the given parent and child frame IDs.
     *
     * @param parent_frame_id The parent frame ID to check for a transform
     * @param child_frame_id  The child frame ID to check for a transform
     * @return true if a transform exists between the parent and child frame IDs,
     *         false otherwise
     */
    public boolean canTransform(String parent_frame_id, String child_frame_id) {
        return lookup.containsKey(new Pair<String, String>(parent_frame_id, child_frame_id));
    }

    /**
     * Checks if a transform exists between the given parent and child frame IDs
     * within a specified time limit.
     *
     * @param parent_frame_id The parent frame ID to check for a transform
     * @param child_frame_id  The child frame ID to check for a transform
     * @param timeLimit       The time limit (in microseconds) within which the
     *                        transform should have been updated
     * @return true if a transform exists between the parent and child frame IDs
     *         within the specified time limit, false otherwise
     */
    public boolean canTransform(String parent_frame_id, String child_frame_id, long timeLimit) {
        if (!canTransform(parent_frame_id, child_frame_id)) {
            return false;
        } else {
            return getTime() - lookupTransform(parent_frame_id, child_frame_id).timestamp < timeLimit;
        }
    }

    /**
     * Retrieves the Transform3dStamped object for the given parent and child frame
     * IDs.
     *
     * @param parent_frame_id The parent frame ID for which to retrieve the
     *                        transform
     * @param child_frame_id  The child frame ID for which to retrieve the transform
     * @return The Transform3dStamped object corresponding to the given parent and
     *         child frame IDs, or null if it does not exist
     */
    public Transform3dStamped lookupTransform(String parent_frame_id, String child_frame_id) {
        return lookup.get(new Pair<String, String>(parent_frame_id, child_frame_id));
    }
}
