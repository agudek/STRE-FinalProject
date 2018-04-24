/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 12:29:26 GMT 2018
 */

package com.jfinal.plugin.activerecord.generator;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class DataDictionaryGenerator_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.plugin.activerecord.generator.DataDictionaryGenerator"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(DataDictionaryGenerator_ESTest_scaffolding.class.getClassLoader() ,
      "com.mchange.v2.cfg.BasicPropertiesConfigSource",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$ErrorLogger",
      "com.mchange.v2.cfg.PropertiesConfigSource",
      "com.mchange.v2.log.FallbackMLog",
      "com.alibaba.druid.proxy.DruidDriver",
      "com.mchange.v2.cfg.MLogConfigSource",
      "org.apache.log4j.Level",
      "com.mchange.v2.coalesce.CoalescerFactory",
      "com.alibaba.druid.pool.DruidAbstractDataSourceMBean",
      "com.mchange.v2.log.MLogClasses",
      "com.mchange.v2.c3p0.impl.PoolBackedDataSourceBase",
      "com.mchange.v2.cfg.MConfig$PathsKey",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner",
      "com.mchange.v2.c3p0.AbstractConnectionTester",
      "com.mchange.v2.util.DoubleWeakHashMap$UserKeySet",
      "com.mchange.v2.cfg.DelayedLogItem",
      "com.mchange.v1.util.ArrayUtils",
      "com.mchange.v2.log.jdk14logging.ForwardingLogger",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean",
      "com.mchange.v2.log.MLevel",
      "com.mchange.v2.c3p0.impl.C3P0ImplUtils",
      "com.alibaba.druid.support.logging.LogFactory",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$2",
      "com.mchange.v2.ser.UnsupportedVersionException",
      "com.mchange.v2.beans.BeansUtils",
      "com.jfinal.plugin.activerecord.generator.DataDictionaryGenerator",
      "com.mchange.v2.c3p0.impl.AuthMaskingProperties",
      "com.alibaba.druid.pool.GetConnectionTimeoutException",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigFinder",
      "com.mchange.v2.c3p0.impl.WrapperConnectionPoolDataSourceBase",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$InfoLogger",
      "com.alibaba.druid.sql.parser.SQLParser",
      "org.apache.log4j.Hierarchy",
      "com.alibaba.druid.sql.parser.SQLStatementParser",
      "com.alibaba.druid.stat.JdbcDataSourceStat",
      "com.mchange.v2.cfg.DelayedLogItem$Level",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$1",
      "com.mchange.v2.cfg.MultiPropertiesConfig",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "com.mchange.v1.cachedstore.CachedStoreException",
      "com.alibaba.druid.stat.JdbcSqlStatMBean",
      "com.mchange.v2.util.DoubleWeakHashMap",
      "com.alibaba.druid.pool.DruidPooledConnection",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource",
      "com.alibaba.druid.util.JdbcUtils",
      "com.mchange.v1.cachedstore.CachedStore$Manager",
      "com.mchange.v1.identicator.Identicator",
      "org.apache.log4j.helpers.OptionConverter",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$3",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$2",
      "com.alibaba.druid.pool.ManagedDataSource",
      "org.apache.log4j.or.ObjectRenderer",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$1",
      "com.mchange.v2.cfg.PropertiesConfig",
      "com.alibaba.druid.pool.ValidConnectionChecker",
      "com.mchange.v1.identicator.IdentityHashCodeIdenticator",
      "com.mchange.v2.coalesce.WeakCcCoalescer",
      "com.mchange.v2.log.MLogger",
      "org.apache.log4j.Category",
      "com.mchange.v2.c3p0.cfg.NamedScope",
      "com.mchange.v2.encounter.EncounterCounter",
      "com.mchange.v1.cachedstore.NoCleanupCachedStore",
      "com.mchange.v2.c3p0.ConnectionTester",
      "com.mchange.v2.c3p0.cfg.C3P0Config",
      "com.mchange.v2.coalesce.Coalescer",
      "com.mchange.v2.management.ManagementUtils$2",
      "com.mchange.v2.management.ManagementUtils$1",
      "com.mchange.v2.c3p0.cfg.DefaultC3P0ConfigFinder",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$OffLogger",
      "com.alibaba.druid.stat.JdbcDataSourceStatMBean",
      "com.alibaba.druid.proxy.DruidDriverMBean",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource",
      "com.mchange.v1.identicator.IdHashKey",
      "com.alibaba.druid.pool.ExceptionSorter",
      "com.alibaba.druid.proxy.jdbc.DataSourceProxy",
      "com.alibaba.druid.pool.WrapperAdapter",
      "org.apache.log4j.PropertyWatchdog",
      "com.mchange.v2.encounter.EncounterUtils",
      "com.mchange.v2.coalesce.CoalesceChecker",
      "com.mchange.v2.log.NameTransformer",
      "com.mchange.v2.encounter.GenericEncounterCounter",
      "com.mchange.v2.util.DoubleWeakHashMap$WKey",
      "com.alibaba.druid.mock.MockDriverMBean",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$QuerylessTestRunner",
      "com.alibaba.druid.pool.DataSourceDisableException",
      "com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase",
      "com.mchange.v2.c3p0.impl.AbstractIdentityTokenized",
      "org.apache.log4j.spi.AppenderAttachable",
      "com.mchange.v2.c3p0.management.ManagementCoordinator",
      "org.apache.log4j.Priority",
      "com.alibaba.druid.pool.DruidAbstractDataSource$PhysicalConnectionInfo",
      "com.mchange.v2.c3p0.FullQueryConnectionTester",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter",
      "com.mchange.v1.identicator.IdWeakHashMap",
      "org.apache.log4j.LogManager",
      "com.mchange.v2.uid.UidUtils",
      "com.mchange.v2.naming.ReferenceIndirector",
      "com.mchange.v2.log.slf4j.Slf4jMLog",
      "com.mchange.v1.cachedstore.CachedStoreFactory",
      "com.mchange.v1.identicator.WeakIdHashKey$Ref",
      "com.mchange.v2.c3p0.management.C3P0RegistryManager",
      "com.alibaba.druid.pool.DruidAbstractDataSource",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.mchange.v1.identicator.IdMap",
      "org.apache.log4j.or.RendererMap",
      "com.alibaba.druid.wall.WallProviderStatValue",
      "com.alibaba.druid.support.logging.Resources",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$LevelLogger",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.mchange.v2.cfg.PropertiesConfigSource$Parse",
      "com.mchange.v2.coalesce.CoalesceIdenticator",
      "com.mchange.v2.naming.JavaBeanReferenceMaker",
      "com.mchange.v1.lang.BooleanUtils",
      "org.hsqldb.jdbc.JDBCDriver$1",
      "com.alibaba.druid.util.Utils",
      "com.alibaba.druid.pool.DataSourceNotAvailableException",
      "com.mchange.v2.log.MLogConfig",
      "com.mchange.v2.c3p0.UnifiedConnectionTester",
      "com.mchange.v2.c3p0.PooledDataSource",
      "org.apache.log4j.CategoryKey",
      "com.mchange.v2.c3p0.DriverManagerDataSource",
      "com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser",
      "com.jfinal.kit.StrKit",
      "com.alibaba.druid.pool.PreparedStatementHolder",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigUtils",
      "com.alibaba.druid.pool.DruidDataSourceStatValue",
      "com.alibaba.druid.TransactionTimeoutException",
      "com.alibaba.druid.pool.DataSourceClosedException",
      "com.alibaba.druid.stat.JdbcSqlStat",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigXmlUtils",
      "com.mchange.v1.identicator.WeakIdHashKey",
      "org.apache.log4j.helpers.Loader",
      "com.mchange.v2.cfg.ConfigUtils",
      "org.apache.log4j.ProvisionNode",
      "com.mchange.v2.c3p0.ComboPooledDataSource",
      "com.mchange.v2.ser.Indirector",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl",
      "com.mchange.v2.log.MLogInitializationException",
      "org.apache.log4j.helpers.FileWatchdog",
      "com.alibaba.druid.util.TransactionInfo",
      "com.mchange.v2.log.MLog",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$TraceLogger",
      "org.apache.log4j.spi.RootLogger",
      "com.mchange.v2.lang.ObjectUtils",
      "org.apache.log4j.spi.RendererSupport",
      "com.mchange.v2.c3p0.management.ActiveManagementCoordinator",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource$1",
      "com.mchange.v1.lang.Synchronizer$1",
      "com.alibaba.druid.DruidRuntimeException",
      "com.jfinal.plugin.activerecord.generator.TableMeta",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource$1",
      "com.mchange.v2.c3p0.PoolBackedDataSource",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig$SystemPropertiesConfigSource",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean$1",
      "com.mchange.v2.coalesce.AbstractWeakCoalescer",
      "com.alibaba.druid.pool.PoolableWrapper",
      "com.mchange.v2.cfg.MConfig$CSManager",
      "com.mchange.v2.c3p0.impl.C3P0Defaults",
      "com.mchange.v1.cachedstore.CachedStoreUtils",
      "com.alibaba.druid.proxy.DruidDriver$1",
      "com.alibaba.druid.pool.DruidDataSourceMBean",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$DebugLogger",
      "com.mchange.v2.c3p0.management.C3P0RegistryManagerMBean",
      "com.mchange.v2.c3p0.impl.IdentityTokenized",
      "com.alibaba.druid.pool.DruidDataSourceStatLogger",
      "org.apache.log4j.Logger",
      "com.mchange.v2.c3p0.DriverManagerDataSource$1",
      "com.mchange.v2.encounter.EncounterUtils$1",
      "com.jfinal.plugin.activerecord.generator.ColumnMeta",
      "com.alibaba.druid.support.logging.Log",
      "org.apache.log4j.helpers.LogLog",
      "com.mchange.v2.lang.Coerce",
      "com.alibaba.druid.mock.handler.MockExecuteHandler",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$WarnLogger",
      "com.mchange.v2.ser.IndirectlySerialized",
      "com.mchange.v2.encounter.AbstractEncounterCounter",
      "com.mchange.v2.management.ManagementUtils",
      "com.mchange.v2.util.DoubleWeakHashMap$WVal",
      "com.mchange.v2.util.DoubleWeakHashMap$CheckKeyHolder",
      "org.apache.log4j.spi.RepositorySelector",
      "com.alibaba.druid.proxy.jdbc.TransactionInfo",
      "com.mchange.v1.cachedstore.CachedStore",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger",
      "com.alibaba.druid.util.JdbcConstants",
      "com.mchange.v1.cachedstore.WritableCachedStore",
      "org.apache.log4j.or.DefaultRenderer",
      "com.mchange.v2.c3p0.impl.DbAuth",
      "com.mchange.v2.c3p0.impl.IdentityTokenizedCoalesceChecker",
      "com.mchange.v2.log.MLog$1",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "com.mchange.v2.c3p0.ConnectionCustomizer",
      "com.alibaba.druid.mock.MockDriver",
      "com.mchange.v2.naming.ReferenceMaker",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
      "com.alibaba.druid.mock.handler.MySqlMockExecuteHandlerImpl",
      "com.mchange.v1.lang.Synchronizer",
      "com.mchange.v2.c3p0.C3P0Registry",
      "com.alibaba.druid.filter.Filter",
      "com.mchange.v1.cachedstore.TweakableCachedStore",
      "com.mchange.v2.c3p0.QueryConnectionTester",
      "com.alibaba.druid.support.logging.Log4jImpl",
      "com.mchange.v2.c3p0.impl.IdentityTokenResolvable",
      "com.alibaba.druid.pool.DruidDataSource",
      "com.mchange.v2.cfg.MConfig",
      "org.apache.log4j.spi.LoggerRepository",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner$1",
      "com.alibaba.druid.util.Histogram"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(DataDictionaryGenerator_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.plugin.activerecord.generator.DataDictionaryGenerator",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "com.jfinal.log.Log4jLogFactory",
      "com.jfinal.log.Log",
      "com.jfinal.log.Log4jLog",
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
      "com.jfinal.kit.LogKit$Holder",
      "com.alibaba.druid.support.monitor.annotation.AggregateType",
      "com.mchange.v2.c3p0.impl.AbstractIdentityTokenized",
      "com.mchange.v2.c3p0.impl.IdentityTokenResolvable",
      "com.mchange.v2.log.MLogConfig",
      "com.mchange.v2.cfg.MLogConfigSource",
      "com.mchange.v2.cfg.ConfigUtils",
      "com.mchange.v2.cfg.DelayedLogItem",
      "com.mchange.v2.cfg.DelayedLogItem$Level",
      "com.mchange.v2.cfg.MultiPropertiesConfig",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig",
      "com.mchange.v2.cfg.BasicPropertiesConfigSource",
      "com.mchange.v2.cfg.PropertiesConfigSource$Parse",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig$SystemPropertiesConfigSource",
      "com.mchange.v2.log.MLogClasses",
      "com.mchange.v2.log.MLevel",
      "com.mchange.v2.log.slf4j.Slf4jMLog",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$TraceLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$DebugLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$InfoLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$WarnLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$ErrorLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$OffLogger",
      "com.mchange.v2.log.MLog$1",
      "com.mchange.v2.log.MLog",
      "com.mchange.v2.naming.JavaBeanReferenceMaker",
      "com.mchange.v2.naming.ReferenceIndirector",
      "com.mchange.v2.c3p0.impl.PoolBackedDataSourceBase",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource",
      "com.mchange.v2.c3p0.ComboPooledDataSource",
      "com.mchange.v2.c3p0.impl.C3P0Defaults",
      "com.mchange.v2.cfg.MConfig$CSManager",
      "com.mchange.v1.cachedstore.CachedStoreFactory",
      "com.mchange.v1.cachedstore.NoCleanupCachedStore",
      "com.mchange.v1.cachedstore.CachedStoreUtils",
      "com.mchange.v1.lang.Synchronizer",
      "com.mchange.v1.lang.Synchronizer$1",
      "com.mchange.v2.cfg.MConfig",
      "com.mchange.v2.cfg.MConfig$PathsKey",
      "com.mchange.v1.util.ArrayUtils",
      "com.mchange.v2.lang.ObjectUtils",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigXmlUtils",
      "com.mchange.v2.c3p0.cfg.DefaultC3P0ConfigFinder",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigUtils",
      "com.mchange.v2.lang.Coerce",
      "com.mchange.v2.c3p0.cfg.NamedScope",
      "com.mchange.v2.c3p0.cfg.C3P0Config",
      "com.mchange.v2.c3p0.impl.AbstractPoolBackedDataSource$1",
      "com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase",
      "com.alibaba.druid.proxy.DruidDriver$1",
      "com.alibaba.druid.proxy.DruidDriver",
      "com.alibaba.druid.mock.handler.MySqlMockExecuteHandlerImpl",
      "com.alibaba.druid.mock.MockDriver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.mchange.v2.c3p0.DriverManagerDataSource",
      "com.mchange.v1.lang.BooleanUtils",
      "com.mchange.v2.c3p0.impl.AuthMaskingProperties",
      "com.mchange.v2.c3p0.impl.DbAuth",
      "com.mchange.v2.log.jdk14logging.ForwardingLogger",
      "com.mchange.v1.identicator.IdentityHashCodeIdenticator",
      "com.mchange.v2.encounter.EncounterUtils",
      "com.mchange.v2.encounter.AbstractEncounterCounter",
      "com.mchange.v2.encounter.GenericEncounterCounter",
      "com.mchange.v1.identicator.IdMap",
      "com.mchange.v1.identicator.IdWeakHashMap",
      "com.mchange.v2.encounter.EncounterUtils$1",
      "com.mchange.v2.uid.UidUtils",
      "com.mchange.v2.c3p0.impl.C3P0ImplUtils",
      "com.mchange.v1.identicator.IdHashKey",
      "com.mchange.v1.identicator.WeakIdHashKey",
      "com.mchange.v1.identicator.WeakIdHashKey$Ref",
      "com.mchange.v2.c3p0.impl.IdentityTokenizedCoalesceChecker",
      "com.mchange.v2.coalesce.CoalescerFactory",
      "com.mchange.v2.coalesce.AbstractWeakCoalescer",
      "com.mchange.v2.coalesce.WeakCcCoalescer",
      "com.mchange.v2.coalesce.CoalesceIdenticator",
      "com.mchange.v2.util.DoubleWeakHashMap",
      "com.mchange.v2.util.DoubleWeakHashMap$CheckKeyHolder",
      "com.mchange.v2.c3p0.AbstractConnectionTester",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$1",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$2",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$3",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner$1",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester",
      "com.mchange.v2.c3p0.management.ActiveManagementCoordinator",
      "com.mchange.v2.c3p0.C3P0Registry",
      "com.mchange.v2.util.DoubleWeakHashMap$UserKeySet",
      "com.mchange.v2.util.DoubleWeakHashMap$WKey",
      "com.mchange.v2.util.DoubleWeakHashMap$WVal",
      "com.mchange.v2.c3p0.DriverManagerDataSource$1",
      "com.mchange.v2.c3p0.impl.WrapperConnectionPoolDataSourceBase",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource$1",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$1",
      "com.mchange.v2.c3p0.AbstractComboPooledDataSource$2",
      "com.jfinal.plugin.activerecord.generator.TableMeta",
      "com.alibaba.druid.pool.DruidDataSourceC3P0Adapter",
      "com.alibaba.druid.pool.WrapperAdapter",
      "com.alibaba.druid.support.logging.Resources",
      "com.alibaba.druid.support.logging.Log4jImpl",
      "com.alibaba.druid.support.logging.LogFactory",
      "com.alibaba.druid.pool.DruidAbstractDataSource",
      "com.alibaba.druid.pool.DruidDataSource",
      "com.alibaba.druid.util.Histogram",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl",
      "com.alibaba.druid.util.Utils",
      "com.zaxxer.hikari.util.DriverDataSource",
      "com.jfinal.plugin.activerecord.generator.ColumnMeta",
      "com.jfinal.kit.StrKit",
      "com.alibaba.druid.util.JdbcUtils",
      "com.mchange.v2.c3p0.PoolBackedDataSource",
      "com.mchange.v2.c3p0.management.C3P0RegistryManager",
      "com.alibaba.druid.util.StringUtils",
      "com.mchange.v2.beans.BeansUtils",
      "com.mchange.v2.management.ManagementUtils$1",
      "com.mchange.v2.management.ManagementUtils$2",
      "com.mchange.v2.management.ManagementUtils",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean",
      "com.mchange.v2.c3p0.management.DynamicPooledDataSourceManagerMBean$1",
      "com.mchange.v2.ser.SerializableUtils",
      "com.mchange.v2.ser.IndirectPolicy",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPoolManager",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$DeadlockDetector",
      "com.mchange.v2.async.ThreadPoolAsynchronousRunner$PoolThread",
      "com.mchange.v2.resourcepool.ResourcePoolFactory",
      "com.mchange.v2.resourcepool.BasicResourcePoolFactory",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ResourceItselfInUseLockFetcher",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$C3P0PooledConnectionNestedLockLockFetcher",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ConnectionEventListenerImpl",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$ThrowableHolderPool",
      "com.mchange.v2.c3p0.impl.C3P0PooledConnectionPool$1PooledConnectionResourcePoolManager",
      "com.mchange.v2.resourcepool.BasicResourcePool",
      "com.mchange.v2.resourcepool.BasicResourcePool$ScatteredAcquireTask",
      "com.alibaba.druid.pool.PoolableWrapper",
      "com.alibaba.druid.pool.DruidPooledConnection",
      "com.mchange.v2.resourcepool.BasicResourcePool$5",
      "com.alibaba.druid.pool.DruidDataSourceStatValue",
      "com.jfinal.kit.LogKit"
    );
  }
}