/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:54:02 GMT 2018
 */

package com.jfinal.template.ext.extensionmethod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.ext.extensionmethod.ShortExt;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ShortExt_ESTest extends ShortExt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)3802);
      Boolean boolean0 = shortExt0.toBoolean(short0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = shortExt0.toShort((Short) null);
      assertNull(short0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Short short1 = shortExt0.toShort(short0);
      assertEquals((short)0, (short)short1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)1773);
      Short short1 = shortExt0.toShort(short0);
      assertEquals((short)1773, (short)short1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Long long0 = shortExt0.toLong(short0);
      assertEquals(0L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)3802);
      Long long0 = shortExt0.toLong(short0);
      assertEquals(3802L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Integer integer0 = shortExt0.toInt(short0);
      assertEquals(0, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)3802);
      Integer integer0 = shortExt0.toInt(short0);
      assertEquals(3802, (int)integer0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Float float0 = shortExt0.toFloat(short0);
      assertEquals(0.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)1773);
      Float float0 = shortExt0.toFloat(short0);
      assertEquals(1773.0F, (float)float0, 0.01F);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Double double0 = shortExt0.toDouble(short0);
      assertEquals(0.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)3802);
      Double double0 = shortExt0.toDouble(short0);
      assertEquals(3802.0, (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Byte byte0 = shortExt0.toByte(short0);
      assertEquals((byte)0, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)3802);
      Byte byte0 = shortExt0.toByte(short0);
      assertEquals((byte) (-38), (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      // Undeclared exception!
      try { 
        shortExt0.toLong((Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ShortExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      // Undeclared exception!
      try { 
        shortExt0.toInt((Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ShortExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      // Undeclared exception!
      try { 
        shortExt0.toFloat((Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ShortExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      // Undeclared exception!
      try { 
        shortExt0.toDouble((Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ShortExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      // Undeclared exception!
      try { 
        shortExt0.toByte((Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ShortExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      // Undeclared exception!
      try { 
        shortExt0.toBoolean((Short) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.extensionmethod.ShortExt", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Boolean boolean0 = shortExt0.toBoolean(short0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short)0);
      Boolean boolean0 = shortExt0.toBoolean(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Long long0 = shortExt0.toLong(short0);
      assertEquals((-3204L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Byte byte0 = shortExt0.toByte(short0);
      assertEquals((byte)124, (byte)byte0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Double double0 = shortExt0.toDouble(short0);
      assertEquals((-3204.0), (double)double0, 0.01);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Integer integer0 = shortExt0.toInt(short0);
      assertEquals((-3204), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Short short1 = shortExt0.toShort(short0);
      assertEquals((short) (-3204), (short)short1);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ShortExt shortExt0 = new ShortExt();
      Short short0 = new Short((short) (-3204));
      Float float0 = shortExt0.toFloat(short0);
      assertEquals((-3204.0F), (float)float0, 0.01F);
  }
}
