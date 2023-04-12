#!/bin/bash

set -e

if [ "$EUID" -eq 0 ]; then
    echo "Cannot be root!"
    exit 1
fi

BASE_DIR=$(realpath "$(dirname $0)")
INTERFACES_BASE_DIR=$1

if [ -z ${INTERFACES_BASE_DIR} ]; then
    SRC_ROS_MSG_DIR=~/tj2_ros/src/tj2_interfaces
else
    SRC_ROS_MSG_DIR=${INTERFACES_BASE_DIR}
fi

GEN_MSG_ROOT=${BASE_DIR}/genmsg

mkdir -p ${GEN_MSG_ROOT}
ROS_MSG_DIR=${GEN_MSG_ROOT}/tj2_interfaces
rm -r ${ROS_MSG_DIR} || true
cp -r ${SRC_ROS_MSG_DIR} ${ROS_MSG_DIR}

if [ ! -d ${GEN_MSG_ROOT}/std_msgs ] ; then
    git clone https://github.com/ros/std_msgs.git ${GEN_MSG_ROOT}/std_msgs
fi

if [ ! -d ${GEN_MSG_ROOT}/common_msgs ] ; then
    git clone https://github.com/ros/common_msgs.git ${GEN_MSG_ROOT}/common_msgs
fi

source ${BASE_DIR}/venv/bin/activate
rospy-build genmsg ${ROS_MSG_DIR} -s ${GEN_MSG_ROOT}
python3 -m pip install -e ${ROS_MSG_DIR}
