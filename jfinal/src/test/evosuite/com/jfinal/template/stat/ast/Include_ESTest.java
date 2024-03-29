/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:11:01 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.EngineConfig;
import com.jfinal.template.Env;
import com.jfinal.template.expr.Sym;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.ExprList;
import com.jfinal.template.stat.Location;
import com.jfinal.template.stat.ast.Include;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Include_ESTest extends Include_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      String string0 = Include.getSubFileName("", "$*:/ D_RY^.Z(");
      assertEquals("$*:/", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      String string0 = Include.getSubFileName("/", "e2W3]M");
      assertEquals("/", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = Include.getSubFileName("rYR[KxKXNMPi'KP&`<", (String) null);
      assertEquals("rYR[KxKXNMPi'KP&`<", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = Include.getSubFileName("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Include.getSubFileName((String) null, "com.jfinal.template.stat.ast.Include");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Env env0 = new Env((EngineConfig) null);
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Sym sym0 = Sym.STR;
      Const const0 = new Const(sym0, env0);
      linkedList0.offer(const0);
      ExprList exprList0 = new ExprList(linkedList0);
      Location location0 = new Location((String) null, 2827);
      Include include0 = null;
      try {
        include0 = new Include(env0, exprList0, (String) null, location0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.jfinal.template.Env cannot be cast to java.lang.String
         //
         verifyException("com.jfinal.template.expr.ast.Const", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      String string0 = Include.getSubFileName((String) null, (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Env env0 = new Env((EngineConfig) null);
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Sym sym0 = Sym.STR;
      Const const0 = new Const(sym0, env0);
      linkedList0.offer(const0);
      linkedList0.offerFirst(const0);
      ExprList exprList0 = new ExprList(linkedList0);
      Location location0 = new Location("~6^a", 2827);
      Include include0 = null;
      try {
        include0 = new Include(env0, exprList0, "~6^a", location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The 1th parameter of #include directive must be an assignment expression
         // Template: \"~6^a\". Line: 2827
         //
         verifyException("com.jfinal.template.stat.ast.Include", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Sym sym0 = Sym.STR;
      Const const0 = new Const(sym0, (Object) null);
      linkedList0.offerFirst(const0);
      ExprList exprList0 = new ExprList(linkedList0);
      Location location0 = new Location("7", 0);
      Include include0 = null;
      try {
        include0 = new Include((Env) null, exprList0, "7", location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Env env0 = new Env((EngineConfig) null);
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      linkedList0.offer((Expr) null);
      ExprList exprList0 = new ExprList(linkedList0);
      Location location0 = new Location("/The first parameter of #include directive must be String", (-1));
      Include include0 = null;
      try {
        include0 = new Include(env0, exprList0, "/The first parameter of #include directive must be String", location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The first parameter of #include directive must be String
         // Template: \"/The first parameter of #include directive must be String\". Line: -1
         //
         verifyException("com.jfinal.template.stat.ast.Include", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ExprList exprList0 = ExprList.NULL_EXPR_LIST;
      Location location0 = new Location("O", 1061);
      Include include0 = null;
      try {
        include0 = new Include((Env) null, exprList0, "2", location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The parameter of #include directive can not be blank
         // Template: \"O\". Line: 1061
         //
         verifyException("com.jfinal.template.stat.ast.Include", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Env env0 = new Env((EngineConfig) null);
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Const const0 = Const.TRUE;
      linkedList0.offer(const0);
      ExprList exprList0 = new ExprList(linkedList0);
      Location location0 = new Location((String) null, 2);
      Include include0 = null;
      try {
        include0 = new Include(env0, exprList0, (String) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The first parameter of #include directive must be String
         // String template line: 2
         //
         verifyException("com.jfinal.template.stat.ast.Include", e);
      }
  }
}
