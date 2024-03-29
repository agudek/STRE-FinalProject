/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 11:30:37 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.render.FileRender;
import com.jfinal.render.Render;
import java.io.File;
import java.net.URL;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import org.eclipse.jetty.http.HttpGenerator;
import org.eclipse.jetty.http.HttpParser;
import org.eclipse.jetty.io.Buffers;
import org.eclipse.jetty.io.ByteArrayEndPoint;
import org.eclipse.jetty.io.EndPoint;
import org.eclipse.jetty.io.ThreadLocalBuffers;
import org.eclipse.jetty.security.ConstraintSecurityHandler;
import org.eclipse.jetty.server.BlockingHttpConnection;
import org.eclipse.jetty.server.LocalConnector;
import org.eclipse.jetty.server.Request;
import org.eclipse.jetty.server.Response;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.util.resource.FileResource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class FileRender_ESTest extends FileRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FileRender fileRender0 = new FileRender("O");
      LocalConnector localConnector0 = new LocalConnector();
      ByteArrayEndPoint byteArrayEndPoint0 = new ByteArrayEndPoint();
      Server server0 = new Server();
      Buffers.Type buffers_Type0 = Buffers.Type.DIRECT;
      ThreadLocalBuffers threadLocalBuffers0 = new ThreadLocalBuffers(buffers_Type0, (-1298), buffers_Type0, 58, buffers_Type0);
      HttpParser.EventHandler httpParser_EventHandler0 = mock(HttpParser.EventHandler.class, new ViolatedAssumptionAnswer());
      HttpParser httpParser0 = new HttpParser(threadLocalBuffers0, byteArrayEndPoint0, httpParser_EventHandler0);
      HttpGenerator httpGenerator0 = new HttpGenerator(threadLocalBuffers0, byteArrayEndPoint0);
      Request request0 = new Request();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, byteArrayEndPoint0, server0, httpParser0, httpGenerator0, request0);
      Request request1 = new Request(blockingHttpConnection0);
      String string0 = fileRender0.encodeFileName(request1, "1fWFE&mYV#IIO");
      assertEquals("filename=\"1fWFE%26mYV%23IIO\"", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileRender fileRender0 = new FileRender("O");
      fileRender0.setView(",is**>!6|u]cD,7");
      LocalConnector localConnector0 = new LocalConnector();
      ByteArrayEndPoint byteArrayEndPoint0 = new ByteArrayEndPoint();
      Server server0 = new Server();
      Buffers.Type buffers_Type0 = Buffers.Type.DIRECT;
      ThreadLocalBuffers threadLocalBuffers0 = new ThreadLocalBuffers(buffers_Type0, (-1298), buffers_Type0, 58, buffers_Type0);
      HttpParser.EventHandler httpParser_EventHandler0 = mock(HttpParser.EventHandler.class, new ViolatedAssumptionAnswer());
      HttpParser httpParser0 = new HttpParser(threadLocalBuffers0, byteArrayEndPoint0, httpParser_EventHandler0);
      HttpGenerator httpGenerator0 = new HttpGenerator(threadLocalBuffers0, byteArrayEndPoint0);
      Request request0 = new Request();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, byteArrayEndPoint0, server0, httpParser0, httpGenerator0, request0);
      Request request1 = new Request(blockingHttpConnection0);
      String string0 = fileRender0.encodeFileName(request1, "");
      assertEquals("filename=\"\"", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ConstraintSecurityHandler constraintSecurityHandler0 = new ConstraintSecurityHandler();
      WebAppContext webAppContext0 = new WebAppContext(constraintSecurityHandler0, "b!<TPX}H<Z_", "}");
      WebAppContext.Context webAppContext_Context0 = webAppContext0.new Context();
      FileRender.init((String) null, webAppContext_Context0);
      assertEquals(3, webAppContext_Context0.getEffectiveMajorVersion());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FileRender fileRender0 = new FileRender("com.alibaba.druid.sql.ast.statement.SQLExprTableSource", "filename*=UTF-8''");
      Render.init("com.alibaba.druid.sql.ast.statement.SQLExprTableSource", true);
      String string0 = fileRender0.encodeFileName("com.alibaba.druid.sql.ast.statement.SQLExprTableSource");
      assertEquals("com.alibaba.druid.sql.ast.statement.SQLExprTableSource", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileRender fileRender0 = new FileRender("TODO : ");
      String string0 = fileRender0.encodeFileName("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FileRender fileRender0 = new FileRender(":(SoQta{");
      // Undeclared exception!
      try { 
        fileRender0.rangeRender();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FileRender fileRender0 = new FileRender("en8Sb4!#bNu7i");
      // Undeclared exception!
      try { 
        fileRender0.processRange((Long[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FileRender fileRender0 = new FileRender("Content-Length", "Content-Length");
      // Undeclared exception!
      try { 
        fileRender0.normalRender();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FileRender fileRender0 = new FileRender("mozilla");
      Request request0 = new Request();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(request0);
      // Undeclared exception!
      try { 
        fileRender0.encodeFileName(httpServletRequestWrapper0, "org.eclipse.multiPartInputStream");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.jetty.server.Request", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FileRender fileRender0 = null;
      try {
        fileRender0 = new FileRender("/)9b3gLEF");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FileRender fileRender0 = null;
      try {
        fileRender0 = new FileRender("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // fileName can not be blank.
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      FileResource fileResource0 = new FileResource(uRL0);
      File file0 = fileResource0.getFile();
      FileRender fileRender0 = new FileRender(file0);
      assertNull(fileRender0.getView());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "filename*=UTF-8''");
      LocalConnector localConnector0 = new LocalConnector();
      Server server0 = new Server();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, (EndPoint) null, server0);
      Response response0 = blockingHttpConnection0.getResponse();
      fileRender0.response = (HttpServletResponse) response0;
      // Undeclared exception!
      try { 
        fileRender0.normalRender();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "filename*=UTF-8''");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null/E+[");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "filename*=UTF-8''");
      LocalConnector localConnector0 = new LocalConnector();
      Server server0 = new Server();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, (EndPoint) null, server0);
      Response response0 = blockingHttpConnection0.getResponse();
      fileRender0.response = (HttpServletResponse) response0;
      // Undeclared exception!
      try { 
        fileRender0.normalRender();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "E+[");
      LocalConnector localConnector0 = new LocalConnector();
      Server server0 = new Server();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, (EndPoint) null, server0);
      Response response0 = blockingHttpConnection0.getResponse();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null/E+[");
      byte[] byteArray0 = new byte[0];
      FileSystemHandling.appendDataToFile(evoSuiteFile0, byteArray0);
      fileRender0.response = (HttpServletResponse) response0;
      // Undeclared exception!
      try { 
        fileRender0.normalRender();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "E+[");
      LocalConnector localConnector0 = new LocalConnector();
      Server server0 = new Server();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, (EndPoint) null, server0);
      Request request0 = new Request(blockingHttpConnection0);
      String string0 = fileRender0.encodeFileName(request0, "STOPPED");
      assertEquals("filename=\"STOPPED\"", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[");
      LocalConnector localConnector0 = new LocalConnector();
      Server server0 = new Server();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, (EndPoint) null, server0);
      Response response0 = blockingHttpConnection0.getResponse();
      fileRender0.response = (HttpServletResponse) response0;
      // Undeclared exception!
      try { 
        fileRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "filename*=UTF-8''");
      LocalConnector localConnector0 = new LocalConnector();
      Server server0 = new Server();
      BlockingHttpConnection blockingHttpConnection0 = new BlockingHttpConnection(localConnector0, (EndPoint) null, server0);
      Response response0 = blockingHttpConnection0.getResponse();
      fileRender0.response = (HttpServletResponse) response0;
      // Undeclared exception!
      try { 
        fileRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "filename*=UTF-8''");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("null/E+[");
      FileSystemHandling.createFolder(evoSuiteFile0);
      // Undeclared exception!
      try { 
        fileRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileRender fileRender0 = new FileRender("E+[", "filename*=UTF-8''");
      fileRender0.file = null;
      // Undeclared exception!
      try { 
        fileRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileRender fileRender0 = null;
      try {
        fileRender0 = new FileRender("Z0rNL[RU3CwyZO", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // downloadFileName can not be blank.
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FileRender fileRender0 = new FileRender("downloadFileName can not be blank.", "downloadFileName can not be blank.");
      // Undeclared exception!
      try { 
        fileRender0.encodeFileName((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileRender fileRender0 = null;
      try {
        fileRender0 = new FileRender("/Z0rNL[RU$3CiwyZO", "/Z0rNL[RU$3CiwyZO");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile((File) null, "mpY9agG?-g2s$*M");
      FileRender fileRender0 = new FileRender(mockFile0, "mpY9agG?-g2s$*M");
      assertFalse(fileRender0.getDevMode());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FileRender fileRender0 = null;
      try {
        fileRender0 = new FileRender((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // file can not be null.
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      FileRender fileRender0 = null;
      try {
        fileRender0 = new FileRender(mockFile0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // downloadFileName can not be blank.
         //
         verifyException("com.jfinal.render.FileRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileRender.init("Unabe to procs jetty-web.xml", (ServletContext) null);
  }
}
