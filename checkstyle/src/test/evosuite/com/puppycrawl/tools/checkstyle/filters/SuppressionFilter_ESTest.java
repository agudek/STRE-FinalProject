/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 15:01:10 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.filters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.AuditEvent;
import com.puppycrawl.tools.checkstyle.api.LocalizedMessage;
import com.puppycrawl.tools.checkstyle.filters.SuppressionFilter;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SuppressionFilter_ESTest extends SuppressionFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      suppressionFilter0.setFile("o>zB%biXxCXD9RB");
      try { 
        suppressionFilter0.finishLocalSetup();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Unable to find: o>zB%biXxCXD9RB
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.CommonUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      suppressionFilter0.finishLocalSetup();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      Object object0 = new Object();
      boolean boolean0 = suppressionFilter0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      SuppressionFilter suppressionFilter1 = new SuppressionFilter();
      boolean boolean0 = suppressionFilter0.equals(suppressionFilter1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      boolean boolean0 = suppressionFilter0.equals(suppressionFilter0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      boolean boolean0 = suppressionFilter0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      suppressionFilter0.setOptional(true);
      suppressionFilter0.setFile("Nw B;Kv|_;<Q<");
      suppressionFilter0.finishLocalSetup();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      Object[] objectArray0 = new Object[7];
      Class<String> class0 = String.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage((-1994), "D1F_0Y5~'mDDLr", (String) null, objectArray0, "", class0, (String) null);
      AuditEvent auditEvent0 = new AuditEvent("", "D1F_0Y5~'mDDLr", localizedMessage0);
      boolean boolean0 = suppressionFilter0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      suppressionFilter0.hashCode();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      suppressionFilter0.setFile("");
      suppressionFilter0.setOptional(true);
      // Undeclared exception!
      try { 
        suppressionFilter0.finishLocalSetup();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SuppressionFilter suppressionFilter0 = new SuppressionFilter();
      Set<String> set0 = suppressionFilter0.getExternalResourceLocations();
      assertEquals(1, set0.size());
  }
}