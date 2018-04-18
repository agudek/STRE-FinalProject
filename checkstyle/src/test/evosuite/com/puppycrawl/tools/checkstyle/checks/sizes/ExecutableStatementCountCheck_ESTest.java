/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:30:58 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.sizes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ExecutableStatementCountCheck_ESTest extends ExecutableStatementCountCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      executableStatementCountCheck0.beginTree((DetailAST) null);
      detailAST0.setType(12);
      executableStatementCountCheck0.visitToken(detailAST0);
      executableStatementCountCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getLine());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setNextSibling(detailAST0);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setNextSibling(detailAST0);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(11);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(10);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(9);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(8);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(7);
      executableStatementCountCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(12);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(10);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(9);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(8);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(7);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.ExecutableStatementCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      executableStatementCountCheck0.beginTree((DetailAST) null);
      detailAST0.setType(12);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      int[] intArray0 = executableStatementCountCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {7}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      executableStatementCountCheck0.setMax(0);
      assertNull(executableStatementCountCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      int[] intArray0 = executableStatementCountCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {8, 9, 11, 12, 7}, intArray0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      int[] intArray0 = executableStatementCountCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {8, 9, 11, 12, 7}, intArray0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ExecutableStatementCountCheck executableStatementCountCheck0 = new ExecutableStatementCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(11);
      // Undeclared exception!
      try { 
        executableStatementCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }
}