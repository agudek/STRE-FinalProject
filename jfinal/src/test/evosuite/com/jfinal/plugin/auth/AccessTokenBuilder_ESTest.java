/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:32:30 GMT 2018
 */

package com.jfinal.plugin.auth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import com.jfinal.plugin.auth.AccessTokenBuilder;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class AccessTokenBuilder_ESTest extends AccessTokenBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest0);
      AccessTokenBuilder.getAccessToken(httpServletRequestWrapper0);
      String string0 = AccessTokenBuilder.getAccessToken(httpServletRequestWrapper0);
      assertEquals("23", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Random.setNextRandom(Integer.MIN_VALUE);
      String string0 = AccessTokenBuilder.getAccessToken((HttpServletRequest) null);
      assertEquals("zik0zkzik0zj", string0);
  }
}
