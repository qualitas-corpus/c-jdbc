package org.objectweb.cjdbc.scenario.tools.mock;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverPropertyInfo;
import java.sql.SQLException;
import java.util.Properties;

import mockmaker.ExceptionalReturnValue;
import mockmaker.ReturnValues;

import com.mockobjects.ExpectationCounter;
import com.mockobjects.ExpectationList;

/**
 * Mock driver generated by MockMaker (www.mockmaker.org).
 */
public class MockDriver implements Driver
{
  private ExpectationCounter myConnectCalls                      = new ExpectationCounter(
                                                                     "java.sql.Driver ConnectCalls");
  private ReturnValues       myActualConnectReturnValues         = new ReturnValues(
                                                                     false);
  private ExpectationList    myConnectParameter0Values           = new ExpectationList(
                                                                     "java.sql.Driver java.lang.String");
  private ExpectationList    myConnectParameter1Values           = new ExpectationList(
                                                                     "java.sql.Driver java.util.Properties");
  private ExpectationCounter myAcceptsURLCalls                   = new ExpectationCounter(
                                                                     "java.sql.Driver AcceptsURLCalls");
  private ReturnValues       myActualAcceptsURLReturnValues      = new ReturnValues(
                                                                     false);
  private ExpectationList    myAcceptsURLParameter0Values        = new ExpectationList(
                                                                     "java.sql.Driver java.lang.String");
  private ExpectationCounter myGetPropertyInfoCalls              = new ExpectationCounter(
                                                                     "java.sql.Driver GetPropertyInfoCalls");
  private ReturnValues       myActualGetPropertyInfoReturnValues = new ReturnValues(
                                                                     false);
  private ExpectationList    myGetPropertyInfoParameter0Values   = new ExpectationList(
                                                                     "java.sql.Driver java.lang.String");
  private ExpectationList    myGetPropertyInfoParameter1Values   = new ExpectationList(
                                                                     "java.sql.Driver java.util.Properties");
  private ExpectationCounter myGetMajorVersionCalls              = new ExpectationCounter(
                                                                     "java.sql.Driver GetMajorVersionCalls");
  private ReturnValues       myActualGetMajorVersionReturnValues = new ReturnValues(
                                                                     false);
  private ExpectationCounter myGetMinorVersionCalls              = new ExpectationCounter(
                                                                     "java.sql.Driver GetMinorVersionCalls");
  private ReturnValues       myActualGetMinorVersionReturnValues = new ReturnValues(
                                                                     false);
  private ExpectationCounter myJdbcCompliantCalls                = new ExpectationCounter(
                                                                     "java.sql.Driver JdbcCompliantCalls");
  private ReturnValues       myActualJdbcCompliantReturnValues   = new ReturnValues(
                                                                     false);

  /**
   * setExpectedConnected
   * 
   * @param calls value
   */
  public void setExpectedConnectCalls(int calls)
  {
    myConnectCalls.setExpected(calls);
  }

  /**
   * addExpectedConnect
   * 
   * @param arg0 value
   * @param arg1 value
   */
  public void addExpectedConnectValues(String arg0, Properties arg1)
  {
    myConnectParameter0Values.addExpected(arg0);
    myConnectParameter1Values.addExpected(arg1);
  }

  /**
   * Connect
   * 
   * @param arg0 value
   * @param arg1 value
   * @return connection
   * @throws SQLException if exception
   */
  public Connection connect(String arg0, Properties arg1) throws SQLException
  {
    myConnectCalls.inc();
    myConnectParameter0Values.addActual(arg0);
    myConnectParameter1Values.addActual(arg1);
    Object nextReturnValue = myActualConnectReturnValues.getNext();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof SQLException)
      throw (SQLException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof RuntimeException)
      throw (RuntimeException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    return (Connection) nextReturnValue;
  }

  /**
   * setupExceptionConnect
   * 
   * @param arg value
   */
  public void setupExceptionConnect(Throwable arg)
  {
    myActualConnectReturnValues.add(new ExceptionalReturnValue(arg));
  }

  /**
   * setupConnect
   * 
   * @param arg value
   */
  public void setupConnect(Connection arg)
  {
    myActualConnectReturnValues.add(arg);
  }

  /**
   * setExpectedAcceptsURLCalls
   * 
   * @param calls value
   */
  public void setExpectedAcceptsURLCalls(int calls)
  {
    myAcceptsURLCalls.setExpected(calls);
  }

  /**
   * addExpectedAcceptsURLValues
   * 
   * @param arg0 value
   */
  public void addExpectedAcceptsURLValues(String arg0)
  {
    myAcceptsURLParameter0Values.addExpected(arg0);
  }

  /**
   * @see java.sql.Driver#acceptsURL(java.lang.String)
   */
  public boolean acceptsURL(String arg0) throws SQLException
  {
    myAcceptsURLCalls.inc();
    myAcceptsURLParameter0Values.addActual(arg0);
    Object nextReturnValue = myActualAcceptsURLReturnValues.getNext();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof SQLException)
      throw (SQLException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof RuntimeException)
      throw (RuntimeException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    return ((Boolean) nextReturnValue).booleanValue();
  }

  /**
   * setupExceptionAcceptsURL
   * 
   * @param arg value
   */
  public void setupExceptionAcceptsURL(Throwable arg)
  {
    myActualAcceptsURLReturnValues.add(new ExceptionalReturnValue(arg));
  }

  /**
   * setupAcceptsURL
   * 
   * @param arg value
   */
  public void setupAcceptsURL(boolean arg)
  {
    myActualAcceptsURLReturnValues.add(new Boolean(arg));
  }

  /**
   * setExpectedGetPropertyInfoCalls
   * 
   * @param calls value
   */
  public void setExpectedGetPropertyInfoCalls(int calls)
  {
    myGetPropertyInfoCalls.setExpected(calls);
  }

  /**
   * addExpectedGetPropertyInfoValues
   * 
   * @param arg0 value
   * @param arg1 value
   */
  public void addExpectedGetPropertyInfoValues(String arg0, Properties arg1)
  {
    myGetPropertyInfoParameter0Values.addExpected(arg0);
    myGetPropertyInfoParameter1Values.addExpected(arg1);
  }

  /**
   * @see java.sql.Driver#getPropertyInfo(java.lang.String,
   *      java.util.Properties)
   */
  public DriverPropertyInfo[] getPropertyInfo(String arg0, Properties arg1)
      throws SQLException
  {
    myGetPropertyInfoCalls.inc();
    myGetPropertyInfoParameter0Values.addActual(arg0);
    myGetPropertyInfoParameter1Values.addActual(arg1);
    Object nextReturnValue = myActualGetPropertyInfoReturnValues.getNext();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof SQLException)
      throw (SQLException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof RuntimeException)
      throw (RuntimeException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    return (DriverPropertyInfo[]) nextReturnValue;
  }

  /**
   * setupExceptionGetPropertyInfo
   * 
   * @param arg value
   */
  public void setupExceptionGetPropertyInfo(Throwable arg)
  {
    myActualGetPropertyInfoReturnValues.add(new ExceptionalReturnValue(arg));
  }

  /**
   * setupGetPropertyInfo
   * 
   * @param arg value
   */
  public void setupGetPropertyInfo(DriverPropertyInfo[] arg)
  {
    myActualGetPropertyInfoReturnValues.add(arg);
  }

  /**
   * setExpectedGetMajorVersionCalls
   * 
   * @param calls value
   */
  public void setExpectedGetMajorVersionCalls(int calls)
  {
    myGetMajorVersionCalls.setExpected(calls);
  }

  /**
   * @see java.sql.Driver#getMajorVersion()
   */
  public int getMajorVersion()
  {
    myGetMajorVersionCalls.inc();
    Object nextReturnValue = myActualGetMajorVersionReturnValues.getNext();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof RuntimeException)
      throw (RuntimeException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    return ((Integer) nextReturnValue).intValue();
  }

  /**
   * setupExceptionGetMajorVersion
   * 
   * @param arg value
   */
  public void setupExceptionGetMajorVersion(Throwable arg)
  {
    myActualGetMajorVersionReturnValues.add(new ExceptionalReturnValue(arg));
  }

  /**
   * setupGetMajorVersion
   * 
   * @param arg value
   */
  public void setupGetMajorVersion(int arg)
  {
    myActualGetMajorVersionReturnValues.add(new Integer(arg));
  }

  /**
   * setExpectedGetMinorVersionCalls
   * 
   * @param calls value
   */
  public void setExpectedGetMinorVersionCalls(int calls)
  {
    myGetMinorVersionCalls.setExpected(calls);
  }

  /**
   * @see java.sql.Driver#getMinorVersion()
   */
  public int getMinorVersion()
  {
    myGetMinorVersionCalls.inc();
    Object nextReturnValue = myActualGetMinorVersionReturnValues.getNext();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof RuntimeException)
      throw (RuntimeException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    return ((Integer) nextReturnValue).intValue();
  }

  /**
   * setupExceptionGetMinorVersion
   * 
   * @param arg value
   */
  public void setupExceptionGetMinorVersion(Throwable arg)
  {
    myActualGetMinorVersionReturnValues.add(new ExceptionalReturnValue(arg));
  }

  /**
   * setupGetMinorVersion
   * 
   * @param arg value
   */
  public void setupGetMinorVersion(int arg)
  {
    myActualGetMinorVersionReturnValues.add(new Integer(arg));
  }

  /**
   * setExpectedJdbcCompliantCalls
   * 
   * @param calls value
   */
  public void setExpectedJdbcCompliantCalls(int calls)
  {
    myJdbcCompliantCalls.setExpected(calls);
  }

  /**
   * jdbcCompliant
   * 
   * @see java.sql.Driver#jdbcCompliant()
   */
  public boolean jdbcCompliant()
  {
    myJdbcCompliantCalls.inc();
    Object nextReturnValue = myActualJdbcCompliantReturnValues.getNext();
    if (nextReturnValue instanceof ExceptionalReturnValue
        && ((ExceptionalReturnValue) nextReturnValue).getException() instanceof RuntimeException)
      throw (RuntimeException) ((ExceptionalReturnValue) nextReturnValue)
          .getException();
    return ((Boolean) nextReturnValue).booleanValue();
  }

  /**
   * setupExceptionJdbcCompliant
   * 
   * @param arg value
   */
  public void setupExceptionJdbcCompliant(Throwable arg)
  {
    myActualJdbcCompliantReturnValues.add(new ExceptionalReturnValue(arg));
  }

  /**
   * setupJdbcCompliant
   * 
   * @param arg value
   */
  public void setupJdbcCompliant(boolean arg)
  {
    myActualJdbcCompliantReturnValues.add(new Boolean(arg));
  }

  /**
   * verify
   */
  public void verify()
  {
    myConnectCalls.verify();
    myConnectParameter0Values.verify();
    myConnectParameter1Values.verify();
    myAcceptsURLCalls.verify();
    myAcceptsURLParameter0Values.verify();
    myGetPropertyInfoCalls.verify();
    myGetPropertyInfoParameter0Values.verify();
    myGetPropertyInfoParameter1Values.verify();
    myGetMajorVersionCalls.verify();
    myGetMinorVersionCalls.verify();
    myJdbcCompliantCalls.verify();
  }
}