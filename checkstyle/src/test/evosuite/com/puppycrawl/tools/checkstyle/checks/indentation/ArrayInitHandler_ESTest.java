/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:09:03 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.indentation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.IndentationCheck;
import com.puppycrawl.tools.checkstyle.checks.indentation.MethodCallHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.StaticInitHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.WhileHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ArrayInitHandler_ESTest extends ArrayInitHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(440, "b!");
      detailAST0.addChild(detailAST0);
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler((IndentationCheck) null, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        arrayInitHandler0.curlyIndent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      WhileHandler whileHandler0 = new WhileHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      StaticInitHandler staticInitHandler0 = new StaticInitHandler(indentationCheck0, detailAST0, whileHandler0);
      MethodCallHandler methodCallHandler0 = new MethodCallHandler(indentationCheck0, detailAST0, staticInitHandler0);
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, methodCallHandler0);
      DetailAST detailAST1 = arrayInitHandler0.getRightCurly();
      assertNull(detailAST1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
      DetailAST detailAST0 = arrayInitHandler0.getListChild();
      assertNull(detailAST0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      IndentationCheck indentationCheck0 = new IndentationCheck();
      detailAST0.initialize(8232, "Floats.stringConverter()");
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      DetailAST detailAST1 = arrayInitHandler0.getListChild();
      assertEquals(0, detailAST1.getLine());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType((-1795));
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      DetailAST detailAST1 = arrayInitHandler0.getListChild();
      assertSame(detailAST1, detailAST0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      detailAST0.addChild(detailAST0);
      DetailAST detailAST1 = arrayInitHandler0.getListChild();
      assertNull(detailAST1.getText());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
      DetailAST detailAST0 = arrayInitHandler0.getLeftCurly();
      assertNull(detailAST0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(1478, (String) null);
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      DetailAST detailAST1 = arrayInitHandler0.getLeftCurly();
      assertSame(detailAST1, detailAST0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType((-1059));
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      DetailAST detailAST1 = arrayInitHandler0.getLeftCurly();
      assertNull(detailAST1.getText());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      detailAST0.addChild(detailAST0);
      DetailAST detailAST1 = arrayInitHandler0.getLeftCurly();
      assertEquals(0, detailAST1.getColumn());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        arrayInitHandler0.getIndentImpl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(136, "b!");
      detailAST0.addChild(detailAST0);
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler((IndentationCheck) null, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      arrayInitHandler0.getChildrenExpectedIndent();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      IndentationCheck indentationCheck0 = new IndentationCheck();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        arrayInitHandler0.getChildrenExpectedIndent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      detailAST0.initialize(80, "indentation.child.error.multi");
      detailAST0.addChild(detailAST0);
      // Undeclared exception!
      arrayInitHandler0.curlyIndent();
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      detailAST0.addChild(detailAST0);
      // Undeclared exception!
      try { 
        arrayInitHandler0.curlyIndent();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(136, "b!");
      detailAST0.addChild(detailAST0);
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler((IndentationCheck) null, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      arrayInitHandler0.getIndentImpl();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      boolean boolean0 = arrayInitHandler0.canChildrenBeNested();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      DetailAST detailAST1 = arrayInitHandler0.getTopLevelAst();
      assertNull(detailAST1);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      ArrayInitHandler arrayInitHandler0 = new ArrayInitHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        arrayInitHandler0.getRightCurly();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.ArrayInitHandler", e);
      }
  }
}