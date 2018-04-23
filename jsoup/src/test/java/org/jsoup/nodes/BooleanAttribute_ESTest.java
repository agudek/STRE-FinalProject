/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:08:33 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.BooleanAttribute;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BooleanAttribute_ESTest extends BooleanAttribute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BooleanAttribute booleanAttribute0 = null;
      try {
        booleanAttribute0 = new BooleanAttribute("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BooleanAttribute booleanAttribute0 = new BooleanAttribute("meta[name=charset]");
      boolean boolean0 = booleanAttribute0.isBooleanAttribute();
      assertTrue(boolean0);
  }
}
