@echo off

SET BASE_DIR=%~dp0

SET GEN_DIR=%BASE_DIR%\ros_networktables_bridge_genmsg
call "%GEN_DIR%\venv\Scripts\activate"
python "%GEN_DIR%\main.py" "-r" "src/main/java" "-m" "frc/team88/ros/messages"
