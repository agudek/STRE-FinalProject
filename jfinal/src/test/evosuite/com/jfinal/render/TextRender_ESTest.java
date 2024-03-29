/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:46:11 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.render.ContentType;
import com.jfinal.render.TextRender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class TextRender_ESTest extends TextRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContentType contentType0 = ContentType.XML;
      TextRender textRender0 = new TextRender("no<&-ache", contentType0);
      assertFalse(textRender0.getDevMode());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TextRender textRender0 = new TextRender((String) null);
      textRender0.getText();
      assertEquals("text/plain", textRender0.getContentType());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TextRender textRender0 = new TextRender("");
      String string0 = textRender0.getText();
      assertEquals("text/plain", textRender0.getContentType());
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TextRender textRender0 = new TextRender("", (String) null);
      String string0 = textRender0.getContentType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TextRender textRender0 = new TextRender("", "");
      String string0 = textRender0.getContentType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TextRender textRender0 = new TextRender("com.jfinal.render.RenderException");
      // Undeclared exception!
      try { 
        textRender0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.TextRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TextRender textRender0 = new TextRender("com.jfinal.render.RenderException");
      String string0 = textRender0.getContentType();
      assertNotNull(string0);
      assertEquals("text/plain", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TextRender textRender0 = null;
      try {
        textRender0 = new TextRender("q[}5*|NI@jn,q", (ContentType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.render.TextRender", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      TextRender textRender0 = new TextRender("z>_q>iVn", "z>_q>iVn");
      String string0 = textRender0.getText();
      assertEquals("z>_q>iVn", string0);
  }
}
