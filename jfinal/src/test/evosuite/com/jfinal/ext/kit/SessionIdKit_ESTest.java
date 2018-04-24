/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:39:35 GMT 2018
 */

package com.jfinal.ext.kit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.ext.kit.SessionIdKit;
import java.util.Random;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.util.MockRandom;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class SessionIdKit_ESTest extends SessionIdKit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SessionIdKit sessionIdKit0 = SessionIdKit.me();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      MockRandom mockRandom0 = new MockRandom();
      SessionIdKit.random = (Random) mockRandom0;
      String string0 = sessionIdKit0.generate(httpServletRequestWrapper0);
      String string1 = sessionIdKit0.generate(httpServletRequestWrapper0);
      assertFalse(string1.equals((Object)string0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      org.evosuite.runtime.Random.setNextRandom(2147483646);
      SessionIdKit sessionIdKit0 = SessionIdKit.me();
      MockRandom mockRandom0 = new MockRandom();
      SessionIdKit.random = (Random) mockRandom0;
      byte[] byteArray0 = new byte[9];
      mockRandom0.nextBytes(byteArray0);
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      String string0 = sessionIdKit0.generate(httpServletRequest0);
      assertEquals("zik0zjzik0zi", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SessionIdKit sessionIdKit0 = SessionIdKit.me();
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        sessionIdKit0.generate(httpServletRequest0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.ext.kit.SessionIdKit", e);
      }
  }
}