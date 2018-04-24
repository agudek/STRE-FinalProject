/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Apr 18 14:35:44 GMT 2018
 */

package com.jfinal.render;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class RenderFactory_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.jfinal.render.RenderFactory"; 
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
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.dom.DOMDocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("strategy", "EvoSuite"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
    java.lang.System.setProperty("show_progress", "false"); 
    java.lang.System.setProperty("extra_timeout", "7"); 
    java.lang.System.setProperty("sun.desktop", "gnome"); 
    java.lang.System.setProperty("process_communication_port", "7630"); 
    java.lang.System.setProperty("initialization_timeout", "7"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.factory", "org.evosuite.shaded.org.dom4j.DocumentFactory"); 
    java.lang.System.setProperty("assertion_timeout", "7"); 
    java.lang.System.setProperty("junit_tests", "true"); 
    java.lang.System.setProperty("analysis_criteria", ""); 
    java.lang.System.setProperty("sun.boot.library.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64"); 
    java.lang.System.setProperty("enable_asserts_for_evosuite", "false"); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("configuration_id", "default"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("ctg_time_per_class", "2"); 
    java.lang.System.setProperty("write_pool", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/pools/com.jfinal.render.RenderFactory.pool"); 
    java.lang.System.setProperty("save_all_data", "false"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-ctg.xml"); 
    java.lang.System.setProperty("junit_check_timeout", "7"); 
    java.lang.System.setProperty("replace_calls", "true"); 
    java.lang.System.setProperty("coverage", "true"); 
    java.lang.System.setProperty("org.evosuite.shaded.org.dom4j.DocumentFactory.singleton.strategy", "org.evosuite.shaded.org.dom4j.util.SimpleSingleton"); 
    java.lang.System.setProperty("ctg_schedule", "BUDGET"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("stopping_condition", "MAXTIME"); 
    java.lang.System.setProperty("print_to_system", "false"); 
    java.lang.System.setProperty("ctg_seeds_file_in", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/evosuite-seeds/com.jfinal.render.RenderFactory.seed"); 
    java.lang.System.setProperty("output_variables", "TARGET_CLASS,configuration_id,criterion,ctg_min_time_per_job,ctg_schedule,search_budget,p_object_pool,ctg_time_per_class,Size,Length,Total_Time,Random_Seed,LineCoverage,LineCoverageBitString,BranchCoverage,BranchCoverageBitString,ExceptionCoverage,ExceptionCoverageBitString,Explicit_MethodExceptions,Explicit_TypeExceptions,Implicit_MethodExceptions,Implicit_TypeExceptions,WeakMutationScore,WeakMutationCoverageBitString,OutputCoverage,OutputCoverageBitString,MethodCoverage,MethodCoverageBitString,MethodNoExceptionCoverage,MethodNoExceptionCoverageBitString,CBranchCoverage,CBranchCoverageBitString"); 
    java.lang.System.setProperty("global_timeout", "46"); 
    java.lang.System.setProperty("assertions", "true"); 
    java.lang.System.setProperty("log_timeout", "false"); 
    java.lang.System.setProperty("master_log_port", "37901"); 
    java.lang.System.setProperty("reset_static_fields", "true"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess"); 
    java.lang.System.setProperty("junit_check", "true"); 
    java.lang.System.setProperty("evosuite.log.folder", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/logs/com.jfinal.render.RenderFactory"); 
    java.lang.System.setProperty("minimize", "true"); 
    java.lang.System.setProperty("max_size", "100"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("ctg_min_time_per_job", "1"); 
    java.lang.System.setProperty("junit_suffix", "_ESTest"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("report_dir", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/reports/com.jfinal.render.RenderFactory"); 
    java.lang.System.setProperty("minimization_timeout", "7"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile8270871072185460129.txt"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("ctg_seeds_file_out", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/seeds/com.jfinal.render.RenderFactory.seed"); 
    java.lang.System.setProperty("TARGET_CLASS", "com.jfinal.render.RenderFactory"); 
    java.lang.System.setProperty("spawn_process_manager_port", "43787"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("write_junit_timeout", "7"); 
    java.lang.System.setProperty("test_dir", "/home/agudek/Documents/STRE/final_project/jfinal/.evosuite/tmp_2018_04_18_12_08_53/tests"); 
    java.lang.System.setProperty("search_budget", "46"); 
    java.lang.System.setProperty("plot", "false"); 
    java.lang.System.setProperty("p_object_pool", "0.3"); 
    java.lang.System.setProperty("criterion", "LINE:BRANCH:EXCEPTION:WEAKMUTATION:OUTPUT:METHOD:METHODNOEXCEPTION:CBRANCH"); 
    java.lang.System.setProperty("test_comments", "false"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(RenderFactory_ESTest_scaffolding.class.getClassLoader() ,
      "freemarker.template.TemplateMethodModel",
      "freemarker.ext.beans.BeansWrapper",
      "freemarker.ext.beans._EnumModels",
      "freemarker.template.TemplateHashModel",
      "com.jfinal.render.TextRender",
      "org.apache.log4j.DefaultCategoryFactory",
      "com.jfinal.render.FreeMarkerRender",
      "org.apache.log4j.or.RendererMap",
      "freemarker.core._ConcurrentMapFactory",
      "com.jfinal.render.JsonRender",
      "freemarker.ext.beans.JavaRebelIntegration",
      "freemarker.template.utility.NormalizeNewlines",
      "com.jfinal.plugin.activerecord.Record",
      "org.apache.velocity.context.Context",
      "com.jfinal.render.FileRender",
      "com.jfinal.render.JavascriptRender",
      "org.apache.log4j.Level",
      "freemarker.template.utility.NullArgumentException",
      "org.apache.velocity.exception.VelocityException",
      "com.jfinal.core.JFinal",
      "freemarker.ext.beans.OverloadedMethodsSubset",
      "org.apache.struts.mock.MockServletContext",
      "com.jfinal.json.Json",
      "freemarker.log._Log4JLoggerFactory$Log4JLogger",
      "com.jfinal.render.ContentType",
      "freemarker.core.Configurable$UnknownSettingException",
      "com.jfinal.json.IJsonFactory",
      "com.jfinal.render.RenderFactory$MainRenderFactory",
      "com.jfinal.core.Controller",
      "com.jfinal.render.NullRender",
      "freemarker.cache.TemplateLoader",
      "org.apache.log4j.CategoryKey",
      "freemarker.template.utility.StandardCompress",
      "com.jfinal.render.RenderFactory",
      "freemarker.cache.TemplateCache$CachedTemplate",
      "com.jfinal.kit.StrKit",
      "freemarker.cache.SoftCacheStorage",
      "com.jfinal.render.RedirectRender",
      "freemarker.template.TemplateExceptionHandler$1",
      "freemarker.template.TemplateExceptionHandler$2",
      "freemarker.template.utility.StandardCompress$StandardCompressWriter",
      "freemarker.ext.beans.StaticModels",
      "freemarker.template.utility.CaptureOutput$1",
      "freemarker.template.utility.HtmlEscape",
      "freemarker.ext.beans.SimpleMethodModel",
      "freemarker.template.TemplateException",
      "freemarker.ext.util.ModelCache",
      "freemarker.ext.beans.CollectionAdapter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.ProvisionNode",
      "freemarker.template.AdapterTemplateModel",
      "org.apache.log4j.Hierarchy",
      "freemarker.ext.beans.BeanModel$1",
      "freemarker.cache.ConcurrentCacheStorage",
      "com.jfinal.template.Engine",
      "freemarker.ext.beans.BeansWrapper$MethodAppearanceDecision",
      "freemarker.core.Configurable",
      "org.apache.log4j.helpers.FileWatchdog",
      "freemarker.core.Environment",
      "com.jfinal.json.JFinalJsonFactory",
      "freemarker.cache.FileTemplateLoader$1",
      "freemarker.ext.beans.MethodUtilities",
      "freemarker.template.TemplateExceptionHandler$3",
      "freemarker.template.TemplateExceptionHandler$4",
      "freemarker.template.TemplateScalarModel",
      "com.jfinal.render.RenderFactory$1",
      "freemarker.ext.servlet.FreemarkerServlet",
      "freemarker.ext.beans.BeansWrapper$MethodSignature",
      "freemarker.template.utility.NormalizeNewlines$1",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "com.jfinal.render.QrCodeRender",
      "freemarker.template.Version",
      "org.apache.log4j.spi.RootLogger",
      "com.jfinal.render.JsonRender$2",
      "com.jfinal.render.JsonRender$1",
      "com.jfinal.render.RenderFactory$VelocityRenderFactory",
      "org.apache.velocity.exception.ParseErrorException",
      "freemarker.template.TemplateModel",
      "org.apache.log4j.spi.RendererSupport",
      "com.jfinal.server.IServer",
      "freemarker.template.SimpleObjectWrapper",
      "freemarker.ext.beans.SequenceAdapter",
      "freemarker.ext.beans.ClassBasedModelFactory",
      "com.jfinal.render.XmlRender",
      "freemarker.template.TemplateTransformModel",
      "freemarker.template.utility.HtmlEscape$1",
      "freemarker.template.Configuration",
      "freemarker.template.TemplateSequenceModel",
      "com.jfinal.plugin.activerecord.ModelRecordElResolver",
      "com.jfinal.log.ILogFactory",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.velocity.exception.ResourceNotFoundException",
      "freemarker.template.TemplateExceptionHandler",
      "freemarker.core._MiscTemplateException",
      "com.jfinal.render.ViewType",
      "freemarker.template.utility.SecurityUtilities",
      "freemarker.template.utility.XmlEscape$1",
      "freemarker.template.TemplateMethodModelEx",
      "com.jfinal.render.RenderFactory$FreeMarkerRenderFactory",
      "org.apache.log4j.or.ObjectRenderer",
      "freemarker.ext.util.ModelFactory",
      "com.jfinal.render.Redirect301Render",
      "freemarker.log._Log4JLoggerFactory",
      "com.google.zxing.qrcode.decoder.ErrorCorrectionLevel",
      "com.jfinal.render.Render",
      "org.apache.log4j.Logger",
      "freemarker.ext.beans.SetAdapter",
      "com.jfinal.handler.Handler",
      "freemarker.template.utility.CaptureOutput",
      "freemarker.template.SimpleScalar",
      "com.jfinal.render.JspRender",
      "freemarker.template.TemplateHashModelEx",
      "freemarker.template.Template$WrongEncodingException",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.Category",
      "freemarker.ext.beans.BooleanModel",
      "freemarker.ext.beans.BeanModel",
      "freemarker.ext.beans.HashAdapter",
      "freemarker.cache.StatefulTemplateLoader",
      "com.jfinal.render.TemplateRender",
      "freemarker.template.utility.ClassUtil",
      "freemarker.ext.util.WrapperTemplateModel",
      "freemarker.ext.beans.OverloadedFixArgMethods",
      "com.jfinal.token.ITokenCache",
      "freemarker.cache.CacheStorage",
      "freemarker.ext.beans.BeansModelCache",
      "freemarker.template.utility.UndeclaredThrowableException",
      "org.apache.log4j.spi.RepositorySelector",
      "freemarker.ext.beans.InvalidPropertyException",
      "com.jfinal.json.JFinalJson",
      "freemarker.log.Logger",
      "com.jfinal.render.HtmlRender",
      "com.jfinal.render.IRenderFactory",
      "freemarker.core.ParseException",
      "org.apache.log4j.spi.LoggerFactory",
      "org.apache.log4j.spi.Configurator",
      "freemarker.cache.TemplateCache",
      "freemarker.ext.beans.OverloadedVarargMethods",
      "org.apache.log4j.or.DefaultRenderer",
      "com.jfinal.captcha.ICaptchaCache",
      "freemarker.core.TemplateClassResolver",
      "com.jfinal.core.ActionHandler",
      "com.jfinal.kit.JsonKit",
      "freemarker.template.TemplateModelException",
      "com.jfinal.plugin.activerecord.Model",
      "org.apache.log4j.PropertyWatchdog",
      "freemarker.template.TemplateCollectionModel",
      "freemarker.log.LoggerFactory",
      "freemarker.cache.TemplateCache$TemplateKey",
      "org.apache.log4j.spi.ThrowableRendererSupport",
      "freemarker.ext.beans.OverloadedMethods",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.commons.logging.impl.Log4JLogger",
      "freemarker.template.DefaultObjectWrapper",
      "com.jfinal.render.ErrorRender",
      "com.jfinal.render.VelocityRender",
      "com.jfinal.captcha.CaptchaRender",
      "freemarker.template.Template",
      "freemarker.core.ArithmeticEngine$BigDecimalEngine",
      "freemarker.ext.beans.BeansWrapper$1",
      "freemarker.template.TemplateNumberModel",
      "freemarker.core.ArithmeticEngine",
      "freemarker.ext.beans.BeansWrapper$3",
      "freemarker.ext.beans.BeansWrapper$2",
      "com.jfinal.render.RenderFactory$JspRenderFactory",
      "freemarker.core.ArithmeticEngine$ConservativeEngine",
      "freemarker.core.FMParserConstants",
      "org.apache.log4j.spi.AppenderAttachable",
      "freemarker.template.utility.SecurityUtilities$1",
      "freemarker.ext.beans.SimpleMemberModel",
      "freemarker.core.TemplateClassResolver$3",
      "freemarker.template.utility.XmlEscape",
      "freemarker.template.TemplateModelAdapter",
      "org.apache.log4j.Priority",
      "com.jfinal.config.Constants",
      "freemarker.core.TemplateClassResolver$1",
      "freemarker.core.TemplateClassResolver$2",
      "com.jfinal.core.ControllerFactory",
      "org.apache.log4j.spi.LoggerRepository",
      "com.jfinal.render.RenderException",
      "org.apache.log4j.LogManager",
      "freemarker.cache.FileTemplateLoader",
      "com.jfinal.core.Const",
      "freemarker.template.ObjectWrapper",
      "freemarker.template.TemplateBooleanModel"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(RenderFactory_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.jfinal.render.RenderFactory",
      "com.jfinal.render.RenderFactory$MainRenderFactory",
      "com.jfinal.render.RenderFactory$FreeMarkerRenderFactory",
      "com.jfinal.render.RenderFactory$JspRenderFactory",
      "com.jfinal.render.RenderFactory$VelocityRenderFactory",
      "com.jfinal.render.ViewType",
      "com.jfinal.render.RenderFactory$1",
      "com.jfinal.render.Render",
      "com.jfinal.render.TextRender",
      "com.jfinal.render.TemplateRender",
      "com.jfinal.render.XmlRender",
      "com.jfinal.plugin.activerecord.ModelRecordElResolver",
      "com.jfinal.core.JFinal",
      "com.jfinal.render.JspRender",
      "com.jfinal.render.JsonRender$1",
      "com.jfinal.render.JsonRender",
      "com.jfinal.kit.JsonKit",
      "com.jfinal.json.JFinalJsonFactory",
      "com.jfinal.json.Json",
      "com.jfinal.json.JFinalJson",
      "com.jfinal.kit.StrKit",
      "com.jfinal.render.HtmlRender",
      "com.jfinal.render.JavascriptRender",
      "com.jfinal.render.QrCodeRender",
      "com.jfinal.render.RedirectRender",
      "com.jfinal.render.Redirect301Render",
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
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "freemarker.log._Log4JLoggerFactory",
      "freemarker.log._Log4JLoggerFactory$Log4JLogger",
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
      "com.jfinal.render.FileRender",
      "com.jfinal.config.Constants",
      "com.jfinal.core.ControllerFactory",
      "com.jfinal.core.Const",
      "com.jfinal.template.EngineConfig",
      "com.jfinal.template.io.WriterBuffer",
      "com.jfinal.template.io.EncoderFactory",
      "com.jfinal.template.io.WriterBuffer$1",
      "com.jfinal.template.io.WriterBuffer$2",
      "com.jfinal.template.io.WriterBuffer$3",
      "com.jfinal.template.OutputDirectiveFactory",
      "com.jfinal.template.source.FileSourceFactory",
      "com.jfinal.template.expr.ast.SharedMethodKit",
      "com.jfinal.template.ext.sharedmethod.SharedMethodLib",
      "com.jfinal.template.ext.extensionmethod.StringExt",
      "com.jfinal.template.expr.ast.MethodKit",
      "com.jfinal.template.Engine",
      "com.jfinal.render.VelocityRender",
      "org.apache.struts.mock.MockServletContext",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.commons.logging.impl.SimpleLog$1",
      "org.apache.commons.logging.impl.SimpleLog",
      "com.jfinal.render.ErrorRender",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.AggregateLifeCycle",
      "org.eclipse.jetty.server.handler.AbstractHandler",
      "org.eclipse.jetty.server.handler.AbstractHandlerContainer",
      "org.eclipse.jetty.server.handler.HandlerWrapper",
      "org.eclipse.jetty.server.handler.ScopedHandler",
      "org.eclipse.jetty.server.session.SessionHandler",
      "org.eclipse.jetty.server.session.AbstractSessionManager$1",
      "org.eclipse.jetty.server.session.AbstractSessionManager",
      "org.eclipse.jetty.server.session.HashSessionManager",
      "org.eclipse.jetty.util.statistic.CounterStatistic",
      "org.eclipse.jetty.util.statistic.SampleStatistic",
      "org.eclipse.jetty.server.session.AbstractSessionManager$2",
      "com.jfinal.captcha.CaptchaRender",
      "com.jfinal.render.JsonRender$2",
      "com.jfinal.render.NullRender",
      "org.eclipse.jetty.security.MappedLoginService",
      "org.eclipse.jetty.security.HashLoginService",
      "org.eclipse.jetty.security.DefaultIdentityService",
      "org.eclipse.jetty.util.resource.Resource",
      "org.eclipse.jetty.util.resource.URLResource",
      "org.eclipse.jetty.util.resource.FileResource",
      "org.eclipse.jetty.security.SecurityHandler$2",
      "org.eclipse.jetty.security.SecurityHandler$3",
      "org.eclipse.jetty.security.SecurityHandler",
      "org.eclipse.jetty.server.handler.ContextHandler",
      "org.eclipse.jetty.servlet.ServletContextHandler",
      "org.eclipse.jetty.webapp.WebAppContext",
      "org.eclipse.jetty.util.AttributesMap",
      "org.eclipse.jetty.server.handler.ContextHandler$Context",
      "org.eclipse.jetty.servlet.ServletContextHandler$Context",
      "org.eclipse.jetty.webapp.MetaData",
      "org.eclipse.jetty.webapp.WebAppContext$Context",
      "org.eclipse.jetty.server.handler.ErrorHandler",
      "org.eclipse.jetty.servlet.ErrorPageErrorHandler",
      "com.oreilly.servlet.MultipartFilter",
      "org.eclipse.jetty.server.AbstractConnector",
      "org.eclipse.jetty.server.LocalConnector",
      "org.eclipse.jetty.http.HttpBuffersImpl",
      "org.eclipse.jetty.util.component.AggregateLifeCycle$Bean",
      "org.eclipse.jetty.io.ByteArrayEndPoint",
      "org.eclipse.jetty.server.Server",
      "org.eclipse.jetty.util.component.Container",
      "org.eclipse.jetty.util.LazyList",
      "org.eclipse.jetty.io.AbstractBuffers",
      "org.eclipse.jetty.io.ThreadLocalBuffers",
      "org.eclipse.jetty.io.ThreadLocalBuffers$1",
      "org.eclipse.jetty.http.HttpParser",
      "org.eclipse.jetty.io.AbstractBuffer",
      "org.eclipse.jetty.io.View",
      "org.eclipse.jetty.io.View$CaseInsensitive",
      "org.eclipse.jetty.http.AbstractGenerator",
      "org.eclipse.jetty.io.BufferCache",
      "org.eclipse.jetty.util.StringMap",
      "org.eclipse.jetty.util.StringMap$Node",
      "org.eclipse.jetty.io.ByteArrayBuffer",
      "org.eclipse.jetty.io.ByteArrayBuffer$CaseInsensitive",
      "org.eclipse.jetty.io.BufferCache$CachedBuffer",
      "org.eclipse.jetty.util.StringUtil",
      "org.eclipse.jetty.http.HttpVersions",
      "org.eclipse.jetty.http.HttpStatus$Code",
      "org.eclipse.jetty.http.HttpStatus",
      "org.eclipse.jetty.http.HttpGenerator$Status",
      "org.eclipse.jetty.http.HttpGenerator",
      "org.eclipse.jetty.server.Request",
      "org.eclipse.jetty.continuation.ContinuationThrowable",
      "org.eclipse.jetty.server.AsyncContinuation",
      "org.eclipse.jetty.io.AbstractConnection",
      "org.eclipse.jetty.server.AbstractHttpConnection",
      "org.eclipse.jetty.server.BlockingHttpConnection",
      "org.eclipse.jetty.util.URIUtil",
      "org.eclipse.jetty.http.HttpURI",
      "org.eclipse.jetty.util.Utf8Appendable",
      "org.eclipse.jetty.util.Utf8StringBuilder",
      "org.eclipse.jetty.util.DateCache",
      "org.eclipse.jetty.io.BufferDateCache",
      "org.eclipse.jetty.http.HttpFields$1",
      "org.eclipse.jetty.http.HttpFields$2",
      "org.eclipse.jetty.http.HttpFields$DateGenerator",
      "org.eclipse.jetty.util.StringMap$NullEntry",
      "org.eclipse.jetty.http.HttpFields",
      "org.eclipse.jetty.server.Response",
      "org.eclipse.jetty.util.resource.ResourceCollection",
      "org.eclipse.jetty.server.nio.AbstractNIOConnector",
      "org.eclipse.jetty.server.nio.SelectChannelConnector",
      "org.eclipse.jetty.io.nio.SelectorManager",
      "org.eclipse.jetty.server.nio.SelectChannelConnector$ConnectorSelectorManager",
      "org.eclipse.jetty.util.component.Container$Relationship",
      "org.eclipse.jetty.http.HttpParser$EventHandler",
      "org.eclipse.jetty.server.AbstractHttpConnection$RequestHandler",
      "com.alibaba.druid.support.logging.Resources",
      "com.alibaba.druid.support.logging.Log4jImpl",
      "com.alibaba.druid.support.logging.LogFactory",
      "com.alibaba.druid.pool.vendor.OracleExceptionSorter",
      "org.eclipse.jetty.servlet.ServletHandler",
      "org.eclipse.jetty.servlet.Holder",
      "org.eclipse.jetty.servlet.FilterHolder",
      "org.eclipse.jetty.servlet.FilterMapping",
      "org.eclipse.jetty.util.MultiMap",
      "org.eclipse.jetty.server.AsyncHttpConnection",
      "com.mchange.v2.c3p0.impl.AbstractIdentityTokenized",
      "com.mchange.v2.c3p0.impl.IdentityTokenResolvable",
      "com.mchange.v2.log.MLogConfig",
      "com.mchange.v2.cfg.MLogConfigSource",
      "com.mchange.v2.cfg.ConfigUtils",
      "com.mchange.v2.cfg.DelayedLogItem",
      "com.mchange.v2.cfg.DelayedLogItem$Level",
      "com.mchange.v2.cfg.MultiPropertiesConfig",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig",
      "com.mchange.v2.cfg.BasicPropertiesConfigSource",
      "com.mchange.v2.cfg.PropertiesConfigSource$Parse",
      "com.mchange.v2.cfg.BasicMultiPropertiesConfig$SystemPropertiesConfigSource",
      "com.mchange.v2.log.MLogClasses",
      "com.mchange.v2.log.MLevel",
      "com.mchange.v2.log.slf4j.Slf4jMLog",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$TraceLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$DebugLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$InfoLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$WarnLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$ErrorLogger",
      "com.mchange.v2.log.slf4j.Slf4jMLog$Slf4jMLogger$OffLogger",
      "com.mchange.v2.log.MLog$1",
      "com.mchange.v2.log.MLog",
      "com.mchange.v2.naming.JavaBeanReferenceMaker",
      "com.mchange.v2.naming.ReferenceIndirector",
      "com.mchange.v2.c3p0.impl.DriverManagerDataSourceBase",
      "com.alibaba.druid.proxy.DruidDriver$1",
      "com.alibaba.druid.proxy.DruidDriver",
      "com.alibaba.druid.mock.handler.MySqlMockExecuteHandlerImpl",
      "com.alibaba.druid.mock.MockDriver",
      "org.hsqldb.jdbc.JDBCDriver",
      "com.mchange.v2.c3p0.DriverManagerDataSource",
      "com.mchange.v2.c3p0.impl.C3P0Defaults",
      "com.mchange.v2.cfg.MConfig$CSManager",
      "com.mchange.v1.cachedstore.CachedStoreFactory",
      "com.mchange.v1.cachedstore.NoCleanupCachedStore",
      "com.mchange.v1.cachedstore.CachedStoreUtils",
      "com.mchange.v1.lang.Synchronizer",
      "com.mchange.v1.lang.Synchronizer$1",
      "com.mchange.v2.cfg.MConfig",
      "com.mchange.v2.cfg.MConfig$PathsKey",
      "com.mchange.v1.util.ArrayUtils",
      "com.mchange.v2.lang.ObjectUtils",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigXmlUtils",
      "com.mchange.v2.c3p0.cfg.DefaultC3P0ConfigFinder",
      "com.mchange.v2.c3p0.cfg.C3P0ConfigUtils",
      "com.mchange.v2.lang.Coerce",
      "com.mchange.v2.c3p0.cfg.NamedScope",
      "com.mchange.v2.c3p0.cfg.C3P0Config",
      "com.mchange.v1.lang.BooleanUtils",
      "com.mchange.v2.c3p0.impl.AuthMaskingProperties",
      "com.mchange.v2.c3p0.impl.DbAuth",
      "com.mchange.v2.log.jdk14logging.ForwardingLogger",
      "com.mchange.v1.identicator.IdentityHashCodeIdenticator",
      "com.mchange.v2.encounter.EncounterUtils",
      "com.mchange.v2.encounter.AbstractEncounterCounter",
      "com.mchange.v2.encounter.GenericEncounterCounter",
      "com.mchange.v1.identicator.IdMap",
      "com.mchange.v1.identicator.IdWeakHashMap",
      "com.mchange.v2.encounter.EncounterUtils$1",
      "com.mchange.v2.uid.UidUtils",
      "com.mchange.v2.c3p0.impl.C3P0ImplUtils",
      "com.mchange.v1.identicator.IdHashKey",
      "com.mchange.v1.identicator.WeakIdHashKey",
      "com.mchange.v1.identicator.WeakIdHashKey$Ref",
      "com.mchange.v2.c3p0.impl.IdentityTokenizedCoalesceChecker",
      "com.mchange.v2.coalesce.CoalescerFactory",
      "com.mchange.v2.coalesce.AbstractWeakCoalescer",
      "com.mchange.v2.coalesce.WeakCcCoalescer",
      "com.mchange.v2.coalesce.CoalesceIdenticator",
      "com.mchange.v2.util.DoubleWeakHashMap",
      "com.mchange.v2.util.DoubleWeakHashMap$CheckKeyHolder",
      "com.mchange.v2.c3p0.AbstractConnectionTester",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$1",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$2",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester$3",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner$1",
      "com.mchange.v2.c3p0.impl.ThreadLocalQuerylessTestRunner",
      "com.mchange.v2.c3p0.impl.DefaultConnectionTester",
      "com.mchange.v2.c3p0.management.ActiveManagementCoordinator",
      "com.mchange.v2.c3p0.C3P0Registry",
      "com.mchange.v2.util.DoubleWeakHashMap$UserKeySet",
      "com.mchange.v2.util.DoubleWeakHashMap$WKey",
      "com.mchange.v2.util.DoubleWeakHashMap$WVal",
      "com.mchange.v2.c3p0.DriverManagerDataSource$1",
      "org.apache.jasper.servlet.JspCServletContext",
      "com.jfinal.log.JdkLogFactory",
      "com.jfinal.log.LogManager",
      "com.jfinal.log.Log4jLogFactory",
      "com.jfinal.log.Log",
      "com.jfinal.kit.LogKit",
      "com.jfinal.log.JdkLog",
      "com.jfinal.kit.LogKit$Holder",
      "com.jfinal.core.ActionReporter$SystemOutWriter",
      "com.jfinal.core.ActionReporter$1",
      "com.jfinal.core.ActionReporter",
      "org.springframework.util.CustomizableThreadCreator",
      "org.springframework.scheduling.concurrent.CustomizableThreadFactory",
      "org.springframework.scheduling.concurrent.ExecutorConfigurationSupport",
      "org.springframework.util.ClassUtils",
      "org.springframework.util.Assert",
      "org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler",
      "org.springframework.util.StringUtils",
      "org.springframework.scheduling.concurrent.ScheduledExecutorTask",
      "org.apache.struts.mock.MockHttpSession",
      "com.jfinal.ext.interceptor.SessionInViewInterceptor$JFinalSession",
      "org.eclipse.jetty.webapp.AbstractConfiguration",
      "org.eclipse.jetty.webapp.WebInfConfiguration",
      "org.eclipse.jetty.server.session.JDBCSessionManager",
      "org.eclipse.jetty.security.ConstraintSecurityHandler",
      "org.eclipse.jetty.security.DefaultAuthenticatorFactory",
      "org.eclipse.jetty.http.PathMap",
      "org.eclipse.jetty.webapp.Descriptor",
      "org.eclipse.jetty.webapp.WebDescriptor",
      "org.eclipse.jetty.webapp.DefaultsDescriptor",
      "com.jfinal.render.RenderManager",
      "com.jfinal.template.source.ClassPathSourceFactory",
      "com.jfinal.core.JFinalFilter",
      "com.alibaba.druid.util.jdbc.ConnectionBase",
      "com.alibaba.druid.mock.MockConnection",
      "com.alibaba.druid.util.jdbc.StatementBase",
      "com.alibaba.druid.util.jdbc.PreparedStatementBase",
      "com.alibaba.druid.mock.MockPreparedStatement",
      "com.alibaba.druid.mock.MockParameterMetaData",
      "com.alibaba.druid.util.jdbc.ResultSetMetaDataBase",
      "com.alibaba.druid.mock.MockResultSetMetaData",
      "com.alibaba.druid.util.jdbc.ResultSetBase",
      "com.alibaba.druid.mock.MockResultSet",
      "com.google.zxing.qrcode.decoder.ErrorCorrectionLevel",
      "com.mchange.v2.c3p0.impl.WrapperConnectionPoolDataSourceBase",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource",
      "com.mchange.v2.c3p0.WrapperConnectionPoolDataSource$1",
      "org.eclipse.jetty.http.MimeTypes",
      "org.eclipse.jetty.io.SimpleBuffers",
      "freemarker.ext.servlet.FreemarkerServlet",
      "com.jfinal.template.source.FileSource",
      "org.eclipse.jetty.server.session.AbstractSession",
      "org.eclipse.jetty.server.session.HashedSession",
      "com.jfinal.captcha.CaptchaManager",
      "com.alibaba.druid.pool.WrapperAdapter",
      "com.alibaba.druid.pool.DruidAbstractDataSource",
      "com.alibaba.druid.pool.DruidDataSource",
      "com.alibaba.druid.util.Histogram",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerAdapter",
      "com.alibaba.druid.pool.DruidDataSourceStatLoggerImpl",
      "com.alibaba.druid.util.Utils",
      "com.zaxxer.hikari.util.DefaultThreadFactory",
      "org.eclipse.jetty.util.TypeUtil",
      "org.eclipse.jetty.util.MultiException",
      "com.zaxxer.hikari.util.DriverDataSource",
      "org.eclipse.jetty.servlet.Holder$HolderRegistration",
      "org.eclipse.jetty.servlet.FilterHolder$Registration",
      "com.jfinal.captcha.CaptchaCache",
      "com.jfinal.captcha.CaptchaCache$1"
    );
  }
}
