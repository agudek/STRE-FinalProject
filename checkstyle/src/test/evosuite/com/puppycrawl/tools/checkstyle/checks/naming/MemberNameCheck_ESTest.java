/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:14:25 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.naming;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MemberNameCheck_ESTest extends MemberNameCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MemberNameCheck memberNameCheck0 = new MemberNameCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        memberNameCheck0.mustCheckName(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MemberNameCheck memberNameCheck0 = new MemberNameCheck();
      int[] intArray0 = memberNameCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {10}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MemberNameCheck memberNameCheck0 = new MemberNameCheck();
      int[] intArray0 = memberNameCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {10}, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      MemberNameCheck memberNameCheck0 = new MemberNameCheck();
      int[] intArray0 = memberNameCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {10}, intArray0);
  }
}