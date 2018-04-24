/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:43:56 GMT 2018
 */

package com.jfinal.ext.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.ext.handler.ContextPathHandler;
import javax.servlet.ServletRequestWrapper;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ContextPathHandler_ESTest extends ContextPathHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContextPathHandler contextPathHandler0 = new ContextPathHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      httpServletRequestWrapper0.setRequest(httpServletRequestWrapper0);
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[3];
      // Undeclared exception!
      try { 
        contextPathHandler0.handle("xd", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContextPathHandler contextPathHandler0 = new ContextPathHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[2];
      ServletRequestWrapper servletRequestWrapper0 = new ServletRequestWrapper(httpServletRequestWrapper0);
      httpServletRequestWrapper0.setRequest(servletRequestWrapper0);
      // Undeclared exception!
      try { 
        contextPathHandler0.handle("contextPathName zan not be bank.", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContextPathHandler contextPathHandler0 = null;
      try {
        contextPathHandler0 = new ContextPathHandler("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // contextPathName can not be blank.
         //
         verifyException("com.jfinal.ext.handler.ContextPathHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContextPathHandler contextPathHandler0 = new ContextPathHandler("com.jfinal.kit.StrKit");
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContextPathHandler contextPathHandler0 = new ContextPathHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getContextPath();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[2];
      // Undeclared exception!
      try { 
        contextPathHandler0.handle("contextPathName zan not be bank.", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.ext.handler.ContextPathHandler", e);
      }
  }
}
