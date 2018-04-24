/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:24:13 GMT 2018
 */

package com.jfinal.plugin.activerecord.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.plugin.activerecord.sql.SqlDirective;
import com.jfinal.template.Env;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.ExprList;
import com.jfinal.template.expr.ast.Id;
import com.jfinal.template.io.CharWriter;
import com.jfinal.template.stat.Scope;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class SqlDirective_ESTest extends SqlDirective_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      // Undeclared exception!
      try { 
        sqlDirective0.setExprList((ExprList) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.activerecord.sql.SqlDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope((Map) null, linkedHashMap0);
      CharWriter charWriter0 = new CharWriter(25);
      // Undeclared exception!
      try { 
        sqlDirective0.exec((Env) null, scope0, charWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Id id0 = new Id("");
      linkedList0.push(id0);
      ExprList exprList0 = new ExprList(linkedList0);
      // Undeclared exception!
      try { 
        sqlDirective0.setExprList(exprList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The parameter of #sql directive must be String
         //
         verifyException("com.jfinal.plugin.activerecord.sql.SqlDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      linkedList0.add((Expr) null);
      linkedList0.add((Expr) null);
      ExprList exprList0 = new ExprList(linkedList0);
      // Undeclared exception!
      try { 
        sqlDirective0.setExprList(exprList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Only one parameter allowed for #sql directive
         //
         verifyException("com.jfinal.plugin.activerecord.sql.SqlDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      ExprList exprList0 = ExprList.NULL_EXPR_LIST;
      // Undeclared exception!
      try { 
        sqlDirective0.setExprList(exprList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The parameter of #sql directive can not be blank
         //
         verifyException("com.jfinal.plugin.activerecord.sql.SqlDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Const const0 = Const.NULL;
      linkedList0.add((Expr) const0);
      ExprList exprList0 = new ExprList(linkedList0);
      // Undeclared exception!
      try { 
        sqlDirective0.setExprList(exprList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The parameter of #sql directive must be String
         //
         verifyException("com.jfinal.plugin.activerecord.sql.SqlDirective", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SqlDirective sqlDirective0 = new SqlDirective();
      boolean boolean0 = sqlDirective0.hasEnd();
      assertTrue(boolean0);
  }
}
