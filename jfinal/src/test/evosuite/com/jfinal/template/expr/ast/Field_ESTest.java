/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:20:53 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.plugin.activerecord.Record;
import com.jfinal.template.expr.Sym;
import com.jfinal.template.expr.ast.Assign;
import com.jfinal.template.expr.ast.Const;
import com.jfinal.template.expr.ast.Expr;
import com.jfinal.template.expr.ast.Field;
import com.jfinal.template.expr.ast.Id;
import com.jfinal.template.expr.ast.Map;
import com.jfinal.template.expr.ast.NullExpr;
import com.jfinal.template.expr.ast.NullSafe;
import com.jfinal.template.stat.Location;
import com.jfinal.template.stat.Scope;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Field_ESTest extends Field_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("D/ftaj>5';{IpY", 1);
      Object object0 = new Object();
      Record record0 = new Record();
      java.util.Map<String, Object> map1 = record0.getColumns();
      Scope scope0 = new Scope(linkedHashMap0, map1);
      linkedHashMap0.put(object0, map0);
      Assign assign0 = new Assign("D/ftaj>5';{IpY", map0, location0);
      Field field0 = new Field(assign0, "D/ftaj>5';{IpY", location0);
      // Undeclared exception!
      field0.eval(scope0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Id id0 = new Id("Can not accessed by \"");
      linkedHashMap0.put(id0, map0);
      Location location0 = new Location("Can not accessed by \"", 58);
      NullSafe nullSafe0 = new NullSafe(map0, map0, location0);
      Field field0 = new Field(nullSafe0, "Can not accessed by \"", location0);
      Record record0 = new Record();
      java.util.Map<String, Object> map1 = record0.getColumns();
      Scope scope0 = new Scope(linkedHashMap0, map1);
      // Undeclared exception!
      field0.eval(scope0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NullExpr nullExpr0 = NullExpr.me;
      Field field0 = new Field(nullExpr0, "NzIp\u0005)~O", nullExpr0.location);
      // Undeclared exception!
      try { 
        field0.eval((Scope) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      Location location0 = new Location(" is null", (-1));
      map0.location = location0;
      Field field0 = new Field(map0, "Can not accessed by \"", map0.location);
      scope0.setGlobal(location0, map0.location);
      // Undeclared exception!
      try { 
        field0.eval(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      LinkedHashMap<Object, Expr> linkedHashMap0 = new LinkedHashMap<Object, Expr>();
      Map map0 = new Map(linkedHashMap0);
      Location location0 = new Location("Can not accessed by \"", 58);
      NullSafe nullSafe0 = new NullSafe(map0, map0, location0);
      Field field0 = new Field(nullSafe0, "Can not accessed by \"", location0);
      Record record0 = new Record();
      java.util.Map<String, Object> map1 = record0.getColumns();
      Scope scope0 = new Scope(linkedHashMap0, map1);
      scope0.setGlobal(location0, location0);
      // Undeclared exception!
      try { 
        field0.eval(scope0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Const const0 = Const.NULL;
      Field field0 = null;
      try {
        field0 = new Field(const0, "", const0.location);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Sym sym0 = Sym.EQUAL;
      Const const0 = new Const(sym0, sym0);
      Location location0 = new Location((String) null, 1184);
      Field field0 = null;
      try {
        field0 = new Field(const0, (String) null, location0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.kit.StrKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Id id0 = new Id("KVPJuC6");
      Field field0 = new Field(id0, "KVPJuC6", (Location) null);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HashMap<String, Object> hashMap1 = new HashMap<String, Object>(hashMap0);
      Scope scope0 = new Scope((java.util.Map) null, hashMap1);
      // Undeclared exception!
      try { 
        field0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // \"KVPJuC6\" can not be null for accessed by \"KVPJuC6.KVPJuC6\"
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Const const0 = Const.NULL;
      LinkedHashMap<String, Object> linkedHashMap0 = new LinkedHashMap<String, Object>();
      Field field0 = new Field(const0, "\" and getter metho3 not fouKd: \"", (Location) null);
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap0);
      // Undeclared exception!
      try { 
        field0.eval(scope0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Can not accessed by \"\" and getter metho3 not fouKd: \"\" field from null target
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Location location0 = new Location("", (-1532));
      Field field0 = null;
      try {
        field0 = new Field((Expr) null, "", location0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // The object for field access can not be null
         // Template: \"\". Line: -1532
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Const const0 = Const.TRUE;
      Field field0 = new Field(const0, "^]rS|PfC<^O", (Location) null);
      // Undeclared exception!
      try { 
        field0.eval((Scope) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // Could not initialize class com.jfinal.template.expr.ast.MethodKit
         //
         verifyException("com.jfinal.template.expr.ast.Field", e);
      }
  }
}