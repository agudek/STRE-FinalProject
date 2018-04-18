/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:35:27 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.coding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.coding.CovariantEqualsCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CovariantEqualsCheck_ESTest extends CovariantEqualsCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CovariantEqualsCheck covariantEqualsCheck0 = new CovariantEqualsCheck();
      // Undeclared exception!
      try { 
        covariantEqualsCheck0.visitToken((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.coding.CovariantEqualsCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CovariantEqualsCheck covariantEqualsCheck0 = new CovariantEqualsCheck();
      int[] intArray0 = covariantEqualsCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {14, 136, 154}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      CovariantEqualsCheck covariantEqualsCheck0 = new CovariantEqualsCheck();
      DetailAST detailAST0 = new DetailAST();
      covariantEqualsCheck0.visitToken(detailAST0);
      assertEquals(0, detailAST0.getLine());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CovariantEqualsCheck covariantEqualsCheck0 = new CovariantEqualsCheck();
      int[] intArray0 = covariantEqualsCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {14, 136, 154}, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      CovariantEqualsCheck covariantEqualsCheck0 = new CovariantEqualsCheck();
      int[] intArray0 = covariantEqualsCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {14, 136, 154}, intArray0);
  }
}
