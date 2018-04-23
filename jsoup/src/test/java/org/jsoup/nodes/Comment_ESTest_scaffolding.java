/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Apr 23 09:05:57 GMT 2018
 */

package org.jsoup.nodes;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Comment_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jsoup.nodes.Comment"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\Maiko\\AppData\\Local\\Temp\\"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "D:\\GitHub\\jsoup"); 
    java.lang.System.setProperty("user.home", "C:\\Users\\Maiko"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "Maiko"); 
    java.lang.System.setProperty("user.timezone", "Europe/Berlin"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Comment_ESTest_scaffolding.class.getClassLoader() ,
      "org.jsoup.select.NodeVisitor",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.select.Evaluator$AttributeWithValueStarting",
      "org.jsoup.nodes.Comment",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.nodes.Entities$CoreCharset",
      "org.jsoup.select.Evaluator$Matches",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.select.Evaluator$AttributeWithValueEnding",
      "org.jsoup.nodes.Element",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.UncheckedIOException",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.select.NodeFilter",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.Tag",
      "org.jsoup.nodes.Node",
      "org.jsoup.select.Evaluator$Attribute",
      "org.jsoup.nodes.Document",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.select.Evaluator$ContainsOwnText",
      "org.jsoup.nodes.Entities",
      "org.jsoup.select.Evaluator$AttributeWithValueContaining",
      "org.jsoup.select.Evaluator$AllElements",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.select.Evaluator$IndexLessThan",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.select.Evaluator$AttributeWithValueNot",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.SerializationException",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.select.Evaluator$ContainsText",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.helper.Validate",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.nodes.Document$OutputSettings$Syntax"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Comment_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jsoup.nodes.Node",
      "org.jsoup.nodes.LeafNode",
      "org.jsoup.nodes.Comment",
      "org.jsoup.nodes.Node$OuterHtmlVisitor",
      "org.jsoup.nodes.Element",
      "org.jsoup.nodes.Document",
      "org.jsoup.parser.ParseSettings",
      "org.jsoup.parser.Tag",
      "org.jsoup.internal.Normalizer",
      "org.jsoup.select.NodeTraversor",
      "org.jsoup.helper.StringUtil$1",
      "org.jsoup.helper.StringUtil",
      "org.jsoup.nodes.Attributes",
      "org.jsoup.nodes.Attributes$1",
      "org.jsoup.nodes.Attribute",
      "org.jsoup.nodes.TextNode",
      "org.jsoup.nodes.CDataNode",
      "org.jsoup.nodes.Node$1",
      "org.jsoup.nodes.XmlDeclaration",
      "org.jsoup.helper.ChangeNotifyingArrayList",
      "org.jsoup.nodes.Element$NodeList",
      "org.jsoup.nodes.FormElement",
      "org.jsoup.select.Elements",
      "org.jsoup.select.Evaluator",
      "org.jsoup.select.Evaluator$Tag",
      "org.jsoup.select.Collector",
      "org.jsoup.select.Collector$Accumulator",
      "org.jsoup.select.NodeFilter$FilterResult",
      "org.jsoup.select.Evaluator$MatchesOwn",
      "org.jsoup.nodes.DataNode",
      "org.jsoup.nodes.DocumentType",
      "org.jsoup.select.Evaluator$IndexEvaluator",
      "org.jsoup.select.Evaluator$IndexEquals",
      "org.jsoup.select.Evaluator$AttributeStarting",
      "org.jsoup.nodes.Element$2",
      "org.jsoup.select.Evaluator$AttributeKeyPair",
      "org.jsoup.select.Evaluator$AttributeWithValue",
      "org.jsoup.parser.Parser",
      "org.jsoup.parser.TreeBuilder",
      "org.jsoup.parser.HtmlTreeBuilder",
      "org.jsoup.parser.Token",
      "org.jsoup.parser.Token$Tag",
      "org.jsoup.parser.Token$StartTag",
      "org.jsoup.parser.Token$TokenType",
      "org.jsoup.parser.Token$EndTag",
      "org.jsoup.parser.ParseErrorList",
      "org.jsoup.parser.HtmlTreeBuilderState",
      "org.jsoup.parser.Tokeniser",
      "org.jsoup.parser.TokeniserState",
      "org.jsoup.parser.Token$Character",
      "org.jsoup.parser.Token$Doctype",
      "org.jsoup.parser.Token$Comment",
      "org.jsoup.parser.Token$EOF",
      "org.jsoup.parser.HtmlTreeBuilderState$24",
      "org.jsoup.SerializationException",
      "org.jsoup.select.Evaluator$Class",
      "org.jsoup.select.Evaluator$Id",
      "org.jsoup.select.Selector",
      "org.jsoup.select.QueryParser",
      "org.jsoup.parser.TokenQueue",
      "org.jsoup.select.StructuralEvaluator$Root",
      "org.jsoup.select.CombiningEvaluator",
      "org.jsoup.select.CombiningEvaluator$And",
      "org.jsoup.select.StructuralEvaluator",
      "org.jsoup.select.StructuralEvaluator$ImmediatePreviousSibling",
      "org.jsoup.select.Selector$SelectorParseException",
      "org.jsoup.nodes.PseudoTextElement",
      "org.jsoup.select.Collector$FirstFinder",
      "org.jsoup.select.Evaluator$IndexGreaterThan",
      "org.jsoup.select.Evaluator$AttributeWithValueMatching",
      "org.jsoup.helper.Validate",
      "org.jsoup.nodes.Document$OutputSettings",
      "org.jsoup.nodes.Document$OutputSettings$Syntax",
      "org.jsoup.nodes.Entities",
      "org.jsoup.parser.CharacterReader",
      "org.jsoup.nodes.Entities$EscapeMode",
      "org.jsoup.nodes.Document$QuirksMode",
      "org.jsoup.nodes.Entities$CoreCharset"
    );
  }
}
