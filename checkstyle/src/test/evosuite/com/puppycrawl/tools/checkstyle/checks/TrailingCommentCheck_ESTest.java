/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:26:12 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.TrailingCommentCheck;
import java.util.Stack;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class TrailingCommentCheck_ESTest extends TrailingCommentCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        trailingCommentCheck0.beginTree(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.TrailingCommentCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      int[] intArray0 = trailingCommentCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      MockFile mockFile0 = new MockFile("trailing.comments", "trailing.comments");
      Stack<String> stack0 = new Stack<String>();
      FileText fileText0 = new FileText(mockFile0, stack0);
      FileContents fileContents0 = new FileContents(fileText0);
      trailingCommentCheck0.setFileContents(fileContents0);
      DetailAST detailAST0 = new DetailAST();
      trailingCommentCheck0.beginTree(detailAST0);
      assertNull(trailingCommentCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      int[] intArray0 = trailingCommentCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        trailingCommentCheck0.visitToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // visitToken() shouldn't be called.
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.TrailingCommentCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      int[] intArray0 = trailingCommentCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {}, intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      Pattern pattern0 = Pattern.compile("trailing.comments");
      trailingCommentCheck0.setFormat(pattern0);
      assertEquals(SeverityLevel.ERROR, trailingCommentCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      TrailingCommentCheck trailingCommentCheck0 = new TrailingCommentCheck();
      Pattern pattern0 = Pattern.compile("trailing.comments");
      trailingCommentCheck0.setLegalComment(pattern0);
      assertFalse(trailingCommentCheck0.isCommentNodesRequired());
  }
}