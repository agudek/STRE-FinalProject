/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:01:37 GMT 2018
 */

package com.jfinal.template;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.kit.ElKit;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.ExprList;
import com.jfinal.template.ext.directive.NowDirective;
import com.jfinal.template.ext.directive.RandomDirective;
import com.jfinal.template.ext.directive.StringDirective;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Directive_ESTest extends Directive_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      StringDirective stringDirective0 = new StringDirective();
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      ExprList exprList0 = new ExprList(linkedList0);
      // Undeclared exception!
      try { 
        stringDirective0.setExprList(exprList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // #string directive parameter cant not be null
         //
         verifyException("com.jfinal.template.ext.directive.StringDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NowDirective nowDirective0 = new NowDirective();
      // Undeclared exception!
      try { 
        nowDirective0.setExprList((ExprList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.ext.directive.NowDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RandomDirective randomDirective0 = new RandomDirective();
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      ExprList exprList0 = new ExprList(linkedList0);
      randomDirective0.setExprList(exprList0);
      assertEquals(0, exprList0.length());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ElKit.InnerEvalDirective elKit_InnerEvalDirective0 = new ElKit.InnerEvalDirective();
      NowDirective nowDirective0 = new NowDirective();
      elKit_InnerEvalDirective0.setStat(nowDirective0);
      assertFalse(elKit_InnerEvalDirective0.hasEnd());
  }
}