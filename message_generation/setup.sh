#!/bin/bash

BASE_DIR=$(realpath "$(dirname $0)")

python3 -m pip install virtualenv
python3 -m venv ${BASE_DIR}/venv

source ${BASE_DIR}/venv/bin/activate
python3 -m pip install --upgrade pip setuptools
python3 -m pip install -r requirements.txt

${BASE_DIR}/build-rospy-messages.sh
