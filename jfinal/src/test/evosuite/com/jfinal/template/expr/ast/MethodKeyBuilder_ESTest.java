/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:44:46 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.expr.ast.MethodKeyBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class MethodKeyBuilder_ESTest extends MethodKeyBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MethodKeyBuilder.StrictMethodKeyBuilder methodKeyBuilder_StrictMethodKeyBuilder0 = new MethodKeyBuilder.StrictMethodKeyBuilder();
      Class<Object> class0 = Object.class;
      Class<String>[] classArray0 = (Class<String>[]) java.lang.reflect.Array.newInstance(Class.class, 1);
      Class<String> class1 = String.class;
      classArray0[0] = class1;
      Long long0 = methodKeyBuilder_StrictMethodKeyBuilder0.getMethodKey(class0, "ydJu{B{", classArray0);
      assertEquals(4887844113341211125L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MethodKeyBuilder.FastMethodKeyBuilder methodKeyBuilder_FastMethodKeyBuilder0 = (MethodKeyBuilder.FastMethodKeyBuilder)MethodKeyBuilder.instance;
      Class<Object> class0 = Object.class;
      Class<Integer>[] classArray0 = (Class<Integer>[]) java.lang.reflect.Array.newInstance(Class.class, 2);
      Long long0 = methodKeyBuilder_FastMethodKeyBuilder0.getMethodKey(class0, "(O\"!Yx23YJW%0R$/", classArray0);
      assertEquals((-8158418019499376707L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MethodKeyBuilder methodKeyBuilder0 = MethodKeyBuilder.getInstance();
      Class<String> class0 = String.class;
      Class<Object>[] classArray0 = (Class<Object>[]) java.lang.reflect.Array.newInstance(Class.class, 1);
      Class<Object> class1 = Object.class;
      classArray0[0] = class1;
      Long long0 = methodKeyBuilder0.getMethodKey(class0, "", classArray0);
      assertEquals((-8872205319305224055L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MethodKeyBuilder methodKeyBuilder0 = MethodKeyBuilder.getInstance();
      Class<Object>[] classArray0 = (Class<Object>[]) java.lang.reflect.Array.newInstance(Class.class, 6);
      Class<Object> class0 = Object.class;
      classArray0[2] = class0;
      Long long0 = methodKeyBuilder0.getMethodKey(class0, "b", classArray0);
      assertEquals(8609587679202131689L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MethodKeyBuilder.FastMethodKeyBuilder methodKeyBuilder_FastMethodKeyBuilder0 = (MethodKeyBuilder.FastMethodKeyBuilder)MethodKeyBuilder.instance;
      MethodKeyBuilder.instance = (MethodKeyBuilder) methodKeyBuilder_FastMethodKeyBuilder0;
      MethodKeyBuilder.instance = null;
      MethodKeyBuilder methodKeyBuilder0 = MethodKeyBuilder.getInstance();
      assertNull(methodKeyBuilder0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MethodKeyBuilder methodKeyBuilder0 = MethodKeyBuilder.getInstance();
      Class<String> class0 = String.class;
      Class<Object>[] classArray0 = (Class<Object>[]) java.lang.reflect.Array.newInstance(Class.class, 5);
      // Undeclared exception!
      try { 
        methodKeyBuilder0.getMethodKey(class0, (String) null, classArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.expr.ast.MethodKeyBuilder$FastMethodKeyBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MethodKeyBuilder.StrictMethodKeyBuilder methodKeyBuilder_StrictMethodKeyBuilder0 = new MethodKeyBuilder.StrictMethodKeyBuilder();
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) java.lang.reflect.Array.newInstance(Class.class, 1);
      Long long0 = methodKeyBuilder_StrictMethodKeyBuilder0.getMethodKey(class0, "t/~[0't}t(5l?", classArray0);
      assertEquals((-6920883092176156968L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MethodKeyBuilder.StrictMethodKeyBuilder methodKeyBuilder_StrictMethodKeyBuilder0 = new MethodKeyBuilder.StrictMethodKeyBuilder();
      Class<String> class0 = String.class;
      Long long0 = methodKeyBuilder_StrictMethodKeyBuilder0.getMethodKey(class0, "", (Class<?>[]) null);
      assertEquals((-4834614249632438472L), (long)long0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Class<Object> class0 = Object.class;
      Class<Object>[] classArray0 = (Class<Object>[]) java.lang.reflect.Array.newInstance(Class.class, 1);
      classArray0[0] = class0;
      MethodKeyBuilder.FastMethodKeyBuilder methodKeyBuilder_FastMethodKeyBuilder0 = new MethodKeyBuilder.FastMethodKeyBuilder();
      Class<String> class1 = String.class;
      Long long0 = methodKeyBuilder_FastMethodKeyBuilder0.getMethodKey(class1, "t/~[0't}t(5l?", classArray0);
      assertEquals(7337309077942389317L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MethodKeyBuilder.setMethodKeyBuilder((MethodKeyBuilder) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // methodKeyBuilder can not be null
         //
         verifyException("com.jfinal.template.expr.ast.MethodKeyBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MethodKeyBuilder.StrictMethodKeyBuilder methodKeyBuilder_StrictMethodKeyBuilder0 = new MethodKeyBuilder.StrictMethodKeyBuilder();
      MethodKeyBuilder.setMethodKeyBuilder(methodKeyBuilder_StrictMethodKeyBuilder0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MethodKeyBuilder methodKeyBuilder0 = MethodKeyBuilder.getInstance();
      Class<Object> class0 = Object.class;
      Long long0 = methodKeyBuilder0.getMethodKey(class0, "", (Class<?>[]) null);
      assertEquals(1948349226734643494L, (long)long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      MethodKeyBuilder.useStrictMethodKeyBuilder();
  }
}
