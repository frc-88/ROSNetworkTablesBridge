package frc.team88.ros.bridge;

import edu.wpi.first.networktables.DoubleSubscriber;
import edu.wpi.first.networktables.TimestampedDouble;
import edu.wpi.first.wpilibj.RobotController;
import frc.team88.ros.messages.TimePrimitive;

/**
 * Manages time synchronization between a ROS node and a NetworkTables server.
 */
public class TimeSyncManager {
    // Subscriber to the time synchronization topic
    private final DoubleSubscriber timeSyncSub;

    /**
     * Constructor of the TimeSyncManager class.
     * 
     * @param bridge The ROSNetworkTablesBridge instance this class will use for
     *               time synchronization.
     */
    public TimeSyncManager(DoubleSubscriber timeSyncSub) {
        this.timeSyncSub = timeSyncSub;
    }

    /**
     * Convert a local time (in microseconds) to remote time (in seconds).
     * 
     * @param localTime The local time in microseconds.
     * @return The remote time in seconds.
     */
    public double toRemoteTime(long localTime) {
        TimestampedDouble data = this.timeSyncSub.getAtomic(0.0);
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
        TimestampedDouble data = this.timeSyncSub.getAtomic(0.0);
        double remoteDelta = remoteTime - data.value;
        return (long) (remoteDelta * 1e6) + data.timestamp;
    }

    /**
     * Gets time as local time
     * 
     * @return The current local time in microseconds.
     */
    public long getLocalTime() {
        return RobotController.getFPGATime();
    }

    /**
     * Gets time as remote time
     *
     * @return A new Time object representing the current remote time
     */
    public TimePrimitive getNow() {
        double remoteTime = toRemoteTime(getLocalTime());
        int secs = (int) (remoteTime);
        int nsecs = (int) ((remoteTime - secs) * 1e9);
        return new TimePrimitive(secs, nsecs);
    }

    /**
     * Gets the last received time from the time synchronization topic.
     * 
     * @return The last received time in microseconds.
     */
    public long lastReceived() {
        return this.timeSyncSub.getAtomic().timestamp;
    }
}
