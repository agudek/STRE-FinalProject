/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:56:00 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.expr.Sym;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.Field;
import com.jfinal.template.expr.ast.ForCtrl;
import com.jfinal.template.expr.ast.Id;
import com.jfinal.template.expr.ast.Index;
import com.jfinal.template.expr.ast.Map;
import com.jfinal.template.expr.ast.RangeArray;
import com.jfinal.template.stat.Location;
import com.jfinal.template.stat.Scope;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class RangeArray_ESTest extends RangeArray_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Location location0 = new Location("The start value of range array can not be blank", 64);
      RangeArray.RangeList rangeArray_RangeList0 = new RangeArray.RangeList(64, 0, location0);
      Integer integer0 = rangeArray_RangeList0.get(64);
      assertEquals(0, (int)integer0);
      assertEquals(65, rangeArray_RangeList0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Location location0 = new Location("The end value of range array can not be blank", 1);
      RangeArray.RangeList rangeArray_RangeList0 = new RangeArray.RangeList(1, 1261, location0);
      // Undeclared exception!
      try { 
        rangeArray_RangeList0.get(1261);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index out of bounds. Index: 1261, Size: 1261
         // Template: \"The end value of range array can not be blank\". Line: 1
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray$RangeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Location location0 = new Location("Method not found: ", 29);
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      linkedHashMap0.put("Method not found: ", map0);
      RangeArray rangeArray0 = new RangeArray(map0, map0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      // Undeclared exception!
      try { 
        rangeArray0.eval(scope0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Object object0 = new Object();
      linkedHashMap0.put(object0, (Expr) null);
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("", 524);
      RangeArray rangeArray0 = new RangeArray(map0, map0, location0);
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      // Undeclared exception!
      try { 
        rangeArray0.eval(scope0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Location location0 = new Location("8Zv<>}4?8", (-1136));
      RangeArray.RangeList rangeArray_RangeList0 = new RangeArray.RangeList(0, (-1136), location0);
      Sym sym0 = Sym.EOF;
      Const const0 = new Const(sym0, rangeArray_RangeList0);
      Field field0 = new Field(const0, "COLON", location0);
      Index index0 = new Index(field0, field0, location0);
      RangeArray rangeArray0 = new RangeArray(index0, const0, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope((java.util.Map) null, hashMap0);
      // Undeclared exception!
      try { 
        rangeArray0.eval(scope0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.jfinal.template.expr.ast.MethodKit
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Location location0 = new Location("", 0);
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      scope0.setLocal(location0, linkedList0);
      RangeArray rangeArray0 = new RangeArray(map0, map0, location0);
      // Undeclared exception!
      try { 
        rangeArray0.eval(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedList cannot be cast to com.jfinal.template.expr.ast.Expr
         //
         verifyException("com.jfinal.template.expr.ast.Map", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Location location0 = new Location("LPAREN", 0);
      RangeArray.RangeList rangeArray_RangeList0 = new RangeArray.RangeList((-2770), (-2770), location0);
      Integer integer0 = rangeArray_RangeList0.get(0);
      assertEquals(1, rangeArray_RangeList0.size());
      assertEquals((-2770), (int)integer0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Sym sym0 = Sym.LBRACE;
      Integer integer0 = new Integer(2750);
      Const const0 = new Const(sym0, integer0);
      LinkedHashMap<String, Integer> linkedHashMap0 = new LinkedHashMap<String, Integer>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Location location0 = new Location("@Y~lOE4mm8w*d`dx", 2750);
      RangeArray rangeArray0 = new RangeArray(const0, const0, location0);
      RangeArray.RangeList rangeArray_RangeList0 = (RangeArray.RangeList)rangeArray0.eval(scope0);
      // Undeclared exception!
      try { 
        rangeArray_RangeList0.get(2750);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index out of bounds. Index: 2750, Size: 1
         // Template: \"@Y~lOE4mm8w*d`dx\". Line: 2750
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray$RangeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Location location0 = new Location("", (-2434));
      RangeArray.RangeList rangeArray_RangeList0 = new RangeArray.RangeList((-2434), (-2434), location0);
      // Undeclared exception!
      try { 
        rangeArray_RangeList0.get((-2434));
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Index out of bounds. Index: -2434, Size: 1
         // Template: \"\". Line: -2434
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray$RangeList", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Sym sym0 = Sym.LBRACE;
      Integer integer0 = new Integer(2750);
      Const const0 = new Const(sym0, integer0);
      Const const1 = Const.NULL;
      Location location0 = new Location("4Fo", 2750);
      RangeArray rangeArray0 = new RangeArray(const0, const1, location0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(hashMap0, hashMap0);
      // Undeclared exception!
      try { 
        rangeArray0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The end value of range array must be Integer
         // Template: \"4Fo\". Line: 2750
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Location location0 = new Location("", 0);
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      RangeArray rangeArray0 = new RangeArray(map0, map0, location0);
      // Undeclared exception!
      try { 
        rangeArray0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The start value of range array must be Integer
         // Template: \"\". Line: 0
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Location location0 = new Location((String) null, (-1434));
      Id id0 = new Id((String) null);
      ForCtrl forCtrl0 = new ForCtrl(id0, id0, location0);
      RangeArray rangeArray0 = null;
      try {
        rangeArray0 = new RangeArray(forCtrl0, (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The end value of range array can not be blank
         // String template line: -1434
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Location location0 = new Location("LPAREN", 0);
      RangeArray rangeArray0 = null;
      try {
        rangeArray0 = new RangeArray((Expr) null, (Expr) null, location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The start value of range array can not be blank
         // Template: \"LPAREN\". Line: 0
         //
         verifyException("com.jfinal.template.expr.ast.RangeArray", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Location location0 = new Location("Method not found: ", 29);
      RangeArray.RangeList rangeArray_RangeList0 = new RangeArray.RangeList(161, 29, location0);
      int int0 = rangeArray_RangeList0.size();
      assertEquals(133, int0);
  }
}
