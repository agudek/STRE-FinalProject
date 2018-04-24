/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 17:59:14 GMT 2018
 */

package com.jfinal.template.stat.ast;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.template.Env;
import com.jfinal.template.io.CharWriter;
import com.jfinal.template.io.Writer;
import com.jfinal.template.stat.Scope;
import com.jfinal.template.stat.ast.Continue;
import java.util.LinkedHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Continue_ESTest extends Continue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Continue continue0 = Continue.me;
      // Undeclared exception!
      try { 
        continue0.exec((Env) null, (Scope) null, (Writer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.template.stat.ast.Continue", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Continue continue0 = Continue.me;
      LinkedHashMap<Object, String> linkedHashMap0 = new LinkedHashMap<Object, String>();
      LinkedHashMap<String, Object> linkedHashMap1 = new LinkedHashMap<String, Object>();
      Scope scope0 = new Scope(linkedHashMap0, linkedHashMap1);
      CharWriter charWriter0 = new CharWriter(3887);
      continue0.exec((Env) null, scope0, charWriter0);
      assertFalse(continue0.hasEnd());
  }
}