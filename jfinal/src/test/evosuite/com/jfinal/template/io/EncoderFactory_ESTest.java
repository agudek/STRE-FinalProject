/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:45:28 GMT 2018
 */

package com.jfinal.template.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.io.Encoder;
import com.jfinal.template.io.EncoderFactory;
import java.nio.charset.IllegalCharsetNameException;
import java.nio.charset.UnsupportedCharsetException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class EncoderFactory_ESTest extends EncoderFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EncoderFactory encoderFactory0 = new EncoderFactory();
      encoderFactory0.setEncoding("UTF8");
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EncoderFactory encoderFactory0 = new EncoderFactory();
      // Undeclared exception!
      try { 
        encoderFactory0.setEncoding("aVb_wz+nX");
        fail("Expecting exception: UnsupportedCharsetException");
      
      } catch(UnsupportedCharsetException e) {
         //
         // aVb_wz+nX
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EncoderFactory encoderFactory0 = new EncoderFactory();
      // Undeclared exception!
      try { 
        encoderFactory0.setEncoding((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Null charset name
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EncoderFactory encoderFactory0 = new EncoderFactory();
      Encoder encoder0 = encoderFactory0.getEncoder();
      assertEquals(3.0F, encoder0.maxBytesPerChar(), 0.01F);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EncoderFactory encoderFactory0 = new EncoderFactory();
      encoderFactory0.charset = null;
      // Undeclared exception!
      try { 
        encoderFactory0.getEncoder();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.io.JdkEncoder", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EncoderFactory encoderFactory0 = new EncoderFactory();
      // Undeclared exception!
      try { 
        encoderFactory0.setEncoding("?_");
        fail("Expecting exception: IllegalCharsetNameException");
      
      } catch(IllegalCharsetNameException e) {
         //
         // ?_
         //
         verifyException("java.nio.charset.Charset", e);
      }
  }
}
