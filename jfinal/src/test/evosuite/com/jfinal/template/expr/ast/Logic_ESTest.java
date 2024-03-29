/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 11:51:12 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.expr.Sym;
import com.jfinal.template.expr.ast.Assign;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.ExprList;
import com.jfinal.template.expr.ast.Field;
import com.jfinal.template.expr.ast.ForCtrl;
import com.jfinal.template.expr.ast.Logic;
import com.jfinal.template.expr.ast.Map;
import com.jfinal.template.expr.ast.NullExpr;
import com.jfinal.template.expr.ast.NullSafe;
import com.jfinal.template.expr.ast.SharedMethod;
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
public class Logic_ESTest extends Logic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Logic.setToOldWorkMode();
      Long long0 = Long.getLong("SUB", (long) 15);
      boolean boolean0 = Logic.isTrue(long0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Logic.setToOldWorkMode();
      Float float0 = new Float(1893.8F);
      boolean boolean0 = Logic.isFalse(float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Logic.setToOldWorkMode();
      Double double0 = new Double(4122.1);
      boolean boolean0 = Logic.isTrue(double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Sym sym0 = Sym.NOT;
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      ExprList exprList0 = new ExprList(linkedList0);
      Location location0 = new Location("?", 40);
      ForCtrl forCtrl0 = new ForCtrl(exprList0, exprList0, exprList0, location0);
      Logic logic0 = new Logic(sym0, forCtrl0, forCtrl0, location0);
      HashMap<Object, Object> hashMap0 = new HashMap<Object, Object>();
      Scope scope0 = new Scope(hashMap0, (java.util.Map<String, Object>) null);
      // Undeclared exception!
      try { 
        logic0.evalOr(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The eval(Scope scope) method can not be invoked
         // Template: \"?\". Line: 40
         //
         verifyException("com.jfinal.template.expr.ast.ForCtrl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Sym sym0 = Sym.MOD;
      NullExpr nullExpr0 = (NullExpr)ExprList.NULL_EXPR;
      Unary unary0 = new Unary(sym0, nullExpr0, (Location) null);
      Logic logic0 = new Logic(sym0, unary0, (Location) null);
      LinkedHashMap<String, Double> linkedHashMap0 = new LinkedHashMap<String, Double>();
      Scope scope0 = new Scope(linkedHashMap0, (java.util.Map<String, Object>) null);
      // Undeclared exception!
      try { 
        logic0.evalOr(scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Sym sym0 = Sym.RBRACE;
      NullExpr nullExpr0 = (NullExpr)ExprList.NULL_EXPR;
      Location location0 = new Location("", (-1));
      Field field0 = new Field(nullExpr0, "jQ-> jb>p@DYM]w~e", location0);
      Logic logic0 = new Logic(sym0, field0, field0, location0);
      LinkedHashMap<Short, Byte> linkedHashMap0 = new LinkedHashMap<Short, Byte>();
      Scope scope0 = new Scope(linkedHashMap0, (java.util.Map<String, Object>) null);
      // Undeclared exception!
      try { 
        logic0.evalNot(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not accessed by \"jQ-> jb>p@DYM]w~e\" field from null target
         // Template: \"\". Line: -1
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sym sym0 = Sym.DEC;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("NG;iGF=N", (-2608));
      Byte byte0 = new Byte((byte)105);
      linkedHashMap0.put(byte0, map0);
      Logic logic0 = new Logic(sym0, map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        logic0.evalNot(scope0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sym sym0 = Sym.STATIC;
      Const const0 = Const.FALSE;
      Location location0 = new Location("AW(yaR/ZR&hnX1TcO-", (-1233));
      NullSafe nullSafe0 = new NullSafe(const0, const0, location0);
      Logic logic0 = new Logic(sym0, nullSafe0, nullSafe0, location0);
      // Undeclared exception!
      try { 
        logic0.evalNot((Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.NullSafe", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Sym sym0 = Sym.DEC;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("NG;iGF=N", (-2608));
      Logic logic0 = new Logic(sym0, map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Object object0 = logic0.evalNot(scope0);
      scope0.setLocal("\nTemplate: \"NG;iGF=N\". Line: -2608", object0);
      // Undeclared exception!
      try { 
        logic0.evalNot(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sym sym0 = Sym.OR;
      Const const0 = Const.TRUE;
      Location location0 = new Location("hK-C=5Qy2 %", 0);
      Assign assign0 = new Assign("", const0, const0, location0);
      Logic logic0 = new Logic(sym0, const0, assign0, location0);
      HashMap<Float, Short> hashMap0 = new HashMap<Float, Short>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, hashMap1);
      // Undeclared exception!
      try { 
        logic0.evalAnd(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The assigned targets \"\" can not be null
         // Template: \"hK-C=5Qy2 %\". Line: 0
         //
         verifyException("com.jfinal.template.expr.ast.Assign", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Sym sym0 = Sym.DEC;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("NG;iGF=N", (-2581));
      Logic logic0 = new Logic(sym0, map0, map0, location0);
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put(map0, map0);
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      // Undeclared exception!
      try { 
        logic0.evalAnd(scope0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Sym sym0 = Sym.LONG;
      ExprList exprList0 = ExprList.NULL_EXPR_LIST;
      Location location0 = new Location("h].YO", 5220);
      Logic logic0 = new Logic(sym0, exprList0, location0);
      HashMap<Long, String> hashMap0 = new HashMap<Long, String>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      // Undeclared exception!
      try { 
        logic0.evalAnd(scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Sym sym0 = Sym.DEC;
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("NG;iGF=N", (-2608));
      Logic logic0 = new Logic(sym0, map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      scope0.setLocal(hashMap0, "NG;iGF=N");
      // Undeclared exception!
      try { 
        logic0.evalAnd(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Sym sym0 = Sym.AND;
      ExprList exprList0 = ExprList.NULL_EXPR_LIST;
      Location location0 = new Location("", 27);
      Logic logic0 = new Logic(sym0, exprList0, location0);
      LinkedHashMap<Double, Long> linkedHashMap0 = new LinkedHashMap<Double, Long>();
      Scope scope0 = new Scope(linkedHashMap0, (java.util.Map<String, Object>) null);
      // Undeclared exception!
      try { 
        logic0.eval(scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Sym sym0 = Sym.FALSE;
      Location location0 = new Location("", (-15));
      Logic logic0 = null;
      try {
        logic0 = new Logic(sym0, (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The target of \"FALSE\" operator on the right side can not be blank
         // Template: \"\". Line: -15
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Logic.setToOldWorkMode();
      Short short0 = new Short((short)0);
      boolean boolean0 = Logic.isTrue(short0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Logic.setToOldWorkMode();
      Double double0 = new Double((-875));
      boolean boolean0 = Logic.isTrue(double0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Sym sym0 = Sym.LE;
      Const const0 = Const.TRUE;
      Location location0 = new Location("\" operator on the right side can not be blank", 3);
      Logic logic0 = new Logic(sym0, const0, const0, location0);
      boolean boolean0 = Logic.isTrue(logic0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = Logic.isTrue("\" operator on the left side can not be blank");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Boolean boolean0 = Boolean.TRUE;
      boolean boolean1 = Logic.isTrue(boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      boolean boolean0 = Logic.isTrue((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Logic.setToOldWorkMode();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      linkedHashMap0.put("The operation target on the left side of \"", "The operation target on the left side of \"");
      boolean boolean0 = Logic.isTrue(linkedHashMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Logic.setToOldWorkMode();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      boolean boolean0 = Logic.isTrue(linkedHashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      linkedList0.add((Expr) null);
      Logic.setToOldWorkMode();
      boolean boolean0 = Logic.isTrue(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      Logic.setToOldWorkMode();
      boolean boolean0 = Logic.isTrue(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Logic.setToOldWorkMode();
      Long long0 = new Long(0);
      boolean boolean0 = Logic.isFalse(long0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Logic.setToOldWorkMode();
      Float float0 = new Float((float) (-2627));
      boolean boolean0 = Logic.isTrue(float0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Logic.setToOldWorkMode();
      Float float0 = new Float((float) 0);
      boolean boolean0 = Logic.isTrue(float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Const const0 = Const.TRUE;
      Logic.setToOldWorkMode();
      boolean boolean0 = Logic.isTrue(const0.location);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Byte byte0 = new Byte((byte) (-68));
      Logic.setToOldWorkMode();
      boolean boolean0 = Logic.isTrue(byte0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      boolean boolean0 = Logic.isTrue("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Const const0 = Const.TRUE;
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      LinkedHashMap<Double, Byte> linkedHashMap1 = new LinkedHashMap<Double, Byte>();
      Sym sym0 = Sym.OR;
      Const const1 = Const.FALSE;
      Location location0 = new Location(".vJBM4Rv;7vi", (-2611));
      Logic logic0 = new Logic(sym0, const1, const0, location0);
      Scope scope0 = new Scope(linkedHashMap1, linkedHashMap0);
      Object object0 = logic0.eval(scope0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Sym sym0 = Sym.MOD;
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      ExprList exprList0 = new ExprList(linkedList0);
      Expr expr0 = exprList0.getActualExpr();
      Location location0 = new Location((String) null, 1589);
      Logic logic0 = new Logic(sym0, expr0, exprList0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, hashMap0);
      Object object0 = logic0.evalOr(scope0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Sym sym0 = Sym.DOT;
      Const const0 = Const.TRUE;
      Location location0 = new Location("yu`txv}l*Cj2+2jHo", (-2218));
      Logic logic0 = new Logic(sym0, const0, const0, location0);
      HashMap<Double, Byte> hashMap0 = new HashMap<Double, Byte>();
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, linkedHashMap0);
      Object object0 = logic0.evalAnd(scope0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      Sym sym0 = Sym.MOD;
      LinkedList<Expr> linkedList0 = new LinkedList<Expr>();
      ExprList exprList0 = new ExprList(linkedList0);
      Expr expr0 = exprList0.getActualExpr();
      Location location0 = new Location((String) null, 1589);
      Logic logic0 = new Logic(sym0, expr0, exprList0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, hashMap0);
      Object object0 = logic0.evalNot(scope0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      Const const0 = Const.TRUE;
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      LinkedHashMap<Double, Byte> linkedHashMap1 = new LinkedHashMap<Double, Byte>();
      Sym sym0 = Sym.OR;
      Location location0 = new Location(".vJBM4Rv;7vi", (-2611));
      Logic logic0 = new Logic(sym0, const0, const0, location0);
      Scope scope0 = new Scope(linkedHashMap1, linkedHashMap0);
      Object object0 = logic0.eval(scope0);
      assertEquals(true, object0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      Sym sym0 = Sym.AND;
      ExprList exprList0 = ExprList.NULL_EXPR_LIST;
      Location location0 = new Location("", 4203);
      Logic logic0 = new Logic(sym0, exprList0, exprList0, location0);
      LinkedHashMap<SharedMethod, Boolean> linkedHashMap0 = new LinkedHashMap<SharedMethod, Boolean>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Object object0 = logic0.eval(scope0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Sym sym0 = Sym.NULL_SAFE;
      Const const0 = Const.FALSE;
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope((java.util.Map) null, linkedHashMap0);
      Location location0 = new Location("The operation target on the left side of \"", 0);
      Logic logic0 = new Logic(sym0, const0, const0, location0);
      // Undeclared exception!
      try { 
        logic0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Unsupported operator: ??
         // Template: \"The operation target on the left side of \"\". Line: 0
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Sym sym0 = Sym.NOT;
      Const const0 = Const.TRUE;
      Location location0 = new Location("f,<_eT0~)2<&3qEtZ", (-113));
      Logic logic0 = new Logic(sym0, const0, location0);
      HashMap<Double, Float> hashMap0 = new HashMap<Double, Float>();
      Scope scope0 = new Scope(hashMap0, (java.util.Map<String, Object>) null);
      Object object0 = logic0.eval(scope0);
      assertEquals(false, object0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Location location0 = new Location("", (-567));
      Logic logic0 = null;
      try {
        logic0 = new Logic((Sym) null, (Expr) null, location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Sym sym0 = Sym.LE;
      Const const0 = Const.TRUE;
      Location location0 = new Location("\" operator on the right side can not be blank", 3);
      Logic logic0 = new Logic(sym0, const0, const0, location0);
      Logic logic1 = null;
      try {
        logic1 = new Logic(sym0, logic0, (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The target of \"<=\" operator on the right side can not be blank
         // Template: \"\" operator on the right side can not be blank\". Line: 3
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Logic logic0 = null;
      try {
        logic0 = new Logic((Sym) null, (Expr) null, (Expr) null, (Location) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Logic", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Logic.setToOldWorkMode();
      Double double0 = new Double(0);
      boolean boolean0 = Logic.isTrue(double0);
      assertFalse(boolean0);
  }
}
