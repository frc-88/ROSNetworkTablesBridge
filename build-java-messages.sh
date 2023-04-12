BASE_DIR=$(realpath "$(dirname $0)")

GEN_DIR=${BASE_DIR}/ros_networktables_bridge_genmsg
source ${GEN_DIR}/venv/bin/activate
python3 ${GEN_DIR}/main.py -r 'src/main/java' -m 'frc/team88/ros/messages' -s ${GEN_DIR}/source_list.json
