/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 11:56:09 GMT 2018
 */

package com.jfinal.template;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.EngineConfig;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class EngineConfig_ESTest extends EngineConfig_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EngineConfig engineConfig0 = null;
      try {
        engineConfig0 = new EngineConfig();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.jfinal.template.expr.ast.MethodKit
         //
         verifyException("com.jfinal.template.expr.ast.SharedMethodKit", e);
      }
  }
}
