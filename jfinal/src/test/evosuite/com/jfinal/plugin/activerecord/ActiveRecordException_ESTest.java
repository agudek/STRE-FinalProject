/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:06:02 GMT 2018
 */

package com.jfinal.plugin.activerecord;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.plugin.activerecord.ActiveRecordException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ActiveRecordException_ESTest extends ActiveRecordException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ActiveRecordException activeRecordException0 = new ActiveRecordException("*&EMBEMzh", (Throwable) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ActiveRecordException activeRecordException0 = new ActiveRecordException("");
      ActiveRecordException activeRecordException1 = new ActiveRecordException(activeRecordException0);
      assertFalse(activeRecordException1.equals((Object)activeRecordException0));
  }
}