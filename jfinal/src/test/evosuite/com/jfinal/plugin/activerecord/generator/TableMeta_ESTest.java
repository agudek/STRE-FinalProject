/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:12:48 GMT 2018
 */

package com.jfinal.plugin.activerecord.generator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.plugin.activerecord.generator.TableMeta;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class TableMeta_ESTest extends TableMeta_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TableMeta tableMeta0 = new TableMeta();
      assertEquals(7, tableMeta0.colDefaultValueMaxLen);
      assertEquals(4, tableMeta0.colTypeMaxLen);
      assertEquals(5, tableMeta0.colNameMaxLen);
  }
}
