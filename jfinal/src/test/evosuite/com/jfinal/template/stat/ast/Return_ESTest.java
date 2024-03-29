/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 18:16:24 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.Env;
import com.jfinal.template.io.CharWriter;
import com.jfinal.template.stat.Scope;
import com.jfinal.template.stat.ast.Return;
import java.util.HashMap;
import java.util.LinkedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Return_ESTest extends Return_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Return return0 = Return.me;
      LinkedHashMap<Integer, String> linkedHashMap0 = new LinkedHashMap<Integer, String>();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, hashMap0);
      CharWriter charWriter0 = new CharWriter(1651);
      return0.exec((Env) null, scope0, charWriter0);
      assertFalse(return0.hasEnd());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Return return0 = Return.me;
      CharWriter charWriter0 = new CharWriter(430);
      // Undeclared exception!
      try { 
        return0.exec((Env) null, (Scope) null, charWriter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.Return", e);
      }
  }
}
