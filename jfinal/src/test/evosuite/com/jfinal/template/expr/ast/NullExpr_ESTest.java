/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:19:09 GMT 2018
 */

package com.jfinal.template.expr.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import com.jfinal.template.expr.ast.NullExpr;
import com.jfinal.template.stat.Scope;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class NullExpr_ESTest extends NullExpr_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NullExpr nullExpr0 = NullExpr.me;
      Object object0 = nullExpr0.eval((Scope) null);
      assertNull(object0);
  }
}
