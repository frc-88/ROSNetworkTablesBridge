# ROSNetworkTablesBridge

ROSNetworkTablesBridge is a WPILib Java tool that bridges the roboRIO to ROS (Robot Operating System) using NetworkTables and JSON formatted NT entries. This project aims to provide a seamless integration between FRC (FIRST Robotics Competition) robots using WPILib and ROS, enabling advanced robot control, sensor integration, and autonomy.

For now, this project is WPILib Java and ROS1 Noetic only. It may work on older versions of ROS, but those haven't been tested.

# Features

- Connects WPILib-based FRC robots with ROS using NetworkTables
- Uses JSON formatted NT entries for standardized communication
- Allows for custom data structures and messages

# Prerequisites

- WPILib Java development environment setup
- roboRIO with updated firmware
- ROS environment setup (tested with ROS Noetic)

  - This must be setup externally. For an example on the NVidia Jetson, check out this repository: <https://github.com/frc-88/tj2_ros>

  - ros_networktables_bridge_node must be installed and running in that environment

# ROS host node

The compliment to this project is ros_networktables_bridge_node. For more information on usage and installation, check out this link: <https://github.com/frc-88/ros_networktables_bridge_host>

It is required to use this library.

# Installation

- Add the following to your build.gradle file (Replace `<<LATEST VERSION TAG>>` with the latest release. Omit the "`...`"):

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

# Usage

Create a new subsystem:

```java
package frc.robot.ros.bridge;

import java.util.Optional;

import frc.team88.ros.bridge.BridgePublisher;
import frc.team88.ros.bridge.BridgeSubscriber;
import frc.team88.ros.bridge.ROSNetworkTablesBridge;
import frc.team88.ros.messages.std_msgs.RosFloat64;

/**
 * CoprocessorBridge is an example class demonstrating how to use the
 * ROSNetworkTablesBridge to enable communication between a WPILib Java robot
 * project and a ROS environment.
 */
public class CoprocessorBridge extends SubsystemBase {
    private final ROSNetworkTablesBridge m_ros_interface;
    private final BridgeSubscriber<RosFloat64> m_pingSendSub;
    private final BridgePublisher<RosFloat64> m_pingReturnPub;

    /**
     * Constructor for the CoprocessorBridge class.
     */
    public CoprocessorBridge() {
        long updateDelay = 20;
        NetworkTableInstance instance = NetworkTableInstance.getDefault();

        m_ros_interface = new ROSNetworkTablesBridge(instance.getTable(""), updateDelay);

        // Initialize ROS bridge objects
        m_pingSendSub = new BridgeSubscriber<>(m_ros_interface, "/ping_send", RosFloat64.class);
        m_pingReturnPub = new BridgePublisher<>(m_ros_interface, "/ping_return");
    }

    /**
     * Checks if a new ping message has been received from the ROS environment,
     * and if so, sends it back as a response. This measures the round trip response time.
     */
    private void checkPing() {
        Optional<RosFloat64> ping;
        if ((ping = pingSendSub.receive()).isPresent()) {
            pingReturnPub.send(ping.get());
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

    private final CoprocessorBridge m_bridge = new CoprocessorBridge();

    ...

}
```

- Connect to your robot's network.

- Run `WPILib: Deploy Robot Code` from the ctrl-shift-P menu.

Now, when any ROS node publishes a `Float64` message on the `/ping_send` topic, the roboRIO will echo it back on `/ping_return` topic.

See [this example](https://github.com/frc-88/tj2_ros/blob/342ea89ae359d42474c8d1d68c8dea20de64f43e/src/tj2_comm/src/tj2_comm.cpp#L56) on how to set this up on the ROS side.

# Example

Check out the [DiffyJrROS](https://github.com/frc-88/DiffyJrROS/blob/5de22eb309424066742a23095398000f3fb5cc8b/src/main/java/frc/robot/subsystems/DiffyJrCoprocessorBridge.java) repository for a full example on how to use this library.

# Custom messages

This library comes with all message types defined in the common_msgs ROS package: <http://wiki.ros.org/common_msgs>

If you want custom messages to be sent between ROS and the roboRIO, follow these instructions.

## Initial setup

- Clone the message generation project into the root of your WPILib project:

```bash
git clone https://github.com/frc-88/ros_networktables_bridge_genmsg.git
```

- Create an empty file `source_list.json` in the root of your project. This defines the names of the messages you want to import.

- Fill it with the messages and repo sources. Here's an example `source_list.json` file:

  ```
  {
    "sources": [
        "tj2_interfaces/GameObjectsStamped",
        "tj2_interfaces/Match",
        "tj2_interfaces/MatchPeriod",
        "tj2_interfaces/NavX",
        "apriltag_ros/*"
    ],
    "repos": [
        {
            "local-name": "apriltag_ros",
            "uri": "https://github.com/AprilRobotics/apriltag_ros.git",
            "version": "master"
        },
        {
            "local-name": "std_msgs",
            "uri": "https://github.com/ros/std_msgs.git",
            "version": "kinetic-devel"
        },
        {
            "local-name": "common_msgs",
            "uri": "https://github.com/ros/common_msgs.git",
            "version": "noetic-devel"
        },
        {
            "local-name": "tj2_interfaces",
            "uri": "file:///home/ben/tj2_ros/src/tj2_interfaces",
            "version": ""
        }
    ]
  }
  ```

- `sources` defines what messages to translate into Java.

  - `apriltag_ros/*` indicates that I want all messages that are a part of the apriltag_ros package.

- `repos` defines where to look for message definitions.

  - **Important**: you must include message dependencies in the repos list. Just about every custom message relies on std_msgs and common_msgs, so they're included here.

  - You can also put local directories like what I've done for tj2_interfaces

  ## Build messages on macOS and linux

- If you don't have python 3 installed on your machine, install python:

  - On Ubuntu: `sudo apt-get install python3-pip python3-setuptools`
  - On macOS (homebrew method):

    - `/bin/bash -c "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/HEAD/install.sh)"`
    - `brew install python`

- Open a terminal window and change directory to the root of your WPILib project.

  ```bash
  cd /directory/to/project
  ```

  Replace `/directory/to/project` with the actual path to your project.

- Run setup script:

  ```bash
  ./ros_networktables_bridge_genmsg/setup.sh
  ```

- Make a new file `build-java-messages.sh`, a convenience script for generating messages.

- Copy and paste the following into this file:

```bash
#!/bin/bash
BASE_DIR=$(realpath "$(dirname $0)")

GEN_DIR=${BASE_DIR}/ros_networktables_bridge_genmsg
GEN_MSG_ROOT=${GEN_DIR}/genmsg
SOURCES_PATH=${BASE_DIR}/source_list.json

${GEN_DIR}/build-rospy-messages.sh ${SOURCES_PATH}
source ${GEN_DIR}/venv/bin/activate
source ${GEN_MSG_ROOT}/set_build_python_path.sh
python3 ${GEN_DIR}/main.py -r 'src/main/java' -m 'frc/robot/ros/messages' -s ${SOURCES_PATH}
```

- Replace `frc/robot/ros/messages` with your desired output directory.

- Make this file an executable: `chmod +x build-java-messages.sh`

- Run the script `./build-java-messsages.sh`

- Re-run this script any time a ROS message definition or `source_list.json` changes.

## On Windows

- If you don't have python 3 installed on your machine, install python by your method of choice.

  - I recommend through the community maintained package manager chocolatey: <https://community.chocolatey.org/>
  - Download instructions here: <https://chocolatey.org/install>
  - In an administrator powershell terminal, run: `choco install python`

- Add python to your environment path.

  - Press the Windows Key
  - Search for "environment variables"
  - Click the first entry
  - Click `Environment Variables...`
  - Click the entry for `Path`
  - Click `Edit...`
  - Click New
  - Type the path of the install python executable. For me, that was `C:\Python311\python.exe`
  - Click Ok -> Ok -> Ok
  - Relaunch VS Code to refresh environment variables

- Open a power shell terminal window and change directory to the root of your WPILib project.

  ```powershell
  cd C:\directory\to\project
  ```

  Replace `C:\directory\to\project` with the actual path to your project.

- Run setup script:

  ```powershell
  .\ros_networktables_bridge_genmsg\setup.bat
  ```

- Make a new file `build-java-messages.bat`, a convenience script for generating messages.

- Copy and paste the following into this file:

```bat
@echo off

SET BASE_DIR=%~dp0

SET GEN_DIR=%BASE_DIR%ros_networktables_bridge_genmsg
SET GEN_MSG_ROOT=%GEN_DIR%\genmsg
SET SOURCES_PATH=%BASE_DIR%source_list.json

call "%GEN_DIR%\build-rospy-messages.bat" "%SOURCES_PATH%"
call "%GEN_DIR%\venv\Scripts\activate"
call "%GEN_MSG_ROOT%\set_build_python_path.bat"
python "%GEN_DIR%\main.py" "-r" "src/main/java" "-m" "frc/robot/ros/messages" "-s" "%SOURCES_PATH%"
```

- replace `frc/robot/ros/messages` with your desired output directory.

- Run the script `.\build-java-messsages.bat`

- Re-run this script any time a ROS message definition or `source_list.json` changes.

## Import and usage of custom messages

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

# A note about namespaces

For those familiar with ROS, topics can have namespaces. For instance, a camera might have sub topics `camera_info` and `image_raw`:

```
/camera/camera_info
/camera/image_raw
```

The namespace for a topic is controlled by the source node. For ROSNetworkTablesBridge, the namespace is the same as ROS host.

If I create a `BridgePublisher` with the topic `imu` and the host node's namespace is `frc`, the topic will appear on the ROS side as `/frc/imu`.

If I create a `BridgePublisher` with the topic `/imu` and the host node's namespace is `frc`, the topic will appear on the ROS side as `/imu`.

If I create a `BridgePublisher` with the topic `imu` and the host node's namespace is `/` (root), the topic will appear on the ROS side as `/imu`.

This also applies to `BridgeSubscriber`. You can subscribe or publish to any ROS topic you want as long as the message type is built in Java, just be aware that not preceding the topic name with "/" will put your topic into the host's relative namespace.

# Contributing

Contributions are welcome! Please follow the guidelines in the CONTRIBUTING.md file.

If there's interest, I can investigate adding other ROS features like services, actions, or the full TF tree.

jitpack URL: <https://jitpack.io/#frc-88/ROSNetworkTablesBridge>
