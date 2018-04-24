/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 15:03:37 GMT 2018
 */

package com.jfinal.core;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class ActionException_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.core.ActionException"; 
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
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ActionException_ESTest_scaffolding.class.getClassLoader() ,
      "com.jfinal.render.TextRender",
      "org.apache.log4j.or.ObjectRenderer",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.or.RendererMap",
      "com.jfinal.render.Render",
      "org.apache.log4j.Logger",
      "org.apache.velocity.context.Context",
      "org.apache.log4j.Level",
      "com.jfinal.core.ActionException",
      "org.apache.velocity.exception.VelocityException",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "com.jfinal.render.TemplateRender",
      "com.jfinal.render.ContentType",
      "org.apache.log4j.spi.RepositorySelector",
      "com.jfinal.render.HtmlRender",
      "com.jfinal.render.RenderManager",
      "com.jfinal.render.IRenderFactory",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.spi.Configurator",
      "com.jfinal.kit.StrKit",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.PropertyWatchdog",
      "com.jfinal.log.Log4jLogFactory",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.helpers.FileWatchdog",
      "com.jfinal.render.VelocityRender",
      "com.jfinal.render.ErrorRender",
      "com.jfinal.log.Log",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.spi.AppenderAttachable",
      "org.apache.velocity.exception.ParseErrorException",
      "org.apache.log4j.spi.RendererSupport",
      "com.jfinal.core.ActionException$1",
      "org.apache.log4j.Priority",
      "com.jfinal.render.XmlRender",
      "com.jfinal.log.ILogFactory",
      "org.apache.log4j.spi.LoggerRepository",
      "org.apache.log4j.LogManager",
      "com.jfinal.render.RenderException",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.velocity.exception.ResourceNotFoundException",
      "com.jfinal.log.Log4jLog"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ActionException_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "com.jfinal.log.Log4jLogFactory",
      "com.jfinal.log.Log",
      "com.jfinal.log.Log4jLog",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.Priority",
      "org.apache.log4j.Level",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "com.jfinal.core.ActionException",
      "com.jfinal.render.Render",
      "com.jfinal.core.ActionException$1",
      "com.jfinal.render.RenderManager",
      "com.jfinal.kit.StrKit",
      "freemarker.core.Configurable",
      "freemarker.template.Version",
      "freemarker.template.TemplateExceptionHandler$1",
      "freemarker.template.TemplateExceptionHandler$2",
      "freemarker.template.TemplateExceptionHandler$3",
      "freemarker.template.TemplateExceptionHandler$4",
      "freemarker.template.TemplateExceptionHandler",
      "freemarker.core.ArithmeticEngine$BigDecimalEngine",
      "freemarker.core.ArithmeticEngine$ConservativeEngine",
      "freemarker.core.ArithmeticEngine",
      "freemarker.ext.beans.HashAdapter",
      "freemarker.ext.beans.SequenceAdapter",
      "freemarker.ext.beans.CollectionAdapter",
      "freemarker.ext.beans.SetAdapter",
      "freemarker.log.Logger",
      "freemarker.template.utility.ClassUtil",
      "freemarker.log._Log4JLoggerFactory",
      "freemarker.log._Log4JLoggerFactory$Log4JLogger",
      "freemarker.template.utility.SecurityUtilities",
      "freemarker.template.utility.SecurityUtilities$1",
      "freemarker.ext.beans.ClassBasedModelFactory",
      "freemarker.ext.beans._EnumModels",
      "freemarker.core._ConcurrentMapFactory",
      "freemarker.ext.beans.StaticModels",
      "freemarker.ext.util.ModelCache",
      "freemarker.ext.beans.BeansModelCache",
      "freemarker.template.SimpleScalar",
      "freemarker.ext.beans.BeanModel$1",
      "freemarker.ext.beans.BeanModel",
      "freemarker.ext.beans.BooleanModel",
      "freemarker.ext.beans.BeansWrapper$MethodSignature",
      "freemarker.ext.beans.BeansWrapper$MethodAppearanceDecision",
      "freemarker.ext.beans.OverloadedMethods",
      "freemarker.ext.beans.OverloadedMethodsSubset",
      "freemarker.ext.beans.OverloadedFixArgMethods",
      "freemarker.ext.beans.MethodUtilities",
      "freemarker.ext.beans.BeansWrapper$1",
      "freemarker.ext.beans.BeansWrapper$2",
      "freemarker.ext.beans.BeansWrapper$3",
      "freemarker.ext.beans.BeansWrapper",
      "freemarker.template.DefaultObjectWrapper",
      "freemarker.template.SimpleObjectWrapper",
      "freemarker.template.ObjectWrapper",
      "freemarker.core.TemplateClassResolver$1",
      "freemarker.core.TemplateClassResolver$2",
      "freemarker.core.TemplateClassResolver$3",
      "freemarker.core.TemplateClassResolver",
      "freemarker.template.utility.NullArgumentException",
      "freemarker.cache.TemplateCache",
      "freemarker.cache.FileTemplateLoader",
      "freemarker.cache.FileTemplateLoader$1",
      "freemarker.cache.SoftCacheStorage",
      "freemarker.template.utility.CaptureOutput",
      "freemarker.template.utility.StandardCompress",
      "freemarker.template.utility.HtmlEscape",
      "freemarker.template.utility.NormalizeNewlines",
      "freemarker.template.utility.XmlEscape",
      "freemarker.template.Configuration",
      "com.jfinal.render.FreeMarkerRender",
      "com.jfinal.render.JsonRender$1",
      "com.jfinal.render.JsonRender",
      "com.jfinal.core.JFinal",
      "com.jfinal.render.RedirectRender",
      "com.jfinal.render.FileRender",
      "com.jfinal.render.QrCodeRender",
      "com.google.zxing.EncodeHintType",
      "com.google.zxing.qrcode.QRCodeWriter",
      "com.google.zxing.BarcodeFormat",
      "com.google.zxing.qrcode.encoder.Encoder",
      "com.google.zxing.qrcode.decoder.Mode",
      "com.google.zxing.common.BitArray",
      "com.google.zxing.common.CharacterSetECI",
      "com.google.zxing.qrcode.encoder.Encoder$1",
      "com.google.zxing.qrcode.decoder.Version$ECBlocks",
      "com.google.zxing.qrcode.decoder.Version$ECB",
      "com.google.zxing.qrcode.decoder.Version",
      "com.google.zxing.common.reedsolomon.ReedSolomonEncoder",
      "com.google.zxing.common.reedsolomon.GenericGFPoly",
      "com.google.zxing.common.reedsolomon.GenericGF",
      "com.google.zxing.qrcode.encoder.BlockPair",
      "com.google.zxing.qrcode.encoder.QRCode",
      "com.google.zxing.qrcode.encoder.ByteMatrix",
      "com.google.zxing.qrcode.encoder.MatrixUtil",
      "com.google.zxing.qrcode.encoder.MaskUtil",
      "com.jfinal.render.RenderException",
      "com.jfinal.render.TextRender",
      "com.jfinal.render.HtmlRender",
      "com.jfinal.render.ErrorRender",
      "com.jfinal.render.Redirect301Render",
      "com.jfinal.render.VelocityRender",
      "com.jfinal.render.JsonRender$2",
      "com.jfinal.kit.JsonKit",
      "com.jfinal.json.JFinalJsonFactory",
      "com.jfinal.json.Json",
      "com.jfinal.json.JFinalJson",
      "com.jfinal.render.TemplateRender",
      "com.jfinal.render.NullRender",
      "com.jfinal.render.JavascriptRender",
      "com.jfinal.plugin.activerecord.ModelRecordElResolver",
      "com.jfinal.render.JspRender",
      "com.jfinal.render.XmlRender",
      "org.apache.velocity.app.Velocity",
      "org.apache.velocity.runtime.RuntimeInstance",
      "org.apache.velocity.runtime.log.Log",
      "org.apache.velocity.runtime.log.HoldingLogChute",
      "org.apache.commons.collections.ExtendedProperties",
      "org.apache.velocity.runtime.VelocimacroFactory",
      "org.apache.velocity.runtime.log.LogDisplayWrapper",
      "org.apache.velocity.runtime.VelocimacroManager",
      "org.apache.velocity.util.MapFactory",
      "org.apache.velocity.util.introspection.IntrospectorBase",
      "org.apache.velocity.util.introspection.Introspector",
      "org.apache.velocity.util.introspection.IntrospectorCacheImpl",
      "org.apache.velocity.runtime.RuntimeSingleton",
      "freemarker.template.TemplateException",
      "freemarker.core._MiscTemplateException",
      "freemarker.core.Configurable$UnknownSettingException",
      "freemarker.core.Environment$6",
      "freemarker.core.Environment",
      "freemarker.core._DelayedConversionToString",
      "freemarker.core._DelayedJQuote",
      "freemarker.core._ErrorDescriptionBuilder",
      "freemarker.ext.beans.StringModel$1",
      "freemarker.ext.beans.StringModel",
      "freemarker.ext.beans.SimpleMemberModel",
      "com.google.zxing.common.BitMatrix",
      "com.google.zxing.client.j2se.MatrixToImageConfig",
      "com.google.zxing.client.j2se.MatrixToImageWriter",
      "freemarker.cache.WebappTemplateLoader",
      "com.jfinal.render.ContentType"
    );
  }
}