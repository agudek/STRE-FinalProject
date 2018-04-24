/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 14:44:28 GMT 2018
 */

package com.jfinal.core.converter;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TypeConverter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.core.converter.TypeConverter"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TypeConverter_ESTest_scaffolding.class.getClassLoader() ,
      "com.jfinal.render.ViewType",
      "com.jfinal.template.io.EncoderFactory",
      "com.jfinal.template.ext.sharedmethod.SharedMethodLib",
      "com.jfinal.core.Config$1",
      "com.jfinal.template.ext.directive.RenderDirective",
      "com.jfinal.template.io.WriterBuffer",
      "com.jfinal.template.io.JdkEncoder",
      "com.jfinal.handler.Handler",
      "com.jfinal.template.stat.ast.StatList",
      "com.jfinal.template.OutputDirectiveFactory",
      "com.jfinal.core.converter.Converters$IntegerConverter",
      "com.jfinal.template.ext.directive.NumberDirective",
      "com.jfinal.core.converter.Converters$DateConverter",
      "com.jfinal.template.source.ISource",
      "com.jfinal.core.converter.IConverter",
      "com.jfinal.core.converter.Converters$BigIntegerConverter",
      "com.jfinal.core.JFinal",
      "com.jfinal.core.converter.Converters$LongConverter",
      "com.jfinal.template.ext.directive.RandomDirective",
      "com.jfinal.template.ext.directive.StringDirective",
      "com.jfinal.core.converter.Converters$FloatConverter",
      "com.jfinal.template.io.WriterBuffer$2",
      "com.jfinal.template.io.WriterBuffer$3",
      "com.jfinal.template.io.WriterBuffer$1",
      "com.jfinal.config.Routes",
      "com.jfinal.template.ext.extensionmethod.StringExt",
      "com.jfinal.template.source.FileSourceFactory",
      "com.jfinal.template.expr.ast.SharedMethodKit",
      "com.jfinal.kit.StrKit",
      "com.jfinal.template.Directive",
      "com.jfinal.template.source.ISourceFactory",
      "com.jfinal.core.converter.Converters$BigDecimalConverter",
      "com.jfinal.template.io.Encoder",
      "com.jfinal.template.IOutputDirectiveFactory",
      "com.jfinal.core.ActionHandler",
      "com.jfinal.core.converter.TypeConverter",
      "com.jfinal.core.converter.Converters$TimestampConverter",
      "com.jfinal.template.EngineConfig",
      "com.jfinal.template.expr.ast.MethodKit",
      "com.jfinal.template.Engine",
      "com.jfinal.template.io.Utf8Encoder",
      "com.jfinal.core.converter.Converters$ByteConverter",
      "com.jfinal.core.converter.Converters$TimeConverter",
      "com.jfinal.template.stat.ast.Stat",
      "com.jfinal.core.converter.Converters$ByteArrayConverter",
      "com.jfinal.core.converter.Converters$DoubleConverter",
      "com.jfinal.core.Config",
      "com.jfinal.core.converter.Converters$SqlDateConverter",
      "com.jfinal.template.ext.directive.DateDirective",
      "com.jfinal.core.converter.Converters$ShortConverter",
      "com.jfinal.core.converter.Converters",
      "com.jfinal.server.IServer",
      "com.jfinal.core.converter.Converters$BooleanConverter",
      "com.jfinal.config.Constants",
      "com.jfinal.core.ControllerFactory",
      "com.jfinal.core.Const",
      "com.jfinal.template.ext.directive.EscapeDirective"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.jfinal.core.converter.IConverter", false, TypeConverter_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TypeConverter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.core.converter.Converters$IntegerConverter",
      "com.jfinal.core.converter.Converters$LongConverter",
      "com.jfinal.core.converter.Converters$DoubleConverter",
      "com.jfinal.core.converter.Converters$FloatConverter",
      "com.jfinal.core.converter.Converters$BooleanConverter",
      "com.jfinal.core.converter.Converters$DateConverter",
      "com.jfinal.core.converter.Converters$SqlDateConverter",
      "com.jfinal.core.converter.Converters$TimeConverter",
      "com.jfinal.core.converter.Converters$TimestampConverter",
      "com.jfinal.core.converter.Converters$BigDecimalConverter",
      "com.jfinal.core.converter.Converters$BigIntegerConverter",
      "com.jfinal.core.converter.Converters$ByteArrayConverter",
      "com.jfinal.core.converter.Converters$ShortConverter",
      "com.jfinal.core.converter.Converters$ByteConverter",
      "com.jfinal.core.converter.TypeConverter",
      "com.jfinal.core.JFinal",
      "com.jfinal.config.Constants",
      "com.jfinal.render.ViewType",
      "com.jfinal.core.ControllerFactory",
      "com.jfinal.core.Const",
      "com.jfinal.config.Routes",
      "com.jfinal.core.Config$1",
      "com.jfinal.template.EngineConfig",
      "com.jfinal.template.io.WriterBuffer",
      "com.jfinal.template.io.EncoderFactory",
      "com.jfinal.template.io.WriterBuffer$1",
      "com.jfinal.template.io.WriterBuffer$2",
      "com.jfinal.template.io.WriterBuffer$3",
      "com.jfinal.template.OutputDirectiveFactory",
      "com.jfinal.template.source.FileSourceFactory",
      "com.jfinal.template.expr.ast.SharedMethodKit",
      "com.jfinal.kit.StrKit",
      "com.jfinal.template.ext.sharedmethod.SharedMethodLib",
      "com.jfinal.template.ext.extensionmethod.StringExt",
      "com.jfinal.template.expr.ast.MethodKit",
      "com.jfinal.template.Engine",
      "com.jfinal.core.Config",
      "com.jfinal.core.converter.Converters"
    );
  }
}
