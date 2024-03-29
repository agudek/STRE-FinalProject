/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:59:09 GMT 2018
 */

package com.jfinal.plugin.redis;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.plugin.redis.Cache;
import com.jfinal.plugin.redis.ICallback;
import com.jfinal.plugin.redis.IKeyNamingPolicy;
import com.jfinal.plugin.redis.Redis;
import com.jfinal.plugin.redis.serializer.FstSerializer;
import com.jfinal.plugin.redis.serializer.JdkSerializer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;
import redis.clients.jedis.JedisPool;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Redis_ESTest extends Redis_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      ICallback iCallback0 = mock(ICallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Redis.call(iCallback0, "org.apache.commons.pool2.impl.DefaultPooledObject");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.redis.Redis", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Cache cache0 = new Cache();
      Redis.mainCache = cache0;
      // Undeclared exception!
      try { 
        Redis.setMainCache("Zlj?~^Q~ch^vit");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // the cache not exists: Zlj?~^Q~ch^vit
         //
         verifyException("com.jfinal.plugin.redis.Redis", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      Redis.use("Property 'targetBeanName' is required");
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      Cache cache1 = Redis.use();
      assertEquals("Property 'targetBeanName' is required", cache1.getName());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Redis.use((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Redis.removeCache((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.concurrent.ConcurrentHashMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JedisPool jedisPool0 = new JedisPool("`bnLqzU", 0);
      JdkSerializer jdkSerializer0 = new JdkSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("`bnLqzU", jedisPool0, jdkSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      ICallback iCallback0 = mock(ICallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Redis.call(iCallback0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Could not get a resource from the pool
         //
         verifyException("redis.clients.util.Pool", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Cache cache0 = new Cache();
      // Undeclared exception!
      try { 
        Redis.addCache(cache0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Cache cache0 = Redis.use();
      assertNull(cache0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Cache cache0 = Redis.use("Property 'targetBeanName' is required");
      assertEquals("Property 'targetBeanName' is required", cache0.getName());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      ICallback iCallback0 = mock(ICallback.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        Redis.call(iCallback0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.plugin.redis.Redis", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      Redis.setMainCache("Property 'targetBeanName' is required");
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        Redis.setMainCache("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cacheName can not be blank
         //
         verifyException("com.jfinal.plugin.redis.Redis", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      Cache cache1 = Redis.removeCache("Property 'targetBeanName' is required");
      Redis.addCache(cache1);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        Redis.addCache((Cache) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // cache can not be null
         //
         verifyException("com.jfinal.plugin.redis.Redis", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FstSerializer fstSerializer0 = new FstSerializer();
      IKeyNamingPolicy iKeyNamingPolicy0 = mock(IKeyNamingPolicy.class, new ViolatedAssumptionAnswer());
      Cache cache0 = new Cache("Property 'targetBeanName' is required", (JedisPool) null, fstSerializer0, iKeyNamingPolicy0);
      Redis.addCache(cache0);
      // Undeclared exception!
      try { 
        Redis.addCache(cache0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The cache name already exists
         //
         verifyException("com.jfinal.plugin.redis.Redis", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Redis redis0 = new Redis();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Cache cache0 = Redis.removeCache("Property 'targetBeanName' is required");
      assertNull(cache0);
  }
}
