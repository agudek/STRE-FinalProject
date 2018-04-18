/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:11:10 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.coding;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.coding.MultipleVariableDeclarationsCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MultipleVariableDeclarationsCheck_ESTest extends MultipleVariableDeclarationsCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      DetailAST detailAST2 = new DetailAST();
      detailAST1.addNextSibling(detailAST2);
      detailAST0.setFirstChild(detailAST1);
      detailAST1.initialize(10, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST1);
      detailAST1.setLineNo((-1));
      // Undeclared exception!
      try { 
        multipleVariableDeclarationsCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.setColumnNo(1356);
      detailAST0.setFirstChild(detailAST1);
      detailAST1.initialize(10, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST1);
      // Undeclared exception!
      try { 
        multipleVariableDeclarationsCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST1.initialize(10, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST1);
      detailAST1.setLineNo((-1));
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertFalse(detailAST0.equals((Object)detailAST1));
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(121);
      detailAST0.setNextSibling(detailAST0);
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertFalse(multipleVariableDeclarationsCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      int[] intArray0 = multipleVariableDeclarationsCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {10}, intArray0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.setFirstChild(detailAST1);
      detailAST0.setLineNo(10);
      detailAST1.initialize(10, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST1);
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertFalse(detailAST0.equals((Object)detailAST1));
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.setFirstChild(detailAST1);
      detailAST1.initialize(10, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST1);
      // Undeclared exception!
      try { 
        multipleVariableDeclarationsCheck0.visitToken(detailAST0);
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
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(10, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST0);
      // Undeclared exception!
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST1.initialize(45, "multiple.variable.declarations.comma");
      detailAST0.setNextSibling(detailAST1);
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(74);
      detailAST0.setNextSibling(detailAST0);
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertEquals(0, detailAST0.getColumn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setNextSibling(detailAST0);
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertFalse(multipleVariableDeclarationsCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      DetailAST detailAST0 = new DetailAST();
      multipleVariableDeclarationsCheck0.visitToken(detailAST0);
      assertNull(multipleVariableDeclarationsCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      int[] intArray0 = multipleVariableDeclarationsCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {10}, intArray0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MultipleVariableDeclarationsCheck multipleVariableDeclarationsCheck0 = new MultipleVariableDeclarationsCheck();
      int[] intArray0 = multipleVariableDeclarationsCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {10}, intArray0);
  }
}