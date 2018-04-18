/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 13:44:05 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.xpath;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RootNode_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.puppycrawl.tools.checkstyle.xpath.RootNode"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RootNode_ESTest_scaffolding.class.getClassLoader() ,
      "antlr.collections.AST",
      "net.sf.saxon.value.Closure",
      "net.sf.saxon.om.NamePool$NamePoolLimitException",
      "net.sf.saxon.functions.registry.XSLT30FunctionSet",
      "net.sf.saxon.expr.instruct.GlobalParameterSet",
      "net.sf.saxon.lib.Numberer",
      "net.sf.saxon.om.ZeroOrOne",
      "net.sf.saxon.trans.CompilerInfo",
      "net.sf.saxon.om.IdentityComparable",
      "net.sf.saxon.serialize.XHTML5Emitter",
      "net.sf.saxon.type.ItemType",
      "net.sf.saxon.om.NamePool",
      "net.sf.saxon.dom.DOMObjectModel$3",
      "net.sf.saxon.resource.UnparsedTextResource",
      "net.sf.saxon.dom.DOMObjectModel$4",
      "net.sf.saxon.dom.DOMObjectModel$1",
      "net.sf.saxon.dom.DOMObjectModel$2",
      "net.sf.saxon.lib.StandardOutputResolver",
      "net.sf.saxon.dom.DOMObjectModel$7",
      "net.sf.saxon.tree.iter.SingleNodeIterator",
      "net.sf.saxon.dom.DOMObjectModel$5",
      "net.sf.saxon.type.Converter",
      "net.sf.saxon.dom.DOMObjectModel$6",
      "net.sf.saxon.query.XQueryParser",
      "com.puppycrawl.tools.checkstyle.xpath.RootNode",
      "net.sf.saxon.resource.XmlResource",
      "net.sf.saxon.om.NamespaceBinding",
      "net.sf.saxon.expr.sort.AtomicMatchKey",
      "net.sf.saxon.expr.parser.Location",
      "net.sf.saxon.type.ItemType$WithSequenceTypeCache",
      "net.sf.saxon.value.StringToDouble11",
      "net.sf.saxon.lib.StaticQueryContextFactory",
      "net.sf.saxon.expr.AtomicSequenceConverter",
      "net.sf.saxon.value.EmptySequence",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "net.sf.saxon.event.Receiver",
      "net.sf.saxon.lib.StandardEntityResolver",
      "net.sf.saxon.type.PlainType",
      "net.sf.saxon.om.TreeModel$TinyTree",
      "net.sf.saxon.trans.DynamicLoader",
      "net.sf.saxon.lib.ExternalObjectModel",
      "antlr.Token",
      "com.puppycrawl.tools.checkstyle.xpath.AttributeNode",
      "net.sf.saxon.expr.compat.GeneralComparison10",
      "net.sf.saxon.pattern.NodeTest",
      "net.sf.saxon.expr.ArithmeticExpression",
      "net.sf.saxon.lib.EnvironmentVariableResolver",
      "net.sf.saxon.resource.StandardCollectionFinder",
      "net.sf.saxon.om.Sequence",
      "net.sf.saxon.tree.iter.AtomicIterator",
      "net.sf.saxon.query.Annotation",
      "net.sf.saxon.tree.iter.UnfailingIterator",
      "net.sf.saxon.expr.compat.TypeChecker10",
      "net.sf.saxon.dom.DOMWriter",
      "net.sf.saxon.serialize.HTML40Emitter",
      "net.sf.saxon.expr.Literal",
      "net.sf.saxon.event.ProxyReceiver",
      "net.sf.saxon.event.TreeReceiver",
      "net.sf.saxon.om.TreeModel$TinyTreeCondensed",
      "net.sf.saxon.lib.OutputURIResolver",
      "net.sf.saxon.serialize.HTMLURIEscaper",
      "net.sf.saxon.tree.iter.ArrayIterator$OfNodes",
      "com.puppycrawl.tools.checkstyle.xpath.AbstractNode",
      "net.sf.saxon.dom.DOMEnvelope$3",
      "net.sf.saxon.dom.DOMEnvelope$1",
      "antlr.BaseAST",
      "net.sf.saxon.dom.DOMEnvelope$2",
      "net.sf.saxon.lib.Resource",
      "net.sf.saxon.expr.BinaryExpression",
      "net.sf.saxon.expr.ErrorExpression",
      "net.sf.saxon.serialize.TEXTEmitter",
      "net.sf.saxon.dom.DOMObjectModel",
      "net.sf.saxon.Platform",
      "net.sf.saxon.expr.FunctionCall",
      "net.sf.saxon.functions.registry.XPath31FunctionSet",
      "net.sf.saxon.event.ComplexContentOutputter",
      "net.sf.saxon.om.NamespaceBindingSet",
      "net.sf.saxon.tree.linked.LinkedTreeBuilder",
      "net.sf.saxon.expr.parser.XPathParser",
      "net.sf.saxon.lib.UnfailingErrorListener",
      "net.sf.saxon.serialize.HTMLEmitter",
      "net.sf.saxon.expr.UntypedSequenceConverter",
      "net.sf.saxon.tree.util.Navigator$DescendantEnumeration",
      "net.sf.saxon.lib.CollectionFinder",
      "net.sf.saxon.Version",
      "net.sf.saxon.trans.XPathException",
      "net.sf.saxon.type.SimpleType",
      "net.sf.saxon.tree.iter.LookaheadIterator",
      "net.sf.saxon.event.SequenceReceiver",
      "net.sf.saxon.resource.JSONResource$1",
      "net.sf.saxon.om.AtomicSequence",
      "net.sf.saxon.serialize.HTML50Emitter",
      "net.sf.saxon.event.FilterFactory",
      "net.sf.saxon.serialize.XML10ContentChecker",
      "net.sf.saxon.pattern.PatternParser",
      "net.sf.saxon.expr.ContextOriginator",
      "net.sf.saxon.lib.ParseOptions",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "net.sf.saxon.expr.Callable",
      "net.sf.saxon.tree.iter.EmptyIterator",
      "net.sf.saxon.serialize.UnicodeNormalizer",
      "net.sf.saxon.om.NotationSet",
      "net.sf.saxon.resource.UnparsedTextResource$1",
      "net.sf.saxon.om.GenericTreeInfo",
      "net.sf.saxon.serialize.JSONEmitter",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "net.sf.saxon.tree.iter.EmptyIterator$OfNodes",
      "net.sf.saxon.tree.iter.ArrayIterator",
      "net.sf.saxon.om.AtomizedValueIterator",
      "net.sf.saxon.trans.LicenseException",
      "net.sf.saxon.functions.FunctionLibrary",
      "net.sf.saxon.lib.StandardURIResolver",
      "net.sf.saxon.type.Converter$PromoterToDouble",
      "net.sf.saxon.expr.GeneralComparison",
      "net.sf.saxon.type.Converter$PromoterToFloat",
      "antlr.CommonAST",
      "net.sf.saxon.om.NamespaceResolver",
      "net.sf.saxon.serialize.XHTML1Emitter",
      "net.sf.saxon.lib.StandardModuleURIResolver",
      "net.sf.saxon.type.StringToDouble",
      "net.sf.saxon.serialize.MessageEmitter",
      "net.sf.saxon.lib.UnparsedTextURIResolver",
      "net.sf.saxon.expr.PJConverter",
      "antlr.collections.ASTEnumeration",
      "net.sf.saxon.expr.StaticContext",
      "net.sf.saxon.lib.SerializerFactory",
      "net.sf.saxon.functions.IntegratedFunctionLibrary",
      "net.sf.saxon.java.JavaPlatform",
      "net.sf.saxon.serialize.XMLIndenter",
      "net.sf.saxon.lib.URIChecker",
      "net.sf.saxon.event.SequenceNormalizer",
      "net.sf.saxon.serialize.CharacterMapExpander",
      "antlr.collections.impl.Vector",
      "net.sf.saxon.type.AtomicType",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler",
      "net.sf.saxon.expr.Expression",
      "net.sf.saxon.expr.ItemChecker",
      "net.sf.saxon.om.QNameException",
      "net.sf.saxon.tree.util.Navigator",
      "net.sf.saxon.expr.GeneralComparison20",
      "net.sf.saxon.resource.BinaryResource$1",
      "net.sf.saxon.lib.StandardCollationURIResolver",
      "net.sf.saxon.expr.UnaryExpression",
      "net.sf.saxon.resource.BinaryResource",
      "net.sf.saxon.tree.iter.AxisIterator",
      "net.sf.saxon.lib.CollationURIResolver",
      "net.sf.saxon.tree.iter.ReversibleIterator",
      "net.sf.saxon.tree.util.Navigator$FollowingEnumeration",
      "net.sf.saxon.lib.ResourceFactory",
      "net.sf.saxon.om.TreeInfo",
      "net.sf.saxon.expr.parser.OptimizerOptions",
      "net.sf.saxon.event.Builder",
      "net.sf.saxon.tree.tiny.AppendableCharSequence",
      "net.sf.saxon.expr.JPConverter",
      "net.sf.saxon.om.GroundedValue",
      "net.sf.saxon.om.StructuredQName",
      "net.sf.saxon.type.StringConverter",
      "net.sf.saxon.tree.iter.EmptyIterator$OfAtomic",
      "net.sf.saxon.trans.NonDelegatingURIResolver",
      "net.sf.saxon.lib.Logger",
      "net.sf.saxon.serialize.XMLEmitter",
      "net.sf.saxon.serialize.CDATAFilter",
      "net.sf.saxon.resource.XmlResource$1",
      "net.sf.saxon.lib.StringCollator",
      "net.sf.saxon.expr.XPathContext",
      "net.sf.saxon.lib.SourceResolver",
      "net.sf.saxon.om.One",
      "net.sf.saxon.tree.util.Navigator$PrecedingEnumeration",
      "net.sf.saxon.functions.IntegratedFunctionCall",
      "net.sf.saxon.lib.ResourceCollection",
      "net.sf.saxon.type.SchemaComponent",
      "net.sf.saxon.om.TreeModel",
      "net.sf.saxon.dom.DOMEnvelope",
      "net.sf.saxon.Configuration",
      "net.sf.saxon.expr.parser.TypeChecker",
      "net.sf.saxon.tree.util.FastStringBuffer",
      "net.sf.saxon.tree.tiny.TinyBuilder",
      "net.sf.saxon.trans.packages.PackageLibrary",
      "net.sf.saxon.serialize.XHTMLURIEscaper",
      "net.sf.saxon.Configuration$1",
      "net.sf.saxon.lib.StandardEnvironmentVariableResolver",
      "net.sf.saxon.om.TreeModel$LinkedTree",
      "net.sf.saxon.pattern.PatternParser30",
      "net.sf.saxon.value.MemoClosure",
      "net.sf.saxon.lib.XQueryFunctionAnnotationHandler$DisallowedCombination",
      "net.sf.saxon.type.SchemaType",
      "net.sf.saxon.om.SpaceStrippingRule",
      "net.sf.saxon.serialize.HTMLIndenter",
      "net.sf.saxon.expr.ComparisonExpression",
      "net.sf.saxon.om.Item",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "antlr.CommonToken",
      "net.sf.saxon.regex.RegularExpression",
      "net.sf.saxon.tree.tiny.TinyBuilderCondensed",
      "net.sf.saxon.event.SequenceWriter",
      "net.sf.saxon.lib.TraceListener",
      "com.puppycrawl.tools.checkstyle.api.CheckstyleException",
      "net.sf.saxon.lib.ModuleURIResolver",
      "net.sf.saxon.serialize.UncommittedSerializer",
      "net.sf.saxon.expr.parser.CodeInjector",
      "net.sf.saxon.functions.registry.UseWhen30FunctionSet",
      "net.sf.saxon.tree.util.DocumentNumberAllocator",
      "net.sf.saxon.om.SequenceIterator",
      "net.sf.saxon.lib.StandardUnparsedTextResolver",
      "net.sf.saxon.lib.FunctionAnnotationHandler",
      "com.puppycrawl.tools.checkstyle.xpath.ElementNode",
      "net.sf.saxon.om.DocumentPool",
      "net.sf.saxon.om.NodeInfo",
      "net.sf.saxon.event.NamespaceReducer",
      "net.sf.saxon.expr.LastPositionFinder",
      "antlr.CommonHiddenStreamToken",
      "net.sf.saxon.lib.StandardLogger",
      "net.sf.saxon.type.BuiltInAtomicType",
      "net.sf.saxon.serialize.Emitter",
      "net.sf.saxon.tree.iter.AxisIteratorImpl",
      "net.sf.saxon.expr.compat.ArithmeticExpression10",
      "net.sf.saxon.z.IntPredicate",
      "net.sf.saxon.serialize.AdaptiveEmitter",
      "net.sf.saxon.tree.iter.GroundedIterator",
      "net.sf.saxon.resource.JSONResource",
      "net.sf.saxon.functions.registry.BuiltInFunctionSet"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RootNode_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.puppycrawl.tools.checkstyle.xpath.AbstractNode",
      "com.puppycrawl.tools.checkstyle.xpath.RootNode",
      "net.sf.saxon.Configuration",
      "net.sf.saxon.tree.iter.EmptyIterator",
      "net.sf.saxon.tree.iter.EmptyIterator$OfNodes",
      "antlr.BaseAST",
      "antlr.CommonAST",
      "antlr.CommonASTWithHiddenTokens",
      "com.puppycrawl.tools.checkstyle.api.DetailAST",
      "com.puppycrawl.tools.checkstyle.xpath.AttributeNode",
      "net.sf.saxon.om.GenericTreeInfo",
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
      "net.sf.saxon.tree.util.FastStringBuffer",
      "net.sf.saxon.om.NamespaceBinding",
      "net.sf.saxon.om.NoNamespaceName",
      "net.sf.saxon.pattern.NodeTest",
      "net.sf.saxon.type.ErrorType",
      "com.puppycrawl.tools.checkstyle.xpath.ElementNode",
      "com.puppycrawl.tools.checkstyle.api.TokenTypes",
      "com.puppycrawl.tools.checkstyle.utils.CommonUtils",
      "com.puppycrawl.tools.checkstyle.utils.TokenUtils",
      "net.sf.saxon.tree.linked.NodeImpl",
      "net.sf.saxon.tree.linked.ParentNodeImpl",
      "net.sf.saxon.tree.linked.ElementImpl",
      "net.sf.saxon.style.StyleElement",
      "net.sf.saxon.style.XSLBreakOrContinue",
      "net.sf.saxon.style.XSLBreak",
      "net.sf.saxon.type.Untyped",
      "antlr.ASTNULLType",
      "antlr.collections.impl.Vector",
      "antlr.collections.impl.ASTEnumerator",
      "antlr.collections.impl.VectorEnumerator",
      "net.sf.saxon.expr.number.AbstractNumberer",
      "antlr.ParseTree",
      "antlr.ParseTreeToken",
      "net.sf.saxon.trans.ConfigurationReader",
      "net.sf.saxon.event.ContentHandlerProxy",
      "net.sf.saxon.trans.ConfigurationReader$1",
      "net.sf.saxon.expr.parser.ExplicitLocation",
      "antlr.Token",
      "net.sf.saxon.expr.instruct.UserFunctionParameter",
      "net.sf.saxon.trans.FunctionStreamability",
      "net.sf.saxon.style.XSLNamespaceAlias",
      "net.sf.saxon.om.FingerprintedQName",
      "net.sf.saxon.expr.instruct.Actor",
      "net.sf.saxon.expr.instruct.AttributeSet",
      "net.sf.saxon.event.PipelineConfiguration",
      "net.sf.saxon.event.Builder",
      "net.sf.saxon.dom.DOMWriter",
      "net.sf.saxon.tree.linked.TextImpl",
      "net.sf.saxon.style.TextValueTemplateNode",
      "net.sf.saxon.om.AllElementsSpaceStrippingRule",
      "net.sf.saxon.expr.MonoIterator",
      "net.sf.saxon.trace.ExpressionPresenter",
      "net.sf.saxon.style.XSLResultDocument",
      "net.sf.saxon.tree.iter.AxisIteratorImpl",
      "net.sf.saxon.tree.util.Navigator$DescendantEnumeration",
      "net.sf.saxon.type.PrimitiveUType",
      "net.sf.saxon.type.UType",
      "net.sf.saxon.pattern.NodeKindTest",
      "net.sf.saxon.om.AbstractItem",
      "net.sf.saxon.value.QualifiedNameValue",
      "net.sf.saxon.value.QNameValue",
      "net.sf.saxon.type.AnySimpleType",
      "net.sf.saxon.pattern.AnyNodeTest",
      "net.sf.saxon.type.AnyItemType",
      "net.sf.saxon.type.Type",
      "net.sf.saxon.z.IntHashMap",
      "net.sf.saxon.type.AnyType",
      "net.sf.saxon.type.NumericType",
      "net.sf.saxon.type.BuiltInType",
      "net.sf.saxon.om.StandardNames",
      "net.sf.saxon.type.BuiltInAtomicType",
      "net.sf.saxon.value.AtomicValue",
      "net.sf.saxon.value.NumericValue",
      "net.sf.saxon.value.DoubleValue",
      "net.sf.saxon.value.FloatingPointConverter",
      "net.sf.saxon.tree.NamespaceNode",
      "net.sf.saxon.style.XSLMode",
      "net.sf.saxon.trans.TextOnlyCopyRuleSet",
      "net.sf.saxon.value.Whitespace",
      "net.sf.saxon.trans.Mode",
      "antlr.ParseTreeRule",
      "net.sf.saxon.style.XSLOutput",
      "net.sf.saxon.tree.tiny.Statistics",
      "net.sf.saxon.tree.tiny.TinyTree",
      "net.sf.saxon.om.PrefixPool",
      "net.sf.saxon.tree.tiny.TinyNodeImpl",
      "net.sf.saxon.tree.tiny.TinyTextImpl",
      "net.sf.saxon.pattern.MultipleNodeKindTest",
      "net.sf.saxon.expr.accum.Accumulator",
      "net.sf.saxon.trans.SimpleMode",
      "net.sf.saxon.trans.rules.RuleChain",
      "net.sf.saxon.value.DecimalValue",
      "net.sf.saxon.value.Int64Value",
      "net.sf.saxon.value.IntegerValue",
      "net.sf.saxon.value.BigIntegerValue",
      "net.sf.saxon.functions.AbstractFunction",
      "net.sf.saxon.functions.SystemFunction",
      "net.sf.saxon.functions.FormatNumber",
      "net.sf.saxon.value.BigDecimalValue",
      "net.sf.saxon.expr.Expression",
      "net.sf.saxon.expr.Literal",
      "net.sf.saxon.value.EmptySequence",
      "net.sf.saxon.pattern.ContentTypeTest",
      "net.sf.saxon.pattern.CombinedNodeTest",
      "net.sf.saxon.tree.util.Navigator$AxisFilter",
      "net.sf.saxon.expr.PackageData",
      "net.sf.saxon.expr.instruct.SlotManager",
      "net.sf.saxon.expr.EarlyEvaluationContext",
      "net.sf.saxon.expr.instruct.WithParam",
      "net.sf.saxon.tree.iter.SingleNodeIterator",
      "net.sf.saxon.style.XSLGlobalVariable",
      "net.sf.saxon.style.SourceBinding",
      "net.sf.saxon.functions.Substring",
      "net.sf.saxon.style.XSLModuleRoot",
      "net.sf.saxon.style.XSLStylesheet",
      "net.sf.saxon.style.XSLSequence",
      "net.sf.saxon.style.XSLOnEmpty",
      "net.sf.saxon.style.XSLGlobalParam",
      "net.sf.saxon.regex.UnicodeString",
      "net.sf.saxon.regex.LatinString",
      "net.sf.saxon.value.StringValue",
      "net.sf.saxon.z.IntToIntArrayMap",
      "net.sf.saxon.functions.Translate",
      "net.sf.saxon.style.XSLLeafNodeConstructor",
      "net.sf.saxon.style.XSLValueOf",
      "net.sf.saxon.style.XSLMatchingSubstring",
      "net.sf.saxon.style.XSLUsePackage",
      "net.sf.saxon.om.IgnorableSpaceStrippingRule",
      "net.sf.saxon.event.SequenceReceiver",
      "net.sf.saxon.event.ProxyReceiver",
      "net.sf.saxon.event.CheckSumFilter",
      "net.sf.saxon.tree.tiny.TinyParentNodeImpl",
      "net.sf.saxon.tree.tiny.TinyDocumentImpl",
      "net.sf.saxon.style.XSLSortOrMergeKey",
      "net.sf.saxon.style.XSLSort",
      "net.sf.saxon.expr.flwor.Clause",
      "net.sf.saxon.expr.flwor.CountClause",
      "net.sf.saxon.z.IntValuePredicate",
      "net.sf.saxon.functions.CodepointsToString",
      "net.sf.saxon.expr.PseudoExpression",
      "net.sf.saxon.pattern.Pattern",
      "net.sf.saxon.pattern.SimplePositionalPattern",
      "net.sf.saxon.pattern.NodeTestPattern",
      "net.sf.saxon.z.AbstractIntSet",
      "net.sf.saxon.z.IntHashSet",
      "net.sf.saxon.z.IntHashSet$IntHashSetIterator",
      "net.sf.saxon.value.CalendarValue",
      "net.sf.saxon.value.TimeValue",
      "net.sf.saxon.value.DateTimeValue",
      "net.sf.saxon.value.GDateValue",
      "net.sf.saxon.value.DateValue",
      "net.sf.saxon.style.XSLOverride",
      "net.sf.saxon.style.XSLGeneralVariable",
      "net.sf.saxon.style.XSLLocalParam",
      "net.sf.saxon.style.AbsentExtensionElement",
      "net.sf.saxon.style.XSLOnNonEmpty",
      "net.sf.saxon.style.LiteralResultElement",
      "net.sf.saxon.tree.tiny.TinyAttributeImpl",
      "net.sf.saxon.type.AnyFunctionType",
      "net.sf.saxon.value.SequenceType",
      "net.sf.saxon.ma.map.MapType",
      "net.sf.saxon.ma.map.HashTrieMap",
      "net.sf.saxon.ma.trie.ImmutableHashTrieMap$EmptyHashNode",
      "net.sf.saxon.ma.trie.ImmutableHashTrieMap",
      "net.sf.saxon.expr.sort.CodepointCollator",
      "net.sf.saxon.style.XSLMergeSource",
      "net.sf.saxon.style.XSLAcceptExpose",
      "net.sf.saxon.style.XSLExpose",
      "net.sf.saxon.style.XSLIf",
      "net.sf.saxon.style.ExpressionContext",
      "net.sf.saxon.style.XSLNumber",
      "net.sf.saxon.style.StylesheetModule",
      "net.sf.saxon.functions.UnparsedTextFunction",
      "net.sf.saxon.functions.UnparsedTextLines",
      "net.sf.saxon.functions.ResolveURI",
      "net.sf.saxon.trans.XPathException",
      "net.sf.saxon.tree.tiny.TinyBuilder",
      "net.sf.saxon.tree.tiny.TinyBuilderCondensed",
      "net.sf.saxon.style.XSLComment",
      "net.sf.saxon.style.XSLMessage",
      "net.sf.saxon.style.XSLAccept",
      "net.sf.saxon.event.PathMaintainer",
      "net.sf.saxon.style.XSLIterate",
      "net.sf.saxon.type.StringConverter$IdentityConverter",
      "net.sf.saxon.type.Converter$ToUntypedAtomicConverter",
      "net.sf.saxon.type.Converter$ToStringConverter",
      "net.sf.saxon.type.Converter$NumericToFloat",
      "net.sf.saxon.type.Converter$BooleanToFloat",
      "net.sf.saxon.type.Converter$NumericToDouble",
      "net.sf.saxon.type.Converter$BooleanToDouble",
      "net.sf.saxon.type.Converter$DoubleToDecimal",
      "net.sf.saxon.type.Converter$FloatToDecimal",
      "net.sf.saxon.type.Converter$IntegerToDecimal",
      "net.sf.saxon.type.Converter$NumericToDecimal",
      "net.sf.saxon.type.Converter$BooleanToDecimal",
      "net.sf.saxon.type.Converter$DoubleToInteger",
      "net.sf.saxon.type.Converter$FloatToInteger",
      "net.sf.saxon.type.Converter$DecimalToInteger",
      "net.sf.saxon.type.Converter$NumericToInteger",
      "net.sf.saxon.type.Converter$BooleanToInteger",
      "net.sf.saxon.type.Converter$DurationToDayTimeDuration",
      "net.sf.saxon.type.Converter$DurationToYearMonthDuration",
      "net.sf.saxon.type.Converter$DateToDateTime",
      "net.sf.saxon.type.Converter$DateTimeToDate",
      "net.sf.saxon.type.Converter$DateTimeToGMonth",
      "net.sf.saxon.type.Converter$DateTimeToGYearMonth",
      "net.sf.saxon.type.Converter$DateTimeToGYear",
      "net.sf.saxon.type.Converter$DateTimeToGMonthDay",
      "net.sf.saxon.type.Converter$DateTimeToGDay",
      "net.sf.saxon.type.Converter$DateTimeToTime",
      "net.sf.saxon.type.Converter$NumericToBoolean",
      "net.sf.saxon.type.Converter$Base64BinaryToHexBinary",
      "net.sf.saxon.type.Converter$HexBinaryToBase64Binary",
      "net.sf.saxon.type.Converter$NotationToQName",
      "net.sf.saxon.type.Converter$QNameToNotation",
      "net.sf.saxon.type.Converter",
      "net.sf.saxon.type.StringConverter$StringToString",
      "net.sf.saxon.type.StringConverter$StringToLanguage",
      "net.sf.saxon.type.StringConverter$StringToNormalizedString",
      "net.sf.saxon.type.StringConverter$StringToNCName",
      "net.sf.saxon.type.StringConverter$StringToName",
      "net.sf.saxon.type.StringConverter$StringToNMTOKEN",
      "net.sf.saxon.type.StringConverter$StringToToken",
      "net.sf.saxon.type.StringConverter$StringToDecimal",
      "net.sf.saxon.type.StringConverter$StringToInteger",
      "net.sf.saxon.type.StringConverter$StringToGMonth",
      "net.sf.saxon.type.StringConverter$StringToGMonthDay",
      "net.sf.saxon.type.StringConverter$StringToGDay",
      "net.sf.saxon.type.StringConverter$StringToDuration",
      "net.sf.saxon.type.StringConverter$StringToDayTimeDuration",
      "net.sf.saxon.type.StringConverter$StringToYearMonthDuration",
      "net.sf.saxon.type.StringConverter$StringToTime",
      "net.sf.saxon.type.StringConverter$StringToBoolean",
      "net.sf.saxon.type.StringConverter$StringToHexBinary",
      "net.sf.saxon.type.Converter$StringToBase64BinaryConverter",
      "net.sf.saxon.type.StringConverter$StringToUntypedAtomic",
      "net.sf.saxon.type.StringConverter$StringToIntegerSubtype",
      "net.sf.saxon.type.StringConverter",
      "net.sf.saxon.value.DurationValue",
      "net.sf.saxon.value.DayTimeDurationValue",
      "net.sf.saxon.style.XSLKey$ContainsGlobalVariable",
      "net.sf.saxon.style.XSLKey",
      "net.sf.saxon.style.XSLImportSchema",
      "net.sf.saxon.style.XSLAccumulator",
      "net.sf.saxon.style.XSLGeneralIncorporate",
      "net.sf.saxon.style.XSLImport",
      "net.sf.saxon.tree.linked.DocumentImpl",
      "net.sf.saxon.tree.linked.SystemIdMap",
      "net.sf.saxon.event.TransformerReceiver",
      "net.sf.saxon.style.XSLWithParam",
      "net.sf.saxon.style.XSLMergeAction",
      "net.sf.saxon.style.XSLNextIteration",
      "net.sf.saxon.om.EmptyAtomicSequence",
      "net.sf.saxon.om.NameChecker",
      "net.sf.saxon.serialize.charcode.UTF16CharacterSet",
      "net.sf.saxon.serialize.charcode.XMLCharacterData",
      "net.sf.saxon.om.QNameException",
      "net.sf.saxon.trans.Err",
      "net.sf.saxon.style.XSLAnalyzeString",
      "net.sf.saxon.style.XSLNamespace",
      "net.sf.saxon.style.XSLApplyTemplates",
      "net.sf.saxon.style.XSLFallback",
      "net.sf.saxon.style.XSLPreserveSpace",
      "net.sf.saxon.style.XSLEvaluate",
      "net.sf.saxon.style.XSLSourceDocument",
      "net.sf.saxon.event.SequenceWriter",
      "net.sf.saxon.event.SequenceOutputter",
      "net.sf.saxon.style.XSLCallTemplate",
      "net.sf.saxon.om.InscopeNamespaceResolver",
      "net.sf.saxon.om.ZeroOrOne",
      "net.sf.saxon.om.One",
      "net.sf.saxon.functions.ScalarSystemFunction",
      "net.sf.saxon.functions.EncodeForUri",
      "net.sf.saxon.value.FloatValue",
      "net.sf.saxon.style.XSLDecimalFormat",
      "net.sf.saxon.style.XSLDocument",
      "net.sf.saxon.dom.NodeOverNodeInfo",
      "net.sf.saxon.dom.AttrOverNodeInfo",
      "net.sf.saxon.dom.DocumentWrapper",
      "net.sf.saxon.style.XSLCopyOf",
      "net.sf.saxon.style.XSLTry",
      "net.sf.saxon.style.XSLMap",
      "net.sf.saxon.functions.GenerateId_1",
      "net.sf.saxon.style.XSLForEach",
      "net.sf.saxon.style.XSLFork",
      "net.sf.saxon.tree.tiny.TinyElementImpl",
      "net.sf.saxon.tree.iter.ArrayIterator",
      "net.sf.saxon.tree.iter.ArrayIterator$OfNodes",
      "net.sf.saxon.style.XSLAttributeSet",
      "net.sf.saxon.tree.util.AttributeCollectionImpl",
      "net.sf.saxon.style.XSLCopy",
      "net.sf.saxon.style.XSLPackage",
      "net.sf.saxon.style.PrincipalStylesheetModule",
      "net.sf.saxon.style.PackageVersion",
      "net.sf.saxon.style.XSLPerformSort",
      "net.sf.saxon.z.IntUniversalSet",
      "net.sf.saxon.style.XSLApplyImports",
      "net.sf.saxon.tree.tiny.CharSlice",
      "net.sf.saxon.style.XSLOnCompletion",
      "net.sf.saxon.style.XSLMapEntry",
      "net.sf.saxon.style.XSLMerge",
      "net.sf.saxon.om.CodedName",
      "net.sf.saxon.value.NestedIntegerValue",
      "net.sf.saxon.expr.instruct.Instruction",
      "net.sf.saxon.expr.instruct.SimpleNodeConstructor",
      "net.sf.saxon.expr.instruct.AttributeCreator",
      "net.sf.saxon.expr.instruct.FixedAttribute",
      "net.sf.saxon.expr.Operand",
      "net.sf.saxon.expr.OperandUsage",
      "net.sf.saxon.expr.OperandRole",
      "net.sf.saxon.expr.parser.ExpressionTool",
      "net.sf.saxon.tree.util.Orphan",
      "net.sf.saxon.expr.Assignation",
      "net.sf.saxon.expr.ForExpression",
      "net.sf.saxon.pattern.NameTest",
      "net.sf.saxon.pattern.AnyChildNodeTest",
      "net.sf.saxon.expr.instruct.Executable",
      "net.sf.saxon.Controller",
      "net.sf.saxon.event.Stripper$StripRuleTarget",
      "net.sf.saxon.event.Stripper$1",
      "net.sf.saxon.event.Stripper$2",
      "net.sf.saxon.event.Stripper",
      "net.sf.saxon.style.XSLCatch",
      "net.sf.saxon.pattern.NodeKindTest$2",
      "net.sf.saxon.functions.SnapshotFn",
      "net.sf.saxon.regex.REMatcher",
      "net.sf.saxon.regex.History",
      "net.sf.saxon.regex.REMatcher$State",
      "net.sf.saxon.style.XSLText",
      "net.sf.saxon.expr.UnionConstructorFunction",
      "net.sf.saxon.expr.UnionCastableFunction",
      "net.sf.saxon.value.HexBinaryValue",
      "net.sf.saxon.trans.NoDynamicContextException",
      "net.sf.saxon.style.XSLCharacterMap",
      "net.sf.saxon.style.XSLOutputCharacter",
      "net.sf.saxon.expr.XPathContextMinor",
      "net.sf.saxon.expr.XPathContextMajor",
      "net.sf.saxon.value.YearMonthDurationValue",
      "net.sf.saxon.style.XSLProcessingInstruction",
      "net.sf.saxon.tree.linked.AttributeImpl",
      "net.sf.saxon.style.DataElement",
      "net.sf.saxon.om.ZeroOrMore",
      "net.sf.saxon.om.SequenceTool",
      "net.sf.saxon.tree.iter.ListIterator",
      "net.sf.saxon.type.ExternalObjectType",
      "net.sf.saxon.type.JavaExternalObjectType",
      "net.sf.saxon.style.XSLContextItem",
      "net.sf.saxon.pattern.SameNameTest",
      "net.sf.saxon.event.Sink",
      "net.sf.saxon.event.CommentStripper",
      "net.sf.saxon.style.TextValueTemplateContext",
      "net.sf.saxon.expr.instruct.ParentNodeConstructor",
      "net.sf.saxon.expr.instruct.DocumentInstr",
      "net.sf.saxon.expr.instruct.ElementCreator",
      "net.sf.saxon.expr.instruct.Copy",
      "net.sf.saxon.style.XSLWhen",
      "net.sf.saxon.style.Compilation",
      "net.sf.saxon.om.QNameParser"
    );
  }
}
