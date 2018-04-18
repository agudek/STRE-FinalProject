/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 14:06:50 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.utils;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ModuleReflectionUtils_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.utils.ModuleReflectionUtils"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ModuleReflectionUtils_ESTest_scaffolding.class.getClassLoader() ,
      "com.puppycrawl.tools.checkstyle.api.Context",
      "antlr.collections.AST",
      "com.puppycrawl.tools.checkstyle.checks.DescendantTokenCheck",
      "com.google.common.collect.MultimapBuilder",
      "com.puppycrawl.tools.checkstyle.grammars.CommentListener",
      "com.google.common.base.CharMatcher$ForPredicate",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "com.google.common.base.JdkPattern",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.math.IntMath",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.Platform",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.collect.RegularImmutableMap",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "org.apache.commons.beanutils.Converter",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.reflect.ClassPath$1",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$Invisible",
      "antlr.CommonASTWithHiddenTokens",
      "com.google.common.base.CharMatcher$None",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.google.common.collect.MultimapBuilder$SetMultimapBuilder",
      "com.puppycrawl.tools.checkstyle.api.RootModule",
      "com.puppycrawl.tools.checkstyle.AuditEventFormatter",
      "com.google.common.reflect.ClassPath$DefaultScanner",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.puppycrawl.tools.checkstyle.api.Filter",
      "com.google.common.collect.Sets$4",
      "com.google.common.base.Absent",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.base.CharMatcher",
      "com.puppycrawl.tools.checkstyle.checks.OuterTypeFilenameCheck",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Preconditions",
      "antlr.BaseAST",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.AbstractMapBasedMultimap$Itr",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.api.FilterSet",
      "com.puppycrawl.tools.checkstyle.utils.ModuleReflectionUtils",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.puppycrawl.tools.checkstyle.TreeWalkerAuditEvent",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.SortedSetMultimap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.reflect.ClassPath$ResourceInfo",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.Splitter$Strategy",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "com.google.common.base.AbstractIterator$1",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilter",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.collect.FluentIterable$2",
      "antlr.CommonAST",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.FluentIterable$3",
      "com.google.common.base.CharMatcher$Negated",
      "com.puppycrawl.tools.checkstyle.ModuleFactory",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.collect.Multimaps$CustomSetMultimap",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.puppycrawl.tools.checkstyle.Checker",
      "com.google.common.base.CharMatcher$Digit",
      "com.puppycrawl.tools.checkstyle.filters.SuppressionXpathFilter",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "com.puppycrawl.tools.checkstyle.StatelessCheck",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.reflect.ClassPath$ClassInfo",
      "com.google.common.collect.FluentIterable",
      "com.google.common.base.Optional",
      "com.google.common.reflect.ClassPath",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$3",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$2",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$1",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$6",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$5",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$OutputStreamOptions",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.base.CommonPattern",
      "com.google.common.collect.RegularImmutableSet",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.collect.MultimapBuilder$1",
      "com.google.common.collect.MultimapBuilder$2",
      "com.google.common.collect.AbstractMapBasedMultimap$2",
      "com.google.common.collect.MultimapBuilder$3",
      "com.google.common.collect.MultimapBuilder$4",
      "com.google.common.base.Present",
      "com.google.common.collect.Iterables",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Multimaps",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.puppycrawl.tools.checkstyle.api.MessageDispatcher",
      "com.google.common.base.Predicates",
      "com.puppycrawl.tools.checkstyle.filters.SuppressionCommentFilter",
      "com.google.common.collect.ObjectArrays",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "com.google.common.collect.AbstractIterator",
      "com.puppycrawl.tools.checkstyle.checks.ArrayTypeStyleCheck",
      "com.google.common.base.CharMatcher$And",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.puppycrawl.tools.checkstyle.DefaultLogger",
      "com.puppycrawl.tools.checkstyle.TreeWalker",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.AbstractMapBasedMultimap$RandomAccessWrappedList",
      "com.google.common.collect.Iterators$EmptyModifiableIterator",
      "com.puppycrawl.tools.checkstyle.api.AuditListener",
      "com.google.common.collect.MultimapBuilder$SortedSetMultimapBuilder",
      "com.google.common.collect.MultimapBuilder$ListMultimapBuilder",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedList",
      "com.puppycrawl.tools.checkstyle.api.FileSetCheck",
      "com.google.common.reflect.ClassPath$Scanner",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.puppycrawl.tools.checkstyle.TreeWalkerFilter",
      "com.google.common.base.Splitter",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Converter",
      "com.google.common.collect.Maps$8",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilterSet",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.CollectPreconditions",
      "com.puppycrawl.tools.checkstyle.api.ExternalResourceHolder",
      "com.google.common.collect.Sets",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.Iterables$4",
      "org.apache.commons.beanutils.ConversionException",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.MultimapBuilder$LinkedHashSetSupplier",
      "com.google.common.collect.Iterators",
      "com.puppycrawl.tools.checkstyle.checks.UpperEllCheck",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.Splitter$5",
      "com.google.common.collect.Maps",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.collect.SetMultimap",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.google.common.base.AbstractIterator",
      "com.puppycrawl.tools.checkstyle.filters.XpathFilter",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ModuleReflectionUtils_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.utils.ModuleReflectionUtils",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.reflect.ClassPath$1",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.reflect.ClassPath",
      "com.google.common.reflect.ClassPath$Scanner",
      "com.google.common.reflect.ClassPath$DefaultScanner",
      "com.google.common.collect.Sets",
      "com.google.common.collect.MultimapBuilder",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys",
      "com.google.common.collect.MultimapBuilder$1",
      "com.google.common.collect.MultimapBuilder$SetMultimapBuilder",
      "com.google.common.collect.MultimapBuilder$MultimapBuilderWithKeys$4",
      "com.google.common.collect.Platform",
      "com.google.common.collect.Maps",
      "com.google.common.collect.MultimapBuilder$LinkedHashSetSupplier",
      "com.google.common.collect.Multimaps",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.Multimaps$CustomSetMultimap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.common.collect.AbstractMapBasedMultimap$Itr",
      "com.google.common.collect.AbstractMapBasedMultimap$2",
      "com.google.common.collect.Iterators$EmptyModifiableIterator",
      "com.google.common.collect.RegularImmutableSet",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.checks.ArrayTypeStyleCheck",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.filters.SuppressionXpathFilter",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "com.puppycrawl.tools.checkstyle.TreeWalker",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.google.common.collect.HashMultimapGwtSerializationDependencies",
      "com.google.common.collect.HashMultimap",
      "com.puppycrawl.tools.checkstyle.Checker",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevelCounter",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilterSet",
      "com.puppycrawl.tools.checkstyle.api.FilterSet",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.FluentIterable$1",
      "com.google.common.base.Optional",
      "com.google.common.base.Present",
      "com.google.common.base.Predicates",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.Iterables$4",
      "com.google.common.base.Absent",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.puppycrawl.tools.checkstyle.filters.XpathFilter",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Iterators$9",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.apache.commons.beanutils.WeakFastHashMap",
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
      "com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "com.puppycrawl.tools.checkstyle.checks.UncommentedMainCheck",
      "com.puppycrawl.tools.checkstyle.checks.TodoCommentCheck",
      "com.puppycrawl.tools.checkstyle.checks.UpperEllCheck",
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedCollection",
      "com.google.common.collect.AbstractMapBasedMultimap$WrappedSet",
      "com.google.common.reflect.ClassPath$ResourceInfo",
      "com.google.common.reflect.ClassPath$ClassInfo",
      "net.sf.saxon.sxpath.XPathEvaluator",
      "net.sf.saxon.Configuration",
      "net.sf.saxon.lib.StandardCollationURIResolver",
      "net.sf.saxon.resource.StandardCollectionFinder",
      "net.sf.saxon.lib.StandardEnvironmentVariableResolver",
      "net.sf.saxon.lib.ParseOptions",
      "net.sf.saxon.lib.StaticQueryContextFactory",
      "net.sf.saxon.trans.CompilerInfo",
      "net.sf.saxon.lib.StandardOutputResolver",
      "net.sf.saxon.expr.instruct.GlobalParameterSet",
      "net.sf.saxon.trans.packages.PackageLibrary",
      "net.sf.saxon.tree.util.DocumentNumberAllocator",
      "net.sf.saxon.trans.DynamicLoader",
      "net.sf.saxon.om.DocumentPool",
      "net.sf.saxon.functions.IntegratedFunctionLibrary",
      "net.sf.saxon.om.NamePool",
      "net.sf.saxon.expr.parser.OptimizerOptions",
      "net.sf.saxon.lib.SerializerFactory",
      "net.sf.saxon.lib.Logger",
      "net.sf.saxon.lib.StandardLogger",
      "net.sf.saxon.java.JavaPlatform",
      "net.sf.saxon.Version",
      "net.sf.saxon.lib.StandardModuleURIResolver",
      "net.sf.saxon.lib.StandardURIResolver",
      "net.sf.saxon.lib.StandardUnparsedTextResolver",
      "net.sf.saxon.expr.parser.TypeChecker",
      "net.sf.saxon.expr.compat.TypeChecker10",
      "net.sf.saxon.Configuration$1",
      "net.sf.saxon.dom.DOMEnvelope",
      "net.sf.saxon.om.TreeModel$TinyTree",
      "net.sf.saxon.om.TreeModel$TinyTreeCondensed",
      "net.sf.saxon.om.TreeModel$LinkedTree",
      "net.sf.saxon.om.TreeModel",
      "net.sf.saxon.dom.DOMObjectModel",
      "net.sf.saxon.lib.StandardEntityResolver",
      "net.sf.saxon.resource.XmlResource$1",
      "net.sf.saxon.resource.XmlResource",
      "net.sf.saxon.resource.UnparsedTextResource$1",
      "net.sf.saxon.resource.UnparsedTextResource",
      "net.sf.saxon.resource.BinaryResource$1",
      "net.sf.saxon.resource.BinaryResource",
      "net.sf.saxon.resource.JSONResource$1",
      "net.sf.saxon.resource.JSONResource",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler$DisallowedCombination",
      "net.sf.saxon.om.StructuredQName",
      "net.sf.saxon.query.Annotation",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler",
      "net.sf.saxon.sxpath.AbstractStaticContext",
      "net.sf.saxon.sxpath.IndependentContext",
      "net.sf.saxon.expr.parser.ExplicitLocation",
      "net.sf.saxon.functions.FunctionLibraryList",
      "net.sf.saxon.type.AnyItemType",
      "net.sf.saxon.value.EmptySequence",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet",
      "net.sf.saxon.type.NumericType",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet$Entry",
      "net.sf.saxon.expr.OperandUsage",
      "net.sf.saxon.type.AnySimpleType",
      "net.sf.saxon.pattern.NodeTest",
      "net.sf.saxon.pattern.AnyNodeTest",
      "net.sf.saxon.type.Type",
      "net.sf.saxon.type.PrimitiveUType",
      "net.sf.saxon.type.UType",
      "net.sf.saxon.z.IntHashMap",
      "net.sf.saxon.type.AnyType",
      "net.sf.saxon.type.Untyped",
      "net.sf.saxon.type.ErrorType",
      "net.sf.saxon.type.BuiltInType",
      "net.sf.saxon.om.FingerprintedQName",
      "net.sf.saxon.om.StandardNames",
      "net.sf.saxon.type.BuiltInAtomicType",
      "net.sf.saxon.pattern.NodeKindTest",
      "net.sf.saxon.type.AnyFunctionType",
      "net.sf.saxon.value.SequenceType",
      "net.sf.saxon.om.AbstractItem",
      "net.sf.saxon.value.QualifiedNameValue",
      "net.sf.saxon.value.QNameValue",
      "net.sf.saxon.value.AtomicValue",
      "net.sf.saxon.value.BooleanValue",
      "net.sf.saxon.value.NumericValue",
      "net.sf.saxon.value.DecimalValue",
      "net.sf.saxon.value.Int64Value",
      "net.sf.saxon.value.IntegerValue",
      "net.sf.saxon.regex.UnicodeString",
      "net.sf.saxon.regex.LatinString",
      "net.sf.saxon.value.StringValue",
      "net.sf.saxon.value.DoubleValue",
      "net.sf.saxon.functions.registry.XPath20FunctionSet",
      "net.sf.saxon.functions.registry.XPath30FunctionSet",
      "net.sf.saxon.ma.map.MapType",
      "net.sf.saxon.functions.AbstractFunction",
      "net.sf.saxon.functions.SystemFunction",
      "net.sf.saxon.type.SpecificFunctionType",
      "net.sf.saxon.query.AnnotationList",
      "net.sf.saxon.functions.OptionsParameter",
      "net.sf.saxon.ma.json.JsonToXMLFn",
      "net.sf.saxon.ma.json.ParseJsonFn",
      "net.sf.saxon.functions.Serialize",
      "net.sf.saxon.functions.TransformFn",
      "net.sf.saxon.ma.arrays.ArrayItemType",
      "net.sf.saxon.ma.json.XMLToJsonFn",
      "net.sf.saxon.functions.registry.XPath31FunctionSet",
      "net.sf.saxon.functions.Doc_2",
      "net.sf.saxon.functions.registry.VendorFunctionSetHE",
      "net.sf.saxon.functions.MathFunctionSet",
      "net.sf.saxon.ma.map.MapFunctionSet",
      "net.sf.saxon.ma.arrays.ArrayFunctionSet",
      "net.sf.saxon.functions.registry.ExsltCommonFunctionSet",
      "net.sf.saxon.functions.registry.ConstructorFunctionLibrary",
      "net.sf.saxon.expr.PackageData",
      "net.sf.saxon.expr.instruct.SlotManager",
      "net.sf.saxon.expr.instruct.Executable",
      "net.sf.saxon.expr.parser.ExpressionTool",
      "net.sf.saxon.expr.parser.XPathParser",
      "net.sf.saxon.expr.parser.ParserExtension",
      "net.sf.saxon.om.QNameParser",
      "net.sf.saxon.Configuration$2",
      "net.sf.saxon.expr.parser.Tokenizer",
      "net.sf.saxon.expr.parser.Token",
      "net.sf.saxon.value.Whitespace",
      "net.sf.saxon.om.NameChecker",
      "net.sf.saxon.serialize.charcode.UTF16CharacterSet",
      "net.sf.saxon.serialize.charcode.XMLCharacterData",
      "net.sf.saxon.lib.NamespaceConstant",
      "net.sf.saxon.pattern.NameTest",
      "net.sf.saxon.value.BigIntegerValue",
      "net.sf.saxon.functions.FormatNumber",
      "net.sf.saxon.tree.util.FastStringBuffer",
      "net.sf.saxon.value.BigDecimalValue",
      "net.sf.saxon.expr.Expression",
      "net.sf.saxon.expr.AxisExpression",
      "net.sf.saxon.expr.parser.ContextItemStaticInfo",
      "net.sf.saxon.om.AxisInfo",
      "net.sf.saxon.expr.parser.RetainedStaticContext",
      "net.sf.saxon.trans.DecimalFormatManager",
      "net.sf.saxon.trans.DecimalSymbols",
      "net.sf.saxon.expr.parser.ExpressionVisitor",
      "net.sf.saxon.type.TypeHierarchy",
      "net.sf.saxon.expr.Literal",
      "net.sf.saxon.expr.ContextItemExpression",
      "net.sf.saxon.expr.parser.RoleDiagnostic",
      "net.sf.saxon.expr.UnaryExpression",
      "net.sf.saxon.expr.ItemChecker",
      "net.sf.saxon.expr.Operand",
      "net.sf.saxon.expr.OperandRole",
      "net.sf.saxon.expr.BinaryExpression",
      "net.sf.saxon.expr.SlashExpression",
      "net.sf.saxon.expr.SimpleStepExpression",
      "net.sf.saxon.expr.parser.Optimizer",
      "net.sf.saxon.expr.parser.LoopLifter",
      "net.sf.saxon.expr.parser.LoopLifter$ExpInfo",
      "net.sf.saxon.expr.BinaryExpression$1",
      "net.sf.saxon.expr.PairIterator",
      "net.sf.saxon.expr.UnaryExpression$1",
      "net.sf.saxon.expr.MonoIterator",
      "net.sf.saxon.sxpath.XPathExpression",
      "com.google.common.collect.Range$1",
      "com.puppycrawl.tools.checkstyle.checks.SuppressWarningsHolder",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.primitives.UnsignedBytes",
      "com.puppycrawl.tools.checkstyle.PackageObjectFactory",
      "com.puppycrawl.tools.checkstyle.PackageObjectFactory$ModuleLoadOption",
      "com.puppycrawl.tools.checkstyle.checks.FinalParametersCheck",
      "antlr.collections.impl.Vector",
      "com.puppycrawl.tools.checkstyle.checks.TrailingCommentCheck",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.puppycrawl.tools.checkstyle.XmlLoader",
      "com.puppycrawl.tools.checkstyle.filters.SuppressionsLoader",
      "com.puppycrawl.tools.checkstyle.XmlLoader$FeaturesForVerySecureJavaInstallations",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "com.puppycrawl.tools.checkstyle.checks.DescendantTokenCheck",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.puppycrawl.tools.checkstyle.XMLLogger",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.puppycrawl.tools.checkstyle.DefaultLogger",
      "com.puppycrawl.tools.checkstyle.AuditEventDefaultFormatter",
      "com.google.common.primitives.Booleans",
      "com.google.common.reflect.Reflection",
      "net.sf.saxon.expr.parser.XPathParser$NestedLocation",
      "net.sf.saxon.trans.XPathException",
      "com.puppycrawl.tools.checkstyle.filters.SuppressionCommentFilter",
      "com.puppycrawl.tools.checkstyle.api.AuditEvent",
      "com.puppycrawl.tools.checkstyle.checks.OuterTypeFilenameCheck",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition"
    );
  }
}
