/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:54:58 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.render.VelocityRender;
import java.util.Properties;
import org.apache.struts.mock.MockServletContext;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class VelocityRender_ESTest extends VelocityRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        VelocityRender.setProperties((Properties) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.VelocityRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockServletContext mockServletContext0 = new MockServletContext();
      // Undeclared exception!
      try { 
        VelocityRender.init(mockServletContext0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.struts.mock.MockServletContext", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      VelocityRender velocityRender0 = new VelocityRender("y+>pcm$4i");
      // Undeclared exception!
      try { 
        velocityRender0.render();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.lang.NullPointerException
         //
         verifyException("com.jfinal.render.VelocityRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Properties properties0 = new Properties();
      properties0.put("[", "[");
      VelocityRender.setProperties(properties0);
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServletContextHandler servletContextHandler0 = new ServletContextHandler();
      ServletContextHandler.Context servletContextHandler_Context0 = servletContextHandler0.new Context();
      // Undeclared exception!
      try { 
        VelocityRender.init(servletContextHandler_Context0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.net.MockURL", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      VelocityRender velocityRender0 = new VelocityRender("[");
      String string0 = velocityRender0.getContentType();
      assertEquals("text/html; charset=UTF-8", string0);
  }
}