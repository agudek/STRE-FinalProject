/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:51:38 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.metrics;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.metrics.CyclomaticComplexityCheck;
import java.util.NoSuchElementException;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class CyclomaticComplexityCheck_ESTest extends CyclomaticComplexityCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(9, "!");
      cyclomaticComplexityCheck0.setMax(1);
      // Undeclared exception!
      try { 
        cyclomaticComplexityCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(90);
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, cyclomaticComplexityCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      cyclomaticComplexityCheck0.setSwitchBlockAsSingleDecisionPoint(true);
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(103, "!");
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, cyclomaticComplexityCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(11, "cyclomaticComplexity");
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      cyclomaticComplexityCheck0.leaveToken(detailAST0);
      assertEquals("cyclomaticComplexity", detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      // Undeclared exception!
      try { 
        cyclomaticComplexityCheck0.visitToken((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.metrics.CyclomaticComplexityCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      cyclomaticComplexityCheck0.setMax((-12));
      DetailAST detailAST0 = new DetailAST();
      MockFile mockFile0 = new MockFile("cyclomaticComplexity");
      Vector<String> vector0 = new Vector<String>();
      FileText fileText0 = new FileText(mockFile0, vector0);
      FileContents fileContents0 = new FileContents(fileText0);
      cyclomaticComplexityCheck0.setFileContents(fileContents0);
      detailAST0.initialize(11, "!");
      // Undeclared exception!
      try { 
        cyclomaticComplexityCheck0.leaveToken(detailAST0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483647
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      cyclomaticComplexityCheck0.setSwitchBlockAsSingleDecisionPoint(true);
      detailAST0.setType(93);
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertEquals(93, detailAST0.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      cyclomaticComplexityCheck0.leaveToken(detailAST0);
      assertNull(cyclomaticComplexityCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(10, "cyclomaticComplexity");
      cyclomaticComplexityCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(8, "cyclomaticComplexity");
      // Undeclared exception!
      try { 
        cyclomaticComplexityCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(10, "cyclomaticComplexity");
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertEquals(10, detailAST0.getType());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(9, "!");
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertFalse(cyclomaticComplexityCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(8, "cyclomaticComplexity");
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertEquals(8, detailAST0.getType());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      cyclomaticComplexityCheck0.setSwitchBlockAsSingleDecisionPoint(true);
      DetailAST detailAST0 = new DetailAST();
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, cyclomaticComplexityCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      int[] intArray0 = cyclomaticComplexityCheck0.getAcceptableTokens();
      assertEquals(14, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      int[] intArray0 = cyclomaticComplexityCheck0.getDefaultTokens();
      assertEquals(14, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      int[] intArray0 = cyclomaticComplexityCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {8, 9, 11, 12}, intArray0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      cyclomaticComplexityCheck0.setMax((-12));
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(9, "!");
      // Undeclared exception!
      try { 
        cyclomaticComplexityCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(12, "cyclomaticComplexity");
      // Undeclared exception!
      try { 
        cyclomaticComplexityCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayDeque", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      CyclomaticComplexityCheck cyclomaticComplexityCheck0 = new CyclomaticComplexityCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(12, "cyclomaticComplexity");
      cyclomaticComplexityCheck0.visitToken(detailAST0);
      assertNull(cyclomaticComplexityCheck0.getId());
  }
}
