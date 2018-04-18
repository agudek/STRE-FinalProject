/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 13:28:21 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class UncommentedMainCheck_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.checks.UncommentedMainCheck"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(UncommentedMainCheck_ESTest_scaffolding.class.getClassLoader() ,
      "com.puppycrawl.tools.checkstyle.api.Context",
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.api.TextBlock",
      "com.puppycrawl.tools.checkstyle.api.FullIdent",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "org.apache.commons.beanutils.PropertyUtils",
      "com.google.common.collect.ImmutableList$SubList",
      "com.puppycrawl.tools.checkstyle.grammars.CommentListener",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "com.google.common.collect.PeekingIterator",
      "org.apache.commons.beanutils.IntrospectionContext",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "com.google.common.collect.RegularImmutableList",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.google.common.base.Optional",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "antlr.collections.impl.Vector",
      "org.apache.commons.beanutils.expression.Resolver",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.RegularImmutableMap",
      "org.apache.commons.beanutils.converters.LongConverter",
      "antlr.ParseTree",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.google.common.collect.Iterators$10",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "com.google.common.collect.AbstractMapEntry",
      "org.apache.commons.beanutils.Converter",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "antlr.ParseTreeRule",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "com.google.common.base.Predicate",
      "antlr.ParseTreeToken",
      "org.apache.commons.beanutils.BeanIntrospector",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "org.apache.commons.beanutils.MethodUtils",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedAccessModifierArrayConverter",
      "com.google.common.collect.Iterators$ConcatenatedIterator",
      "com.google.common.collect.Iterables",
      "com.puppycrawl.tools.checkstyle.checks.UncommentedMainCheck",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "antlr.Token",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.google.common.collect.RegularImmutableAsList",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "com.puppycrawl.tools.checkstyle.FileStatefulCheck",
      "com.google.common.collect.ImmutableMapEntrySet",
      "org.apache.commons.beanutils.converters.DateConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$UriConverter",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableMultimap",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "com.google.common.collect.ObjectArrays",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "com.google.common.collect.AbstractIterator",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$PatternConverter",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "org.apache.commons.beanutils.ConvertUtils",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.google.common.base.Preconditions",
      "antlr.BaseAST",
      "com.google.common.collect.UnmodifiableIterator",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$SeverityLevelConverter",
      "com.google.common.collect.ImmutableEntry",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "com.google.common.collect.ImmutableCollection",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "antlr.collections.impl.ASTEnumerator",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "com.google.common.collect.AbstractIndexedListIterator",
      "org.apache.commons.beanutils.DynaProperty",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "org.apache.commons.beanutils.BeanAccessLanguageException",
      "org.apache.commons.beanutils.converters.FileConverter",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "antlr.CommonToken",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "antlr.ASTNULLType",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ImmutableMap$1",
      "org.apache.commons.beanutils.ConversionException",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$1",
      "com.google.common.collect.AbstractMultimap",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$ScopeConverter",
      "antlr.CommonAST",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "antlr.collections.impl.VectorEnumerator",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$1",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "antlr.CommonHiddenStreamToken",
      "org.apache.commons.beanutils.converters.StringConverter",
      "com.google.common.collect.Iterators$PeekingImpl",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.NestedNullException",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.google.common.collect.SetMultimap",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "antlr.collections.ASTEnumeration",
      "com.google.common.collect.Iterators$MergingIterator",
      "org.apache.commons.beanutils.converters.URLConverter",
      "com.google.common.collect.RegularImmutableMap$Values",
      "org.apache.commons.beanutils.converters.CalendarConverter"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(UncommentedMainCheck_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.checks.UncommentedMainCheck",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.puppycrawl.tools.checkstyle.api.FullIdent",
      "antlr.collections.impl.Vector",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
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
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.CollectPreconditions",
      "antlr.ASTNULLType",
      "antlr.collections.impl.ASTEnumerator",
      "antlr.collections.impl.VectorEnumerator",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.RegularImmutableMap",
      "antlr.Token",
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
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "antlr.ParseTree",
      "antlr.ParseTreeRule",
      "antlr.ParseTreeToken",
      "org.apache.commons.beanutils.PropertyUtils",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control"
    );
  }
}