/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:17:04 GMT 2018
 */

package com.jfinal.log;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.log.Log;
import com.jfinal.log.Log4jLogFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Log4jLogFactory_ESTest extends Log4jLogFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Log4jLogFactory log4jLogFactory0 = new Log4jLogFactory();
      // Undeclared exception!
      try { 
        log4jLogFactory0.getLog((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.log4j.CategoryKey", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Log4jLogFactory log4jLogFactory0 = new Log4jLogFactory();
      // Undeclared exception!
      try { 
        log4jLogFactory0.getLog((Class<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.log4j.Logger", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Log4jLogFactory log4jLogFactory0 = new Log4jLogFactory();
      Log log0 = log4jLogFactory0.getLog("defaultLogFactory can not be null.");
      assertNotNull(log0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Log4jLogFactory log4jLogFactory0 = new Log4jLogFactory();
      Class<Integer> class0 = Integer.class;
      Log log0 = log4jLogFactory0.getLog(class0);
      assertNotNull(log0);
  }
}
