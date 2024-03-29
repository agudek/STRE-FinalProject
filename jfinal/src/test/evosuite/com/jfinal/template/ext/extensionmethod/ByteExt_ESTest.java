/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:51:01 GMT 2018
 */

package com.jfinal.template.ext.extensionmethod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.ext.extensionmethod.ByteExt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ByteExt_ESTest extends ByteExt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-29));
      Boolean boolean0 = byteExt0.toBoolean(byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Short short0 = byteExt0.toShort(byte0);
      assertEquals((short)0, (short)short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-29));
      Short short0 = byteExt0.toShort(byte0);
      assertEquals((short) (-29), (short)short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Long long0 = byteExt0.toLong(byte0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)76);
      Long long0 = byteExt0.toLong(byte0);
      assertEquals(76L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Integer integer0 = byteExt0.toInt(byte0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)19);
      Integer integer0 = byteExt0.toInt(byte0);
      assertEquals(19, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Float float0 = byteExt0.toFloat(byte0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-52));
      Float float0 = byteExt0.toFloat(byte0);
      assertEquals((-52.0F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Double double0 = byteExt0.toDouble(byte0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)1);
      Double double0 = byteExt0.toDouble(byte0);
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = byteExt0.toByte((Byte) null);
      assertNull(byte0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Byte byte1 = byteExt0.toByte(byte0);
      assertEquals((byte)0, (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)76);
      Byte byte1 = byteExt0.toByte(byte0);
      assertEquals((byte)76, (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      // Undeclared exception!
      try { 
        byteExt0.toShort((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ByteExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      // Undeclared exception!
      try { 
        byteExt0.toLong((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ByteExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      // Undeclared exception!
      try { 
        byteExt0.toInt((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ByteExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      // Undeclared exception!
      try { 
        byteExt0.toFloat((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ByteExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      // Undeclared exception!
      try { 
        byteExt0.toDouble((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ByteExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      // Undeclared exception!
      try { 
        byteExt0.toBoolean((Byte) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ByteExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)76);
      Boolean boolean0 = byteExt0.toBoolean(byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)0);
      Boolean boolean0 = byteExt0.toBoolean(byte0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)76);
      Short short0 = byteExt0.toShort(byte0);
      assertEquals((short)76, (short)short0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte)76);
      Float float0 = byteExt0.toFloat(byte0);
      assertEquals(76.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-29));
      Byte byte1 = byteExt0.toByte(byte0);
      assertEquals((byte) (-29), (byte)byte1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-20));
      Double double0 = byteExt0.toDouble(byte0);
      assertEquals((-20.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-7));
      Long long0 = byteExt0.toLong(byte0);
      assertEquals((-7L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ByteExt byteExt0 = new ByteExt();
      Byte byte0 = new Byte((byte) (-29));
      Integer integer0 = byteExt0.toInt(byte0);
      assertEquals((-29), (int)integer0);
  }
}
