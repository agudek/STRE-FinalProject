/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:50:10 GMT 2018
 */

package com.jfinal.render;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.render.NullRender;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class NullRender_ESTest extends NullRender_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullRender nullRender0 = new NullRender();
      nullRender0.render();
      assertNull(nullRender0.getView());
  }
}
