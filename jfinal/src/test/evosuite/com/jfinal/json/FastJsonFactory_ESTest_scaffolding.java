/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 18:15:03 GMT 2018
 */

package com.jfinal.json;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class FastJsonFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.json.FastJsonFactory"; 
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
    java.lang.System.setProperty("user.dir", "/home/agudek/Documents/STRE/final_project/jfinal"); 
    java.lang.System.setProperty("user.home", "/home/agudek"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("user.name", "agudek"); 
    java.lang.System.setProperty("user.timezone", "Europe/Amsterdam"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(FastJsonFactory_ESTest_scaffolding.class.getClassLoader() ,
      "com.alibaba.fastjson.serializer.SerializeBeanInfo",
      "com.alibaba.fastjson.serializer.SerializerFeature",
      "com.alibaba.fastjson.util.ASMUtils",
      "com.jfinal.json.FastJsonFactory",
      "com.alibaba.fastjson.JSONPath",
      "com.alibaba.fastjson.util.IOUtils",
      "com.alibaba.fastjson.parser.JSONScanner",
      "com.alibaba.fastjson.util.TypeUtils",
      "com.jfinal.plugin.activerecord.Record",
      "com.alibaba.fastjson.parser.JSONLexerBase",
      "com.alibaba.fastjson.parser.deserializer.ParseProcess",
      "com.alibaba.fastjson.serializer.MiscCodec",
      "com.alibaba.fastjson.util.IOUtils$1",
      "com.alibaba.fastjson.serializer.IntegerCodec",
      "com.alibaba.fastjson.serializer.SerializeFilter",
      "com.alibaba.fastjson.serializer.SerializeWriter",
      "com.alibaba.fastjson.serializer.ReferenceCodec",
      "com.alibaba.fastjson.JSONException",
      "com.jfinal.json.Json",
      "com.alibaba.fastjson.serializer.ObjectArrayCodec",
      "com.jfinal.json.IJsonFactory",
      "com.alibaba.fastjson.serializer.ToStringSerializer",
      "com.jfinal.json.FastJsonRecordSerializer",
      "com.jfinal.json.JFinalJson",
      "com.alibaba.fastjson.parser.deserializer.ExtraProcessor",
      "com.alibaba.fastjson.serializer.BeforeFilter",
      "com.alibaba.fastjson.serializer.SerialContext",
      "com.alibaba.fastjson.serializer.AfterFilter",
      "com.alibaba.fastjson.parser.deserializer.ExtraProcessable",
      "com.alibaba.fastjson.serializer.ObjectSerializer",
      "com.alibaba.fastjson.TypeReference",
      "com.alibaba.fastjson.util.ParameterizedTypeImpl",
      "com.alibaba.fastjson.JSONObject",
      "com.alibaba.fastjson.parser.deserializer.ExtraTypeProvider",
      "com.alibaba.fastjson.serializer.CharacterCodec",
      "com.alibaba.fastjson.parser.deserializer.ObjectDeserializer",
      "com.alibaba.fastjson.serializer.BigDecimalCodec",
      "com.alibaba.fastjson.parser.JSONLexer",
      "com.alibaba.fastjson.util.ASMClassLoader$1",
      "com.alibaba.fastjson.serializer.PrimitiveArraySerializer",
      "com.alibaba.fastjson.util.FieldInfo",
      "com.alibaba.fastjson.serializer.JSONSerializer",
      "com.alibaba.fastjson.serializer.PropertyFilter",
      "com.alibaba.fastjson.util.JavaBeanInfo",
      "com.alibaba.fastjson.parser.deserializer.JavaBeanDeserializer",
      "com.alibaba.fastjson.serializer.SerializeConfig",
      "com.alibaba.fastjson.parser.SymbolTable",
      "com.alibaba.fastjson.serializer.AtomicCodec",
      "com.alibaba.fastjson.serializer.NameFilter",
      "com.alibaba.fastjson.JSONArray",
      "com.alibaba.fastjson.JSONAware",
      "com.alibaba.fastjson.serializer.LongCodec",
      "com.jfinal.json.JFinalJsonFactory",
      "com.alibaba.fastjson.util.ASMClassLoader",
      "com.alibaba.fastjson.parser.JSONToken",
      "com.alibaba.fastjson.serializer.FloatCodec",
      "com.alibaba.fastjson.parser.JSONReaderScanner",
      "com.alibaba.fastjson.serializer.ValueFilter",
      "com.alibaba.fastjson.serializer.AppendableSerializer",
      "com.jfinal.json.FastJson",
      "com.alibaba.fastjson.JSONPathException",
      "com.alibaba.fastjson.parser.deserializer.DefaultFieldDeserializer",
      "com.alibaba.fastjson.parser.deserializer.FieldDeserializer",
      "com.alibaba.fastjson.serializer.Labels",
      "com.alibaba.fastjson.parser.deserializer.AutowiredObjectDeserializer",
      "com.alibaba.fastjson.serializer.ContextValueFilter",
      "com.alibaba.fastjson.serializer.ContextObjectSerializer",
      "com.alibaba.fastjson.parser.DefaultJSONParser",
      "com.alibaba.fastjson.serializer.BeanContext",
      "com.alibaba.fastjson.util.IdentityHashMap",
      "com.alibaba.fastjson.serializer.BigIntegerCodec",
      "com.alibaba.fastjson.JSON",
      "com.alibaba.fastjson.serializer.StringCodec",
      "com.alibaba.fastjson.asm.MethodVisitor",
      "com.alibaba.fastjson.serializer.SerializeFilterable",
      "com.alibaba.fastjson.JSONWriter",
      "com.alibaba.fastjson.asm.Opcodes",
      "com.alibaba.fastjson.serializer.LabelFilter",
      "com.alibaba.fastjson.JSONReader",
      "com.alibaba.fastjson.util.IdentityHashMap$Entry",
      "com.alibaba.fastjson.serializer.JavaBeanSerializer",
      "com.alibaba.fastjson.serializer.DoubleSerializer",
      "com.alibaba.fastjson.JSONStreamAware",
      "com.alibaba.fastjson.serializer.ASMSerializerFactory",
      "com.alibaba.fastjson.serializer.BooleanCodec",
      "com.alibaba.fastjson.parser.Feature",
      "com.alibaba.fastjson.serializer.PropertyPreFilter",
      "com.alibaba.fastjson.parser.ParserConfig",
      "com.alibaba.fastjson.parser.ParseContext"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(FastJsonFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.json.FastJsonFactory",
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
      "com.jfinal.json.JFinalJsonFactory",
      "com.jfinal.json.Json",
      "com.jfinal.json.FastJsonRecordSerializer",
      "com.jfinal.json.FastJson"
    );
  }
}
