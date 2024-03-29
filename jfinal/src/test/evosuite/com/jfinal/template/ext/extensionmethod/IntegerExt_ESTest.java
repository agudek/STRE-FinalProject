/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:44:42 GMT 2018
 */

package com.jfinal.template.ext.extensionmethod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.ext.extensionmethod.IntegerExt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class IntegerExt_ESTest extends IntegerExt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(1);
      Boolean boolean0 = integerExt0.toBoolean(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Short short0 = integerExt0.toShort(integer0);
      assertEquals((short)0, (short)short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(2392);
      Short short0 = integerExt0.toShort(integer0);
      assertEquals((short)2392, (short)short0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(3719);
      Long long0 = integerExt0.toLong(integer0);
      assertEquals(3719L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-1197));
      Long long0 = integerExt0.toLong(integer0);
      assertEquals((-1197L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = integerExt0.toInt((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(3260);
      Integer integer1 = integerExt0.toInt(integer0);
      assertEquals(3260, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Integer integer1 = integerExt0.toInt(integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-1189));
      Integer integer1 = integerExt0.toInt(integer0);
      assertEquals((-1189), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(3260);
      Float float0 = integerExt0.toFloat(integer0);
      assertEquals(3260.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Float float0 = integerExt0.toFloat(integer0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-1189));
      Float float0 = integerExt0.toFloat(integer0);
      assertEquals((-1189.0F), (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Double double0 = integerExt0.toDouble(integer0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(1);
      Double double0 = integerExt0.toDouble(integer0);
      assertEquals(1.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Byte byte0 = integerExt0.toByte(integer0);
      assertEquals((byte)0, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-1189));
      Byte byte0 = integerExt0.toByte(integer0);
      assertEquals((byte)91, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      // Undeclared exception!
      try { 
        integerExt0.toShort((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.IntegerExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      // Undeclared exception!
      try { 
        integerExt0.toLong((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.IntegerExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      // Undeclared exception!
      try { 
        integerExt0.toFloat((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.IntegerExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      // Undeclared exception!
      try { 
        integerExt0.toDouble((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.IntegerExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      // Undeclared exception!
      try { 
        integerExt0.toByte((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.IntegerExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      // Undeclared exception!
      try { 
        integerExt0.toBoolean((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.IntegerExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-11));
      Boolean boolean0 = integerExt0.toBoolean(integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Boolean boolean0 = integerExt0.toBoolean(integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-11));
      Byte byte0 = integerExt0.toByte(integer0);
      assertEquals((byte) (-11), (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer(0);
      Long long0 = integerExt0.toLong(integer0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-11));
      Double double0 = integerExt0.toDouble(integer0);
      assertEquals((-11.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      IntegerExt integerExt0 = new IntegerExt();
      Integer integer0 = new Integer((-11));
      Short short0 = integerExt0.toShort(integer0);
      assertEquals((short) (-11), (short)short0);
  }
}
