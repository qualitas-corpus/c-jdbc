#!/bin/sh

CJDBC_HOME=%INSTALL_PATH

cd $CJDBC_HOME/bin

echo "Starting hsqldb on port 9001"
./hsqldb.sh -port 9001 &

echo "Starting hsqldb on port 9002"
./hsqldb.sh -port 9002 &

echo "Waiting for hsqldb servers to finish start up"
sleep 5

echo "Starting Controller 1"
./controller.sh -f ../config/controller/controller-distributed-1.xml &
