# ROSNetworkTablesBridge

ROSNetworkTablesBridge is a WPILib Java tool that bridges the roboRIO to ROS (Robot Operating System) using NetworkTables and JSON formatted NT entries. This project aims to provide a seamless integration between FRC (FIRST Robotics Competition) robots using WPILib and ROS, enabling advanced robot control, sensor integration, and autonomy.

For now, this project is Java and ROS1 Noetic only. It may work on older versions of ROS, but hasn't been tested on those.

# Features

- Connects WPILib-based FRC robots with ROS using NetworkTables
- Uses JSON formatted NT entries for standardized communication
- Supports various data types, including numbers, strings, and booleans
- Allows for custom data structures and messages
- Compatible with existing WPILib projects

# Prerequisites

- WPILib Java development environment setup
- roboRIO with updated firmware
- ROS environment setup (tested with ROS Noetic)

# Installation

- Add the following to your build.gradle file (Replace `<<LATEST VERSION TAG>>` with the latest release):

```gradle
...

repositories {
    mavenCentral()
    maven { url "https://jitpack.io" }
}

...

dependencies {
    ...

    implementation 'com.google.code.gson:gson:2.10.1'
    implementation 'com.github.frc-88:ROSNetworkTablesBridge:<<LATEST VERSION TAG>>'

    ...
}
```

- Ensure you are connected to the internet.
- Run `WPILib: Build Robot Code` from the ctrl-shift-P menu.

jitpack URL: <https://jitpack.io/#frc-88/ROSNetworkTablesBridge>

# Usage

Create a new subsystem:

```java
/**
 * CoprocessorBridge is an example class demonstrating how to use the
 * ROSNetworkTablesBridge to enable communication between a WPILib Java robot
 * project and a ROS environment.
 */
public class CoprocessorBridge extends SubsystemBase {
    private final ROSNetworkTablesBridge m_ros_interface;
    private final BridgeSubscriber<Float64> m_pingSendSub;
    private final BridgePublisher<Float64> m_pingReturnPub;

    /**
     * Constructor for the CoprocessorBridge class.
     * 
     * @param coprocessorAddress The IP address of the coprocessor (for team 88: 10.0.88.2)
     * @param coprocessorPort    The port number of the coprocessor (for the Jetson: 5800)
     * @param updateDelay        The time delay (in milliseconds) between updates (I recommend 20)
     */
    public CoprocessorBridge(String coprocessorAddress, int coprocessorPort, int updateDelay) {
        // Initialize target network table. In this example, the host is the coprocessor.
        // The host can easily be changed to be the roboRIO.
        NetworkTableInstance instance = NetworkTableInstance.create();
        instance.startClient3("bridge");
        instance.setServer(coprocessorAddress, coprocessorPort);

        // Initialize ROS bridge objects
        m_ros_interface = new ROSNetworkTablesBridge(instance.getTable(""), updateDelay);
        m_pingSendSub = new BridgeSubscriber<>(m_ros_interface, "/ping_send", Float64.class);
        m_pingReturnPub = new BridgePublisher<>(m_ros_interface, "/ping_return");
    }

    /**
     * Checks if a new ping message has been received from the ROS environment,
     * and if so, sends it back as a response. This measures the round trip response time.
     */
    private void checkPing() {
        Float64 ping;
        if ((ping = m_pingSendSub.receive()) != null) {
            m_pingReturnPub.send(ping);
        }
    }

    /**
     * The periodic method is called at a regular interval (~50 Hz).
     */
    @Override
    public void periodic() {
        checkPing();
    }
}
```

Initialize it in `RobotContainer.java` (or your top level object of choice):

```java
public class RobotContainer {
    ...

    private final CoprocessorBridge m_bridge = new CoprocessorBridge("10.0.88.2", 5800, 20);

    ...

}
```

## Custom messages

This library comes with all message types defined in the common_msgs ROS package: <http://wiki.ros.org/common_msgs>

If you want custom messages to be sent between ROS and the roboRIO, follow these instructions.

- Clone the message generation project into the root of your project:

```bash
git clone https://github.com/frc-88/ros_networktables_bridge_genmsg.git
```

- Create `source_list.json` in the root of your project. This defines the names of the messages you want to import:

```
{
    "sources": [
        "tj2_interfaces/GameObjectsStamped",
        "tj2_interfaces/Match",
        "tj2_interfaces/MatchPeriod",
        "tj2_interfaces/NavX"
    ]
}
```

### On macOS and linux

- Install python dependencies:

  - On Ubuntu: `sudo apt-get install python3-pip python3-setuptools`
  - On macOS: TODO

- Create `build-java-messages.sh`, a convenience script for generating messages.

```bash
#!/bin/bash
BASE_DIR=$(realpath "$(dirname $0)")

GEN_DIR=${BASE_DIR}/ros_networktables_bridge_genmsg

${GEN_DIR}/build-rospy-messages.sh ~/tj2_ros/src/tj2_interfaces
export PYTHONPATH=${GEN_DIR}/genmsg/tj2_interfaces:$PYTHONPATH
source ${GEN_DIR}/venv/bin/activate
python3 ${GEN_DIR}/main.py -r 'src/main/java' -m 'frc/robot/ros/messages' -s ${BASE_DIR}/source_list.json
```

- Make this file an executable: `chmod +x build-java-messages.sh`

- Run the file `./build-java-messsages.sh`

- Replace `~/tj2_ros/src/tj2_interfaces` with the directory of your custom messages package containing a `msg/` folder. See this tutorial on how to generate a custom message package in ROS: <http://wiki.ros.org/ROS/Tutorials/CreatingMsgAndSrv>.

- replace `tj2_interfaces` in the PYTHONPATH variable with your package name.

- replace `frc/robot/ros/messages` with your desired output directory.

### On Windows

- TODO

### Import and usage of custom messages

In your `CoprocessorBridge.java` class, create subscribers or publishers using your messages:

```java
import com.kauailabs.navx.frc.AHRS;
import frc.robot.ros.messages.tj2_interfaces.NavX;
import frc.team88.ros.conversions.ROSConversions;
import edu.wpi.first.math.util.Units;

public class CoprocessorBridge extends SubsystemBase {
    ...

    private final AHRS m_imu;

    private final BridgePublisher<NavX> m_imuPub;

    public final String IMU_FRAME = "imu";
    private final double GRAVITY = 9.81;

    ...
    public CoprocessorBridge(AHRS imu) {
        ...

        m_imu = imu;
        m_imuPub = new BridgePublisher<>(m_ros_interface, "/imu");

        ...
    }

    ...

    private void sendImu() {
        m_imuPub.send(new NavX(m_imuPub.getHeader(IMU_FRAME),
                ROSConversions.wpiToRosRotation(new Rotation3d(
                    Units.degreesToRadians(m_imu.getRoll()), 
                    Units.degreesToRadians(m_imu.getPitch()),
                    Units.degreesToRadians(-m_imu.getYaw()))),
                new Vector3(0.0, 0.0, Units.degreesToRadians(-m_imu.getYawRate())),
                new Vector3(
                    m_imu.getWorldLinearAccelX() * GRAVITY,
                    m_imu.getWorldLinearAccelY() * GRAVITY,
                    m_imu.getWorldLinearAccelZ() * GRAVITY)
        ));
    }

    ...


    @Override
    public void periodic() {
        ...

        sendImu();

        ...
    }
```

# Example

Check out the DiffyJrROS repository for a full example on how to use this library:

<https://github.com/frc-88/DiffyJrROS/tree/a07c30bc2fd893d286f947317b4d7cdec6914b46>

# Contributing

Contributions are welcome! Please follow the guidelines in the CONTRIBUTING.md file.
