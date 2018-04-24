/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 15:09:31 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ElseIf_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.template.stat.ast.ElseIf"; 
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
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ElseIf_ESTest_scaffolding.class.getClassLoader() ,
      "com.jfinal.template.stat.ast.NullStat",
      "com.jfinal.template.io.Writer",
      "com.jfinal.template.io.CharWriter",
      "com.jfinal.template.Env",
      "com.jfinal.template.expr.ast.Array",
      "com.jfinal.template.expr.ast.ForCtrl",
      "com.jfinal.template.expr.ast.Logic",
      "com.jfinal.template.stat.ast.ElseIf",
      "com.jfinal.template.EngineConfig",
      "com.jfinal.template.stat.ast.Define",
      "com.jfinal.template.TemplateException",
      "com.jfinal.template.stat.Ctrl",
      "com.jfinal.template.io.DateFormats",
      "com.jfinal.template.io.IWritable",
      "com.jfinal.template.stat.ast.StatList",
      "com.jfinal.template.expr.ast.Expr",
      "com.jfinal.template.expr.ast.ExprList",
      "com.jfinal.template.stat.ast.Stat",
      "com.jfinal.template.stat.ParseException",
      "com.jfinal.template.expr.ast.NullExpr",
      "com.jfinal.template.stat.Location",
      "com.jfinal.template.stat.Scope",
      "com.jfinal.template.expr.ast.Id",
      "com.jfinal.template.source.ISource"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ElseIf_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.template.stat.ast.Stat",
      "com.jfinal.template.stat.ast.ElseIf",
      "com.jfinal.template.expr.ast.Expr",
      "com.jfinal.template.expr.ast.Logic",
      "com.jfinal.template.expr.ast.NullExpr",
      "com.jfinal.template.expr.ast.ExprList",
      "com.jfinal.template.stat.ast.NullStat",
      "com.jfinal.template.stat.ast.StatList",
      "com.jfinal.template.stat.Location",
      "com.jfinal.template.stat.ParseException",
      "com.jfinal.template.stat.Scope",
      "com.jfinal.template.stat.Ctrl",
      "com.jfinal.template.stat.ast.SetLocal",
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
      "com.jfinal.template.TemplateException",
      "com.jfinal.template.io.Writer",
      "com.jfinal.template.io.CharWriter",
      "com.jfinal.template.io.DateFormats",
      "com.jfinal.template.io.Encoder",
      "com.jfinal.template.io.Utf8Encoder",
      "com.jfinal.template.io.ByteWriter",
      "com.jfinal.template.expr.ast.StaticMethod",
      "com.jfinal.template.expr.ast.RangeArray",
      "com.jfinal.template.expr.ast.Array",
      "com.jfinal.template.source.ClassPathSource",
      "com.jfinal.template.Env",
      "com.jfinal.template.expr.ast.ForCtrl",
      "com.jfinal.template.expr.ast.Const",
      "com.jfinal.template.stat.ast.Else",
      "com.jfinal.template.stat.ast.Define",
      "com.jfinal.template.expr.ast.Method",
      "com.jfinal.template.stat.ast.Set",
      "com.jfinal.template.stat.ast.Return",
      "com.jfinal.template.stat.ast.Continue",
      "com.jfinal.template.stat.ast.If",
      "com.jfinal.template.expr.ast.Ternary",
      "com.jfinal.template.expr.ast.NullSafe",
      "com.jfinal.template.expr.ast.SharedMethod",
      "com.jfinal.template.expr.ast.StaticField",
      "com.jfinal.template.stat.ast.Output",
      "com.jfinal.template.stat.ast.Text",
      "com.jfinal.template.expr.ast.Id",
      "com.jfinal.template.stat.ast.Break",
      "com.jfinal.template.expr.ast.Assign",
      "com.jfinal.template.stat.ast.Call",
      "com.jfinal.template.io.FloatingWriter",
      "com.jfinal.template.io.FloatingDecimal$1",
      "com.jfinal.template.io.FloatingDecimal",
      "com.jfinal.template.expr.ast.Index",
      "com.jfinal.template.expr.ast.Arith",
      "com.jfinal.template.source.StringSource",
      "com.jfinal.kit.HashKit",
      "com.jfinal.template.source.FileSource",
      "com.jfinal.template.io.JdkEncoder",
      "com.jfinal.template.expr.ast.Array$ArrayListExt",
      "com.jfinal.template.expr.ast.Logic$1",
      "com.jfinal.template.io.LongWriter",
      "com.jfinal.template.io.IntegerWriter",
      "com.jfinal.template.stat.ast.For",
      "com.jfinal.template.stat.ast.SetGlobal",
      "com.jfinal.template.expr.ast.Unary",
      "com.jfinal.template.stat.ast.Include",
      "com.jfinal.template.expr.ast.Compare",
      "com.jfinal.template.expr.ast.IncDec",
      "com.jfinal.template.Directive",
      "com.jfinal.template.expr.ast.Field",
      "com.jfinal.template.expr.ast.Map"
    );
  }
}
