#!/bin/sh

CJDBC_HOME=%INSTALL_PATH

cd $CJDBC_HOME/bin

echo "Starting hsqldb on port 9003"
./hsqldb.sh -port 9003 &

echo "Starting hsqldb on port 9004"
./hsqldb.sh -port 9004 &


echo "Waiting for hsqldb servers to finish start up"
sleep 5

echo "Starting Controller 2"
./controller.sh -f ../config/controller/controller-distributed-2.xml &
