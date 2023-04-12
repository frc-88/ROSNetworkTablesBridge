package frc.team88.ros.conversions;

import edu.wpi.first.math.geometry.Transform3d;

public class Transform3dStamped {
    public long timestamp = 0;
    public Transform3d transform = new Transform3d();

    public Transform3dStamped() {

    }

    public Transform3dStamped(long timestamp, Transform3d transform) {
        this.timestamp = timestamp;
        this.transform = transform;
    }
}
