/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:18:09 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.Directive;
import com.jfinal.template.Env;
import com.jfinal.template.io.ByteWriter;
import com.jfinal.template.io.CharWriter;
import com.jfinal.template.io.Utf8Encoder;
import com.jfinal.template.stat.Scope;
import com.jfinal.template.stat.ast.Text;
import java.io.ByteArrayOutputStream;
import java.io.FilterOutputStream;
import java.io.PipedOutputStream;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockPrintWriter;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Text_ESTest extends Text_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope((Map) null, hashMap0);
      CharWriter charWriter0 = new CharWriter(3);
      ByteArrayOutputStream byteArrayOutputStream0 = new ByteArrayOutputStream(3);
      FilterOutputStream filterOutputStream0 = new FilterOutputStream(byteArrayOutputStream0);
      MockPrintWriter mockPrintWriter0 = new MockPrintWriter(filterOutputStream0);
      CharWriter charWriter1 = charWriter0.init(mockPrintWriter0);
      text0.exec((Env) null, scope0, charWriter1);
      assertSame(charWriter0, charWriter1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Text text0 = new Text((StringBuilder) null, "UTF-8");
      // Undeclared exception!
      try { 
        text0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.Text", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Text text0 = new Text((StringBuilder) null, "UTF-8");
      // Undeclared exception!
      try { 
        text0.isEmpty();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.Text", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Text text0 = new Text((StringBuilder) null, "UTF-8");
      // Undeclared exception!
      try { 
        text0.getChars();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Text text0 = new Text((StringBuilder) null, "UTF-8");
      // Undeclared exception!
      try { 
        text0.getBytes();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      LinkedHashMap<Directive, Integer> linkedHashMap0 = new LinkedHashMap<Directive, Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Utf8Encoder utf8Encoder0 = Utf8Encoder.me;
      ByteWriter byteWriter0 = new ByteWriter(utf8Encoder0, 2445);
      PipedOutputStream pipedOutputStream0 = new PipedOutputStream();
      ByteWriter byteWriter1 = byteWriter0.init(pipedOutputStream0);
      // Undeclared exception!
      try { 
        text0.exec((Env) null, scope0, byteWriter1);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.jfinal.template.stat.ast.Text", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Text text0 = new Text((StringBuilder) null, "UTF-8");
      HashMap<Directive, Integer> hashMap0 = new HashMap<Directive, Integer>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      ByteWriter byteWriter0 = new ByteWriter(utf8Encoder0, 0);
      // Undeclared exception!
      try { 
        text0.exec((Env) null, scope0, byteWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("6w");
      Text text0 = null;
      try {
        text0 = new Text(stringBuilder0, "6w");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // 6w
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Text text0 = null;
      try {
        text0 = new Text((StringBuilder) null, "_");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // _
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("*uZ5rUp*HwYfaO");
      Text text0 = null;
      try {
        text0 = new Text(stringBuilder0, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("6y2");
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getChars();
      char[] charArray0 = text0.getChars();
      assertEquals(3, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("6y2");
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getChars();
      String string0 = text0.toString();
      assertEquals("6y2", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getBytes();
      String string0 = text0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      char[] charArray0 = text0.getChars();
      assertNotNull(charArray0);
      
      boolean boolean0 = text0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("UTF-8");
      Text text0 = new Text(stringBuilder0, "UTF-8");
      byte[] byteArray0 = text0.getBytes();
      assertNotNull(byteArray0);
      
      boolean boolean0 = text0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("6y2");
      Text text0 = new Text(stringBuilder0, "UTF-8");
      char[] charArray0 = text0.getChars();
      assertNotNull(charArray0);
      
      boolean boolean0 = text0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("UTF-8");
      Text text0 = new Text(stringBuilder0, "UTF-8");
      boolean boolean0 = text0.isEmpty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      boolean boolean0 = text0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      byte[] byteArray0 = text0.getBytes();
      assertNotNull(byteArray0);
      
      boolean boolean0 = text0.isEmpty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getBytes();
      char[] charArray0 = text0.getChars();
      assertArrayEquals(new char[] {}, charArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getChars();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope((Map) null, hashMap0);
      CharWriter charWriter0 = new CharWriter(3);
      // Undeclared exception!
      try { 
        text0.exec((Env) null, scope0, charWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.CharWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getChars();
      byte[] byteArray0 = text0.getBytes();
      assertEquals(0, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder();
      Text text0 = new Text(stringBuilder0, "UTF-8");
      text0.getBytes();
      byte[] byteArray0 = text0.getBytes();
      assertEquals(0, byteArray0.length);
  }
}