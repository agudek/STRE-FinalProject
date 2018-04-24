/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:56:53 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.stat.ast.MapIterator;
import java.util.Iterator;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class MapIterator_ESTest extends MapIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Iterator<Map.Entry<Object, Object>> iterator0 = (Iterator<Map.Entry<Object, Object>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      MapIterator mapIterator0 = new MapIterator(iterator0);
      boolean boolean0 = mapIterator0.hasNext();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MapIterator mapIterator0 = new MapIterator((Iterator<Map.Entry<Object, Object>>) null);
      // Undeclared exception!
      try { 
        mapIterator0.next();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.MapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MapIterator mapIterator0 = new MapIterator((Iterator<Map.Entry<Object, Object>>) null);
      // Undeclared exception!
      try { 
        mapIterator0.hasNext();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.MapIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Iterator<Map.Entry<Object, Object>> iterator0 = (Iterator<Map.Entry<Object, Object>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(iterator0).next();
      MapIterator mapIterator0 = new MapIterator(iterator0);
      Map.Entry<Object, Object> map_Entry0 = mapIterator0.next();
      assertNotNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Iterator<Map.Entry<Object, Object>> iterator0 = (Iterator<Map.Entry<Object, Object>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(iterator0).hasNext();
      MapIterator mapIterator0 = new MapIterator(iterator0);
      boolean boolean0 = mapIterator0.hasNext();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Iterator<Map.Entry<Object, Object>> iterator0 = (Iterator<Map.Entry<Object, Object>>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      MapIterator mapIterator0 = new MapIterator(iterator0);
      // Undeclared exception!
      try { 
        mapIterator0.remove();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.MapIterator", e);
      }
  }
}