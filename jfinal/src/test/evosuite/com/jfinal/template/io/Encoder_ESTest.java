/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:51:30 GMT 2018
 */

package com.jfinal.template.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.io.JdkEncoder;
import com.jfinal.template.io.Utf8Encoder;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Encoder_ESTest extends Encoder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      float float0 = utf8Encoder0.maxBytesPerChar();
      assertEquals(3.0F, float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      JdkEncoder jdkEncoder0 = new JdkEncoder(charset0);
      char[] charArray0 = new char[0];
      byte[] byteArray0 = new byte[4];
      int int0 = jdkEncoder0.encode(charArray0, 0, 0, byteArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Utf8Encoder utf8Encoder0 = new Utf8Encoder();
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[6];
      int int0 = utf8Encoder0.encode(charArray0, 1, 1, byteArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      JdkEncoder jdkEncoder0 = new JdkEncoder(charset0);
      byte[] byteArray0 = new byte[3];
      // Undeclared exception!
      try { 
        jdkEncoder0.encode((char[]) null, 1610, 2777, byteArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapCharBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Utf8Encoder utf8Encoder0 = Utf8Encoder.me;
      char[] charArray0 = new char[7];
      byte[] byteArray0 = new byte[2];
      // Undeclared exception!
      try { 
        utf8Encoder0.encode(charArray0, 224, 224, byteArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 224
         //
         verifyException("com.jfinal.template.io.Utf8Encoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      JdkEncoder jdkEncoder0 = new JdkEncoder(charset0);
      char[] charArray0 = new char[3];
      byte[] byteArray0 = new byte[6];
      // Undeclared exception!
      try { 
        jdkEncoder0.encode(charArray0, 0, (-2323), byteArray0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.CharBuffer", e);
      }
  }
}
