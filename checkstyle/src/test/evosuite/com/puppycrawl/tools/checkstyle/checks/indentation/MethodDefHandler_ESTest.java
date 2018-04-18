/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:17:43 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.indentation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.IndentationCheck;
import com.puppycrawl.tools.checkstyle.checks.indentation.MethodDefHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class MethodDefHandler_ESTest extends MethodDefHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(164, "indentation.error.multi");
      MethodDefHandler methodDefHandler0 = new MethodDefHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      MethodDefHandler methodDefHandler0 = new MethodDefHandler((IndentationCheck) null, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        methodDefHandler0.checkModifiers();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      IndentationCheck indentationCheck0 = new IndentationCheck();
      MethodDefHandler methodDefHandler0 = new MethodDefHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        methodDefHandler0.checkIndentation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      MethodDefHandler methodDefHandler0 = null;
      try {
        methodDefHandler0 = new MethodDefHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.MethodDefHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(161, "indentation.child.error.multi");
      MethodDefHandler methodDefHandler0 = new MethodDefHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(8);
      IndentationCheck indentationCheck0 = new IndentationCheck();
      MethodDefHandler methodDefHandler0 = new MethodDefHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      MethodDefHandler methodDefHandler0 = new MethodDefHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      DetailAST detailAST1 = methodDefHandler0.getTopLevelAst();
      assertNull(detailAST1);
  }
}
