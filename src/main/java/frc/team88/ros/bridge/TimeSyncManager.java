package frc.team88.ros.bridge;

import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.networktables.TimestampedDouble;
import edu.wpi.first.wpilibj.RobotController;
import frc.team88.ros.messages.TimePrimitive;

/**
 * Manages time synchronization between a ROS node and a NetworkTables server.
 */
public class TimeSyncManager {
    private final ROSNetworkTablesBridge bridge;

    // Subscriber to the time synchronization topic
    private final DoubleSubscriber timeSyncSub;

    /**
     * Constructor of the TimeSyncManager class.
     * 
     * @param bridge The ROSNetworkTablesBridge instance this class will use for
     *               time synchronization.
     */
    public TimeSyncManager(ROSNetworkTablesBridge bridge) {
        this.bridge = bridge;
        this.timeSyncSub = this.bridge.getTimeSyncSub();
    }

    /**
     * Convert a local time (in microseconds) to remote time (in seconds).
     * 
     * @param localTime The local time in microseconds.
     * @return The remote time in seconds.
     */
    public double toRemoteTime(long localTime) {
        TimestampedDouble data = this.timeSyncSub.getAtomic();
        long localDelta = localTime - data.timestamp;
        return (localDelta * 1e-6) + data.value;
    }

    /**
     * Convert a remote time (in seconds) to local time (in microseconds).
     * 
     * @param remoteTime The remote time in seconds.
     * @return The local time in microseconds.
     */
    public long toLocalTime(double remoteTime) {
        TimestampedDouble data = this.timeSyncSub.getAtomic();
        double remoteDelta = remoteTime - data.value;
        return (long) (remoteDelta * 1e6) + data.timestamp;
    }

    /**
     * Gets time as remote time
     *
     * @return A new Time object representing the current remote time
     */
    public TimePrimitive getNow() {
        double remoteTime = toRemoteTime(RobotController.getFPGATime());
        int secs = (int) (remoteTime);
        int nsecs = (int) ((remoteTime - secs) * 1e9);
        return new TimePrimitive(secs, nsecs);
    }
}
