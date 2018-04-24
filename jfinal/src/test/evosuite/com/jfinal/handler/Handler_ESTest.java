/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:57:33 GMT 2018
 */

package com.jfinal.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.core.ActionHandler;
import java.util.Arrays;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Handler_ESTest extends Handler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActionHandler actionHandler0 = new ActionHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[0];
      actionHandler0.handle("com.jfinal.handler.Handler", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
      assertTrue(Arrays.equals(new boolean[] {}, booleanArray0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActionHandler actionHandler0 = new ActionHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[1];
      // Undeclared exception!
      try { 
        actionHandler0.handle("", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.core.ActionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ActionHandler actionHandler0 = new ActionHandler();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[0];
      // Undeclared exception!
      try { 
        actionHandler0.handle("", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.jfinal.core.ActionHandler", e);
      }
  }
}
