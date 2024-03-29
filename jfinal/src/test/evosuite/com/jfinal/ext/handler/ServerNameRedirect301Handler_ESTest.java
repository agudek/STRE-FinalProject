/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:26:29 GMT 2018
 */

package com.jfinal.ext.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.ext.handler.ServerNameRedirect301Handler;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ServerNameRedirect301Handler_ESTest extends ServerNameRedirect301Handler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServerNameRedirect301Handler serverNameRedirect301Handler0 = new ServerNameRedirect301Handler("HS^8U`c.!~6Z_^", "");
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      HttpServletResponseWrapper httpServletResponseWrapper0 = new HttpServletResponseWrapper(httpServletResponse0);
      boolean[] booleanArray0 = new boolean[6];
      httpServletRequestWrapper0.setRequest(httpServletRequestWrapper0);
      // Undeclared exception!
      try { 
        serverNameRedirect301Handler0.handle("HS^8U`c.!~6Z_^", httpServletRequestWrapper0, httpServletResponseWrapper0, booleanArray0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((StringBuffer) null).when(httpServletRequest0).getRequestURL();
      ServerNameRedirect301Handler serverNameRedirect301Handler0 = new ServerNameRedirect301Handler("Ht9p:////", "Ht9p:////");
      boolean[] booleanArray0 = new boolean[4];
      HttpServletResponse httpServletResponse0 = mock(HttpServletResponse.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        serverNameRedirect301Handler0.handle("Ht9p:////", httpServletRequest0, httpServletResponse0, booleanArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.ext.handler.ServerNameRedirect301Handler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServerNameRedirect301Handler serverNameRedirect301Handler0 = null;
      try {
        serverNameRedirect301Handler0 = new ServerNameRedirect301Handler("O1_", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
