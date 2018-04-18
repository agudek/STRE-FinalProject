/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:52:58 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.indentation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.BlockParentHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.IndentationCheck;
import com.puppycrawl.tools.checkstyle.checks.indentation.LambdaHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.MethodCallHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.NewHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LambdaHandler_ESTest extends LambdaHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      LambdaHandler lambdaHandler0 = new LambdaHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      detailAST0.addChild(detailAST0);
      // Undeclared exception!
      lambdaHandler0.getSuggestedChildIndent((AbstractExpressionHandler) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      MethodCallHandler methodCallHandler0 = new MethodCallHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      LambdaHandler lambdaHandler0 = new LambdaHandler(indentationCheck0, (DetailAST) null, methodCallHandler0);
      // Undeclared exception!
      try { 
        lambdaHandler0.getIndentImpl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.MethodCallHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.addChild(detailAST0);
      IndentationCheck indentationCheck0 = new IndentationCheck();
      LambdaHandler lambdaHandler0 = new LambdaHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      lambdaHandler0.checkIndentation();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      IndentationCheck indentationCheck0 = new IndentationCheck();
      LambdaHandler lambdaHandler0 = new LambdaHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        lambdaHandler0.checkIndentation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      BlockParentHandler blockParentHandler0 = new BlockParentHandler(indentationCheck0, "indentation.child.error.multi", detailAST0, (AbstractExpressionHandler) null);
      NewHandler newHandler0 = new NewHandler(indentationCheck0, detailAST0, blockParentHandler0);
      LambdaHandler lambdaHandler0 = new LambdaHandler(indentationCheck0, detailAST0, newHandler0);
      // Undeclared exception!
      try { 
        lambdaHandler0.getSuggestedChildIndent(newHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.LambdaHandler", e);
      }
  }
}