/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:22:10 GMT 2018
 */

package com.jfinal.template.stat;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.template.stat.Location;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Location_ESTest extends Location_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Location location0 = new Location("P|iaM9", 0);
      location0.getTemplateFile();
      assertEquals(0, location0.getRow());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Location location0 = new Location("", 0);
      location0.getTemplateFile();
      assertEquals(0, location0.getRow());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Location location0 = new Location("6(`$uE", 0);
      int int0 = location0.getRow();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Location location0 = new Location("9", (-2605));
      int int0 = location0.getRow();
      assertEquals((-2605), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Location location0 = new Location((String) null, 16);
      location0.toString();
      String string0 = location0.toString();
      assertEquals("\nString template line: 16", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Location location0 = new Location((String) null, 16);
      int int0 = location0.getRow();
      assertEquals(16, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Location location0 = new Location((String) null, 16);
      location0.getTemplateFile();
      assertEquals(16, location0.getRow());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Location location0 = new Location("\"", (-2142));
      String string0 = location0.toString();
      assertNotNull(string0);
      assertEquals("\nTemplate: \"\"\". Line: -2142", string0);
  }
}
