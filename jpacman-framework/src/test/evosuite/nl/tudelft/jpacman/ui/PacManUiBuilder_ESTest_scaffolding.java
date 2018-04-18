/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 12 10:49:50 GMT 2018
 */

package nl.tudelft.jpacman.ui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class PacManUiBuilder_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "nl.tudelft.jpacman.ui.PacManUiBuilder"; 
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
    java.lang.System.setProperty("user.dir", "/home/agudek/Documents/STRE/final_project/jpacman-framework"); 
    java.lang.System.setProperty("user.home", "/home/agudek"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "agudek"); 
    java.lang.System.setProperty("user.timezone", "Europe/Amsterdam"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(PacManUiBuilder_ESTest_scaffolding.class.getClassLoader() ,
      "org.checkerframework.checker.nullness.qual.NonNull",
      "nl.tudelft.jpacman.ui.PacManUI",
      "nl.tudelft.jpacman.ui.ButtonPanel",
      "org.checkerframework.framework.qual.InvisibleQualifier",
      "nl.tudelft.jpacman.board.Direction",
      "org.checkerframework.checker.initialization.qual.UnknownInitialization",
      "nl.tudelft.jpacman.ui.ScorePanel",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "org.checkerframework.checker.initialization.qual.Initialized",
      "nl.tudelft.jpacman.board.Square",
      "org.checkerframework.checker.nullness.qual.UnknownKeyFor",
      "org.checkerframework.checker.nullness.qual.MonotonicNonNull",
      "nl.tudelft.jpacman.level.Level$LevelObserver",
      "org.checkerframework.framework.qual.DefaultInUncheckedCodeFor",
      "nl.tudelft.jpacman.game.Game",
      "nl.tudelft.jpacman.board.Board",
      "org.checkerframework.framework.qual.MonotonicQualifier",
      "org.checkerframework.framework.qual.ImplicitFor",
      "nl.tudelft.jpacman.level.Level",
      "nl.tudelft.jpacman.ui.PacManUiBuilder",
      "nl.tudelft.jpacman.level.Player",
      "org.checkerframework.checker.nullness.qual.Nullable",
      "nl.tudelft.jpacman.board.Unit",
      "org.checkerframework.framework.qual.DefaultFor",
      "nl.tudelft.jpacman.ui.Action",
      "nl.tudelft.jpacman.ui.BoardPanel",
      "org.checkerframework.framework.qual.SubtypeOf",
      "org.checkerframework.framework.qual.DefaultQualifierInHierarchy",
      "org.checkerframework.framework.qual.TypeKind",
      "nl.tudelft.jpacman.ui.ScorePanel$ScoreFormatter",
      "org.checkerframework.framework.qual.LiteralKind",
      "nl.tudelft.jpacman.sprite.Sprite"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("nl.tudelft.jpacman.game.Game", false, PacManUiBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("nl.tudelft.jpacman.ui.Action", false, PacManUiBuilder_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("nl.tudelft.jpacman.ui.ScorePanel$ScoreFormatter", false, PacManUiBuilder_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(PacManUiBuilder_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "nl.tudelft.jpacman.ui.PacManUiBuilder",
      "org.checkerframework.framework.qual.LiteralKind",
      "org.checkerframework.framework.qual.TypeKind",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "nl.tudelft.jpacman.game.Game",
      "nl.tudelft.jpacman.ui.PacManUI"
    );
  }
}