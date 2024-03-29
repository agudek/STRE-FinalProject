/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:03:29 GMT 2018
 */

package org.jsoup.examples;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.examples.ListLinks;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ListLinks_ESTest extends ListLinks_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        ListLinks.main((String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.examples.ListLinks", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[7];
      // Undeclared exception!
      try { 
        ListLinks.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // usage: supply url to fetch
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ListLinks listLinks0 = new ListLinks();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[1];
      // Undeclared exception!
      try { 
        ListLinks.main(stringArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Must supply a valid URL
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
