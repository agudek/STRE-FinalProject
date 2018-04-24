/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:17:18 GMT 2018
 */

package com.jfinal.token;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.token.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Token_ESTest extends Token_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Token token0 = new Token("", 0L);
      String string0 = token0.getId();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Token token0 = new Token("", (-1L));
      long long0 = token0.getExpirationTime();
      assertEquals((-1L), long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Token token0 = new Token("],");
      boolean boolean0 = token0.equals(token0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Token token0 = new Token("");
      boolean boolean0 = token0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Token token0 = null;
      try {
        token0 = new Token((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // id can not be null
         //
         verifyException("com.jfinal.token.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Token token0 = null;
      try {
        token0 = new Token((String) null, 0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // id can not be null
         //
         verifyException("com.jfinal.token.Token", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Token token0 = new Token("=)$vBBl-M#j=#}", 1L);
      long long0 = token0.getExpirationTime();
      assertEquals(1L, long0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Token token0 = new Token("],");
      String string0 = token0.getId();
      assertEquals("],", string0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Token token0 = new Token("],");
      long long0 = token0.getExpirationTime();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Token token0 = new Token("");
      token0.hashCode();
  }
}
