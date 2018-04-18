/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:57:34 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.annotation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.annotation.SuppressWarningsCheck;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SuppressWarningsCheck_ESTest extends SuppressWarningsCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SuppressWarningsCheck suppressWarningsCheck0 = new SuppressWarningsCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        suppressWarningsCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.AnnotationUtility", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SuppressWarningsCheck suppressWarningsCheck0 = new SuppressWarningsCheck();
      // Undeclared exception!
      try { 
        suppressWarningsCheck0.visitToken((DetailAST) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // the ast is null
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.AnnotationUtility", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SuppressWarningsCheck suppressWarningsCheck0 = new SuppressWarningsCheck();
      int[] intArray0 = suppressWarningsCheck0.getAcceptableTokens();
      assertEquals(10, intArray0.length);
      assertArrayEquals(new int[] {14, 15, 154, 157, 161, 155, 21, 10, 9, 8}, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SuppressWarningsCheck suppressWarningsCheck0 = new SuppressWarningsCheck();
      int[] intArray0 = suppressWarningsCheck0.getRequiredTokens();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SuppressWarningsCheck suppressWarningsCheck0 = new SuppressWarningsCheck();
      int[] intArray0 = suppressWarningsCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {14, 15, 154, 157, 161, 155, 21, 10, 9, 8}, intArray0);
      assertEquals(10, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SuppressWarningsCheck suppressWarningsCheck0 = new SuppressWarningsCheck();
      suppressWarningsCheck0.setFormat((Pattern) null);
      assertFalse(suppressWarningsCheck0.isCommentNodesRequired());
  }
}