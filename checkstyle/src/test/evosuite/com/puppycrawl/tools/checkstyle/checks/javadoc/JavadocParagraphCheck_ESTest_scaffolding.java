/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 12:46:40 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.javadoc;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class JavadocParagraphCheck_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocParagraphCheck"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JavadocParagraphCheck_ESTest_scaffolding.class.getClassLoader() ,
      "com.puppycrawl.tools.checkstyle.api.Context",
      "antlr.collections.AST",
      "org.antlr.v4.runtime.ANTLRErrorStrategy",
      "com.puppycrawl.tools.checkstyle.grammars.CommentListener",
      "com.google.common.collect.PeekingIterator",
      "org.apache.commons.beanutils.IntrospectionContext",
      "org.antlr.v4.runtime.atn.ArrayPredictionContext",
      "org.apache.commons.beanutils.converters.DateTimeConverter",
      "org.antlr.v4.runtime.tree.pattern.TextChunk",
      "org.antlr.v4.runtime.atn.LoopEndState",
      "org.apache.commons.beanutils.expression.Resolver",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap$1EntrySetImpl",
      "com.google.common.collect.NullsLastOrdering",
      "org.antlr.v4.runtime.Recognizer",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser",
      "org.apache.commons.beanutils.converters.LongConverter",
      "com.puppycrawl.tools.checkstyle.api.AbstractFileSetCheck",
      "org.antlr.v4.runtime.atn.PredicateTransition",
      "org.apache.commons.beanutils.WeakFastHashMap",
      "org.apache.commons.beanutils.Converter",
      "com.google.common.collect.ImmutableBiMap$Builder",
      "org.antlr.v4.runtime.atn.EmptyPredictionContext",
      "com.puppycrawl.tools.checkstyle.api.RootModule",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ParagraphContext",
      "com.google.common.collect.NullsFirstOrdering",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "antlr.Token",
      "org.apache.commons.beanutils.ContextClassLoaderLocal",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedStringArrayConverter",
      "org.antlr.v4.runtime.atn.EpsilonTransition",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$FrameTagContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TfootContext",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$UriConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlElementStartContext",
      "org.antlr.v4.runtime.FailedPredicateException",
      "org.antlr.v4.runtime.dfa.DFASerializer",
      "org.apache.commons.beanutils.converters.SqlTimeConverter",
      "org.antlr.v4.runtime.atn.ProfilingATNSimulator",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$PatternConverter",
      "com.puppycrawl.tools.checkstyle.api.Configurable",
      "org.apache.commons.beanutils.DefaultBeanIntrospector",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "org.antlr.v4.runtime.atn.PredictionMode",
      "org.antlr.v4.runtime.TokenSource",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ThTagEndContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$SingletonElementContext",
      "org.antlr.v4.runtime.atn.ATNDeserializationOptions",
      "org.antlr.v4.runtime.Parser",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "org.antlr.v4.runtime.tree.ParseTreeListener",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "org.antlr.v4.runtime.ANTLRErrorListener",
      "com.google.common.collect.ImmutableMapValues",
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DescriptionContext",
      "com.google.common.collect.ImmutableEntry",
      "org.apache.commons.beanutils.converters.BigDecimalConverter",
      "org.antlr.v4.runtime.atn.ATNConfigSet$AbstractConfigHashSet",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TfootTagStartContext",
      "org.antlr.v4.runtime.TokenStream",
      "com.google.common.collect.ImmutableCollection",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlElementEndContext",
      "org.apache.commons.beanutils.converters.BooleanConverter",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.AbstractJavadocCheck",
      "org.antlr.v4.runtime.misc.EqualityComparator",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$PTagEndContext",
      "org.apache.commons.beanutils.converters.AbstractConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TheadTagEndContext",
      "com.puppycrawl.tools.checkstyle.TreeWalkerAuditEvent",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$WbrTagContext",
      "com.google.common.collect.IndexedImmutableSet",
      "org.antlr.v4.runtime.misc.Array2DHashSet",
      "org.antlr.v4.runtime.tree.Tree",
      "com.google.common.collect.ImmutableMapValues$1",
      "com.google.common.collect.ImmutableMapValues$2",
      "org.apache.commons.beanutils.converters.SqlDateConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ThTagStartContext",
      "org.apache.commons.beanutils.converters.FileConverter",
      "org.antlr.v4.runtime.Vocabulary",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$InputTagContext",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "antlr.ASTNULLType",
      "org.apache.commons.beanutils.PropertyUtilsBean",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlTagEndContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TbodyContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$OptionTagEndContext",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.base.Supplier",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TrackTagContext",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TextContext",
      "com.google.common.collect.ImmutableList",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$ScopeConverter",
      "com.google.common.collect.ReverseOrdering",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlElementContext",
      "antlr.CommonAST",
      "org.antlr.v4.runtime.atn.ATNDeserializer",
      "com.puppycrawl.tools.checkstyle.api.DetailNode",
      "com.google.common.collect.Iterators$PeekingImpl",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$MetaTagContext",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocParagraphCheck",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.antlr.v4.runtime.LexerNoViableAltException",
      "org.antlr.v4.runtime.atn.SetTransition",
      "com.google.common.collect.Ordering",
      "com.puppycrawl.tools.checkstyle.Checker",
      "antlr.collections.ASTEnumeration",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HrTagContext",
      "org.antlr.v4.runtime.atn.BlockStartState",
      "org.apache.commons.beanutils.converters.CalendarConverter",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.AllEqualOrdering",
      "com.puppycrawl.tools.checkstyle.api.TextBlock",
      "org.apache.commons.beanutils.PropertyUtils",
      "org.apache.commons.beanutils.converters.ArrayConverter",
      "org.antlr.v4.runtime.misc.AbstractEqualityComparator",
      "com.puppycrawl.tools.checkstyle.TreeWalker$AstState",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ParamTagContext",
      "org.antlr.v4.runtime.IntStream",
      "com.google.common.base.Optional",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ColgroupTagStartContext",
      "com.google.common.collect.Iterators$ArrayItr",
      "antlr.collections.impl.Vector",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "org.antlr.v4.runtime.misc.IntegerList",
      "org.antlr.v4.runtime.atn.ATNDeserializer$UnicodeDeserializingMode",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets$1",
      "antlr.ParseTree",
      "org.apache.commons.beanutils.converters.BigIntegerConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$BaseTagContext",
      "com.google.common.collect.RegularImmutableSet",
      "org.antlr.v4.runtime.tree.TerminalNode",
      "org.antlr.v4.runtime.atn.RuleStartState",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "org.antlr.v4.runtime.atn.Transition$1",
      "org.antlr.v4.runtime.atn.ATNSimulator",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$JavadocInlineTagContext",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ImmutableListMultimap",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DdTagStartContext",
      "com.puppycrawl.tools.checkstyle.api.AuditEvent",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableAsList",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$LiContext",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$OptionTagStartContext",
      "org.antlr.v4.runtime.RuleContext",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.ImmutableMapEntrySet",
      "org.antlr.v4.runtime.CharStream",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$SingletonTagNameContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$BodyTagStartContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DtTagEndContext",
      "com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser$ParseStatus",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$KeygenTagContext",
      "com.google.common.collect.ObjectArrays",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TbodyTagStartContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ParametersContext",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.IndexedImmutableSet$1",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "org.antlr.v4.runtime.atn.LexerAction",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet$1",
      "org.antlr.v4.runtime.atn.WildcardTransition",
      "org.antlr.v4.runtime.dfa.DFA",
      "org.apache.commons.collections.FastHashMap",
      "antlr.collections.impl.ASTEnumerator",
      "org.antlr.v4.runtime.atn.RuleTransition",
      "org.antlr.v4.runtime.tree.pattern.TagChunk",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlTagContext",
      "org.antlr.v4.runtime.atn.PrecedencePredicateTransition",
      "com.google.common.collect.SingletonImmutableList",
      "org.apache.commons.beanutils.converters.ConverterFacade",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableMap",
      "org.apache.commons.beanutils.DynaProperty",
      "com.google.common.collect.Multiset$Entry",
      "org.apache.commons.beanutils.BeanAccessLanguageException",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlCommentContext",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "antlr.CommonToken",
      "org.antlr.v4.runtime.atn.BasicBlockStartState",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TrContext",
      "com.google.common.collect.ExplicitOrdering",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "com.google.common.collect.ImmutableList$Builder",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$LinkTagContext",
      "org.antlr.v4.runtime.misc.IntervalSet",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DdTagEndContext",
      "org.antlr.v4.runtime.atn.BasicState",
      "org.antlr.v4.runtime.NoViableAltException",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.CompoundOrdering",
      "org.antlr.v4.runtime.RuntimeMetaData",
      "org.antlr.v4.runtime.atn.SemanticContext$AND",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "org.antlr.v4.runtime.atn.ATNConfigSet",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HeadContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$IsindexTagContext",
      "org.antlr.v4.runtime.atn.SemanticContext$PrecedencePredicate",
      "com.google.common.collect.Ordering$IncomparableValueException",
      "com.google.common.collect.ImmutableMultiset$1",
      "antlr.collections.impl.VectorEnumerator",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$1",
      "antlr.CommonHiddenStreamToken",
      "org.apache.commons.beanutils.converters.StringConverter",
      "org.antlr.v4.runtime.atn.SemanticContext",
      "org.apache.commons.beanutils.NestedNullException",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.SetMultimap",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$AttributeContext",
      "org.antlr.v4.runtime.atn.StarLoopEntryState",
      "org.apache.commons.beanutils.converters.URLConverter",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ColgroupContext",
      "org.apache.commons.beanutils.ConvertUtilsBean",
      "org.antlr.v4.runtime.tree.pattern.RuleTagToken",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$SourceTagContext",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "org.antlr.v4.runtime.tree.pattern.Chunk",
      "org.antlr.v4.runtime.tree.pattern.ParseTreeMatch",
      "com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser$ParseErrorMessage",
      "org.antlr.v4.runtime.misc.IntSet",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$EmbedTagContext",
      "com.google.common.collect.ImmutableMultimap$Values",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DtTagStartContext",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.base.Predicate",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "antlr.ParseTreeToken",
      "org.apache.commons.beanutils.BeanIntrospector",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.AbstractJavadocCheck$1",
      "org.apache.commons.beanutils.MethodUtils",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$RelaxedAccessModifierArrayConverter",
      "com.google.common.collect.Iterators$ConcatenatedIterator",
      "org.antlr.v4.runtime.atn.TokensStartState",
      "org.antlr.v4.runtime.atn.DecisionState",
      "org.antlr.v4.runtime.atn.ATNConfigSet$ConfigEqualityComparator",
      "org.antlr.v4.runtime.atn.BlockEndState",
      "org.antlr.v4.runtime.atn.ActionTransition",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DtContext",
      "org.apache.commons.beanutils.converters.DateConverter",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableMultimap",
      "org.antlr.v4.runtime.atn.ParserATNSimulator",
      "com.google.common.collect.ImmutableSortedSet",
      "com.puppycrawl.tools.checkstyle.api.Filter",
      "org.antlr.v4.runtime.atn.AtomTransition",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ColgroupTagEndContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$DdContext",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TrTagEndContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ColTagContext",
      "org.antlr.v4.runtime.RecognitionException",
      "org.apache.commons.beanutils.ConvertUtils",
      "com.puppycrawl.tools.checkstyle.api.JavadocTokenTypes",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$AreaTagContext",
      "org.antlr.v4.runtime.atn.RangeTransition",
      "com.google.common.base.Preconditions",
      "org.antlr.v4.runtime.VocabularyImpl",
      "antlr.BaseAST",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocTags",
      "org.apache.commons.beanutils.converters.DoubleConverter",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$SeverityLevelConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$OptionContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$EmptyTagContext",
      "org.apache.commons.beanutils.BeanUtilsBean$1",
      "org.antlr.v4.runtime.misc.Interval",
      "org.antlr.v4.runtime.atn.StarLoopbackState",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TdTagStartContext",
      "org.apache.commons.beanutils.converters.ClassConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TheadTagStartContext",
      "org.antlr.v4.runtime.misc.MurmurHash",
      "org.apache.commons.beanutils.converters.ByteConverter",
      "com.puppycrawl.tools.checkstyle.utils.JavadocUtils$JavadocTagType",
      "org.antlr.v4.runtime.atn.SemanticContext$Predicate",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TbodyTagEndContext",
      "org.antlr.v4.runtime.TokenFactory",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "org.antlr.v4.runtime.atn.PredictionContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ThContext",
      "org.apache.commons.logging.impl.Jdk14Logger",
      "org.antlr.v4.runtime.atn.PlusLoopbackState",
      "com.google.common.collect.RegularImmutableBiMap$Inverse",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$LiTagStartContext",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$JavadocTagContext",
      "com.google.common.collect.AbstractMultimap",
      "org.antlr.v4.runtime.atn.PredictionContextCache",
      "com.puppycrawl.tools.checkstyle.api.BeforeExecutionFileFilter",
      "org.antlr.v4.runtime.atn.SemanticContext$OR",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$BasefontTagContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TrTagStartContext",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.AbstractJavadocCheck$FileContext",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher$StartRuleDoesNotConsumeFullPattern",
      "org.antlr.v4.runtime.atn.Transition",
      "org.apache.commons.beanutils.converters.ShortConverter",
      "com.puppycrawl.tools.checkstyle.utils.JavadocUtils",
      "com.puppycrawl.tools.checkstyle.ModuleFactory",
      "org.antlr.v4.runtime.atn.ATNDeserializer$UnicodeDeserializer",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher",
      "org.antlr.v4.runtime.atn.SemanticContext$Operator",
      "org.antlr.v4.runtime.atn.ATN",
      "org.antlr.v4.runtime.atn.ATNConfigSet$ConfigHashSet",
      "org.antlr.v4.runtime.dfa.LexerDFASerializer",
      "com.puppycrawl.tools.checkstyle.DefaultContext",
      "com.google.common.collect.NaturalOrdering",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TheadContext",
      "org.antlr.v4.runtime.tree.SyntaxTree",
      "org.antlr.v4.runtime.tree.RuleNode",
      "org.antlr.v4.runtime.atn.NotSetTransition",
      "org.apache.commons.beanutils.converters.SqlTimestampConverter",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ListMultimap",
      "org.antlr.v4.runtime.Token",
      "org.antlr.v4.runtime.atn.ATNState",
      "org.antlr.v4.runtime.atn.DecisionInfo",
      "com.google.common.collect.RegularImmutableList",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlTagStartContext",
      "com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser",
      "org.antlr.v4.runtime.atn.PlusBlockStartState",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TdTagEndContext",
      "org.antlr.v4.runtime.misc.Pair",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "org.antlr.v4.runtime.atn.AbstractPredicateTransition",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl",
      "com.google.common.collect.ImmutableMapKeySet",
      "org.apache.commons.beanutils.converters.NumberConverter",
      "org.antlr.v4.runtime.atn.ATNConfig",
      "org.antlr.v4.runtime.misc.MultiMap",
      "org.apache.commons.beanutils.converters.CharacterConverter",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "antlr.ParseTreeRule",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.base.Present",
      "org.antlr.v4.runtime.ParserRuleContext",
      "org.antlr.v4.runtime.tree.ErrorNode",
      "org.antlr.v4.runtime.dfa.DFAState",
      "com.google.common.collect.ImmutableMultimap$2",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$BrTagContext",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$PTagStartContext",
      "com.google.common.collect.ImmutableSet$Builder",
      "org.antlr.v4.runtime.atn.LexerActionType",
      "com.google.common.collect.UsingToStringOrdering",
      "com.puppycrawl.tools.checkstyle.api.MessageDispatcher",
      "org.antlr.v4.runtime.tree.ParseTree",
      "com.google.common.collect.JdkBackedImmutableSet",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePatternMatcher$CannotInvokeStartRule",
      "com.puppycrawl.tools.checkstyle.api.Contextualizable",
      "org.apache.commons.beanutils.BeanUtilsBean",
      "com.google.common.collect.RegularImmutableBiMap$Inverse$InverseEntrySet",
      "org.antlr.v4.runtime.dfa.DFAState$PredPrediction",
      "com.puppycrawl.tools.checkstyle.TreeWalker",
      "com.puppycrawl.tools.checkstyle.api.AuditListener",
      "org.antlr.v4.runtime.tree.ParseTreeVisitor",
      "org.antlr.v4.runtime.Lexer",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TfootTagEndContext",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.puppycrawl.tools.checkstyle.api.FileSetCheck",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.puppycrawl.tools.checkstyle.TreeWalkerFilter",
      "org.antlr.v4.runtime.atn.SingletonPredictionContext",
      "org.antlr.v4.runtime.atn.StarBlockStartState",
      "org.apache.commons.beanutils.converters.FloatConverter",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$WrongSingletonTagContext",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.CollectPreconditions",
      "com.puppycrawl.tools.checkstyle.api.ExternalResourceHolder",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$BodyContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HeadTagStartContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$TdContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HtmlContext",
      "org.antlr.v4.runtime.misc.DoubleKeyMap",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.google.common.collect.ImmutableMap$1",
      "org.antlr.v4.runtime.misc.ParseCancellationException",
      "org.apache.commons.beanutils.ConversionException",
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean$1",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ImgTagContext",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableBiMapEntry",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.ImmutableBiMap",
      "org.antlr.v4.runtime.atn.ParseInfo",
      "org.antlr.v4.runtime.misc.ObjectEqualityComparator",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$LiTagEndContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$BodyTagEndContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$ReferenceContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$HeadTagEndContext",
      "org.antlr.v4.runtime.tree.pattern.ParseTreePattern",
      "org.apache.commons.beanutils.converters.IntegerConverter",
      "org.apache.commons.beanutils.expression.DefaultResolver",
      "org.antlr.v4.runtime.atn.RuleStopState",
      "com.puppycrawl.tools.checkstyle.api.Configuration",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.grammars.javadoc.JavadocParser$JavadocContext",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JavadocParagraphCheck_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.api.AutomaticBean",
      "com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.AbstractJavadocCheck",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocParagraphCheck",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "com.puppycrawl.tools.checkstyle.api.JavadocTokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.JavadocUtils",
      "com.puppycrawl.tools.checkstyle.api.SeverityLevel",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl",
      "com.puppycrawl.tools.checkstyle.api.AbstractCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.api.FileText",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.checks.javadoc.AbstractJavadocCheck$FileContext",
      "com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser",
      "com.puppycrawl.tools.checkstyle.DefaultConfiguration",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.RegularImmutableMap",
      "com.puppycrawl.tools.checkstyle.ThreadModeSettings",
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
      "org.apache.commons.beanutils.PropertyUtils",
      "org.apache.commons.beanutils.DefaultIntrospectionContext",
      "org.apache.commons.beanutils.MethodUtils",
      "org.apache.commons.beanutils.MethodUtils$MethodDescriptor",
      "org.apache.commons.beanutils.BeanIntrospectionData",
      "org.apache.commons.collections.FastHashMap",
      "org.apache.commons.beanutils.MappedPropertyDescriptor",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
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
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Iterators$9",
      "antlr.Token",
      "com.puppycrawl.tools.checkstyle.api.FileContents",
      "antlr.ParseTree",
      "antlr.ParseTreeRule",
      "antlr.ASTNULLType",
      "antlr.collections.impl.Vector",
      "antlr.collections.impl.ASTEnumerator",
      "antlr.collections.impl.VectorEnumerator",
      "com.puppycrawl.tools.checkstyle.api.LocalizedMessage$Utf8Control",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.CollectPreconditions",
      "com.puppycrawl.tools.checkstyle.api.LineColumn",
      "antlr.ParseTreeToken"
    );
  }
}