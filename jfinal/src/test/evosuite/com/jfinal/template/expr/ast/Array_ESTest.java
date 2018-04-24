/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:27:06 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.expr.Sym;
import com.jfinal.template.expr.ast.Array;
import com.jfinal.template.expr.ast.Assign;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.ExprList;
import com.jfinal.template.expr.ast.ForCtrl;
import com.jfinal.template.expr.ast.Index;
import com.jfinal.template.expr.ast.Logic;
import com.jfinal.template.expr.ast.Map;
import com.jfinal.template.expr.ast.NullExpr;
import com.jfinal.template.expr.ast.NullSafe;
import com.jfinal.template.expr.ast.RangeArray;
import com.jfinal.template.expr.ast.StaticMethod;
import com.jfinal.template.expr.ast.Unary;
import com.jfinal.template.stat.Location;
import com.jfinal.template.stat.Scope;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Array_ESTest extends Array_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Expr[] exprArray0 = new Expr[3];
      Const const0 = Const.TRUE;
      exprArray0[0] = (Expr) const0;
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      ExprList exprList0 = new ExprList(linkedList0);
      exprArray0[1] = (Expr) exprList0;
      Sym sym0 = Sym.DIV;
      Location location0 = new Location("", 37);
      Logic logic0 = new Logic(sym0, exprArray0[1], exprList0, location0);
      exprArray0[2] = (Expr) logic0;
      Array array0 = new Array(exprArray0, location0);
      HashMap<ForCtrl, String> hashMap0 = new HashMap<ForCtrl, String>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      // Undeclared exception!
      try { 
        array0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported operator: /
         // Template: \"\". Line: 37
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Expr[] exprArray0 = new Expr[2];
      Sym sym0 = Sym.DEC;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      linkedHashMap0.put(sym0, map0);
      Location location0 = new Location((String) null, 3);
      Unary unary0 = new Unary(sym0, map0, location0);
      exprArray0[0] = (Expr) unary0;
      Array array0 = new Array(exprArray0, location0);
      // Undeclared exception!
      try { 
        array0.eval((Scope) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Expr[] exprArray0 = new Expr[3];
      Location location0 = new Location("3.U $,<}3jm", 1);
      Array array0 = new Array(exprArray0, location0);
      LinkedHashMap<Object, Object> linkedHashMap0 = new LinkedHashMap<Object, Object>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        array0.eval(scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Expr[] exprArray0 = new Expr[6];
      Location location0 = new Location("com.jfinal.template.expr.ast.Array", 959);
      StaticMethod staticMethod0 = new StaticMethod("com.jfinal.template.expr.ast.Array", "com.jfinal.template.expr.ast.Array", location0);
      RangeArray rangeArray0 = new RangeArray(staticMethod0, staticMethod0, location0);
      exprArray0[0] = (Expr) rangeArray0;
      Array array0 = new Array(exprArray0, location0);
      LinkedHashMap<Integer, Object> linkedHashMap0 = new LinkedHashMap<Integer, Object>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        array0.eval(scope0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.jfinal.template.expr.ast.MethodKit
         //
         verifyException("com.jfinal.template.expr.ast.StaticMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Expr[] exprArray0 = new Expr[3];
      Location location0 = new Location((String) null, 860);
      StaticMethod staticMethod0 = new StaticMethod("com.jfinal.template.expr.ast.Array$ArrayListExt", "-", location0);
      NullSafe nullSafe0 = new NullSafe(staticMethod0, staticMethod0, location0);
      Index index0 = new Index(nullSafe0, nullSafe0, location0);
      exprArray0[0] = (Expr) index0;
      Array array0 = new Array(exprArray0, location0);
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>(1);
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      // Undeclared exception!
      try { 
        array0.eval(scope0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.jfinal.template.expr.ast.MethodKit
         //
         verifyException("com.jfinal.template.expr.ast.StaticMethod", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Expr[] exprArray0 = new Expr[7];
      Const const0 = Const.FALSE;
      Assign assign0 = new Assign(")F->2Q", const0, (Location) null);
      exprArray0[0] = (Expr) assign0;
      exprArray0[1] = (Expr) assign0;
      NullExpr nullExpr0 = (NullExpr)ExprList.NULL_EXPR;
      exprArray0[2] = (Expr) nullExpr0;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      exprArray0[3] = (Expr) map0;
      Array array0 = new Array(exprArray0, (Location) null);
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      // Undeclared exception!
      try { 
        array0.eval(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Boolean cannot be cast to com.jfinal.template.expr.ast.Expr
         //
         verifyException("com.jfinal.template.expr.ast.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Expr[] exprArray0 = new Expr[1];
      NullExpr nullExpr0 = NullExpr.me;
      exprArray0[0] = (Expr) nullExpr0;
      Array array0 = new Array(exprArray0, (Location) null);
      Array.ArrayListExt array_ArrayListExt0 = (Array.ArrayListExt)array0.eval((Scope) null);
      assertFalse(array_ArrayListExt0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Location location0 = new Location("*@Cg *p$K?=P}", 56);
      Array array0 = null;
      try {
        array0 = new Array((Expr[]) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // exprList can not be null
         // Template: \"*@Cg *p$K?=P}\". Line: 56
         //
         verifyException("com.jfinal.template.expr.ast.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Array.ArrayListExt array_ArrayListExt0 = new Array.ArrayListExt(56);
      Integer integer0 = array_ArrayListExt0.getLength();
      assertEquals(0, (int)integer0);
  }
}