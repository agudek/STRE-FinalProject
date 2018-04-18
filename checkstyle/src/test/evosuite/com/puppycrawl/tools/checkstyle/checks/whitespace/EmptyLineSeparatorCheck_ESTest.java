/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:09:48 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.whitespace;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyLineSeparatorCheck_ESTest extends EmptyLineSeparatorCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.setFirstChild(detailAST1);
      DetailAST detailAST2 = new DetailAST();
      detailAST2.addPreviousSibling(detailAST0);
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(1958, "empty.line.separator.multiple.lines");
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLinesInsideClassMembers(false);
      emptyLineSeparatorCheck0.visitToken(detailAST0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(2051);
      detailAST0.addPreviousSibling(detailAST0);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.addPreviousSibling(detailAST1);
      detailAST0.addChild(detailAST1);
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLines(false);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.setFirstChild(detailAST1);
      MockFile mockFile0 = new MockFile("empty.line.separator.multiple.lines.inside");
      Vector<String> vector0 = new Vector<String>();
      FileText fileText0 = new FileText(mockFile0, vector0);
      FileContents fileContents0 = new FileContents(fileText0);
      emptyLineSeparatorCheck0.setFileContents(fileContents0);
      detailAST0.addPreviousSibling(detailAST0);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -2147483648
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      int[] intArray0 = emptyLineSeparatorCheck0.getAcceptableTokens();
      assertEquals(10, intArray0.length);
      assertArrayEquals(new int[] {16, 30, 14, 15, 154, 12, 11, 9, 8, 10}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLines(false);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(10, "empty.line.separator.multiple.lines");
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(8, "empty.line.separator.multiple.lines.after");
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLinesInsideClassMembers(false);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(9, "empty.line.separator.multiple.lines.after");
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLinesInsideClassMembers(false);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(12, "empty.line.separator.multiple.lines.after");
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLinesInsideClassMembers(false);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(11, "empty.line.separator.multiple.lines.after");
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLinesInsideClassMembers(false);
      // Undeclared exception!
      try { 
        emptyLineSeparatorCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.EmptyLineSeparatorCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      DetailAST detailAST0 = new DetailAST();
      emptyLineSeparatorCheck0.setAllowMultipleEmptyLinesInsideClassMembers(false);
      emptyLineSeparatorCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, emptyLineSeparatorCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      emptyLineSeparatorCheck0.setAllowNoEmptyLineBetweenFields(false);
      assertTrue(emptyLineSeparatorCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      boolean boolean0 = emptyLineSeparatorCheck0.isCommentNodesRequired();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      int[] intArray0 = emptyLineSeparatorCheck0.getRequiredTokens();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EmptyLineSeparatorCheck emptyLineSeparatorCheck0 = new EmptyLineSeparatorCheck();
      int[] intArray0 = emptyLineSeparatorCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {16, 30, 14, 15, 154, 12, 11, 9, 8, 10}, intArray0);
      assertEquals(10, intArray0.length);
  }
}