BASE_DIR=$(realpath "$(dirname $0)")

export PYTHONPATH=${BASE_DIR}/genmsg/tj2_interfaces/tj2_interfaces:$PYTHONPATH
echo $PYTHONPATH
source ${BASE_DIR}/venv/bin/activate
python3 main.py ${BASE_DIR}/source_list.json
