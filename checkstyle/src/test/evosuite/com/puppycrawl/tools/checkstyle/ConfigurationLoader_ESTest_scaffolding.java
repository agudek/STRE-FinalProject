/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 14:04:40 GMT 2018
 */

package com.puppycrawl.tools.checkstyle;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ConfigurationLoader_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.ConfigurationLoader"; 
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
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\GUDEK-~1\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Gudek-Home\\Documents\\TU\\STRE\\STRE-FinalProject\\checkstyle"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Gudek-Home"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Gudek-Home"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ConfigurationLoader_ESTest_scaffolding.class.getClassLoader() ,
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.ConfigurationLoader$InternalLoader",
      "com.puppycrawl.tools.checkstyle.PropertiesExpander",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "com.puppycrawl.tools.checkstyle.PropertyResolver",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "com.puppycrawl.tools.checkstyle.api.ExternalResourceHolder",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.XmlLoader",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.FileSetCheck",
      "com.puppycrawl.tools.checkstyle.Checker",
      "com.puppycrawl.tools.checkstyle.api.MessageDispatcher",
      "com.puppycrawl.tools.checkstyle.TreeWalker",
      "com.puppycrawl.tools.checkstyle.XmlLoader$FeaturesForVerySecureJavaInstallations",
      "com.puppycrawl.tools.checkstyle.ConfigurationLoader",
      "com.puppycrawl.tools.checkstyle.api.RootModule",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.ConfigurationLoader$IgnoredModulesOptions"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ConfigurationLoader_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.ConfigurationLoader",
      "com.puppycrawl.tools.checkstyle.XmlLoader",
      "com.puppycrawl.tools.checkstyle.ConfigurationLoader$InternalLoader",
      "com.puppycrawl.tools.checkstyle.ConfigurationLoader$IgnoredModulesOptions",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.PropertiesExpander",
      "com.puppycrawl.tools.checkstyle.XmlLoader$FeaturesForVerySecureJavaInstallations",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition"
    );
  }
}