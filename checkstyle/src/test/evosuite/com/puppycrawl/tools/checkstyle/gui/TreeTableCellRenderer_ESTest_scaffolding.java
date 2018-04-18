/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 15:18:24 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.gui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class TreeTableCellRenderer_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.gui.TreeTableCellRenderer"; 
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
    java.lang.System.setProperty("file.encoding", "Cp1252"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\GUDEK-~1\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\Gudek-Home\\Documents\\TU\\STRE\\STRE-FinalProject\\checkstyle"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Gudek-Home"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Gudek-Home"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("user.variant", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TreeTableCellRenderer_ESTest_scaffolding.class.getClassLoader() ,
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableCellRenderer",
      "antlr.Token",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableModelAdapter$UpdatingTreeExpansionListener",
      "com.google.common.collect.ImmutableCollection",
      "antlr.ASTFactory",
      "com.puppycrawl.tools.checkstyle.gui.ListToTreeSelectionModelWrapper",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.google.common.collect.ImmutableList",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable",
      "antlr.CommonAST",
      "com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation",
      "antlr.collections.impl.Vector",
      "com.puppycrawl.tools.checkstyle.gui.MainFrameModel$ParseMode",
      "antlr.CommonHiddenStreamToken",
      "com.puppycrawl.tools.checkstyle.api.DetailNode",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableModelAdapter",
      "com.puppycrawl.tools.checkstyle.gui.BaseCellEditor",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable$2",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable$1",
      "antlr.Utils",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "antlr.CommonToken",
      "com.puppycrawl.tools.checkstyle.gui.ParseTreeTableModel",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableModelAdapter$UpdatingTreeModelListener",
      "antlr.CommonASTWithHiddenTokens",
      "antlr.collections.ASTEnumeration",
      "antlr.BaseAST",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable$TreeTableCellEditor",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("javax.swing.tree.TreeNode", false, TreeTableCellRenderer_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TreeTableCellRenderer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.gui.TreeTableCellRenderer",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.gui.ParseTreeTableModel",
      "com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation",
      "antlr.ASTFactory",
      "antlr.Utils",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableModelAdapter",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableModelAdapter$UpdatingTreeExpansionListener",
      "com.puppycrawl.tools.checkstyle.gui.TreeTableModelAdapter$UpdatingTreeModelListener",
      "com.puppycrawl.tools.checkstyle.gui.ListToTreeSelectionModelWrapper",
      "com.puppycrawl.tools.checkstyle.gui.BaseCellEditor",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable$TreeTableCellEditor",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable$1",
      "com.puppycrawl.tools.checkstyle.gui.TreeTable$2",
      "antlr.Token",
      "antlr.ParseTree",
      "antlr.ParseTreeRule",
      "com.google.common.collect.BoundType",
      "antlr.collections.impl.Vector",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.primitives.Booleans",
      "antlr.ASTNULLType",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.DiscreteDomain",
      "antlr.collections.impl.ASTEnumerator",
      "antlr.collections.impl.VectorEnumerator",
      "antlr.StringUtils",
      "antlr.ParseTreeToken",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.puppycrawl.tools.checkstyle.gui.MainFrameModel$ParseMode"
    );
  }
}
