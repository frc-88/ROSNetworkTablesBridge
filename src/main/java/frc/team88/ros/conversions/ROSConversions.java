package frc.team88.ros.conversions;

/**
 * This class contains utility methods for converting between WPILib and ROS
 * geometry data types.
 */
public class ROSConversions {
    /**
     * Converts a WPILib Rotation3d object to an ROS Quaternion object.
     *
     * @param rotate The WPILib Rotation3d object to be converted
     * @return A new ROS Quaternion object representing the same rotation
     */
    public static frc.team88.ros.messages.geometry_msgs.Quaternion wpiToRosRotation(
            edu.wpi.first.math.geometry.Rotation3d rotate) {
        edu.wpi.first.math.geometry.Quaternion quat = rotate.getQuaternion();
        return new frc.team88.ros.messages.geometry_msgs.Quaternion(quat.getX(), quat.getY(), quat.getZ(), quat.getW());
    }

    /**
     * Converts an ROS Quaternion object to a WPILib Rotation3d object.
     *
     * @param quat The ROS Quaternion object to be converted
     * @return A new WPILib Rotation3d object representing the same rotation
     */
    public static edu.wpi.first.math.geometry.Rotation3d rosToWpiRotation(
            frc.team88.ros.messages.geometry_msgs.Quaternion quat) {
        return new edu.wpi.first.math.geometry.Rotation3d(
                new edu.wpi.first.math.geometry.Quaternion(quat.getW(), quat.getX(), quat.getY(), quat.getZ()));
    }

    /**
     * Converts a WPILib Translation3d object to an ROS Point object.
     *
     * @param point The WPILib Translation3d object to be converted
     * @return A new ROS Point object representing the same translation
     */
    public static frc.team88.ros.messages.geometry_msgs.Point wpiToRosTranslation(
            edu.wpi.first.math.geometry.Translation3d point) {
        return new frc.team88.ros.messages.geometry_msgs.Point(point.getX(), point.getY(), point.getZ());
    }

    /**
     * Converts an ROS Point object to a WPILib Translation3d object.
     *
     * @param point The ROS Point object to be converted
     * @return A new WPILib Translation3d object representing the same translation
     */
    public static edu.wpi.first.math.geometry.Translation3d rosToWpiTranslation(
            frc.team88.ros.messages.geometry_msgs.Point point) {
        return new edu.wpi.first.math.geometry.Translation3d(point.getX(), point.getY(), point.getZ());
    }

    /**
     * Converts an ROS Vector3 object to a WPILib Translation3d object.
     *
     * @param point The ROS Vector3 object to be converted
     * @return A new WPILib Translation3d object representing the same translation
     */
    public static edu.wpi.first.math.geometry.Translation3d rosToWpiTranslation(
            frc.team88.ros.messages.geometry_msgs.Vector3 point) {
        return new edu.wpi.first.math.geometry.Translation3d(point.getX(), point.getY(), point.getZ());
    }

    /**
     * Converts a WPILib Pose3d object to an ROS Pose object.
     *
     * @param pose The WPILib Pose3d object to be converted
     * @return A new ROS Pose object representing the same pose
     */
    public static frc.team88.ros.messages.geometry_msgs.Pose wpiToRosPose(edu.wpi.first.math.geometry.Pose3d pose) {
        return new frc.team88.ros.messages.geometry_msgs.Pose(wpiToRosTranslation(pose.getTranslation()),
                wpiToRosRotation(pose.getRotation()));
    }

    /**
     * Converts an ROS Pose object to a WPILib Pose3d object.
     *
     * @param pose The ROS Pose object to be converted
     * @return A new WPILib Pose3d object representing the same pose
     */
    public static edu.wpi.first.math.geometry.Pose3d rosToWpiPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        return new edu.wpi.first.math.geometry.Pose3d(rosToWpiTranslation(pose.getPosition()),
                rosToWpiRotation(pose.getOrientation()));
    }

    /**
     * Converts an ROS Twist object to a WPILib ChassisSpeeds object.
     *
     * @param twist The ROS Twist object to be converted
     * @return A new WPILib ChassisSpeeds object representing the same twist
     */
    public static edu.wpi.first.math.kinematics.ChassisSpeeds rosToWpiTwist(
            frc.team88.ros.messages.geometry_msgs.Twist twist) {
        return new edu.wpi.first.math.kinematics.ChassisSpeeds(
                twist.getLinear().getX(),
                twist.getLinear().getY(),
                twist.getAngular().getZ());
    }

    /**
     * Converts a WPILib ChassisSpeeds object to an ROS Twist object.
     *
     * @param twist The WPILib ChassisSpeeds object to be converted
     * @return A new ROS Twist object representing the same twist
     */
    public static frc.team88.ros.messages.geometry_msgs.Twist wpiToRosTwist(
            edu.wpi.first.math.kinematics.ChassisSpeeds twist) {
        return new frc.team88.ros.messages.geometry_msgs.Twist(
                new frc.team88.ros.messages.geometry_msgs.Vector3(twist.vxMetersPerSecond, twist.vyMetersPerSecond,
                        0.0),
                new frc.team88.ros.messages.geometry_msgs.Vector3(0.0, 0.0, twist.omegaRadiansPerSecond));
    }

    /**
     * Converts an ROS TransformStamped object to a WPILib Transform3d object.
     *
     * @param transform The ROS TransformStamped object to be converted
     * @return A new WPILib Transform3d object representing the same transform
     */
    public static edu.wpi.first.math.geometry.Transform3d rosToWpiTransform(
            frc.team88.ros.messages.geometry_msgs.TransformStamped transform) {
        return new edu.wpi.first.math.geometry.Transform3d(
                rosToWpiTranslation(transform.getTransform().getTranslation()),
                rosToWpiRotation(transform.getTransform().getRotation()));
    }
}
