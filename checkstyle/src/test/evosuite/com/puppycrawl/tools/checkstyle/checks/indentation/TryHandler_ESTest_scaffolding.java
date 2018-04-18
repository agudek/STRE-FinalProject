/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 14:21:57 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.indentation;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class TryHandler_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.checks.indentation.TryHandler"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(TryHandler_ESTest_scaffolding.class.getClassLoader() ,
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IndentLevel",
      "com.puppycrawl.tools.checkstyle.api.Context",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LambdaHandler",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.checks.indentation.WhileHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LabelHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.DoWhileHandler",
      "com.puppycrawl.tools.checkstyle.grammars.CommentListener",
      "com.puppycrawl.tools.checkstyle.checks.indentation.CatchHandler",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.checks.indentation.CaseHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.MethodCallHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ElseHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ForHandler",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.checks.indentation.SwitchHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.HandlerFactory",
      "com.puppycrawl.tools.checkstyle.checks.indentation.FinallyHandler",
      "org.apache.commons.beanutils.Converter",
      "antlr.CommonToken",
      "com.puppycrawl.tools.checkstyle.checks.indentation.MemberDefHandler",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LineSet",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ObjectBlockHandler",
      "org.apache.commons.beanutils.ConversionException",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ImportHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IndentationCheck",
      "antlr.Token",
      "com.puppycrawl.tools.checkstyle.checks.indentation.SlistHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.MethodDefHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.TryHandler",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.FileStatefulCheck",
      "antlr.CommonAST",
      "com.puppycrawl.tools.checkstyle.checks.indentation.PrimordialHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.SynchronizedHandler",
      "antlr.CommonHiddenStreamToken",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LineWrappingHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ClassDefHandler",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "com.puppycrawl.tools.checkstyle.checks.indentation.PackageDefHandler",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.puppycrawl.tools.checkstyle.checks.indentation.BlockParentHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.NewHandler",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.checks.indentation.StaticInitHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IndexHandler",
      "antlr.collections.ASTEnumeration",
      "antlr.BaseAST"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(TryHandler_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.BlockParentHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.TryHandler",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IndentationCheck",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LineWrappingHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.HandlerFactory",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IndentLevel",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.puppycrawl.tools.checkstyle.checks.indentation.PrimordialHandler",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.checks.indentation.DoWhileHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.NewHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ClassDefHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ObjectBlockHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.MemberDefHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.CatchHandler",
      "antlr.ParseTree",
      "antlr.ParseTreeRule",
      "antlr.collections.impl.Vector",
      "antlr.collections.impl.ASTEnumerator",
      "antlr.collections.impl.VectorEnumerator",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ImportHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LineWrappingHandler$LineWrappingOptions",
      "com.puppycrawl.tools.checkstyle.checks.indentation.PackageDefHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LineSet",
      "com.puppycrawl.tools.checkstyle.checks.indentation.CaseHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LabelHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ForHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.MethodCallHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.SwitchHandler",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.checks.indentation.WhileHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.MethodDefHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.LambdaHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.ElseHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.FinallyHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.IndexHandler",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "antlr.ASTNULLType",
      "com.puppycrawl.tools.checkstyle.checks.indentation.SlistHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.StaticInitHandler",
      "com.puppycrawl.tools.checkstyle.checks.indentation.SynchronizedHandler",
      "antlr.Token",
      "antlr.ParseTreeToken",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.RegularImmutableMap",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Iterators$9",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.beanutils.ConvertUtils",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.converters.LongConverter",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "org.apache.commons.beanutils.converters.DateConverter",
      "org.apache.commons.beanutils.converters.CalendarConverter",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.converters.URLConverter",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$PatternConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$SeverityLevelConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$ScopeConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$UriConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedAccessModifierArrayConverter",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.MethodUtils",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "org.apache.commons.beanutils.PropertyUtils",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException"
    );
  }
}
