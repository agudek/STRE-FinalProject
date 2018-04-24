/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:53:17 GMT 2018
 */

package com.jfinal.template.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.io.FastStringWriter;
import java.nio.CharBuffer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class FastStringWriter_ESTest extends FastStringWriter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(703);
      FastStringWriter.MAX_SIZE = 703;
      FastStringWriter.MAX_SIZE = 1;
      FastStringWriter.MAX_SIZE = 0;
      fastStringWriter0.close();
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      char[] charArray0 = new char[0];
      fastStringWriter0.write(charArray0, 0, 0);
      assertEquals(0, charArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      fastStringWriter0.append('6');
      String string0 = fastStringWriter0.toString();
      assertEquals("6", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      // Undeclared exception!
      try { 
        fastStringWriter0.write((char[]) null, 0, 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(703);
      // Undeclared exception!
      try { 
        fastStringWriter0.write("", 0, 451);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      // Undeclared exception!
      try { 
        fastStringWriter0.write((String) null, (-902), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(3826);
      char[] charArray0 = new char[8];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      CharBuffer charBuffer1 = CharBuffer.wrap((CharSequence) charBuffer0);
      charBuffer0.append('i');
      // Undeclared exception!
      try { 
        fastStringWriter0.append((CharSequence) charBuffer1);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      fastStringWriter0.write(0);
      assertEquals("\u0000", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      fastStringWriter0.write("");
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      FastStringWriter.MAX_SIZE = (-5123);
      fastStringWriter0.close();
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(3826);
      fastStringWriter0.close();
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      // Undeclared exception!
      try { 
        fastStringWriter0.append((CharSequence) null, (int) '>', (int) '>');
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      fastStringWriter0.append((CharSequence) null);
      assertEquals("null", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      char[] charArray0 = new char[22];
      fastStringWriter0.write(charArray0, 0, 0);
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      char[] charArray0 = new char[3];
      // Undeclared exception!
      try { 
        fastStringWriter0.write(charArray0, 0, 2025);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(4);
      char[] charArray0 = new char[8];
      // Undeclared exception!
      try { 
        fastStringWriter0.write(charArray0, 4, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(3826);
      char[] charArray0 = new char[8];
      fastStringWriter0.write(charArray0);
      assertEquals("\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(3386);
      char[] charArray0 = new char[1];
      // Undeclared exception!
      try { 
        fastStringWriter0.write(charArray0, 3386, 3386);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      char[] charArray0 = new char[10];
      // Undeclared exception!
      try { 
        fastStringWriter0.write(charArray0, (-1), (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FastStringWriter fastStringWriter0 = null;
      try {
        fastStringWriter0 = new FastStringWriter((-575));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Negative buffer size
         //
         verifyException("com.jfinal.template.io.FastStringWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter(0);
      CharBuffer charBuffer0 = CharBuffer.allocate(1);
      // Undeclared exception!
      try { 
        fastStringWriter0.append((CharSequence) charBuffer0, 0, (-1));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      StringBuilder stringBuilder0 = fastStringWriter0.getBuffer();
      assertEquals("", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      fastStringWriter0.flush();
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      String string0 = fastStringWriter0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      fastStringWriter0.write("6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, 0);
      assertEquals("", fastStringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FastStringWriter fastStringWriter0 = new FastStringWriter();
      FastStringWriter fastStringWriter1 = fastStringWriter0.append((CharSequence) "6\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000", 0, 0);
      assertEquals("", fastStringWriter1.toString());
  }
}
