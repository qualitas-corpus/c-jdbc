#!/bin/sh

CJDBC_HOME=%INSTALL_PATH

cd $CJDBC_HOME/bin

echo "Starting hsqldb on port 9001"
./hsqldb.sh -port 9001 &

echo "Starting hsqldb on port 9002"
./hsqldb.sh -port 9002 &

echo "Starting hsqldb on port 9003 (recovery)"
./hsqldb.sh -port 9003 &

echo "Waiting for hsqldb servers to finish start up"
sleep 10

echo "Starting Controller with Raidb1 Configuration"
./controller.sh -f ../config/controller/controller-raidb1.xml &
