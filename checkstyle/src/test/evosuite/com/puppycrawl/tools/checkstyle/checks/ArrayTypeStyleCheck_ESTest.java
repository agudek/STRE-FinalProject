/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:07:13 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.ArrayTypeStyleCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayTypeStyleCheck_ESTest extends ArrayTypeStyleCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ArrayTypeStyleCheck arrayTypeStyleCheck0 = new ArrayTypeStyleCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        arrayTypeStyleCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.ArrayTypeStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayTypeStyleCheck arrayTypeStyleCheck0 = new ArrayTypeStyleCheck();
      int[] intArray0 = arrayTypeStyleCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {17}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayTypeStyleCheck arrayTypeStyleCheck0 = new ArrayTypeStyleCheck();
      arrayTypeStyleCheck0.setJavaStyle(false);
      assertFalse(arrayTypeStyleCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayTypeStyleCheck arrayTypeStyleCheck0 = new ArrayTypeStyleCheck();
      int[] intArray0 = arrayTypeStyleCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {17}, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ArrayTypeStyleCheck arrayTypeStyleCheck0 = new ArrayTypeStyleCheck();
      int[] intArray0 = arrayTypeStyleCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {17}, intArray0);
  }
}