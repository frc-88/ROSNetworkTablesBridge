@echo off

SET BASE_DIR=%~dp0

SET GEN_DIR=%BASE_DIR%\ros_networktables_bridge_genmsg
call "%BASE_DIR%\venv\bin\activate.bat"
python "%GEN_DIR%\main.py" "-r" "src/main/java" "-m" "frc/team88/ros/messages"
