/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:41:31 GMT 2018
 */

package com.jfinal.plugin.ehcache;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.plugin.ehcache.CacheKit;
import com.jfinal.plugin.ehcache.IDataLoader;
import net.sf.ehcache.CacheManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class CacheKit_ESTest extends CacheKit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheKit.getOrAddCache("}afIr86");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Class<IDataLoader> class0 = IDataLoader.class;
      // Undeclared exception!
      try { 
        CacheKit.get("com.alibaba.druid.TransactionTimeoutException", (Object) "com.alibaba.druid.TransactionTimeoutException", (Class<? extends IDataLoader>) class0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      IDataLoader iDataLoader0 = mock(IDataLoader.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        CacheKit.get("@/U'_|xnf a0BF", (Object) "?", iDataLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheKit.get("", (Object) "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      CacheManager cacheManager0 = CacheManager.getCacheManager("=!2P^|");
      CacheKit.init(cacheManager0);
      IDataLoader iDataLoader0 = mock(IDataLoader.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        CacheKit.get("bS203U^e0T<g8EZ", (Object) iDataLoader0, iDataLoader0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object object0 = new Object();
      // Undeclared exception!
      try { 
        CacheKit.put("3}W 685=", object0, object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheKit.removeAll("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheKit.getKeys("Cache [");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      CacheKit cacheKit0 = new CacheKit();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        CacheKit.remove("8F.", "8F.");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.ehcache.CacheKit", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      CacheManager cacheManager0 = CacheKit.getCacheManager();
      assertNull(cacheManager0);
  }
}
