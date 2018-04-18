/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:57:25 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.sizes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.sizes.MethodCountCheck;
import java.util.NoSuchElementException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodCountCheck_ESTest extends MethodCountCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(2120, "");
      methodCountCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, methodCountCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      methodCountCheck0.setMaxProtected((-3209));
      DetailAST detailAST0 = new DetailAST();
      methodCountCheck0.visitToken(detailAST0);
      // Undeclared exception!
      try { 
        methodCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      methodCountCheck0.visitToken(detailAST0);
      methodCountCheck0.setMaxPublic(0);
      methodCountCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(2120, "");
      // Undeclared exception!
      try { 
        methodCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.addPreviousSibling(detailAST0);
      methodCountCheck0.visitToken(detailAST0);
      methodCountCheck0.setMaxTotal((-312));
      // Undeclared exception!
      methodCountCheck0.leaveToken(detailAST0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      int[] intArray0 = methodCountCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {14, 155, 154, 15, 157, 9}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(15, "too.many.publicMethods");
      methodCountCheck0.visitToken(detailAST0);
      assertNull(methodCountCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      methodCountCheck0.setMaxPublic((-13));
      methodCountCheck0.visitToken(detailAST0);
      // Undeclared exception!
      try { 
        methodCountCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(9, "too.many.publicMethods");
      methodCountCheck0.leaveToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, methodCountCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(9, "too.many.publicMethods");
      methodCountCheck0.visitToken(detailAST0);
      assertEquals(9, detailAST0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      DetailAST detailAST0 = new DetailAST();
      methodCountCheck0.visitToken(detailAST0);
      detailAST0.initialize(9, "too.many.publicMethods");
      // Undeclared exception!
      try { 
        methodCountCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.sizes.MethodCountCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      methodCountCheck0.setMaxPackage(2131);
      assertEquals(SeverityLevel.ERROR, methodCountCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      methodCountCheck0.setMaxPrivate((-21));
      assertFalse(methodCountCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      int[] intArray0 = methodCountCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {14, 155, 154, 15, 157, 9}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MethodCountCheck methodCountCheck0 = new MethodCountCheck();
      int[] intArray0 = methodCountCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {9}, intArray0);
  }
}
