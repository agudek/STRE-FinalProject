/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 12:14:37 GMT 2018
 */

package com.jfinal.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ActionHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.core.ActionHandler"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "17"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "5793"); 
    java.lang.System.setProperty("initialization_timeout", "17"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "17"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "2"); 
    java.lang.System.setProperty("write_pool", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/pools/com.jfinal.core.ActionHandler.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "17"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/evosuite-seeds/com.jfinal.core.ActionHandler.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "109"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "41887"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/logs/com.jfinal.core.ActionHandler"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/reports/com.jfinal.core.ActionHandler"); 
    java.lang.System.setProperty("minimization_timeout", "17"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile2520863413925005175.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/seeds/com.jfinal.core.ActionHandler.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "com.jfinal.core.ActionHandler"); 
    java.lang.System.setProperty("spawn_process_manager_port", "43787"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "17"); 
    java.lang.System.setProperty("test_dir", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/tests"); 
    java.lang.System.setProperty("search_budget", "109"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActionHandler_ESTest_scaffolding.class.getClassLoader() ,
      "org.eclipse.jetty.server.Request",
      "org.eclipse.jetty.util.component.AggregateLifeCycle$Bean",
      "com.jfinal.config.Routes$Route",
      "org.eclipse.jetty.util.Utf8StringBuilder",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.util.StringMap$Node",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.eclipse.jetty.http.HttpBuffers",
      "org.eclipse.jetty.io.Buffers$Type",
      "org.apache.log4j.or.RendererMap",
      "org.eclipse.jetty.io.EofException",
      "org.eclipse.jetty.io.UncheckedPrintWriter",
      "org.eclipse.jetty.server.BlockingHttpConnection",
      "org.apache.log4j.Level",
      "org.eclipse.jetty.http.HttpParser$EventHandler",
      "com.jfinal.core.ActionException",
      "org.eclipse.jetty.server.HttpInput",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.server.HandlerContainer",
      "org.eclipse.jetty.io.Buffer$CaseInsensitve",
      "com.jfinal.core.ActionMapping",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.server.nio.NIOConnector",
      "com.jfinal.json.IJsonFactory",
      "org.eclipse.jetty.io.AbstractConnection",
      "com.jfinal.core.Controller",
      "org.eclipse.jetty.http.HttpParser",
      "org.eclipse.jetty.io.nio.AsyncConnection",
      "org.eclipse.jetty.util.thread.ThreadPool",
      "org.eclipse.jetty.http.HttpGenerator$Status",
      "org.eclipse.jetty.http.AbstractGenerator",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.server.AsyncContinuation$AsyncEventState",
      "org.apache.log4j.CategoryKey",
      "org.eclipse.jetty.server.Response",
      "org.eclipse.jetty.server.Handler",
      "org.eclipse.jetty.util.component.Destroyable",
      "org.eclipse.jetty.http.HttpStatus$Code",
      "org.eclipse.jetty.server.SessionIdManager",
      "org.eclipse.jetty.http.Parser",
      "org.eclipse.jetty.util.StringMap$NullEntry",
      "org.apache.log4j.helpers.Loader",
      "org.eclipse.jetty.server.AbstractHttpConnection$1",
      "org.apache.log4j.ProvisionNode",
      "org.eclipse.jetty.util.StringUtil",
      "org.apache.log4j.Hierarchy",
      "org.eclipse.jetty.server.UserIdentity",
      "org.eclipse.jetty.io.ByteArrayBuffer",
      "org.apache.log4j.helpers.FileWatchdog",
      "org.eclipse.jetty.continuation.ContinuationThrowable",
      "org.eclipse.jetty.io.nio.NIOBuffer",
      "org.eclipse.jetty.io.BufferCache",
      "org.eclipse.jetty.server.nio.SelectChannelConnector$ConnectorSelectorManager",
      "org.eclipse.jetty.util.component.LifeCycle$Listener",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.io.ByteArrayBuffer$CaseInsensitive",
      "org.eclipse.jetty.server.UserIdentity$Scope",
      "org.eclipse.jetty.io.BufferCache$CachedBuffer",
      "org.eclipse.jetty.io.ConnectedEndPoint",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.eclipse.jetty.util.DateCache",
      "org.apache.log4j.spi.RootLogger",
      "org.eclipse.jetty.io.AbstractBuffer",
      "org.eclipse.jetty.http.EncodedHttpURI",
      "org.eclipse.jetty.util.MultiMap",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.apache.log4j.spi.RendererSupport",
      "org.eclipse.jetty.http.HttpBuffersImpl",
      "org.eclipse.jetty.server.SessionManager",
      "org.eclipse.jetty.util.LazyList",
      "org.eclipse.jetty.io.Connection",
      "org.eclipse.jetty.io.AsyncEndPoint",
      "com.jfinal.log.ILogFactory",
      "org.eclipse.jetty.io.View$CaseInsensitive",
      "org.apache.log4j.helpers.OptionConverter",
      "org.eclipse.jetty.http.HttpVersions",
      "com.jfinal.render.ViewType",
      "org.eclipse.jetty.server.AbstractConnector",
      "org.eclipse.jetty.util.component.AggregateLifeCycle",
      "org.eclipse.jetty.util.Attributes",
      "org.eclipse.jetty.util.component.LifeCycle",
      "org.eclipse.jetty.io.EndPoint",
      "org.eclipse.jetty.util.Utf8Appendable",
      "org.eclipse.jetty.server.LocalConnector",
      "com.jfinal.aop.Interceptor",
      "org.apache.log4j.or.ObjectRenderer",
      "org.eclipse.jetty.http.HttpFields$DateGenerator",
      "org.eclipse.jetty.io.BufferDateCache",
      "org.eclipse.jetty.http.Generator",
      "org.apache.log4j.Logger",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.io.View",
      "com.jfinal.handler.Handler",
      "org.eclipse.jetty.server.handler.ContextHandler$Context",
      "org.eclipse.jetty.http.HttpFields$1",
      "org.eclipse.jetty.http.HttpStatus",
      "org.eclipse.jetty.io.RuntimeIOException",
      "org.eclipse.jetty.http.HttpFields$2",
      "org.apache.log4j.helpers.LogLog",
      "org.eclipse.jetty.io.Buffer",
      "org.eclipse.jetty.server.AbstractHttpConnection$OutputWriter",
      "org.apache.log4j.Category",
      "org.eclipse.jetty.server.nio.SelectChannelConnector",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.QuotedStringTokenizer",
      "com.jfinal.token.ITokenCache",
      "org.eclipse.jetty.util.StringMap",
      "org.apache.log4j.spi.RepositorySelector",
      "org.eclipse.jetty.server.nio.AbstractNIOConnector",
      "com.jfinal.render.RenderManager",
      "com.jfinal.config.Routes",
      "com.jfinal.render.IRenderFactory",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "org.eclipse.jetty.http.HttpGenerator",
      "org.eclipse.jetty.util.URIUtil",
      "org.apache.log4j.or.DefaultRenderer",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "com.jfinal.captcha.ICaptchaCache",
      "org.eclipse.jetty.continuation.Continuation",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.util.component.Container$Relationship",
      "org.eclipse.jetty.io.Buffers",
      "com.jfinal.core.ActionHandler",
      "org.apache.log4j.PropertyWatchdog",
      "org.eclipse.jetty.server.HttpOutput",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "com.jfinal.log.Log4jLogFactory",
      "org.eclipse.jetty.server.AbstractHttpConnection",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "org.eclipse.jetty.server.HttpWriter",
      "org.eclipse.jetty.server.AbstractHttpConnection$RequestHandler",
      "org.eclipse.jetty.io.nio.IndirectNIOBuffer",
      "org.eclipse.jetty.io.nio.SelectorManager",
      "org.eclipse.jetty.http.HttpURI",
      "org.eclipse.jetty.util.Utf8Appendable$NotUtf8Exception",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.http.HttpFields",
      "com.jfinal.log.Log",
      "org.eclipse.jetty.http.HttpCookie",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.Authentication",
      "org.apache.log4j.Priority",
      "org.eclipse.jetty.server.Request$1",
      "com.jfinal.config.Constants",
      "org.eclipse.jetty.util.log.Log",
      "com.jfinal.core.ControllerFactory",
      "org.eclipse.jetty.http.HttpException",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "com.jfinal.core.Action",
      "org.apache.log4j.spi.LoggerRepository",
      "com.jfinal.render.RenderException",
      "org.apache.log4j.LogManager",
      "org.eclipse.jetty.server.AbstractHttpConnection$Output",
      "org.eclipse.jetty.util.log.Logger",
      "org.eclipse.jetty.io.nio.DirectNIOBuffer",
      "org.eclipse.jetty.server.Connector",
      "com.jfinal.core.Const",
      "com.jfinal.log.Log4jLog",
      "org.eclipse.jetty.server.AsyncContinuation"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.jfinal.config.Routes", false, ActionHandler_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActionHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.handler.Handler",
      "com.jfinal.render.RenderManager",
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
      "com.jfinal.core.ActionHandler",
      "com.jfinal.core.ActionReporter$SystemOutWriter",
      "com.jfinal.core.ActionReporter$1",
      "com.jfinal.core.ActionReporter",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.AggregateLifeCycle",
      "org.eclipse.jetty.server.AbstractConnector",
      "org.eclipse.jetty.server.LocalConnector",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.http.HttpBuffersImpl",
      "org.eclipse.jetty.util.component.AggregateLifeCycle$Bean",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.util.LazyList",
      "org.eclipse.jetty.io.AbstractConnection",
      "org.eclipse.jetty.server.AbstractHttpConnection",
      "org.eclipse.jetty.server.AsyncHttpConnection",
      "org.eclipse.jetty.util.URIUtil",
      "org.eclipse.jetty.http.HttpURI",
      "org.eclipse.jetty.util.Utf8Appendable",
      "org.eclipse.jetty.util.Utf8StringBuilder",
      "org.eclipse.jetty.http.HttpParser$EventHandler",
      "org.eclipse.jetty.server.AbstractHttpConnection$RequestHandler",
      "org.eclipse.jetty.http.HttpParser",
      "org.eclipse.jetty.io.AbstractBuffer",
      "org.eclipse.jetty.io.View",
      "org.eclipse.jetty.io.View$CaseInsensitive",
      "org.eclipse.jetty.util.DateCache",
      "org.eclipse.jetty.io.BufferDateCache",
      "org.eclipse.jetty.http.HttpFields$1",
      "org.eclipse.jetty.http.HttpFields$2",
      "org.eclipse.jetty.http.HttpFields$DateGenerator",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.io.ByteArrayBuffer",
      "org.eclipse.jetty.util.StringMap",
      "org.eclipse.jetty.util.StringMap$Node",
      "org.eclipse.jetty.util.StringMap$NullEntry",
      "org.eclipse.jetty.http.HttpFields",
      "org.eclipse.jetty.server.Request",
      "org.eclipse.jetty.continuation.ContinuationThrowable",
      "org.eclipse.jetty.server.AsyncContinuation",
      "org.eclipse.jetty.server.Response",
      "org.eclipse.jetty.http.AbstractGenerator",
      "org.eclipse.jetty.io.BufferCache",
      "org.eclipse.jetty.io.ByteArrayBuffer$CaseInsensitive",
      "org.eclipse.jetty.io.BufferCache$CachedBuffer",
      "org.eclipse.jetty.http.HttpVersions",
      "org.eclipse.jetty.http.HttpStatus$Code",
      "org.eclipse.jetty.http.HttpStatus",
      "org.eclipse.jetty.http.HttpGenerator$Status",
      "org.eclipse.jetty.http.HttpGenerator",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "org.eclipse.jetty.servlet.ServletContextHandler",
      "org.eclipse.jetty.webapp.WebAppContext",
      "org.eclipse.jetty.server.handler.ContextHandler$Context",
      "org.eclipse.jetty.servlet.ServletContextHandler$Context",
      "org.eclipse.jetty.webapp.MetaData",
      "org.eclipse.jetty.webapp.WebAppContext$Context",
      "org.eclipse.jetty.server.handler.ErrorHandler",
      "org.eclipse.jetty.servlet.ErrorPageErrorHandler",
      "org.eclipse.jetty.http.MimeTypes",
      "org.eclipse.jetty.io.SimpleBuffers",
      "org.eclipse.jetty.server.BlockingHttpConnection",
      "com.jfinal.config.Constants",
      "com.jfinal.core.ControllerFactory",
      "com.jfinal.core.Const",
      "org.eclipse.jetty.server.session.SessionHandler",
      "org.eclipse.jetty.server.session.AbstractSessionManager$1",
      "org.eclipse.jetty.server.session.AbstractSessionManager",
      "org.eclipse.jetty.server.session.HashSessionManager",
      "org.eclipse.jetty.server.session.AbstractSessionManager$2",
      "org.eclipse.jetty.io.AbstractBuffers",
      "org.eclipse.jetty.io.ThreadLocalBuffers",
      "org.eclipse.jetty.io.ThreadLocalBuffers$1",
      "org.eclipse.jetty.server.nio.AbstractNIOConnector",
      "org.eclipse.jetty.server.nio.SelectChannelConnector",
      "org.eclipse.jetty.io.nio.SelectorManager",
      "org.eclipse.jetty.server.nio.SelectChannelConnector$ConnectorSelectorManager",
      "org.eclipse.jetty.util.component.Container$Relationship",
      "com.jfinal.config.Routes",
      "com.jfinal.core.ActionMapping",
      "com.jfinal.aop.InterceptorManager",
      "com.jfinal.i18n.I18n",
      "com.jfinal.kit.StrKit",
      "com.jfinal.template.EngineConfig",
      "com.jfinal.template.io.WriterBuffer",
      "com.jfinal.template.io.EncoderFactory",
      "com.jfinal.template.io.WriterBuffer$1",
      "com.jfinal.template.io.WriterBuffer$2",
      "com.jfinal.template.io.WriterBuffer$3",
      "com.jfinal.template.OutputDirectiveFactory",
      "com.jfinal.template.source.FileSourceFactory",
      "com.jfinal.template.expr.ast.SharedMethodKit",
      "com.jfinal.template.ext.sharedmethod.SharedMethodLib",
      "com.jfinal.template.ext.extensionmethod.StringExt",
      "com.jfinal.template.expr.ast.MethodKit",
      "com.jfinal.template.Engine",
      "org.eclipse.jetty.io.PooledBuffers",
      "com.jfinal.render.RenderFactory",
      "com.jfinal.render.Render",
      "com.jfinal.render.ErrorRender",
      "org.eclipse.jetty.io.nio.IndirectNIOBuffer",
      "org.eclipse.jetty.io.nio.SslConnection",
      "org.eclipse.jetty.util.resource.Resource",
      "org.eclipse.jetty.util.resource.URLResource",
      "org.eclipse.jetty.util.resource.FileResource",
      "org.eclipse.jetty.util.TypeUtil",
      "org.eclipse.jetty.io.nio.SslConnection$SslEndPoint",
      "com.jfinal.ext.interceptor.SessionInViewInterceptor$JFinalSession",
      "org.eclipse.jetty.io.ThreadLocalBuffers$ThreadBuffers",
      "org.eclipse.jetty.io.AbstractBuffers$1",
      "org.eclipse.jetty.io.nio.DirectNIOBuffer",
      "org.eclipse.jetty.http.HttpHeaders",
      "com.jfinal.render.QrCodeRender",
      "com.jfinal.json.JFinalJsonFactory",
      "com.jfinal.json.Json",
      "com.jfinal.json.JFinalJson",
      "com.alibaba.fastjson.util.ASMUtils",
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.util.IOUtils$1",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.util.IdentityHashMap",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory",
      "com.alibaba.fastjson.util.ASMClassLoader$1",
      "com.alibaba.fastjson.util.ASMClassLoader",
      "com.alibaba.fastjson.serializer.BooleanCodec",
      "com.alibaba.fastjson.util.IdentityHashMap$Entry",
      "com.alibaba.fastjson.serializer.CharacterCodec",
      "com.alibaba.fastjson.serializer.IntegerCodec",
      "com.alibaba.fastjson.serializer.LongCodec",
      "com.alibaba.fastjson.serializer.FloatCodec",
      "com.alibaba.fastjson.serializer.DoubleSerializer",
      "com.alibaba.fastjson.serializer.BigDecimalCodec",
      "com.alibaba.fastjson.serializer.BigIntegerCodec",
      "com.alibaba.fastjson.serializer.StringCodec",
      "com.alibaba.fastjson.serializer.PrimitiveArraySerializer",
      "com.alibaba.fastjson.serializer.ObjectArrayCodec",
      "com.alibaba.fastjson.serializer.MiscCodec",
      "com.alibaba.fastjson.serializer.AppendableSerializer",
      "com.alibaba.fastjson.serializer.ToStringSerializer",
      "com.alibaba.fastjson.serializer.AtomicCodec",
      "com.alibaba.fastjson.serializer.ReferenceCodec",
      "com.alibaba.fastjson.serializer.SerializeConfig",
      "com.jfinal.json.FastJsonRecordSerializer",
      "com.jfinal.json.FastJson",
      "com.jfinal.json.MixedJsonFactory$MixedJson",
      "com.jfinal.json.MixedJsonFactory",
      "com.jfinal.json.JsonManager",
      "com.jfinal.captcha.CaptchaCache",
      "com.jfinal.captcha.CaptchaCache$1",
      "com.jfinal.captcha.CaptchaManager",
      "com.jfinal.json.JacksonFactory",
      "org.eclipse.jetty.util.MultiMap",
      "com.jfinal.core.JFinal",
      "com.jfinal.render.RedirectRender",
      "com.jfinal.render.Redirect301Render",
      "org.eclipse.jetty.server.HttpOutput",
      "org.eclipse.jetty.server.AbstractHttpConnection$Output",
      "org.eclipse.jetty.server.HttpWriter",
      "org.eclipse.jetty.server.AbstractHttpConnection$OutputWriter",
      "org.eclipse.jetty.server.AbstractHttpConnection$1",
      "org.eclipse.jetty.util.ByteArrayOutputStream2",
      "org.eclipse.jetty.server.Authentication$1",
      "org.eclipse.jetty.server.Authentication$2",
      "org.eclipse.jetty.server.Authentication$3",
      "org.eclipse.jetty.server.Authentication$4",
      "org.eclipse.jetty.server.Authentication$5",
      "org.eclipse.jetty.server.Authentication",
      "org.eclipse.jetty.server.session.AbstractSession",
      "org.eclipse.jetty.server.session.HashedSession",
      "com.jfinal.core.ForwardActionRender",
      "org.eclipse.jetty.http.HttpHeaderValues",
      "org.eclipse.jetty.http.HttpFields$Field",
      "org.eclipse.jetty.io.BufferUtil",
      "org.eclipse.jetty.server.LocalConnector$Request",
      "org.eclipse.jetty.util.thread.QueuedThreadPool",
      "org.eclipse.jetty.util.thread.QueuedThreadPool$3",
      "org.eclipse.jetty.server.session.JDBCSessionManager",
      "org.eclipse.jetty.security.SecurityHandler$2",
      "org.eclipse.jetty.security.SecurityHandler$3",
      "org.eclipse.jetty.security.SecurityHandler",
      "org.eclipse.jetty.servlet.ServletHandler",
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
      "com.mchange.v2.c3p0.JndiRefConnectionPoolDataSource",
      "com.mchange.v2.c3p0.impl.JndiRefDataSourceBase",
      "com.mchange.v2.c3p0.JndiRefForwardingDataSource",
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
      "com.mchange.v2.c3p0.JndiRefForwardingDataSource$1",
      "com.mchange.v2.c3p0.JndiRefForwardingDataSource$2",
      "com.mchange.v2.c3p0.impl.WrapperConnectionPoolDataSourceBase",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
      "com.mchange.v1.lang.BooleanUtils",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource$1",
      "com.alibaba.druid.proxy.DruidDriver$1",
      "com.alibaba.druid.proxy.DruidDriver",
      "com.alibaba.druid.mock.handler.MySqlMockExecuteHandlerImpl",
      "com.alibaba.druid.mock.MockDriver",
      "org.hsqldb.jdbc.JDBCDriver",
      "org.eclipse.jetty.util.QuotedStringTokenizer",
      "org.eclipse.jetty.server.HttpInput",
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
      "com.alibaba.druid.util.jdbc.ConnectionBase",
      "com.alibaba.druid.mock.MockConnection",
      "com.zaxxer.hikari.util.DriverDataSource",
      "com.mchange.v2.beans.BeansUtils",
      "org.springframework.util.CustomizableThreadCreator",
      "org.springframework.scheduling.concurrent.CustomizableThreadFactory",
      "org.eclipse.jetty.util.thread.ExecutorThreadPool",
      "com.jfinal.log.JdkLogFactory",
      "com.jfinal.log.LogManager",
      "com.jfinal.kit.LogKit",
      "com.jfinal.log.JdkLog",
      "com.jfinal.kit.LogKit$Holder",
      "com.jfinal.template.source.ClassPathSource",
      "com.alibaba.druid.mock.MockSQLXML",
      "com.alibaba.druid.mock.MockClob",
      "com.alibaba.druid.mock.MockNClob",
      "org.eclipse.jetty.util.resource.ResourceCollection",
      "com.jfinal.json.FastJsonFactory",
      "com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase",
      "com.mchange.v2.c3p0.DriverManagerDataSource",
      "com.mchange.v2.c3p0.impl.AuthMaskingProperties",
      "com.mchange.v2.c3p0.DriverManagerDataSource$1",
      "org.eclipse.jetty.servlet.Holder$Source",
      "org.eclipse.jetty.servlet.Holder",
      "org.eclipse.jetty.servlet.ServletHolder",
      "org.eclipse.jetty.servlet.ServletMapping",
      "org.eclipse.jetty.http.PathMap",
      "org.eclipse.jetty.util.UrlEncoded",
      "com.jfinal.render.JsonRender$1",
      "com.jfinal.render.JsonRender",
      "com.jfinal.kit.JsonKit",
      "org.eclipse.jetty.security.ConstraintSecurityHandler",
      "org.eclipse.jetty.security.DefaultAuthenticatorFactory",
      "org.eclipse.jetty.server.session.AbstractSessionIdManager",
      "org.eclipse.jetty.server.session.HashSessionIdManager",
      "org.apache.struts.mock.MockHttpSession",
      "org.eclipse.jetty.servlet.FilterHolder",
      "org.eclipse.jetty.servlet.FilterMapping",
      "org.eclipse.jetty.util.MultiException",
      "org.eclipse.jetty.util.BlockingArrayQueue",
      "com.jfinal.render.ViewType",
      "org.eclipse.jetty.io.Buffers$Type"
    );
  }
}
