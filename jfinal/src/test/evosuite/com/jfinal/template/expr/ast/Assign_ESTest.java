/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:27:08 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.expr.Sym;
import com.jfinal.template.expr.ast.Arith;
import com.jfinal.template.expr.ast.Assign;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.ExprList;
import com.jfinal.template.expr.ast.Field;
import com.jfinal.template.expr.ast.ForCtrl;
import com.jfinal.template.expr.ast.Id;
import com.jfinal.template.expr.ast.Logic;
import com.jfinal.template.expr.ast.Map;
import com.jfinal.template.expr.ast.NullExpr;
import com.jfinal.template.expr.ast.NullSafe;
import com.jfinal.template.expr.ast.RangeArray;
import com.jfinal.template.expr.ast.Ternary;
import com.jfinal.template.expr.ast.Unary;
import com.jfinal.template.stat.Location;
import com.jfinal.template.stat.Scope;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Assign_ESTest extends Assign_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Const const0 = Const.TRUE;
      Assign assign0 = new Assign("", const0, const0, (Location) null);
      HashMap<Logic, Object> hashMap0 = new HashMap<Logic, Object>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("", assign0);
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      // Undeclared exception!
      try { 
        assign0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The index of list/array can only be integer
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Sym sym0 = Sym.LE;
      Const const0 = Const.FALSE;
      Location location0 = new Location("", 0);
      Unary unary0 = new Unary(sym0, const0, location0);
      Assign assign0 = new Assign("", unary0, unary0, location0);
      RangeArray rangeArray0 = new RangeArray(assign0, const0, location0);
      Assign assign1 = new Assign("`ALC0W*!|JnCD", rangeArray0, location0);
      Expr expr0 = assign1.getIndex();
      assertNull(expr0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Const const0 = Const.NULL;
      Location location0 = new Location("", (-2855));
      Assign assign0 = new Assign((String) null, const0, location0);
      String string0 = assign0.getId();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Const const0 = Const.FALSE;
      Location location0 = new Location("The index of list/array can only be integer", 0);
      Assign assign0 = new Assign("The index of list/array can only be integer", const0, location0);
      String string0 = assign0.getId();
      assertEquals("The index of list/array can only be integer", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NullExpr nullExpr0 = NullExpr.me;
      Location location0 = new Location("", 3418);
      Assign assign0 = new Assign("", nullExpr0, location0);
      LinkedHashMap<String, String> linkedHashMap0 = new LinkedHashMap<String, String>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Object object0 = assign0.eval(scope0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Const const0 = Const.FALSE;
      Location location0 = new Location("The index of list/array can only be integer", 0);
      Assign assign0 = new Assign("The index of list/array can only be integer", const0, location0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, hashMap1);
      Object object0 = assign0.eval(scope0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ExprList exprList0 = ExprList.NULL_EXPR_LIST;
      Expr expr0 = exprList0.getActualExpr();
      Assign assign0 = new Assign("", expr0, exprList0, (Location) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, hashMap1);
      Object object0 = assign0.assignVariable(scope0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      BiFunction<Expr, Expr, Expr> biFunction0 = (BiFunction<Expr, Expr, Expr>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashMap0.merge("", map0, biFunction0);
      Location location0 = new Location("getClass", (-1047));
      Assign assign0 = new Assign("", map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        assign0.eval(scope0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Id id0 = new Id("");
      Location location0 = new Location("", (-1));
      Assign assign0 = new Assign("", id0, location0);
      // Undeclared exception!
      try { 
        assign0.eval((Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Id", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("{GsSL:(", (-1));
      Assign assign0 = new Assign("{GsSL:(", map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      scope0.set(location0, "{GsSL:(");
      // Undeclared exception!
      try { 
        assign0.eval(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.jfinal.template.expr.ast.Expr
         //
         verifyException("com.jfinal.template.expr.ast.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sym sym0 = Sym.INT;
      Id id0 = new Id("");
      Location location0 = new Location("IDHir]/o2/", (-1));
      Unary unary0 = new Unary(sym0, id0, location0);
      Assign assign0 = new Assign("", unary0, location0);
      LinkedHashMap<Object, Integer> linkedHashMap0 = new LinkedHashMap<Object, Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        assign0.assignVariable(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The parameter of \"INT\" operator can not be blank
         // Template: \"IDHir]/o2/\". Line: -1
         //
         verifyException("com.jfinal.template.expr.ast.Unary", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      linkedHashMap0.put(map0, map0);
      Location location0 = new Location((String) null, 0);
      Assign assign0 = new Assign("UO2bXD'{][", map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        assign0.assignVariable(scope0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Const const0 = Const.TRUE;
      Location location0 = new Location(", length = ", 17);
      Assign assign0 = new Assign(", length = ", const0, const0, location0);
      // Undeclared exception!
      try { 
        assign0.assignVariable((Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Const const0 = Const.TRUE;
      Location location0 = new Location("q~zgZX4", 3335);
      NullSafe nullSafe0 = new NullSafe(const0, const0, location0);
      Field field0 = new Field(const0, "q~zgZX4", location0);
      Assign assign0 = new Assign("q~zgZX4", nullSafe0, field0, location0);
      HashMap<Object, Integer> hashMap0 = new HashMap<Object, Integer>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      // Undeclared exception!
      try { 
        assign0.assignVariable(scope0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.jfinal.template.expr.ast.MethodKit
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sym sym0 = Sym.NOTEQUAL;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("", 1383);
      Logic logic0 = new Logic(sym0, map0, location0);
      Assign assign0 = new Assign("", logic0, map0, location0);
      Scope scope0 = new Scope(linkedHashMap0, (java.util.Map<String, Object>) null);
      assign0.assignVariable(scope0);
      // Undeclared exception!
      try { 
        assign0.assignVariable(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedHashMap cannot be cast to com.jfinal.template.expr.ast.Expr
         //
         verifyException("com.jfinal.template.expr.ast.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      BiFunction<Expr, Expr, Expr> biFunction0 = (BiFunction<Expr, Expr, Expr>) mock(BiFunction.class, new ViolatedAssumptionAnswer());
      linkedHashMap0.merge("", map0, biFunction0);
      Location location0 = new Location("getClass", (-1047));
      Assign assign0 = new Assign("", map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        assign0.assignElement(scope0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Const const0 = Const.FALSE;
      Location location0 = new Location(">|cG6Zj)Y-3hsd?F,", 0);
      Assign assign0 = new Assign(">|cG6Zj)Y-3hsd?F,", const0, location0);
      LinkedHashMap<Object, Object> linkedHashMap0 = new LinkedHashMap<Object, Object>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Object object0 = new Object();
      scope0.set(">|cG6Zj)Y-3hsd?F,", object0);
      // Undeclared exception!
      try { 
        assign0.assignElement(scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Ternary ternary0 = new Ternary(map0, map0, map0, map0.location);
      Assign assign0 = new Assign((String) null, ternary0, map0, map0.location);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      assign0.assignVariable(scope0);
      // Undeclared exception!
      try { 
        assign0.assignElement(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedHashMap cannot be cast to com.jfinal.template.expr.ast.Expr
         //
         verifyException("com.jfinal.template.expr.ast.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Const const0 = Const.FALSE;
      Assign assign0 = new Assign("", const0, const0, (Location) null);
      LinkedHashMap<Logic, Object> linkedHashMap0 = new LinkedHashMap<Logic, Object>();
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      linkedHashMap1.put("", linkedHashMap0);
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      Object object0 = assign0.assignElement(scope0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullExpr nullExpr0 = NullExpr.me;
      Location location0 = new Location("", 831);
      Assign assign0 = new Assign("", nullExpr0, nullExpr0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("", location0);
      Scope scope0 = new Scope(hashMap0, hashMap0);
      // Undeclared exception!
      try { 
        assign0.assignElement(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The index of list/array and the key of map can not be null
         // Template: \"\". Line: 831
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Const const0 = Const.TRUE;
      Assign assign0 = new Assign("SH[-41;12", const0, const0, (Location) null);
      Location location0 = new Location("SH[-41;12", 2417);
      HashMap<Logic, Object> hashMap0 = new HashMap<Logic, Object>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>(2417);
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      Assign assign1 = new Assign("SH[-41;12", assign0, location0);
      // Undeclared exception!
      try { 
        assign1.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The assigned targets \"SH[-41;12\" can not be null
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Location location0 = new Location("<Jk", (-372));
      Assign assign0 = null;
      try {
        assign0 = new Assign("<Jk", (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The expression on the right side of an assignment expression can not be null
         // Template: \"<Jk\". Line: -372
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Const const0 = Const.TRUE;
      Location location0 = new Location("q~zgZX4", 3338);
      NullSafe nullSafe0 = new NullSafe(const0, const0, location0);
      Assign assign0 = null;
      try {
        assign0 = new Assign("q~zgZX4", nullSafe0, (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The expression on the right side of an assignment expression can not be null
         // Template: \"q~zgZX4\". Line: 3338
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Location location0 = new Location("\" operator8on the left side can not be blank", 18);
      Assign assign0 = null;
      try {
        assign0 = new Assign("\" operator8on the left side can not be blank", (Expr) null, (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The index expression of array assignment can not be null
         // Template: \"\" operator8on the left side can not be blank\". Line: 18
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Sym sym0 = Sym.NOTEQUAL;
      Id id0 = new Id("C");
      Location location0 = new Location("C", 0);
      ForCtrl forCtrl0 = new ForCtrl(id0, id0, location0);
      Arith arith0 = new Arith(sym0, forCtrl0, id0, location0);
      NullSafe nullSafe0 = new NullSafe(arith0, arith0, location0);
      NullExpr nullExpr0 = (NullExpr)ExprList.NULL_EXPR;
      Assign assign0 = new Assign("C", nullSafe0, nullExpr0, location0);
      Expr expr0 = assign0.getRight();
      assertSame(expr0, nullExpr0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Sym sym0 = Sym.NOTEQUAL;
      Id id0 = new Id("C");
      Location location0 = new Location("C", 0);
      ForCtrl forCtrl0 = new ForCtrl(id0, id0, location0);
      Arith arith0 = new Arith(sym0, forCtrl0, id0, location0);
      NullSafe nullSafe0 = new NullSafe(arith0, arith0, location0);
      NullExpr nullExpr0 = (NullExpr)ExprList.NULL_EXPR;
      Assign assign0 = new Assign("C", nullSafe0, nullExpr0, location0);
      Expr expr0 = assign0.getIndex();
      assertSame(expr0, nullSafe0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Const const0 = Const.FALSE;
      Assign assign0 = new Assign("", const0, const0, (Location) null);
      String string0 = assign0.getId();
      assertEquals("", string0);
  }
}
