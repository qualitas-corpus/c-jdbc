@echo off
title C-JDBC Distributed RAIDb-1 demo - Controller 1
echo ******************************************************
echo ******************************************************
echo **                                                  **
echo ** Please press a key when hsqldb servers are ready **
echo **                                                  **
echo ******************************************************
echo ******************************************************

SET CJDBC_HOME="$INSTALL_PATH"

:begin
cd "%CJDBC_HOME%\bin"

echo Starting hsqldb on port 9001
start /B hsqldb.bat -port 9001

echo Starting hsqldb on port 9002
start /B hsqldb.bat -port 9002

pause 

echo Starting Controller 1 in distributed Configuration
start /B controller.bat -f ..\config\controller\controller-distributed-1.xml

:end