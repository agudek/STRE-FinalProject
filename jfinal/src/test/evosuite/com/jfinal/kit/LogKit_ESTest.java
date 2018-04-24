/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:11:56 GMT 2018
 */

package com.jfinal.kit;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.kit.LogKit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class LogKit_ESTest extends LogKit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = LogKit.isWarnEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      LogKit.logNothing(mockThrowable0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LogKit.error("");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      boolean boolean0 = LogKit.isErrorEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      LogKit.info((String) null, (Throwable) mockThrowable0);
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable", mockThrowable0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable("2?4}7i^>t+&I,<");
      LogKit.error("2?4}7i^>t+&I,<", (Throwable) mockThrowable0);
      assertEquals("2?4}7i^>t+&I,<", mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      LogKit.warn("EO2pyL2U8P4W~&zYt", (Throwable) mockThrowable0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LogKit.fatal("}&>UG,Xt>X_TDcd");
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LogKit.synchronizeLog();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      boolean boolean0 = LogKit.isDebugEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      LogKit.info("bI!-*<1H7");
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LogKit.debug("", (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      LogKit.debug("");
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      LogKit logKit0 = new LogKit();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      boolean boolean0 = LogKit.isFatalEnabled();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      LogKit.fatal("O", (Throwable) mockThrowable0);
      assertNull(mockThrowable0.getMessage());
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      LogKit.warn("C7");
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = LogKit.isInfoEnabled();
      assertFalse(boolean0);
  }
}
