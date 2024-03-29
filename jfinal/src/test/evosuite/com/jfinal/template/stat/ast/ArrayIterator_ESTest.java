/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:43:10 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.stat.ast.ArrayIterator;
import java.util.function.Consumer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class ArrayIterator_ESTest extends ArrayIterator_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      ArrayIterator arrayIterator0 = new ArrayIterator(object0, 0);
      arrayIterator0.hasNext();
      arrayIterator0.remove();
      // Undeclared exception!
      try { 
        arrayIterator0.next();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.ArrayIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object object0 = new Object();
      ArrayIterator arrayIterator0 = new ArrayIterator(object0, 1402);
      arrayIterator0.hasNext();
      arrayIterator0.next();
      // Undeclared exception!
      try { 
        arrayIterator0.remove();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ArrayIterator arrayIterator0 = new ArrayIterator((Object) null, 0);
      arrayIterator0.next();
      arrayIterator0.next();
      // Undeclared exception!
      try { 
        arrayIterator0.remove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ArrayIterator arrayIterator0 = new ArrayIterator("", 0);
      arrayIterator0.remove();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      ArrayIterator arrayIterator0 = new ArrayIterator(object0, 0);
      arrayIterator0.remove();
      Consumer<Object> consumer0 = (Consumer<Object>) mock(Consumer.class, new ViolatedAssumptionAnswer());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Object object0 = new Object();
      ArrayIterator arrayIterator0 = new ArrayIterator(object0, 554);
      arrayIterator0.next();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Object object0 = new Object();
      ArrayIterator arrayIterator0 = new ArrayIterator(object0, 86);
      arrayIterator0.next();
      // Undeclared exception!
      try { 
        arrayIterator0.next();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Argument is not an array
         //
         verifyException("java.lang.reflect.Array", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayIterator arrayIterator0 = new ArrayIterator("AG`rya", (-1826));
      arrayIterator0.hasNext();
  }
}
