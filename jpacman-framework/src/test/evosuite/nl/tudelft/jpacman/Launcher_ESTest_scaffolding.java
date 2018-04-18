/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 12 11:18:40 GMT 2018
 */

package nl.tudelft.jpacman;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Launcher_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "nl.tudelft.jpacman.Launcher"; 
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
    java.lang.System.setProperty("user.dir", "/home/agudek/Documents/STRE/final_project/jpacman-framework"); 
    java.lang.System.setProperty("user.home", "/home/agudek"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "agudek"); 
    java.lang.System.setProperty("user.timezone", "Europe/Amsterdam"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Launcher_ESTest_scaffolding.class.getClassLoader() ,
      "nl.tudelft.jpacman.game.GameFactory",
      "nl.tudelft.jpacman.npc.ghost.Clyde",
      "nl.tudelft.jpacman.ui.PacManUI",
      "nl.tudelft.jpacman.ui.ButtonPanel",
      "nl.tudelft.jpacman.level.PlayerFactory",
      "nl.tudelft.jpacman.board.Direction",
      "nl.tudelft.jpacman.sprite.ImageSprite",
      "nl.tudelft.jpacman.Launcher",
      "nl.tudelft.jpacman.board.BoardFactory$Ground",
      "nl.tudelft.jpacman.level.MapParser",
      "nl.tudelft.jpacman.ui.ScorePanel",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "nl.tudelft.jpacman.board.Square",
      "nl.tudelft.jpacman.level.Level$LevelObserver",
      "nl.tudelft.jpacman.npc.ghost.GhostColor",
      "nl.tudelft.jpacman.game.Game",
      "nl.tudelft.jpacman.board.Board",
      "nl.tudelft.jpacman.npc.ghost.Blinky",
      "nl.tudelft.jpacman.npc.ghost.Ghost",
      "nl.tudelft.jpacman.level.LevelFactory$RandomGhost",
      "nl.tudelft.jpacman.npc.ghost.Inky",
      "nl.tudelft.jpacman.level.Level",
      "nl.tudelft.jpacman.board.BoardFactory",
      "nl.tudelft.jpacman.ui.PacManUiBuilder",
      "nl.tudelft.jpacman.level.Player",
      "nl.tudelft.jpacman.npc.NPC",
      "nl.tudelft.jpacman.board.Unit",
      "nl.tudelft.jpacman.ui.Action",
      "nl.tudelft.jpacman.ui.BoardPanel",
      "nl.tudelft.jpacman.sprite.AnimatedSprite",
      "nl.tudelft.jpacman.npc.ghost.Pinky",
      "nl.tudelft.jpacman.sprite.EmptySprite",
      "nl.tudelft.jpacman.board.BoardFactory$Wall",
      "nl.tudelft.jpacman.level.Pellet",
      "nl.tudelft.jpacman.npc.ghost.GhostFactory",
      "nl.tudelft.jpacman.PacmanConfigurationException",
      "nl.tudelft.jpacman.game.SinglePlayerGame",
      "org.checkerframework.framework.qual.TypeKind",
      "nl.tudelft.jpacman.level.LevelFactory",
      "nl.tudelft.jpacman.ui.ScorePanel$ScoreFormatter",
      "org.checkerframework.framework.qual.LiteralKind",
      "nl.tudelft.jpacman.sprite.PacManSprites",
      "nl.tudelft.jpacman.level.CollisionMap",
      "nl.tudelft.jpacman.sprite.Sprite",
      "nl.tudelft.jpacman.sprite.SpriteStore"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Launcher_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "nl.tudelft.jpacman.sprite.SpriteStore",
      "nl.tudelft.jpacman.board.Direction",
      "nl.tudelft.jpacman.sprite.PacManSprites",
      "nl.tudelft.jpacman.Launcher",
      "nl.tudelft.jpacman.game.GameFactory",
      "nl.tudelft.jpacman.level.PlayerFactory",
      "nl.tudelft.jpacman.level.MapParser",
      "nl.tudelft.jpacman.level.LevelFactory",
      "nl.tudelft.jpacman.npc.ghost.GhostFactory",
      "nl.tudelft.jpacman.board.BoardFactory",
      "nl.tudelft.jpacman.PacmanConfigurationException",
      "nl.tudelft.jpacman.ui.PacManUiBuilder",
      "org.checkerframework.framework.qual.LiteralKind",
      "org.checkerframework.framework.qual.TypeKind",
      "org.checkerframework.framework.qual.TypeUseLocation",
      "nl.tudelft.jpacman.board.Square",
      "nl.tudelft.jpacman.board.BoardFactory$Wall",
      "nl.tudelft.jpacman.sprite.ImageSprite",
      "nl.tudelft.jpacman.board.BoardFactory$Ground",
      "nl.tudelft.jpacman.board.Unit",
      "nl.tudelft.jpacman.level.Pellet",
      "nl.tudelft.jpacman.npc.NPC",
      "nl.tudelft.jpacman.npc.ghost.Ghost",
      "nl.tudelft.jpacman.npc.ghost.Blinky",
      "nl.tudelft.jpacman.npc.ghost.GhostColor",
      "nl.tudelft.jpacman.ui.PacManUI"
    );
  }
}