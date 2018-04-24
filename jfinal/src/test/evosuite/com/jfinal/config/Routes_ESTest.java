/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:34:35 GMT 2018
 */

package com.jfinal.config;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.config.Routes;
import com.jfinal.core.Controller;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Routes_ESTest extends Routes_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Class<Controller> class0 = Controller.class;
      Routes.Route routes_Route0 = null;
      try {
        routes_Route0 = new Routes.Route("-->", class0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // controllerKey already exists: /-->
         //
         verifyException("com.jfinal.config.Routes$Route", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Routes.Route routes_Route0 = null;
      try {
        routes_Route0 = new Routes.Route(">m", (Class<? extends Controller>) null, ">m");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // controllerClass can not be null
         //
         verifyException("com.jfinal.config.Routes$Route", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Class<Controller> class0 = Controller.class;
      Routes.Route routes_Route0 = null;
      try {
        routes_Route0 = new Routes.Route("", class0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // controllerKey can not be blank
         //
         verifyException("com.jfinal.config.Routes$Route", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Class<Controller> class0 = Controller.class;
      Routes.Route routes_Route0 = null;
      try {
        routes_Route0 = new Routes.Route("\" to Long value.", class0, "\" to Long value.");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // controllerKey already exists: /\" to Long value.
         //
         verifyException("com.jfinal.config.Routes$Route", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      List<Routes> list0 = Routes.getRoutesList();
      assertEquals(0, list0.size());
  }
}
