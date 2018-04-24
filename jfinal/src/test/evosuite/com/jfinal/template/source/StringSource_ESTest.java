/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:46:25 GMT 2018
 */

package com.jfinal.template.source;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.source.StringSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class StringSource_ESTest extends StringSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringSource stringSource0 = new StringSource("SHA-512", true);
      String string0 = stringSource0.getKey();
      assertEquals("8564616775671dbdb0a7e59ed38ef242", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      stringBuilder0.appendCodePoint(19);
      StringSource stringSource0 = new StringSource(stringBuilder0, false);
      assertEquals("UTF-8", stringSource0.getEncoding());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringSource stringSource0 = null;
      try {
        stringSource0 = new StringSource(stringBuilder0, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // content can not be blank
         //
         verifyException("com.jfinal.template.source.StringSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      StringSource stringSource0 = null;
      try {
        stringSource0 = new StringSource((StringBuilder) null, true);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // content can not be blank
         //
         verifyException("com.jfinal.template.source.StringSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      StringSource stringSource0 = null;
      try {
        stringSource0 = new StringSource("", false);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // content can not be blank
         //
         verifyException("com.jfinal.template.source.StringSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StringSource stringSource0 = new StringSource("Qd*g@`", false);
      String string0 = stringSource0.toString();
      assertEquals("Key : null\nContent : Qd*g@`\n", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      StringSource stringSource0 = new StringSource("Qd*g@`", false);
      String string0 = stringSource0.getEncoding();
      assertEquals("UTF-8", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      StringSource stringSource0 = new StringSource("Qd*g@`", false);
      String string0 = stringSource0.getKey();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      StringBuilder stringBuilder1 = stringBuilder0.appendCodePoint(13);
      StringSource stringSource0 = new StringSource(stringBuilder1, true);
      boolean boolean0 = stringSource0.isModified();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      StringSource stringSource0 = new StringSource("Qd*g@`", false);
      StringBuilder stringBuilder0 = stringSource0.getContent();
      assertEquals("Qd*g@`", stringBuilder0.toString());
  }
}
