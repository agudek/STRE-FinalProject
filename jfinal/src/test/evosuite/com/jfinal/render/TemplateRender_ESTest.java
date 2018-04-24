/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:42:28 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.render.TemplateRender;
import com.jfinal.template.Engine;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class TemplateRender_ESTest extends TemplateRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TemplateRender templateRender0 = new TemplateRender("sF");
      templateRender0.view = null;
      String string0 = templateRender0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TemplateRender templateRender0 = new TemplateRender("");
      String string0 = templateRender0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TemplateRender templateRender0 = new TemplateRender("sF");
      String string0 = templateRender0.getContentType();
      assertEquals("text/html; charset=UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        TemplateRender.init((Engine) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // engine can not be null
         //
         verifyException("com.jfinal.render.TemplateRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TemplateRender templateRender0 = new TemplateRender(".oe}nS# M%,");
      String string0 = templateRender0.toString();
      assertEquals(".oe}nS# M%,", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TemplateRender templateRender0 = new TemplateRender(".oe}nS# M%,");
      // Undeclared exception!
      try { 
        templateRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.TemplateRender", e);
      }
  }
}