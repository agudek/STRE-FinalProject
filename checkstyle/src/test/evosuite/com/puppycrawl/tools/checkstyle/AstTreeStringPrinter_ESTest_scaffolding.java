/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 14:33:24 GMT 2018
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
public class AstTreeStringPrinter_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.AstTreeStringPrinter"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AstTreeStringPrinter_ESTest_scaffolding.class.getClassLoader() ,
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "antlr.ByteBuffer",
      "com.puppycrawl.tools.checkstyle.grammars.CommentListener",
      "com.puppycrawl.tools.checkstyle.JavaParser$Options",
      "antlr.CharBuffer",
      "antlr.RecognitionException",
      "antlr.LexerSharedInputState",
      "antlr.NoViableAltForCharException",
      "antlr.TokenStreamException",
      "antlr.CharQueue",
      "antlr.CharStreamIOException",
      "antlr.ANTLRStringBuffer",
      "antlr.Utils",
      "antlr.CommonToken",
      "antlr.ANTLRHashString",
      "antlr.InputBuffer",
      "antlr.CharScanner",
      "antlr.TokenQueue",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "antlr.TokenStream",
      "antlr.collections.impl.BitSet",
      "antlr.ANTLRException",
      "com.puppycrawl.tools.checkstyle.grammars.GeneratedJavaRecognizer",
      "antlr.Token",
      "com.puppycrawl.tools.checkstyle.AstTreeStringPrinter",
      "antlr.SemanticException",
      "antlr.ASTFactory",
      "antlr.TokenStreamRecognitionException",
      "antlr.Parser",
      "antlr.LLkParser",
      "com.puppycrawl.tools.checkstyle.grammars.GeneratedJavaTokenTypes",
      "antlr.MismatchedCharException",
      "antlr.ASdebug.IASDebugStream",
      "antlr.CommonAST",
      "antlr.TokenStreamIOException",
      "antlr.MismatchedTokenException",
      "com.puppycrawl.tools.checkstyle.grammars.GeneratedJavaLexer",
      "com.puppycrawl.tools.checkstyle.JavaParser",
      "antlr.CommonHiddenStreamToken",
      "antlr.CharStreamException",
      "antlr.TokenStreamBasicFilter",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "antlr.NoViableAltException",
      "antlr.ParserSharedInputState",
      "antlr.TokenBuffer",
      "antlr.ASTPair",
      "antlr.BaseAST",
      "antlr.TokenStreamHiddenTokenFilter",
      "com.puppycrawl.tools.checkstyle.api.LineColumn"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AstTreeStringPrinter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.AstTreeStringPrinter",
      "com.puppycrawl.tools.checkstyle.JavaParser$Options",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.puppycrawl.tools.checkstyle.api.JavadocTokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.JavadocUtils",
      "com.puppycrawl.tools.checkstyle.DetailNodeTreeStringPrinter",
      "com.puppycrawl.tools.checkstyle.JavaParser",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "antlr.CharScanner",
      "antlr.collections.impl.BitSet",
      "com.puppycrawl.tools.checkstyle.grammars.GeneratedJavaLexer",
      "antlr.InputBuffer",
      "antlr.CharBuffer",
      "antlr.CharQueue",
      "antlr.LexerSharedInputState",
      "antlr.ANTLRStringBuffer",
      "antlr.ANTLRHashString",
      "antlr.Utils",
      "antlr.TokenStreamBasicFilter",
      "antlr.TokenStreamHiddenTokenFilter",
      "antlr.Parser",
      "antlr.LLkParser",
      "com.puppycrawl.tools.checkstyle.grammars.GeneratedJavaRecognizer",
      "antlr.ParserSharedInputState",
      "antlr.TokenBuffer",
      "antlr.TokenQueue",
      "antlr.ASTFactory",
      "antlr.ASTPair",
      "antlr.Token",
      "antlr.CommonToken",
      "antlr.CommonHiddenStreamToken",
      "antlr.ANTLRException",
      "antlr.RecognitionException",
      "antlr.NoViableAltException",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "antlr.NoViableAltForCharException",
      "antlr.TokenStreamException",
      "antlr.TokenStreamRecognitionException",
      "antlr.MismatchedCharException",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "antlr.SemanticException",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.collect.DiscreteDomain",
      "antlr.collections.impl.ASTArray",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "antlr.MismatchedTokenException",
      "antlr.DefaultFileLineFormatter",
      "antlr.FileLineFormatter"
    );
  }
}
