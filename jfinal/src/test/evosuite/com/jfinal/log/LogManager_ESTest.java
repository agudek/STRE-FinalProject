/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:50:50 GMT 2018
 */

package com.jfinal.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.log.ILogFactory;
import com.jfinal.log.JdkLogFactory;
import com.jfinal.log.LogManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class LogManager_ESTest extends LogManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LogManager logManager0 = LogManager.me();
      JdkLogFactory jdkLogFactory0 = new JdkLogFactory();
      logManager0.setDefaultLogFactory(jdkLogFactory0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LogManager logManager0 = LogManager.me();
      logManager0.init();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LogManager logManager0 = LogManager.me();
      // Undeclared exception!
      try { 
        logManager0.setDefaultLogFactory((ILogFactory) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // defaultLogFactory can not be null.
         //
         verifyException("com.jfinal.log.Log", e);
      }
  }
}
