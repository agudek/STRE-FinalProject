/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:08:36 GMT 2018
 */

package com.jfinal.captcha;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.captcha.CaptchaManager;
import com.jfinal.captcha.ICaptchaCache;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class CaptchaManager_ESTest extends CaptchaManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CaptchaManager captchaManager0 = CaptchaManager.me();
      // Undeclared exception!
      try { 
        captchaManager0.setCaptchaCache((ICaptchaCache) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // captchaCache can not be null
         //
         verifyException("com.jfinal.captcha.CaptchaManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CaptchaManager captchaManager0 = CaptchaManager.me();
      ICaptchaCache iCaptchaCache0 = captchaManager0.getCaptchaCache();
      captchaManager0.setCaptchaCache(iCaptchaCache0);
  }
}
