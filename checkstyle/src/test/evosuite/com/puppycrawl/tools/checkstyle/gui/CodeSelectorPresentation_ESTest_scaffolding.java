/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 15:21:03 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.gui;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class CodeSelectorPresentation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.gui.CodeSelectorPresentation"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CodeSelectorPresentation_ESTest_scaffolding.class.getClassLoader() ,
      "antlr.collections.AST",
      "com.google.common.primitives.Longs$LongConverter",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.cache.AbstractLoadingCache",
      "net.sf.saxon.regex.RESyntaxException",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.hash.BloomFilter$Strategy",
      "org.apache.commons.io.filefilter.EmptyFileFilter",
      "com.google.common.base.Enums$StringConverter",
      "org.apache.commons.io.filefilter.TrueFileFilter",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.common.collect.Platform",
      "org.apache.commons.io.filefilter.AgeFileFilter",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.Functions$FunctionForMapNoDefault",
      "com.google.common.base.Converter$IdentityConverter",
      "org.apache.commons.io.filefilter.DirectoryFileFilter",
      "com.google.common.collect.Iterators$10",
      "com.google.common.cache.ForwardingLoadingCache",
      "com.google.common.cache.LocalCache$LocalManualCache",
      "org.apache.commons.io.filefilter.SuffixFileFilter",
      "com.google.common.base.Predicate",
      "antlr.ParseTreeToken",
      "com.google.common.collect.ImmutableRangeSet$ComplementRanges",
      "com.google.common.base.CharMatcher$Invisible",
      "antlr.CommonASTWithHiddenTokens",
      "com.google.common.base.CharMatcher$None",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.google.common.collect.FilteredEntryMultimap$ValuePredicate",
      "org.apache.commons.io.filefilter.AndFileFilter",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.collect.DiscreteDomain$BigIntegerDomain",
      "antlr.Token",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.cache.LocalCache",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.DiscreteDomain",
      "org.apache.commons.io.filefilter.NameFileFilter",
      "com.google.common.io.PatternFilenameFilter",
      "com.google.common.collect.Cut",
      "com.google.common.base.Functions$ConstantFunction",
      "com.google.common.primitives.Shorts$ShortConverter",
      "com.google.common.collect.FilteredEntryMultimap$Keys",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.io.Files$FilePredicate",
      "com.google.common.collect.DiscreteDomain$1",
      "com.google.common.base.CharMatcher",
      "com.google.common.collect.Multimaps$Keys",
      "com.google.common.cache.ForwardingLoadingCache$SimpleForwardingLoadingCache",
      "com.google.common.cache.ForwardingCache",
      "com.puppycrawl.tools.checkstyle.api.JavadocTokenTypes",
      "org.apache.commons.io.filefilter.WildcardFilter",
      "com.google.common.collect.RegularImmutableTable$Values",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.base.Preconditions",
      "antlr.BaseAST",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.common.base.CharMatcher$1",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.hash.Funnels$StringCharsetFunnel",
      "org.apache.commons.io.filefilter.IOFileFilter",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Converter$ConverterComposition",
      "org.apache.commons.io.filefilter.MagicNumberFileFilter",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.cache.LocalCache$ManualSerializationProxy",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "net.sf.saxon.trans.XPathException",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.collect.ImmutableSortedAsList",
      "org.apache.commons.io.filefilter.AbstractFileFilter",
      "com.google.common.hash.Funnels$ByteArrayFunnel",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.base.Equivalence$EquivalentToPredicate",
      "com.google.common.collect.Iterators$5",
      "org.apache.commons.io.filefilter.HiddenFileFilter",
      "com.google.common.collect.DiscreteDomain$LongDomain",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "antlr.ASTNULLType",
      "com.google.common.base.Converter$ReverseConverter",
      "net.sf.saxon.regex.ARegularExpression",
      "com.google.common.base.Functions$ToStringFunction",
      "com.google.common.base.Functions$FunctionComposition",
      "org.apache.commons.io.filefilter.FalseFileFilter",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.collect.Lists$2",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.collect.Lists$1",
      "net.sf.saxon.regex.RegexIterator",
      "net.sf.saxon.regex.JavaRegularExpression",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultimap",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.google.errorprone.annotations.concurrent.LazyInit",
      "com.google.common.hash.BloomFilter$SerialForm",
      "com.google.common.collect.Interners$InternerFunction",
      "org.apache.commons.io.filefilter.OrFileFilter",
      "com.google.common.collect.ImmutableList",
      "com.google.common.util.concurrent.UncheckedExecutionException",
      "com.google.common.collect.Range$RangeLexOrdering",
      "net.sf.saxon.functions.URIQueryParameters",
      "antlr.CommonAST",
      "com.google.common.collect.FilteredEntryMultimap$AsMap",
      "com.google.common.base.CharMatcher$Negated",
      "com.puppycrawl.tools.checkstyle.utils.JavadocUtils",
      "com.puppycrawl.tools.checkstyle.api.DetailNode",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.Funnels$IntegerFunnel",
      "com.google.common.collect.Range$LowerBoundFn",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.collect.Ordering",
      "com.google.common.base.CharMatcher$Digit",
      "net.sf.saxon.regex.UnicodeString",
      "antlr.collections.ASTEnumeration",
      "com.google.common.cache.Cache",
      "org.apache.commons.io.filefilter.CanWriteFileFilter",
      "com.google.common.cache.LoadingCache",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.collect.Range$UpperBoundFn",
      "com.google.common.base.Suppliers$SupplierFunctionImpl",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "net.sf.saxon.functions.URIQueryParameters$RegexFilter",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "org.apache.commons.io.filefilter.NotFileFilter",
      "com.google.common.collect.Iterators$ArrayItr",
      "antlr.collections.impl.Vector",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$IsNot",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.collect.Range",
      "com.google.common.cache.AbstractCache",
      "org.apache.commons.io.filefilter.ConditionalFileFilter",
      "antlr.ParseTree",
      "com.google.common.hash.Funnel",
      "antlr.ParseTreeRule",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.collect.FilteredMultimap",
      "com.google.common.cache.CacheStats",
      "org.apache.commons.io.filefilter.DelegateFileFilter",
      "com.google.common.collect.Iterables",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.ImmutableList$SerializedForm",
      "com.google.common.hash.Funnels$UnencodedCharsFunnel",
      "com.google.common.base.Predicates",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.base.Functions$IdentityFunction",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.collect.FluentIterable$FromIterableFunction",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.hash.BloomFilter$1",
      "com.google.common.collect.SortedIterable",
      "com.google.common.base.CharMatcher$AnyOf",
      "org.apache.commons.io.filefilter.WildcardFileFilter",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.base.Functions$SupplierFunction",
      "com.google.common.collect.Maps$EntryFunction",
      "net.sf.saxon.regex.REProgram",
      "com.google.common.collect.FilteredEntryMultimap",
      "com.google.common.base.Functions$PredicateFunction",
      "antlr.collections.impl.ASTEnumerator",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.primitives.Floats$FloatConverter",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "org.checkerframework.checker.nullness.compatqual.MonotonicNonNullDecl",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.SmallCharMatcher",
      "com.google.common.hash.Funnels$LongFunnel",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Converter",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.base.Function",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.CollectPreconditions",
      "org.apache.commons.io.filefilter.FileFileFilter",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.base.Suppliers$SupplierFunction",
      "com.google.common.primitives.Ints$IntConverter",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "antlr.CommonToken",
      "net.sf.saxon.regex.RegularExpression",
      "com.google.common.collect.BoundType",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "org.apache.commons.io.filefilter.CanReadFileFilter",
      "com.google.common.collect.ImmutableList$Builder",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "org.apache.commons.io.IOCase",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.cache.LocalCache$LoadingSerializationProxy",
      "com.google.common.reflect.TypeToken$TypeFilter",
      "com.google.common.collect.Multimap",
      "net.sf.saxon.om.SequenceIterator",
      "com.google.common.collect.Iterators",
      "org.apache.commons.io.filefilter.SizeFileFilter",
      "com.puppycrawl.tools.checkstyle.gui.CodeSelectorPresentation",
      "com.google.common.cache.LocalCache$LocalLoadingCache",
      "antlr.collections.impl.VectorEnumerator",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "org.apache.commons.io.filefilter.RegexFileFilter",
      "com.google.common.hash.Funnels$SequentialFunnel",
      "antlr.CommonHiddenStreamToken",
      "com.google.common.primitives.Doubles$DoubleConverter",
      "com.google.common.base.CharMatcher$Or",
      "org.apache.commons.io.filefilter.PrefixFileFilter",
      "org.checkerframework.checker.nullness.compatqual.NullableDecl",
      "com.google.common.collect.JdkBackedImmutableBiMap$InverseEntries",
      "com.google.common.base.CaseFormat$StringConverter",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.base.Functions$ForMapWithDefault",
      "com.google.common.base.Predicates$InPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CodeSelectorPresentation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.gui.CodeSelectorPresentation",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl",
      "com.puppycrawl.tools.checkstyle.api.JavadocTokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.JavadocUtils",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Preconditions",
      "antlr.ASTNULLType",
      "com.google.common.collect.Iterables",
      "antlr.collections.impl.Vector",
      "antlr.Token",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableList$Builder",
      "antlr.ParseTree",
      "antlr.ParseTreeToken",
      "com.google.common.collect.Platform",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.Lists",
      "antlr.ParseTreeRule",
      "antlr.collections.impl.ASTEnumerator",
      "antlr.collections.impl.VectorEnumerator"
    );
  }
}