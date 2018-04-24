/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:10:22 GMT 2018
 */

package com.jfinal.ext.kit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.ext.kit.ElResolverListener;
import javax.servlet.ServletContextEvent;
import org.eclipse.jetty.server.handler.ContextHandler;
import org.eclipse.jetty.webapp.WebAppContext;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ElResolverListener_ESTest extends ElResolverListener_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElResolverListener elResolverListener0 = new ElResolverListener();
      // Undeclared exception!
      try { 
        elResolverListener0.contextInitialized((ServletContextEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.ext.kit.ElResolverListener", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElResolverListener elResolverListener0 = new ElResolverListener();
      WebAppContext webAppContext0 = new WebAppContext("s/TCgLKUn", "s/TCgLKUn");
      ContextHandler.Context contextHandler_Context0 = webAppContext0.getServletContext();
      ServletContextEvent servletContextEvent0 = new ServletContextEvent(contextHandler_Context0);
      elResolverListener0.contextInitialized(servletContextEvent0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElResolverListener elResolverListener0 = new ElResolverListener();
      WebAppContext webAppContext0 = new WebAppContext("s/TCgLKUn", "s/TCgLKUn");
      ContextHandler.Context contextHandler_Context0 = webAppContext0.getServletContext();
      ServletContextEvent servletContextEvent0 = new ServletContextEvent(contextHandler_Context0);
      elResolverListener0.contextDestroyed(servletContextEvent0);
  }
}