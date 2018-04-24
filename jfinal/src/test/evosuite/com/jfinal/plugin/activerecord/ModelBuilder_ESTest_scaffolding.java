/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 12:41:49 GMT 2018
 */

package com.jfinal.plugin.activerecord;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ModelBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.plugin.activerecord.ModelBuilder"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/agudek/Documents/STRE/final_project/jfinal"); 
    java.lang.System.setProperty("user.home", "/home/agudek"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "agudek"); 
    java.lang.System.setProperty("user.timezone", "Europe/Amsterdam"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ModelBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "com.alibaba.druid.util.jdbc.ConnectionBase",
      "com.alibaba.druid.util.jdbc.ResultSetBase",
      "com.alibaba.druid.mock.MockPreparedStatement",
      "com.alibaba.druid.mock.MockResultSetMetaData",
      "com.alibaba.druid.mock.MockClob",
      "com.alibaba.druid.mock.MockCallableStatement",
      "com.alibaba.druid.util.jdbc.PreparedStatementBase",
      "com.alibaba.druid.util.jdbc.ResultSetMetaDataBase",
      "com.alibaba.druid.mock.MockNClob",
      "com.alibaba.druid.util.jdbc.ResultSetMetaDataBase$ColumnMetaData",
      "com.alibaba.druid.mock.MockDriver",
      "com.alibaba.druid.mock.MockParameterMetaData",
      "com.alibaba.druid.mock.MockResultSet",
      "com.alibaba.druid.mock.MockStatementBase",
      "com.jfinal.plugin.activerecord.ModelBuilder",
      "com.alibaba.druid.mock.MockStatement",
      "com.alibaba.druid.mock.MockDriverMBean",
      "com.alibaba.druid.util.jdbc.StatementBase",
      "com.alibaba.druid.mock.MockBlob",
      "com.alibaba.druid.mock.MockConnection",
      "com.alibaba.druid.mock.MockConnectionClosedException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ModelBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.plugin.activerecord.ModelBuilder",
      "com.alibaba.druid.support.monitor.annotation.AggregateType",
      "com.alibaba.druid.mock.handler.MySqlMockExecuteHandlerImpl",
      "com.alibaba.druid.proxy.DruidDriver$1",
      "com.alibaba.druid.proxy.DruidDriver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.alibaba.druid.mock.MockDriver",
      "com.alibaba.druid.util.jdbc.StatementBase",
      "com.alibaba.druid.util.jdbc.PreparedStatementBase",
      "com.alibaba.druid.mock.MockPreparedStatement",
      "com.alibaba.druid.mock.MockCallableStatement",
      "com.alibaba.druid.mock.MockParameterMetaData",
      "com.alibaba.druid.util.jdbc.ResultSetMetaDataBase",
      "com.alibaba.druid.mock.MockResultSetMetaData",
      "com.alibaba.druid.util.jdbc.ConnectionBase",
      "com.alibaba.druid.mock.MockConnection",
      "com.alibaba.druid.mock.MockClob",
      "com.alibaba.druid.mock.MockNClob",
      "com.alibaba.druid.mock.MockStatement",
      "com.alibaba.druid.util.jdbc.ResultSetBase",
      "com.alibaba.druid.mock.MockResultSet",
      "com.alibaba.druid.pool.WrapperAdapter",
      "com.alibaba.druid.support.logging.Resources",
      "com.alibaba.druid.support.logging.Log4jImpl",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "com.alibaba.druid.support.logging.LogFactory",
      "com.alibaba.druid.pool.DruidAbstractDataSource",
      "com.alibaba.druid.pool.DruidDataSource",
      "com.alibaba.druid.util.Histogram",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl",
      "com.alibaba.druid.util.Utils",
      "com.alibaba.druid.util.JdbcUtils",
      "com.alibaba.druid.pool.DruidPooledPreparedStatement$PreparedStatementKey",
      "com.alibaba.druid.pool.DruidConnectionHolder",
      "com.alibaba.druid.pool.PreparedStatementHolder",
      "com.alibaba.druid.pool.PoolableWrapper",
      "com.alibaba.druid.pool.DruidPooledStatement",
      "com.alibaba.druid.pool.DruidPooledPreparedStatement",
      "com.alibaba.druid.pool.DruidPooledResultSet",
      "com.alibaba.druid.pool.DruidAbstractDataSource$PhysicalConnectionInfo",
      "com.alibaba.druid.pool.DruidPooledConnection",
      "com.alibaba.druid.mock.MockBlob",
      "com.alibaba.druid.pool.DruidPooledCallableStatement",
      "com.alibaba.druid.util.JMXUtils",
      "com.alibaba.druid.VERSION",
      "com.alibaba.druid.mock.MockSavepoint",
      "com.alibaba.druid.mock.MockArray",
      "com.alibaba.druid.mock.MockRowId",
      "com.alibaba.druid.sql.parser.SQLParser",
      "com.alibaba.druid.sql.parser.SQLStatementParser",
      "com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser",
      "com.alibaba.druid.sql.parser.SQLExprParser",
      "com.alibaba.druid.sql.dialect.mysql.parser.MySqlExprParser",
      "com.alibaba.druid.sql.parser.Lexer",
      "com.alibaba.druid.sql.parser.Token",
      "com.alibaba.druid.sql.parser.Keywords",
      "com.alibaba.druid.sql.dialect.mysql.parser.MySqlLexer",
      "com.alibaba.druid.sql.parser.CharTypes",
      "com.alibaba.druid.sql.parser.ParserException",
      "com.alibaba.druid.util.StringUtils",
      "net.sf.ehcache.store.MemoryStoreEvictionPolicy",
      "net.sf.ehcache.config.CacheWriterConfiguration$WriteMode",
      "net.sf.ehcache.config.CacheWriterConfiguration",
      "net.sf.ehcache.config.CacheConfiguration$TransactionalMode",
      "net.sf.ehcache.config.CopyStrategyConfiguration",
      "net.sf.ehcache.config.CacheConfiguration",
      "net.sf.ehcache.config.ElementValueComparatorConfiguration",
      "net.sf.ehcache.config.FactoryConfiguration",
      "net.sf.ehcache.config.CacheConfiguration$BootstrapCacheLoaderFactoryConfiguration",
      "com.alibaba.druid.mock.MockSQLXML"
    );
  }
}
