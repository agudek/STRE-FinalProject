/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:59:37 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.render.HtmlRender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class HtmlRender_ESTest extends HtmlRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HtmlRender htmlRender0 = new HtmlRender("no-cache");
      assertEquals("no-cache", htmlRender0.getText());
  }
}