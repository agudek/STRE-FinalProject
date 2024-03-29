/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:51:13 GMT 2018
 */

package com.jfinal.plugin.activerecord.sql;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.plugin.activerecord.sql.SqlSource;
import com.jfinal.template.source.FileSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class SqlSource_ESTest extends SqlSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FileSource fileSource0 = new FileSource("pGqPi~5yB", "pGqPi~5yB", "pGqPi~5yB");
      SqlSource sqlSource0 = new SqlSource(fileSource0);
      boolean boolean0 = sqlSource0.isFile();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SqlSource sqlSource0 = new SqlSource("{t*");
      boolean boolean0 = sqlSource0.isFile();
      assertTrue(boolean0);
  }
}
