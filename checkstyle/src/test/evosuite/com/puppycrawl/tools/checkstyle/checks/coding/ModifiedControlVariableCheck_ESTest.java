/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:14:00 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.coding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ModifiedControlVariableCheck_ESTest extends ModifiedControlVariableCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      // Undeclared exception!
      try { 
        modifiedControlVariableCheck0.visitToken((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      int[] intArray0 = modifiedControlVariableCheck0.getRequiredTokens();
      assertEquals(20, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        modifiedControlVariableCheck0.leaveToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Illegal type of token: null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(129);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, modifiedControlVariableCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(108, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(108, detailAST0.getType());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(107);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(106);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(105, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(104, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(103);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(103, detailAST0.getType());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(102, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(101);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertNull(modifiedControlVariableCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(100);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, modifiedControlVariableCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(99, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getColumn());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(98, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(91, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      // Undeclared exception!
      try { 
        modifiedControlVariableCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(80, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertEquals(0, detailAST0.getLine());
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(26);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertNull(modifiedControlVariableCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(25);
      modifiedControlVariableCheck0.leaveToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        modifiedControlVariableCheck0.visitToken(detailAST0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Illegal type of token: null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(130);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, modifiedControlVariableCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(129);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(108, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(0, detailAST0.getColumn());
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(107);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(modifiedControlVariableCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(106);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(0, detailAST0.getColumn());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(105);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(104, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(103);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, modifiedControlVariableCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(102, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(101);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(99, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, modifiedControlVariableCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(98, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(0, detailAST0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(80, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(37, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(modifiedControlVariableCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(26);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(modifiedControlVariableCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(25);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertNull(modifiedControlVariableCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(100);
      modifiedControlVariableCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, modifiedControlVariableCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      DetailAST detailAST0 = new DetailAST();
      modifiedControlVariableCheck0.beginTree(detailAST0);
      assertEquals(0, detailAST0.getLine());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(37, (String) null);
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      // Undeclared exception!
      try { 
        modifiedControlVariableCheck0.leaveToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.coding.ModifiedControlVariableCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      int[] intArray0 = modifiedControlVariableCheck0.getDefaultTokens();
      assertEquals(20, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      int[] intArray0 = modifiedControlVariableCheck0.getAcceptableTokens();
      assertEquals(20, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ModifiedControlVariableCheck modifiedControlVariableCheck0 = new ModifiedControlVariableCheck();
      modifiedControlVariableCheck0.setSkipEnhancedForLoopVariable(true);
      assertFalse(modifiedControlVariableCheck0.isCommentNodesRequired());
  }
}