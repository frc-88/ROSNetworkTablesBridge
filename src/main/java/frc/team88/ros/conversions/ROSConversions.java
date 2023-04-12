package frc.team88.ros.conversions;

import edu.wpi.first.math.geometry.Translation3d;

public class ROSConversions {
    public static frc.team88.ros.messages.geometry_msgs.Quaternion wpiToRosRotation(
            edu.wpi.first.math.geometry.Rotation3d rotate) {
        edu.wpi.first.math.geometry.Quaternion quat = rotate.getQuaternion();
        return new frc.team88.ros.messages.geometry_msgs.Quaternion(quat.getX(), quat.getY(), quat.getZ(), quat.getW());
    }

    public static edu.wpi.first.math.geometry.Rotation3d rosToWpiRotation(
            frc.team88.ros.messages.geometry_msgs.Quaternion quat) {
        return new edu.wpi.first.math.geometry.Rotation3d(
                new edu.wpi.first.math.geometry.Quaternion(quat.getW(), quat.getX(), quat.getY(), quat.getZ()));
    }

    public static frc.team88.ros.messages.geometry_msgs.Point wpiToRosTranslation(
            edu.wpi.first.math.geometry.Translation3d point) {
        return new frc.team88.ros.messages.geometry_msgs.Point(point.getX(), point.getY(), point.getZ());
    }

    public static edu.wpi.first.math.geometry.Translation3d rosToWpiTranslation(
            frc.team88.ros.messages.geometry_msgs.Point point) {
        return new edu.wpi.first.math.geometry.Translation3d(point.getX(), point.getY(), point.getZ());
    }

    public static edu.wpi.first.math.geometry.Translation3d rosToWpiTranslation(
            frc.team88.ros.messages.geometry_msgs.Vector3 point) {
        return new edu.wpi.first.math.geometry.Translation3d(point.getX(), point.getY(), point.getZ());
    }

    public static frc.team88.ros.messages.geometry_msgs.Pose wpiToRosPose(edu.wpi.first.math.geometry.Pose3d pose) {
        return new frc.team88.ros.messages.geometry_msgs.Pose(wpiToRosTranslation(pose.getTranslation()),
                wpiToRosRotation(pose.getRotation()));
    }

    public static edu.wpi.first.math.geometry.Pose3d rosToWpiPose(frc.team88.ros.messages.geometry_msgs.Pose pose) {
        return new edu.wpi.first.math.geometry.Pose3d(rosToWpiTranslation(pose.getPosition()),
                rosToWpiRotation(pose.getOrientation()));
    }

    public static edu.wpi.first.math.kinematics.ChassisSpeeds rosToWpiTwist(
            frc.team88.ros.messages.geometry_msgs.Twist twist) {
        return new edu.wpi.first.math.kinematics.ChassisSpeeds(
                twist.getLinear().getX(),
                twist.getLinear().getY(),
                twist.getAngular().getZ());
    }

    public static frc.team88.ros.messages.geometry_msgs.Twist wpiToRosTwist(
            edu.wpi.first.math.kinematics.ChassisSpeeds twist) {
        return new frc.team88.ros.messages.geometry_msgs.Twist(
                new frc.team88.ros.messages.geometry_msgs.Vector3(twist.vxMetersPerSecond, twist.vyMetersPerSecond, 0.0),
                new frc.team88.ros.messages.geometry_msgs.Vector3(0.0, 0.0, twist.omegaRadiansPerSecond));
    }

    public static edu.wpi.first.math.geometry.Transform3d rosToWpiTransform(
            frc.team88.ros.messages.geometry_msgs.TransformStamped transform) {
        return new edu.wpi.first.math.geometry.Transform3d(
                rosToWpiTranslation(transform.getTransform().getTranslation()),
                rosToWpiRotation(transform.getTransform().getRotation()));
    }
}
