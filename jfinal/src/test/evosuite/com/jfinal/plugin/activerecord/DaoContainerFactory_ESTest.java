/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:54:39 GMT 2018
 */

package com.jfinal.plugin.activerecord;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.plugin.activerecord.DaoContainerFactory;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class DaoContainerFactory_ESTest extends DaoContainerFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Set<String> set0 = DaoContainerFactory.daoSet;
      // Undeclared exception!
      try { 
        set0.toArray();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.contains("D^p(+");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.containsAll(linkedList0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.isEmpty();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Set<String> set0 = DaoContainerFactory.daoSet;
      // Undeclared exception!
      try { 
        set0.size();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  /*@Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Set<String> set0 = DaoContainerFactory.daoSet;
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        set0.addAll(linkedHashSet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }*/

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.clear();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      LinkedHashSet<Object> linkedHashSet0 = new LinkedHashSet<Object>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.retainAll(linkedHashSet0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.remove("com.jfinal.plugin.activerecord.IContainerFactory$1");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.removeAll((Collection<?>) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DaoContainerFactory.DaoSet daoContainerFactory_DaoSet0 = new DaoContainerFactory.DaoSet();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoSet0.add((String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Set<String> set0 = DaoContainerFactory.daoSet;
      // Undeclared exception!
      try { 
        set0.iterator();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Set<String> set0 = DaoContainerFactory.daoSet;
      Object[] objectArray0 = new Object[3];
      // Undeclared exception!
      try { 
        set0.toArray(objectArray0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoSet", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DaoContainerFactory.DaoMap<Object> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Object>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.keySet();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DaoContainerFactory.DaoMap<Object> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Object>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.containsKey(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DaoContainerFactory.DaoMap<Integer> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Integer>();
      HashMap<String, Integer> hashMap0 = new HashMap<String, Integer>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.putAll(hashMap0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DaoContainerFactory.DaoMap<String> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<String>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.put((String) null, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DaoContainerFactory.DaoMap<Object> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Object>();
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.get(object0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DaoContainerFactory.DaoMap<Integer> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Integer>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.values();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DaoContainerFactory.DaoMap<Object> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Object>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.clear();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DaoContainerFactory.DaoMap<String> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<String>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.isEmpty();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DaoContainerFactory.DaoMap<String> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<String>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.remove((Object) "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DaoContainerFactory.DaoMap<Object> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Object>();
      Integer integer0 = new Integer((-1616));
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.containsValue(integer0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DaoContainerFactory.DaoMap<Integer> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Integer>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.entrySet();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DaoContainerFactory.DaoMap<Object> daoContainerFactory_DaoMap0 = new DaoContainerFactory.DaoMap<Object>();
      // Undeclared exception!
      try { 
        daoContainerFactory_DaoMap0.size();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // dao \u53EA\u5141\u8BB8\u8C03\u7528\u67E5\u8BE2\u65B9\u6CD5
         //
         verifyException("com.jfinal.plugin.activerecord.DaoContainerFactory$DaoMap", e);
      }
  }
}
