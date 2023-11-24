@echo off
title C-JDBC RAIDb-1 demo
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

echo Starting hsqldb on port 9003(recovery)
start /B hsqldb.bat -port 9003

pause 

echo Starting Controller with Raidb1 Configuration
start /B controller.bat -f ..\config\controller\controller-raidb1.xml
:end