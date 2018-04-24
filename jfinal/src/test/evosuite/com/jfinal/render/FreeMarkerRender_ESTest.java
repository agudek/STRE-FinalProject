/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:20:24 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceC3P0Adapter;
import com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement;
import com.jfinal.render.FreeMarkerRender;
import com.jfinal.render.Render;
import freemarker.template.Configuration;
import java.util.Locale;
import java.util.Properties;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.apache.struts.mock.MockServletContext;
import org.eclipse.jetty.http.HttpGenerator;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.http.MimeTypes;
import org.eclipse.jetty.io.BufferCache;
import org.eclipse.jetty.io.ByteArrayEndPoint;
import org.eclipse.jetty.io.SimpleBuffers;
import org.eclipse.jetty.io.View;
import org.eclipse.jetty.server.BlockingHttpConnection;
import org.eclipse.jetty.server.LocalConnector;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.Server;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class FreeMarkerRender_ESTest extends FreeMarkerRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FreeMarkerRender.setProperty("url_escaping_charset", "time_format");
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FreeMarkerRender freeMarkerRender0 = new FreeMarkerRender("text/html; charset=");
      LocalConnector localConnector0 = new LocalConnector();
      ByteArrayEndPoint byteArrayEndPoint0 = new ByteArrayEndPoint();
      Server server0 = new Server((-1));
      BufferCache.CachedBuffer bufferCache_CachedBuffer0 = MimeTypes.TEXT_JSON__UTF_8_BUFFER;
      View view0 = new View(bufferCache_CachedBuffer0, (-1), (-1), 0, 232);
      HttpParser.EventHandler httpParser_EventHandler0 = mock(HttpParser.EventHandler.class, new ViolatedAssumptionAnswer());
      HttpParser httpParser0 = new HttpParser(view0, httpParser_EventHandler0);
      SimpleBuffers simpleBuffers0 = new SimpleBuffers(view0, view0);
      HttpGenerator httpGenerator0 = new HttpGenerator(simpleBuffers0, byteArrayEndPoint0);
      Request request0 = new Request();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, byteArrayEndPoint0, server0, httpParser0, httpGenerator0, request0);
      Response response0 = blockingHttpConnection0.getResponse();
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(response0);
      freeMarkerRender0.response = (HttpServletResponse) httpServletResponseWrapper0;
      // Undeclared exception!
      try { 
        freeMarkerRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FreeMarkerRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DruidDataSource druidDataSource0 = new DruidDataSource();
      Properties properties0 = druidDataSource0.getConnectProperties();
      properties0.setProperty("object_wrapper", "output_encoding");
      // Undeclared exception!
      try { 
        FreeMarkerRender.setProperties(properties0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("com.jfinal.render.FreeMarkerRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        FreeMarkerRender.setProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("freemarker.core.Configurable", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DruidDataSourceC3P0Adapter druidDataSourceC3P0Adapter0 = new DruidDataSourceC3P0Adapter();
      Properties properties0 = druidDataSourceC3P0Adapter0.getProperties();
      SQLCreateTableStatement.Type sQLCreateTableStatement_Type0 = SQLCreateTableStatement.Type.LOCAL_TEMPORARY;
      properties0.put(sQLCreateTableStatement_Type0, "4`EEoqMU]!~Uj`");
      // Undeclared exception!
      try { 
        FreeMarkerRender.setProperties(properties0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.alibaba.druid.sql.ast.statement.SQLCreateTableStatement$Type cannot be cast to java.lang.String
         //
         verifyException("freemarker.core.Configurable", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockServletContext mockServletContext0 = new MockServletContext();
      // Undeclared exception!
      try { 
        FreeMarkerRender.init(mockServletContext0, (Locale) null, 33);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The \"locale\" argument can't be null
         //
         verifyException("freemarker.template.utility.NullArgumentException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale locale0 = Locale.KOREAN;
      // Undeclared exception!
      try { 
        FreeMarkerRender.init((ServletContext) null, locale0, 129);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal FreeMarker error: java.lang.reflect.InvocationTargetException
         //
         verifyException("freemarker.template.Configuration", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FreeMarkerRender freeMarkerRender0 = new FreeMarkerRender("tag_syntax");
      String string0 = freeMarkerRender0.getContentType();
      assertEquals("text/html; charset=UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Configuration configuration0 = FreeMarkerRender.getConfiguration();
      assertNull(configuration0.getURLEscapingCharset());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MockServletContext mockServletContext0 = new MockServletContext();
      Render.init("c2D(oeCl!1ab[s", true);
      Locale locale0 = Locale.US;
      FreeMarkerRender.init(mockServletContext0, locale0, (-1017));
      assertEquals(3, mockServletContext0.getMinorVersion());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Properties properties0 = new Properties();
      FreeMarkerRender.setProperties(properties0);
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FreeMarkerRender.setSharedVariable("0'", "0'");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        FreeMarkerRender.setTemplateLoadingPath("STARTING");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Internal FreeMarker error: java.lang.reflect.InvocationTargetException
         //
         verifyException("freemarker.template.Configuration", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        FreeMarkerRender.setProperty("~+6=D", "~+6=D");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // org.evosuite.runtime.mock.java.lang.MockThrowable
         //
         verifyException("com.jfinal.render.FreeMarkerRender", e);
      }
  }
}