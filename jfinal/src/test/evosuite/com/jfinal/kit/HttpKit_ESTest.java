/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:09:49 GMT 2018
 */

package com.jfinal.kit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.kit.HttpKit;
import java.io.BufferedReader;
import java.util.HashMap;
import java.util.Map;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class HttpKit_ESTest extends HttpKit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpKit.post("r<o.K:", "\" was loaded by ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: r<o.K:
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        HttpKit.post("UTF-8", (String) null, (Map<String, String>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: UTF-8
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      httpServletRequestWrapper0.setRequest(httpServletRequestWrapper0);
      // Undeclared exception!
      try { 
        HttpKit.readIncommingRequestData(httpServletRequestWrapper0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpKit.readData((HttpServletRequest) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("NC3a% Y[!SW", "charSet can not be blank.");
      // Undeclared exception!
      try { 
        HttpKit.get(";u:Y", (Map<String, String>) hashMap0, (Map<String, String>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: ;u:Y?NC3a% Y[!SW=charSet+can+not+be+blank.
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("", "");
      // Undeclared exception!
      try { 
        HttpKit.post("w]=AhQ/1DOKRh?", (Map<String, String>) hashMap0, "", (Map<String, String>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: w]=AhQ/1DOKRh?&=
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpKit.setCharSet("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // charSet can not be blank.
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpKit.setCharSet("0~jBjCV|QK6");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        HttpKit.get("?ihy[W");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: ?ihy[W
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        HttpKit.get("40", (Map<String, String>) hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: 40
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      try { 
        HttpKit.post("l>Dfb?", (Map<String, String>) hashMap0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.net.MalformedURLException: no protocol: l>Dfb?
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((BufferedReader) null).when(httpServletRequest0).getReader();
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      // Undeclared exception!
      try { 
        HttpKit.readIncommingRequestData(httpServletRequestWrapper0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.kit.HttpKit", e);
      }
  }
}
