/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 11:14:42 GMT 2018
 */

package com.jfinal.json;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class JFinalJson_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.json.JFinalJson"; 
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
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.country", "US"); 
    java.lang.System.setProperty("user.dir", "/home/agudek/Documents/STRE/final_project/jfinal"); 
    java.lang.System.setProperty("user.home", "/home/agudek"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "agudek"); 
    java.lang.System.setProperty("user.timezone", "Europe/Amsterdam"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(JFinalJson_ESTest_scaffolding.class.getClassLoader() ,
      "com.fasterxml.jackson.databind.MappingIterator",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerModifier",
      "com.fasterxml.jackson.databind.deser.impl.FieldProperty",
      "com.alibaba.fastjson.JSONPath",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.deser.std.EnumDeserializer",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$Base",
      "com.alibaba.fastjson.parser.JSONScanner",
      "com.alibaba.fastjson.parser.JSONLexerBase",
      "com.fasterxml.jackson.databind.introspect.AnnotatedConstructor",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.databind.deser.UnresolvedForwardReference",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWithSerializerProvider",
      "com.fasterxml.jackson.databind.type.MapLikeType",
      "com.fasterxml.jackson.databind.type.MapType",
      "com.alibaba.fastjson.serializer.SerializeWriter",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.alibaba.fastjson.JSONException",
      "com.fasterxml.jackson.databind.ObjectWriter",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.jfinal.json.IJsonFactory",
      "com.jfinal.plugin.activerecord.dialect.Dialect",
      "com.fasterxml.jackson.databind.node.TextNode",
      "com.fasterxml.jackson.core.util.Instantiatable",
      "com.alibaba.fastjson.serializer.AfterFilter",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$Indenter",
      "com.fasterxml.jackson.databind.deser.impl.ReadableObjectId",
      "com.alibaba.fastjson.util.FieldInfo",
      "com.alibaba.fastjson.serializer.PropertyFilter",
      "com.fasterxml.jackson.databind.node.DecimalNode",
      "com.fasterxml.jackson.databind.util.Annotations",
      "com.fasterxml.jackson.databind.deser.Deserializers",
      "com.fasterxml.jackson.databind.ser.std.CollectionSerializer",
      "com.fasterxml.jackson.databind.deser.KeyDeserializers",
      "com.jfinal.json.JFinalJsonFactory",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitable",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.jfinal.json.FastJson",
      "com.fasterxml.jackson.databind.type.CollectionLikeType",
      "com.fasterxml.jackson.core.TreeNode",
      "com.fasterxml.jackson.databind.node.NumericNode",
      "com.fasterxml.jackson.databind.deser.ValueInstantiator",
      "com.alibaba.fastjson.serializer.ContextValueFilter",
      "com.alibaba.fastjson.serializer.ContextObjectSerializer",
      "com.fasterxml.jackson.databind.ser.std.StaticListSerializerBase",
      "com.alibaba.fastjson.serializer.StringCodec",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.core.base.ParserMinimalBase",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerBase",
      "com.fasterxml.jackson.databind.ObjectMapper$DefaultTyping",
      "com.alibaba.fastjson.JSONStreamAware",
      "com.fasterxml.jackson.databind.introspect.BeanPropertyDefinition",
      "com.jfinal.render.ViewType",
      "com.fasterxml.jackson.databind.util.Converter",
      "com.jfinal.plugin.activerecord.IContainerFactory",
      "com.fasterxml.jackson.databind.ser.std.FileSerializer",
      "com.fasterxml.jackson.core.SerializableString",
      "com.fasterxml.jackson.databind.deser.ValueInstantiators",
      "com.fasterxml.jackson.core.Versioned",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.deser.std.EnumSetDeserializer",
      "com.fasterxml.jackson.databind.JsonSerializable",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMember",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.deser.impl.TypeWrappedDeserializer",
      "com.alibaba.fastjson.util.IOUtils$1",
      "com.fasterxml.jackson.databind.introspect.AnnotatedWithParams",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.alibaba.fastjson.parser.deserializer.ExtraProcessable",
      "com.alibaba.fastjson.util.ASMClassLoader$1",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.ser.ContextualSerializer",
      "com.alibaba.fastjson.serializer.AtomicCodec",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.ser.std.ClassSerializer",
      "com.fasterxml.jackson.databind.Module$SetupContext",
      "com.fasterxml.jackson.databind.node.ContainerNode",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory",
      "com.fasterxml.jackson.databind.PropertyNamingStrategy",
      "com.fasterxml.jackson.databind.jsonschema.SchemaAware",
      "com.fasterxml.jackson.databind.AbstractTypeResolver",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.ByteBufferSerializer",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer",
      "com.fasterxml.jackson.databind.deser.std.ArrayBlockingQueueDeserializer",
      "com.fasterxml.jackson.databind.ser.std.IterableSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicIntegerSerializer",
      "com.fasterxml.jackson.databind.util.ArrayBuilders",
      "com.alibaba.fastjson.serializer.LabelFilter",
      "com.fasterxml.jackson.core.PrettyPrinter",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory",
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.parser.ParserConfig",
      "com.alibaba.fastjson.parser.ParseContext",
      "com.fasterxml.jackson.core.base.GeneratorBase",
      "com.fasterxml.jackson.databind.exc.PropertyBindingException",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.BeanSerializer",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.jfinal.plugin.activerecord.Record",
      "com.fasterxml.jackson.databind.node.NullNode",
      "com.fasterxml.jackson.databind.ser.BeanSerializerModifier",
      "com.fasterxml.jackson.databind.jsontype.NamedType",
      "com.fasterxml.jackson.databind.jsontype.TypeResolverBuilder",
      "com.fasterxml.jackson.databind.ser.std.EnumMapSerializer",
      "com.fasterxml.jackson.databind.introspect.ObjectIdInfo",
      "com.fasterxml.jackson.databind.introspect.NopAnnotationIntrospector",
      "com.fasterxml.jackson.annotation.ObjectIdGenerators$PropertyGenerator",
      "com.fasterxml.jackson.core.io.UTF8Writer",
      "com.fasterxml.jackson.databind.BeanProperty",
      "com.jfinal.render.ContentType",
      "com.alibaba.fastjson.serializer.ObjectArrayCodec",
      "com.fasterxml.jackson.core.Version",
      "com.alibaba.fastjson.serializer.ToStringSerializer",
      "com.jfinal.json.FastJsonRecordSerializer",
      "com.jfinal.plugin.activerecord.cache.ICache",
      "com.alibaba.fastjson.serializer.ObjectSerializer",
      "com.alibaba.fastjson.TypeReference",
      "com.fasterxml.jackson.databind.ser.std.StdDelegatingSerializer",
      "com.fasterxml.jackson.core.base.ParserBase",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.node.BinaryNode",
      "com.fasterxml.jackson.databind.introspect.AnnotationMap",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.alibaba.fastjson.serializer.PrimitiveArraySerializer",
      "com.fasterxml.jackson.core.JsonGenerator",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.ser.Serializers",
      "com.alibaba.fastjson.parser.SymbolTable",
      "com.jfinal.plugin.activerecord.IDbProFactory$1",
      "com.alibaba.fastjson.JSONArray",
      "com.alibaba.fastjson.JSONAware",
      "com.alibaba.fastjson.util.ASMClassLoader",
      "com.fasterxml.jackson.core.JsonGenerationException",
      "com.alibaba.fastjson.serializer.AppendableSerializer",
      "com.fasterxml.jackson.databind.ser.std.JsonValueSerializer",
      "com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.databind.deser.impl.SetterlessProperty",
      "com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer",
      "com.fasterxml.jackson.core.json.UTF8JsonGenerator",
      "com.fasterxml.jackson.databind.ser.std.EnumSetSerializer",
      "com.fasterxml.jackson.databind.ser.std.SerializableSerializer",
      "com.alibaba.fastjson.serializer.BeanContext",
      "com.alibaba.fastjson.serializer.BigIntegerCodec",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.alibaba.fastjson.JSONWriter",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$DelegatingKD",
      "com.alibaba.fastjson.asm.Opcodes",
      "com.alibaba.fastjson.JSONReader",
      "com.fasterxml.jackson.databind.util.TokenBuffer",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.core.json.WriterBasedJsonGenerator",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.fasterxml.jackson.core.sym.Name1",
      "com.fasterxml.jackson.core.sym.Name2",
      "com.fasterxml.jackson.core.sym.Name3",
      "com.fasterxml.jackson.databind.node.LongNode",
      "com.alibaba.fastjson.util.IOUtils",
      "com.fasterxml.jackson.databind.deser.CreatorProperty",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringCtorKeyDeserializer",
      "com.jfinal.plugin.activerecord.IDbProFactory",
      "com.jfinal.json.MixedJsonFactory$MixedJson",
      "com.fasterxml.jackson.core.type.TypeReference",
      "com.fasterxml.jackson.core.JsonParseException",
      "com.fasterxml.jackson.databind.ser.std.TokenBufferSerializer",
      "com.alibaba.fastjson.parser.deserializer.ExtraProcessor",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.alibaba.fastjson.serializer.BeforeFilter",
      "com.fasterxml.jackson.databind.ser.std.MapSerializer",
      "com.fasterxml.jackson.databind.ser.std.SqlDateSerializer",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.deser.std.AtomicReferenceDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.alibaba.fastjson.util.ParameterizedTypeImpl",
      "com.fasterxml.jackson.databind.JsonMappingException",
      "com.fasterxml.jackson.databind.deser.std.StdScalarDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.TypeWrappedSerializer",
      "com.jfinal.plugin.activerecord.Model",
      "com.fasterxml.jackson.annotation.JsonTypeInfo$As",
      "com.fasterxml.jackson.databind.ser.std.SqlTimeSerializer",
      "com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.node.ObjectNode",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.databind.deser.DeserializationProblemHandler",
      "com.alibaba.fastjson.serializer.FloatCodec",
      "com.fasterxml.jackson.annotation.PropertyAccessor",
      "com.jfinal.plugin.activerecord.cache.EhCache",
      "com.fasterxml.jackson.databind.introspect.AnnotatedField",
      "com.jfinal.plugin.activerecord.builder.KeepByteAndShortModelBuilder",
      "com.fasterxml.jackson.databind.deser.std.ContainerDeserializerBase",
      "com.fasterxml.jackson.databind.deser.ContextualDeserializer",
      "com.fasterxml.jackson.databind.ser.std.ArraySerializerBase",
      "com.fasterxml.jackson.core.sym.NameN",
      "com.fasterxml.jackson.annotation.ObjectIdGenerator",
      "com.fasterxml.jackson.databind.cfg.HandlerInstantiator",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.alibaba.fastjson.serializer.BooleanCodec",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.alibaba.fastjson.util.ASMUtils",
      "com.fasterxml.jackson.databind.node.TreeTraversingParser",
      "com.fasterxml.jackson.databind.deser.std.CollectionDeserializer",
      "com.fasterxml.jackson.databind.jsonschema.JsonSchema",
      "com.alibaba.fastjson.parser.deserializer.ParseProcess",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.type.ArrayType",
      "com.fasterxml.jackson.databind.util.Named",
      "com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer$TableInfo",
      "com.alibaba.fastjson.serializer.ReferenceCodec",
      "com.fasterxml.jackson.databind.type.CollectionType",
      "com.fasterxml.jackson.databind.deser.std.StringCollectionDeserializer",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.annotation.JsonAutoDetect",
      "com.fasterxml.jackson.databind.node.ValueNode",
      "com.alibaba.fastjson.serializer.SerialContext",
      "com.fasterxml.jackson.databind.ser.impl.IteratorSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.deser.std.EnumMapDeserializer",
      "com.fasterxml.jackson.databind.node.JsonNodeCreator",
      "com.fasterxml.jackson.databind.deser.SettableBeanProperty",
      "com.fasterxml.jackson.databind.jsonFormatVisitors.JsonFormatVisitorWrapper",
      "com.jfinal.plugin.activerecord.dialect.MysqlDialect",
      "com.fasterxml.jackson.core.json.ReaderBasedJsonParser",
      "com.fasterxml.jackson.databind.node.FloatNode",
      "com.fasterxml.jackson.databind.node.IntNode",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.alibaba.fastjson.serializer.NameFilter",
      "com.alibaba.fastjson.serializer.LongCodec",
      "com.fasterxml.jackson.databind.ser.std.EnumSerializer",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.jfinal.plugin.activerecord.RecordBuilder",
      "com.fasterxml.jackson.databind.KeyDeserializer",
      "com.fasterxml.jackson.databind.deser.impl.PropertyBasedObjectIdGenerator",
      "com.fasterxml.jackson.databind.ser.impl.StringCollectionSerializer",
      "com.fasterxml.jackson.annotation.ObjectIdResolver",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.InetSocketAddressSerializer",
      "com.fasterxml.jackson.databind.ser.std.ObjectArraySerializer",
      "com.alibaba.fastjson.serializer.SerializeFilterable",
      "com.jfinal.plugin.activerecord.ModelBuilder",
      "com.fasterxml.jackson.databind.node.DoubleNode",
      "com.fasterxml.jackson.core.util.ByteArrayBuilder",
      "com.fasterxml.jackson.databind.ser.impl.IndexedStringListSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.Module",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.ContainerSerializer",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.deser.std.StringDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StringArrayDeserializer",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.annotation.JacksonAnnotation",
      "com.fasterxml.jackson.databind.node.POJONode",
      "com.fasterxml.jackson.databind.ObjectReader",
      "com.alibaba.fastjson.util.TypeUtils",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.node.BigIntegerNode",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.databind.JsonDeserializer",
      "com.alibaba.fastjson.serializer.MiscCodec",
      "com.alibaba.fastjson.serializer.IntegerCodec",
      "com.fasterxml.jackson.databind.deser.impl.MethodProperty",
      "com.fasterxml.jackson.databind.util.SimpleBeanPropertyDefinition",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.jfinal.json.JFinalJson",
      "com.fasterxml.jackson.databind.node.ArrayNode",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.alibaba.fastjson.JSONObject",
      "com.alibaba.fastjson.serializer.CharacterCodec",
      "com.fasterxml.jackson.databind.exc.InvalidFormatException",
      "com.fasterxml.jackson.databind.deser.std.MapDeserializer",
      "com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.core.io.CharacterEscapes",
      "com.fasterxml.jackson.databind.deser.std.TokenBufferDeserializer",
      "com.alibaba.fastjson.util.JavaBeanInfo",
      "com.alibaba.fastjson.serializer.SerializeConfig",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.impl.PropertyBasedObjectIdGenerator",
      "com.alibaba.fastjson.parser.JSONReaderScanner",
      "com.alibaba.fastjson.serializer.ValueFilter",
      "com.fasterxml.jackson.databind.introspect.AnnotatedMethod",
      "com.alibaba.fastjson.JSONPathException",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker",
      "com.fasterxml.jackson.core.JsonParser",
      "com.fasterxml.jackson.databind.introspect.AnnotatedParameter",
      "com.alibaba.fastjson.serializer.Labels",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.core.JsonProcessingException",
      "com.jfinal.json.JacksonFactory",
      "com.jfinal.json.MixedJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer$Bucket",
      "com.alibaba.fastjson.asm.MethodVisitor",
      "com.jfinal.plugin.activerecord.ActiveRecordException",
      "com.alibaba.fastjson.serializer.JavaBeanSerializer",
      "com.alibaba.fastjson.serializer.DoubleSerializer",
      "com.fasterxml.jackson.databind.deser.std.ObjectArrayDeserializer",
      "com.jfinal.json.Jackson",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.exc.UnrecognizedPropertyException",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicBooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicLongSerializer",
      "com.fasterxml.jackson.databind.ser.std.InetAddressSerializer",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.core.sym.Name",
      "com.fasterxml.jackson.databind.deser.std.StdDeserializer",
      "com.fasterxml.jackson.annotation.JsonInclude$Include",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.ResolvableSerializer",
      "com.jfinal.plugin.activerecord.builder.KeepByteAndShortRecordBuilder",
      "com.jfinal.json.Json",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.ser.impl.StringArraySerializer",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.jfinal.plugin.activerecord.Config",
      "com.jfinal.kit.StrKit",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$StringFactoryKeyDeserializer",
      "com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider",
      "com.fasterxml.jackson.databind.util.ObjectBuffer",
      "com.alibaba.fastjson.serializer.BigDecimalCodec",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.databind.InjectableValues",
      "com.fasterxml.jackson.databind.deser.std.ThrowableDeserializer",
      "com.fasterxml.jackson.databind.ser.std.TimeZoneSerializer",
      "com.fasterxml.jackson.databind.introspect.AnnotationIntrospectorPair",
      "com.alibaba.fastjson.parser.JSONToken",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.deser.BeanDeserializer",
      "com.fasterxml.jackson.databind.ser.std.AsArraySerializerBase",
      "com.alibaba.fastjson.parser.DefaultJSONParser",
      "com.alibaba.fastjson.util.IdentityHashMap",
      "com.alibaba.fastjson.JSON",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.node.ShortNode",
      "com.fasterxml.jackson.databind.node.BooleanNode",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer$EnumKD",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.alibaba.fastjson.serializer.SerializeBeanInfo",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers$AtomicReferenceSerializer",
      "com.fasterxml.jackson.databind.ser.std.BeanSerializerBase",
      "com.fasterxml.jackson.databind.deser.ResolvableDeserializer",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializer",
      "com.alibaba.fastjson.serializer.SerializeFilter",
      "com.fasterxml.jackson.databind.ser.FilterProvider",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.deser.std.UntypedObjectDeserializer",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector$MixInResolver",
      "com.fasterxml.jackson.core.json.JsonGeneratorImpl",
      "com.alibaba.fastjson.parser.deserializer.ObjectDeserializer",
      "com.fasterxml.jackson.databind.deser.AbstractDeserializer",
      "com.fasterxml.jackson.databind.ser.impl.IndexedListSerializer",
      "com.alibaba.fastjson.parser.JSONLexer",
      "com.alibaba.fastjson.serializer.JSONSerializer",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.io.SegmentedStringWriter",
      "com.fasterxml.jackson.databind.deser.std.JsonLocationInstantiator",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.core.JsonToken",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.alibaba.fastjson.parser.deserializer.FieldDeserializer",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.jfinal.plugin.activerecord.IContainerFactory$1",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.cfg.ConfigFeature",
      "com.fasterxml.jackson.core.FormatSchema",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.alibaba.fastjson.util.IdentityHashMap$Entry",
      "com.alibaba.fastjson.serializer.PropertyPreFilter",
      "com.jfinal.plugin.activerecord.DbKit"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Iterator", false, JFinalJson_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.Function", false, JFinalJson_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(JFinalJson_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.json.JFinalJsonFactory",
      "com.jfinal.json.Json",
      "com.jfinal.json.JFinalJson",
      "com.jfinal.kit.StrKit",
      "com.jfinal.plugin.activerecord.Record",
      "com.jfinal.plugin.activerecord.Config",
      "com.jfinal.plugin.activerecord.IDbProFactory$1",
      "com.jfinal.plugin.activerecord.IDbProFactory",
      "com.jfinal.plugin.activerecord.dialect.Dialect",
      "com.jfinal.plugin.activerecord.dialect.MysqlDialect",
      "com.jfinal.plugin.activerecord.ModelBuilder",
      "com.jfinal.plugin.activerecord.RecordBuilder",
      "com.jfinal.plugin.activerecord.IContainerFactory$1",
      "com.jfinal.plugin.activerecord.IContainerFactory",
      "com.jfinal.plugin.activerecord.cache.EhCache",
      "com.jfinal.plugin.activerecord.DbKit",
      "com.alibaba.fastjson.util.ASMUtils",
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.util.IOUtils$1",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.util.IdentityHashMap",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory",
      "com.alibaba.fastjson.util.ASMClassLoader$1",
      "com.alibaba.fastjson.util.ASMClassLoader",
      "com.alibaba.fastjson.serializer.BooleanCodec",
      "com.alibaba.fastjson.util.IdentityHashMap$Entry",
      "com.alibaba.fastjson.serializer.CharacterCodec",
      "com.alibaba.fastjson.serializer.IntegerCodec",
      "com.alibaba.fastjson.serializer.LongCodec",
      "com.alibaba.fastjson.serializer.FloatCodec",
      "com.alibaba.fastjson.serializer.DoubleSerializer",
      "com.alibaba.fastjson.serializer.BigDecimalCodec",
      "com.alibaba.fastjson.serializer.BigIntegerCodec",
      "com.alibaba.fastjson.serializer.StringCodec",
      "com.alibaba.fastjson.serializer.PrimitiveArraySerializer",
      "com.alibaba.fastjson.serializer.ObjectArrayCodec",
      "com.alibaba.fastjson.serializer.MiscCodec",
      "com.alibaba.fastjson.serializer.AppendableSerializer",
      "com.alibaba.fastjson.serializer.ToStringSerializer",
      "com.alibaba.fastjson.serializer.AtomicCodec",
      "com.alibaba.fastjson.serializer.ReferenceCodec",
      "com.alibaba.fastjson.serializer.SerializeConfig",
      "com.jfinal.json.FastJsonRecordSerializer",
      "com.jfinal.json.FastJson",
      "com.jfinal.json.MixedJsonFactory$MixedJson",
      "com.jfinal.json.MixedJsonFactory",
      "com.jfinal.json.FastJsonFactory",
      "com.jfinal.json.JacksonFactory",
      "com.jfinal.json.Jackson",
      "com.fasterxml.jackson.core.TreeCodec",
      "com.fasterxml.jackson.core.ObjectCodec",
      "com.fasterxml.jackson.core.type.ResolvedType",
      "com.fasterxml.jackson.databind.JavaType",
      "com.fasterxml.jackson.databind.type.TypeBase",
      "com.fasterxml.jackson.databind.type.SimpleType",
      "com.fasterxml.jackson.databind.introspect.ClassIntrospector",
      "com.fasterxml.jackson.databind.introspect.Annotated",
      "com.fasterxml.jackson.databind.introspect.AnnotatedClass",
      "com.fasterxml.jackson.databind.BeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicBeanDescription",
      "com.fasterxml.jackson.databind.introspect.BasicClassIntrospector",
      "com.fasterxml.jackson.databind.AnnotationIntrospector",
      "com.fasterxml.jackson.databind.introspect.JacksonAnnotationIntrospector",
      "com.fasterxml.jackson.annotation.JsonAutoDetect$Visibility",
      "com.fasterxml.jackson.databind.introspect.VisibilityChecker$Std",
      "com.fasterxml.jackson.core.io.SerializedString",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$NopIndenter",
      "com.fasterxml.jackson.core.util.DefaultPrettyPrinter$FixedSpaceIndenter",
      "com.fasterxml.jackson.core.util.DefaultIndenter",
      "com.fasterxml.jackson.databind.cfg.BaseSettings",
      "com.fasterxml.jackson.databind.util.LRUMap",
      "com.fasterxml.jackson.databind.type.TypeParser",
      "com.fasterxml.jackson.databind.type.TypeFactory",
      "com.fasterxml.jackson.databind.util.StdDateFormat",
      "com.fasterxml.jackson.core.Base64Variant",
      "com.fasterxml.jackson.core.Base64Variants",
      "com.fasterxml.jackson.databind.ObjectMapper",
      "com.fasterxml.jackson.core.JsonFactory$Feature",
      "com.fasterxml.jackson.core.JsonParser$Feature",
      "com.fasterxml.jackson.core.JsonGenerator$Feature",
      "com.fasterxml.jackson.core.JsonFactory",
      "com.fasterxml.jackson.databind.MappingJsonFactory",
      "com.fasterxml.jackson.core.sym.CharsToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer",
      "com.fasterxml.jackson.core.sym.BytesToNameCanonicalizer$TableInfo",
      "com.fasterxml.jackson.databind.jsontype.SubtypeResolver",
      "com.fasterxml.jackson.databind.jsontype.impl.StdSubtypeResolver",
      "com.fasterxml.jackson.databind.util.RootNameLookup",
      "com.fasterxml.jackson.databind.cfg.MapperConfig",
      "com.fasterxml.jackson.databind.MapperFeature",
      "com.fasterxml.jackson.databind.cfg.MapperConfigBase",
      "com.fasterxml.jackson.databind.SerializationConfig",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes",
      "com.fasterxml.jackson.databind.cfg.ContextAttributes$Impl",
      "com.fasterxml.jackson.databind.SerializationFeature",
      "com.fasterxml.jackson.databind.DeserializationConfig",
      "com.fasterxml.jackson.databind.DeserializationFeature",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.DatabindContext",
      "com.fasterxml.jackson.databind.JsonSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdSerializer",
      "com.fasterxml.jackson.databind.ser.impl.FailingSerializer",
      "com.fasterxml.jackson.databind.ser.impl.UnknownSerializer",
      "com.fasterxml.jackson.databind.SerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider",
      "com.fasterxml.jackson.databind.ser.DefaultSerializerProvider$Impl",
      "com.fasterxml.jackson.databind.ser.std.NullSerializer",
      "com.fasterxml.jackson.databind.ser.SerializerCache",
      "com.fasterxml.jackson.databind.DeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext",
      "com.fasterxml.jackson.databind.deser.DefaultDeserializationContext$Impl",
      "com.fasterxml.jackson.databind.deser.DeserializerFactory",
      "com.fasterxml.jackson.databind.PropertyName",
      "com.fasterxml.jackson.databind.deser.BasicDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.std.StdKeyDeserializers",
      "com.fasterxml.jackson.databind.cfg.DeserializerFactoryConfig",
      "com.fasterxml.jackson.databind.deser.BeanDeserializerFactory",
      "com.fasterxml.jackson.databind.deser.DeserializerCache",
      "com.fasterxml.jackson.databind.ser.SerializerFactory",
      "com.fasterxml.jackson.databind.ser.std.StdScalarSerializer",
      "com.fasterxml.jackson.databind.ser.std.NonTypedScalarSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.StringSerializer",
      "com.fasterxml.jackson.databind.ser.std.ToStringSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$Base",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntegerSerializer",
      "com.fasterxml.jackson.core.JsonParser$NumberType",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$LongSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$IntLikeSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$ShortSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$FloatSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializers$DoubleSerializer",
      "com.fasterxml.jackson.databind.ser.std.BooleanSerializer",
      "com.fasterxml.jackson.databind.ser.std.NumberSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateTimeSerializerBase",
      "com.fasterxml.jackson.databind.ser.std.CalendarSerializer",
      "com.fasterxml.jackson.databind.ser.std.DateSerializer",
      "com.fasterxml.jackson.databind.ser.std.StdJdkSerializers",
      "com.fasterxml.jackson.databind.ser.std.UUIDSerializer",
      "com.fasterxml.jackson.databind.ser.BasicSerializerFactory",
      "com.fasterxml.jackson.databind.cfg.SerializerFactoryConfig",
      "com.fasterxml.jackson.databind.ser.BeanSerializerFactory"
    );
  }
}
