/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:03:29 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.naming;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.naming.ConstantNameCheck;
import com.puppycrawl.tools.checkstyle.checks.naming.MemberNameCheck;
import com.puppycrawl.tools.checkstyle.checks.naming.MethodNameCheck;
import com.puppycrawl.tools.checkstyle.checks.naming.StaticVariableNameCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AbstractAccessControlNameCheck_ESTest extends AbstractAccessControlNameCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MemberNameCheck memberNameCheck0 = new MemberNameCheck();
      // Undeclared exception!
      try { 
        memberNameCheck0.shouldCheckInScope((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.naming.AbstractAccessControlNameCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConstantNameCheck constantNameCheck0 = new ConstantNameCheck();
      DetailAST detailAST0 = new DetailAST();
      constantNameCheck0.setApplyToPackage(false);
      constantNameCheck0.setApplyToPrivate(false);
      boolean boolean0 = constantNameCheck0.shouldCheckInScope(detailAST0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ConstantNameCheck constantNameCheck0 = new ConstantNameCheck();
      DetailAST detailAST0 = new DetailAST();
      constantNameCheck0.setApplyToPackage(false);
      boolean boolean0 = constantNameCheck0.shouldCheckInScope(detailAST0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ConstantNameCheck constantNameCheck0 = new ConstantNameCheck();
      DetailAST detailAST0 = new DetailAST();
      boolean boolean0 = constantNameCheck0.shouldCheckInScope(detailAST0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ConstantNameCheck constantNameCheck0 = new ConstantNameCheck();
      constantNameCheck0.setApplyToProtected(false);
      DetailAST detailAST0 = new DetailAST();
      boolean boolean0 = constantNameCheck0.shouldCheckInScope(detailAST0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      StaticVariableNameCheck staticVariableNameCheck0 = new StaticVariableNameCheck();
      staticVariableNameCheck0.setApplyToPublic(false);
      DetailAST detailAST0 = new DetailAST();
      boolean boolean0 = staticVariableNameCheck0.shouldCheckInScope(detailAST0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MethodNameCheck methodNameCheck0 = new MethodNameCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        methodNameCheck0.mustCheckName(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.naming.AbstractAccessControlNameCheck", e);
      }
  }
}
