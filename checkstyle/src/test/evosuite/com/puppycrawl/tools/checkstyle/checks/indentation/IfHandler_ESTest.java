/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:17:26 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.indentation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.checks.indentation.AbstractExpressionHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.ElseHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler;
import com.puppycrawl.tools.checkstyle.checks.indentation.IndentationCheck;
import com.puppycrawl.tools.checkstyle.checks.indentation.StaticInitHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class IfHandler_ESTest extends IfHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      DetailAST detailAST0 = new DetailAST();
      IfHandler ifHandler0 = new IfHandler(indentationCheck0, detailAST0, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        ifHandler0.getIndentImpl();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      StaticInitHandler staticInitHandler0 = new StaticInitHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
      ElseHandler elseHandler0 = new ElseHandler(indentationCheck0, (DetailAST) null, staticInitHandler0);
      IfHandler ifHandler0 = new IfHandler(indentationCheck0, (DetailAST) null, elseHandler0);
      // Undeclared exception!
      try { 
        ifHandler0.getSuggestedChildIndent(elseHandler0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      IfHandler ifHandler0 = new IfHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        ifHandler0.getSuggestedChildIndent((AbstractExpressionHandler) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      IndentationCheck indentationCheck0 = new IndentationCheck();
      IfHandler ifHandler0 = new IfHandler(indentationCheck0, (DetailAST) null, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        ifHandler0.checkIndentation();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      IfHandler ifHandler0 = new IfHandler((IndentationCheck) null, (DetailAST) null, (AbstractExpressionHandler) null);
      // Undeclared exception!
      try { 
        ifHandler0.checkTopLevelToken();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.indentation.IfHandler", e);
      }
  }
}
