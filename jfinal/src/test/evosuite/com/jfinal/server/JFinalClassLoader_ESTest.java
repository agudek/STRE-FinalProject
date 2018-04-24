/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:13:16 GMT 2018
 */

package com.jfinal.server;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.server.JFinalClassLoader;
import java.net.MalformedURLException;
import org.eclipse.jetty.security.SecurityHandler;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.server.handler.ErrorHandler;
import org.eclipse.jetty.server.session.SessionHandler;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.util.resource.Resource;
import org.eclipse.jetty.webapp.WebAppContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockInetSocketAddress;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class JFinalClassLoader_ESTest extends JFinalClassLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext((SessionHandler) null, (SecurityHandler) null, (ServletHandler) null, (ErrorHandler) null);
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "-n-STOPPING");
      Class class0 = jFinalClassLoader0.loadClass("com.jfinal.server.JFinalClassLoader");
      assertFalse(class0.isInterface());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext();
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, (String) null);
      try { 
        jFinalClassLoader0.loadClass("");
        fail("Expecting exception: ClassNotFoundException");
      
      } catch(ClassNotFoundException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JFinalClassLoader jFinalClassLoader0 = null;
      try {
        jFinalClassLoader0 = new JFinalClassLoader((WebAppContext) null, "org.eclipse.jetty.server.error_page");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.jetty.webapp.WebAppClassLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("WEB-INF/classes/", 1289);
      Server server0 = new Server(mockInetSocketAddress0);
      WebAppContext webAppContext0 = new WebAppContext(server0, "STARTED", "");
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "");
      Resource resource0 = Resource.newClassPathResource("");
      jFinalClassLoader0.addJars(resource0);
      assertTrue(Resource.__defaultUseCaches);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext();
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "");
      try { 
        jFinalClassLoader0.addClassPath("WEB-INF/classes/");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: WEB-INF/classes/
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext("", "");
      webAppContext0.setExtraClasspath("");
      JFinalClassLoader jFinalClassLoader0 = null;
      try {
        jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "org/eclipse/jetty/webapp/webdefault.xml");
        fail("Expecting exception: MalformedURLException");
      
      } catch(Throwable e) {
         //
         // no protocol: org/eclipse/jetty/webapp/webdefault.xml
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext((SessionHandler) null, (SecurityHandler) null, (ServletHandler) null, (ErrorHandler) null);
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "-n-STOPPING");
      jFinalClassLoader0.addClassPath("STARTED");
      assertEquals("8", jFinalClassLoader0.getName());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext();
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "-y-");
      assertEquals("8", jFinalClassLoader0.getName());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      WebAppContext webAppContext0 = new WebAppContext();
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, (String) null);
      // Undeclared exception!
      try { 
        jFinalClassLoader0.addClassPath((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      MockInetSocketAddress mockInetSocketAddress0 = new MockInetSocketAddress("WEB-INF/classes/", 1289);
      Server server0 = new Server(mockInetSocketAddress0);
      WebAppContext webAppContext0 = new WebAppContext(server0, "STARTED", "");
      JFinalClassLoader jFinalClassLoader0 = new JFinalClassLoader(webAppContext0, "");
      // Undeclared exception!
      try { 
        jFinalClassLoader0.loadClass((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.eclipse.jetty.webapp.ClasspathPattern", e);
      }
  }
}