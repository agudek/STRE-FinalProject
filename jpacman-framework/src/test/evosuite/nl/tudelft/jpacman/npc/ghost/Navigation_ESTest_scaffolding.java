/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Thu Apr 12 10:47:59 GMT 2018
 */

package nl.tudelft.jpacman.npc.ghost;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Navigation_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "nl.tudelft.jpacman.npc.ghost.Navigation"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Navigation_ESTest_scaffolding.class.getClassLoader() ,
      "net.bytebuddy.dynamic.DynamicType",
      "net.bytebuddy.dynamic.DynamicType$Unloaded",
      "net.bytebuddy.description.TypeVariableSource$AbstractBase",
      "net.bytebuddy.description.type.TypeList$Generic",
      "net.bytebuddy.jar.asm.OpenedClassReader",
      "net.bytebuddy.matcher.EqualityMatcher",
      "net.bytebuddy.description.annotation.AnnotationList",
      "net.bytebuddy.ClassFileVersion$VersionExtractor",
      "net.bytebuddy.description.method.MethodList",
      "nl.tudelft.jpacman.board.Unit",
      "net.bytebuddy.dynamic.scaffold.TypeInitializer",
      "nl.tudelft.jpacman.level.Pellet",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple",
      "net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Dispatcher$CreationAction",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition",
      "net.bytebuddy.description.modifier.ModifierContributor$ForField",
      "net.bytebuddy.description.ModifierReviewable$ForFieldDescription",
      "net.bytebuddy.description.method.MethodDescription$SignatureToken",
      "net.bytebuddy.implementation.bytecode.ByteCodeAppender$Size",
      "net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Valuable",
      "net.bytebuddy.matcher.ElementMatcher$Junction$AbstractBase",
      "net.bytebuddy.dynamic.DynamicType$Builder$TypeVariableDefinition",
      "net.bytebuddy.description.method.MethodDescription$ForLoadedConstructor",
      "net.bytebuddy.description.modifier.MethodManifestation",
      "net.bytebuddy.description.ModifierReviewable",
      "net.bytebuddy.description.field.FieldDescription",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance",
      "net.bytebuddy.matcher.StringMatcher$Mode$1",
      "net.bytebuddy.matcher.StringMatcher$Mode$2",
      "net.bytebuddy.matcher.StringMatcher$Mode$3",
      "net.bytebuddy.description.method.ParameterList",
      "net.bytebuddy.matcher.StringMatcher$Mode$4",
      "net.bytebuddy.matcher.StringMatcher$Mode$5",
      "net.bytebuddy.matcher.StringMatcher$Mode$6",
      "net.bytebuddy.matcher.StringMatcher$Mode$7",
      "net.bytebuddy.matcher.StringMatcher$Mode$8",
      "net.bytebuddy.matcher.CollectionErasureMatcher",
      "net.bytebuddy.matcher.StringMatcher$Mode$9",
      "net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Dispatcher$ForJava8CapableVm",
      "net.bytebuddy.description.modifier.FieldPersistence",
      "net.bytebuddy.matcher.MethodParametersMatcher",
      "net.bytebuddy.description.enumeration.EnumerationDescription",
      "net.bytebuddy.description.annotation.AnnotationSource",
      "net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Dispatcher$ForJava8CapableVm",
      "net.bytebuddy.jar.asm.AnnotationVisitor",
      "net.bytebuddy.description.method.MethodDescription$InDefinedShape",
      "net.bytebuddy.jar.asm.TypePath",
      "net.bytebuddy.description.type.TypeDescription$Generic$Visitor",
      "net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition$Annotatable",
      "net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithEagerNavigation",
      "net.bytebuddy.implementation.LoadedTypeInitializer",
      "net.bytebuddy.jar.asm.Handle",
      "net.bytebuddy.description.modifier.Ownership",
      "net.bytebuddy.description.method.MethodList$Explicit",
      "net.bytebuddy.description.ByteCodeElement$Token$TokenList",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Annotatable",
      "nl.tudelft.jpacman.board.Square",
      "net.bytebuddy.description.ModifierReviewable$OfEnumeration",
      "net.bytebuddy.description.method.MethodDescription$InDefinedShape$AbstractBase",
      "net.bytebuddy.pool.TypePool",
      "net.bytebuddy.description.method.MethodDescription",
      "net.bytebuddy.implementation.attribute.TypeAttributeAppender",
      "nl.tudelft.jpacman.npc.ghost.Navigation$Node",
      "net.bytebuddy.description.type.TypeList",
      "net.bytebuddy.implementation.attribute.AnnotationValueFilter",
      "net.bytebuddy.description.method.MethodDescription$TypeToken",
      "net.bytebuddy.description.type.TypeList$Generic$ForLoadedTypes",
      "nl.tudelft.jpacman.sprite.EmptySprite",
      "net.bytebuddy.description.annotation.AnnotationValue$Loaded",
      "net.bytebuddy.implementation.attribute.FieldAttributeAppender",
      "net.bytebuddy.description.modifier.ModifierContributor",
      "net.bytebuddy.description.ModifierReviewable$ForTypeDefinition",
      "net.bytebuddy.description.annotation.AnnotationDescription$Loadable",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record",
      "net.bytebuddy.description.modifier.FieldManifestation",
      "net.bytebuddy.implementation.MethodAccessorFactory",
      "net.bytebuddy.jar.asm.ModuleVisitor",
      "net.bytebuddy.matcher.ElementMatcher$Junction",
      "net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Dispatcher$ForJava8CapableVm",
      "net.bytebuddy.description.method.ParameterDescription",
      "net.bytebuddy.description.ModifierReviewable$AbstractBase",
      "net.bytebuddy.description.type.TypeDescription",
      "net.bytebuddy.implementation.attribute.AnnotationValueFilter$Factory",
      "net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter",
      "net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional$Valuable",
      "net.bytebuddy.jar.asm.ClassReader",
      "net.bytebuddy.implementation.bytecode.ByteCodeAppender",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Simple$Annotatable",
      "net.bytebuddy.matcher.StringMatcher",
      "net.bytebuddy.implementation.bytecode.StackSize",
      "net.bytebuddy.description.ModifierReviewable$OfByteCodeElement",
      "net.bytebuddy.dynamic.scaffold.InstrumentedType$Prepareable",
      "net.bytebuddy.description.field.FieldDescription$SignatureToken",
      "net.bytebuddy.description.method.ParameterDescription$Token",
      "net.bytebuddy.description.modifier.ParameterManifestation",
      "net.bytebuddy.description.modifier.ModifierContributor$ForMethod",
      "net.bytebuddy.matcher.LatentMatcher",
      "net.bytebuddy.implementation.Implementation$Context",
      "net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$OfMethod",
      "net.bytebuddy.description.modifier.ModifierContributor$ForParameter",
      "net.bytebuddy.dynamic.TypeResolutionStrategy",
      "net.bytebuddy.implementation.auxiliary.AuxiliaryType",
      "net.bytebuddy.description.modifier.TypeManifestation",
      "net.bytebuddy.dynamic.loading.ClassLoadingStrategy",
      "net.bytebuddy.description.modifier.MethodStrictness",
      "net.bytebuddy.dynamic.TypeResolutionStrategy$Resolved",
      "net.bytebuddy.matcher.ElementMatcher",
      "net.bytebuddy.description.NamedElement$WithGenericName",
      "net.bytebuddy.implementation.HashCodeMethod",
      "net.bytebuddy.matcher.ErasureMatcher",
      "net.bytebuddy.pool.TypePool$Resolution",
      "net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Dispatcher",
      "net.bytebuddy.jar.asm.SymbolTable",
      "net.bytebuddy.description.type.TypeList$Generic$AbstractBase",
      "net.bytebuddy.description.modifier.SyntheticState",
      "net.bytebuddy.matcher.CollectionSizeMatcher",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$3",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$2",
      "net.bytebuddy.description.method.ParameterList$AbstractBase",
      "net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$ForLoadedReturnType",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$4",
      "net.bytebuddy.jar.asm.ClassVisitor",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper$1",
      "net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$Dispatcher",
      "net.bytebuddy.dynamic.scaffold.TypeWriter$MethodPool$Record$Sort",
      "net.bytebuddy.ClassFileVersion$VersionLocator$ForLegacyVm",
      "net.bytebuddy.description.type.TypeVariableToken",
      "net.bytebuddy.description.ModifierReviewable$ForMethodDescription",
      "net.bytebuddy.matcher.StringMatcher$Mode",
      "net.bytebuddy.description.annotation.AnnotationValue",
      "net.bytebuddy.dynamic.DynamicType$Builder",
      "net.bytebuddy.jar.asm.ByteVector",
      "net.bytebuddy.description.field.FieldDescription$InDefinedShape",
      "net.bytebuddy.implementation.Implementation$Target",
      "net.bytebuddy.description.modifier.Visibility",
      "net.bytebuddy.description.modifier.EnumerationState",
      "net.bytebuddy.description.method.MethodDescription$Token",
      "net.bytebuddy.description.method.ParameterList$ForLoadedExecutable",
      "net.bytebuddy.description.field.FieldDescription$Token",
      "net.bytebuddy.dynamic.ClassFileLocator",
      "net.bytebuddy.matcher.MethodReturnTypeMatcher",
      "net.bytebuddy.jar.asm.MethodVisitor",
      "net.bytebuddy.description.field.FieldList",
      "net.bytebuddy.ClassFileVersion$VersionLocator$CreationAction",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin",
      "net.bytebuddy.description.modifier.ModifierContributor$ForType",
      "net.bytebuddy.description.method.MethodDescription$AbstractBase",
      "net.bytebuddy.description.modifier.SynchronizationState",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Dispatcher$CreationAction",
      "net.bytebuddy.dynamic.Transformer",
      "net.bytebuddy.jar.asm.Attribute",
      "net.bytebuddy.implementation.bytecode.StackManipulation$Size",
      "net.bytebuddy.description.type.PackageDescription",
      "net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$NoOp",
      "net.bytebuddy.implementation.bytecode.StackManipulation",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ImplementationDefinition$Optional",
      "net.bytebuddy.build.Plugin",
      "net.bytebuddy.description.annotation.AnnotationDescription",
      "net.bytebuddy.description.method.ParameterDescription$InDefinedShape",
      "net.bytebuddy.description.TypeVariableSource$Visitor",
      "net.bytebuddy.matcher.CollectionOneToOneMatcher",
      "net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection",
      "net.bytebuddy.implementation.MethodAccessorFactory$AccessType",
      "net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader",
      "net.bytebuddy.description.method.ParameterList$ForLoadedExecutable$OfMethod",
      "net.bytebuddy.description.method.MethodList$AbstractBase",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$TypeVariableDefinition",
      "net.bytebuddy.jar.asm.Label",
      "net.bytebuddy.matcher.FilterableList",
      "nl.tudelft.jpacman.sprite.Sprite",
      "net.bytebuddy.description.type.TypeDescription$Generic$AnnotationReader$Dispatcher$CreationAction",
      "net.bytebuddy.description.modifier.ProvisioningState",
      "net.bytebuddy.description.type.TypeDescription$AbstractBase",
      "nl.tudelft.jpacman.board.Direction",
      "net.bytebuddy.description.ModifierReviewable$OfAbstraction",
      "net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$OfMethodParameter",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ExceptionDefinition",
      "net.bytebuddy.description.ByteCodeElement$TypeDependant",
      "nl.tudelft.jpacman.npc.ghost.Navigation",
      "net.bytebuddy.description.ModifierReviewable$ForParameterDescription",
      "nl.tudelft.jpacman.sprite.AnimatedSprite",
      "net.bytebuddy.description.type.TypeDescription$Generic$LazyProjection$WithEagerNavigation$OfAnnotatedElement",
      "net.bytebuddy.implementation.HashCodeMethod$OffsetProvider",
      "net.bytebuddy.description.TypeVariableSource",
      "net.bytebuddy.description.type.TypeDescription$Generic",
      "net.bytebuddy.utility.privilege.GetSystemPropertyAction",
      "net.bytebuddy.implementation.attribute.MethodAttributeAppender$Factory",
      "net.bytebuddy.dynamic.DynamicType$Loaded",
      "net.bytebuddy.description.annotation.AnnotationValue$Loaded$State",
      "net.bytebuddy.matcher.NameMatcher",
      "net.bytebuddy.description.type.TypeDefinition",
      "net.bytebuddy.matcher.MethodParameterTypesMatcher",
      "net.bytebuddy.description.type.TypeList$Generic$Explicit",
      "net.bytebuddy.description.method.MethodList$ForLoadedMethods",
      "net.bytebuddy.description.ByteCodeElement$Token",
      "net.bytebuddy.description.NamedElement$WithOptionalName",
      "net.bytebuddy.ClassFileVersion",
      "nl.tudelft.jpacman.sprite.ImageSprite",
      "net.bytebuddy.implementation.Implementation",
      "net.bytebuddy.dynamic.DynamicType$Builder$FieldDefinition$Optional",
      "net.bytebuddy.description.ByteCodeElement",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ReceiverTypeDefinition",
      "net.bytebuddy.description.method.ParameterDescription$InDefinedShape$AbstractBase",
      "net.bytebuddy.implementation.Implementation$SpecialMethodInvocation",
      "net.bytebuddy.description.method.MethodDescription$ForLoadedMethod",
      "net.bytebuddy.matcher.NullMatcher",
      "net.bytebuddy.description.type.TypeDefinition$Sort",
      "net.bytebuddy.jar.asm.FieldVisitor",
      "net.bytebuddy.description.method.ParameterDescription$AbstractBase",
      "net.bytebuddy.description.DeclaredByType",
      "net.bytebuddy.jar.asm.ClassWriter",
      "net.bytebuddy.implementation.EqualsMethod",
      "net.bytebuddy.description.NamedElement$WithRuntimeName",
      "net.bytebuddy.description.method.ParameterDescription$ForLoadedParameter$Dispatcher",
      "net.bytebuddy.ClassFileVersion$VersionLocator",
      "net.bytebuddy.matcher.ElementMatcher$Junction$Conjunction",
      "net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType",
      "net.bytebuddy.asm.AsmVisitorWrapper",
      "net.bytebuddy.description.type.TypeDescription$ForLoadedType",
      "net.bytebuddy.description.type.TypeDescription$Generic$AbstractBase",
      "net.bytebuddy.description.type.TypeDescription$Generic$OfNonGenericType$ForLoadedType",
      "net.bytebuddy.ClassFileVersion$VersionLocator$ForJava9CapableVm",
      "net.bytebuddy.matcher.ElementMatchers",
      "net.bytebuddy.implementation.attribute.FieldAttributeAppender$Factory",
      "net.bytebuddy.matcher.FilterableList$AbstractBase",
      "net.bytebuddy.dynamic.DynamicType$Builder$MethodDefinition$ParameterDefinition$Initial",
      "net.bytebuddy.description.NamedElement"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Navigation_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "nl.tudelft.jpacman.npc.ghost.Navigation",
      "nl.tudelft.jpacman.npc.ghost.Navigation$Node",
      "nl.tudelft.jpacman.board.Direction",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "nl.tudelft.jpacman.sprite.ImageSprite",
      "nl.tudelft.jpacman.sprite.EmptySprite",
      "nl.tudelft.jpacman.sprite.AnimatedSprite",
      "nl.tudelft.jpacman.board.Unit",
      "nl.tudelft.jpacman.level.Pellet"
    );
  }
}
