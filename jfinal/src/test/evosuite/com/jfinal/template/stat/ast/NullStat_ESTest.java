/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:07:43 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.template.Env;
import com.jfinal.template.io.CharWriter;
import com.jfinal.template.stat.Scope;
import com.jfinal.template.stat.ast.NullStat;
import java.util.LinkedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class NullStat_ESTest extends NullStat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullStat nullStat0 = NullStat.me;
      LinkedHashMap<Object, Object> linkedHashMap0 = new LinkedHashMap<Object, Object>();
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      CharWriter charWriter0 = new CharWriter(0);
      nullStat0.exec((Env) null, scope0, charWriter0);
      assertFalse(nullStat0.hasEnd());
  }
}
