/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:08:10 GMT 2018
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.UnsupportedMimeTypeException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UnsupportedMimeTypeException_ESTest extends UnsupportedMimeTypeException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("org.jsoup.UnsupportedMimeTypeException", "org.jsoup.UnsupportedMimeTypeException", (String) null);
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("v#/;WUSgv", "v#/;WUSgv", "v#/;WUSgv");
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertEquals("v#/;WUSgv", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException((String) null, (String) null, (String) null);
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException(", URL=", ". Mimetype=", ", URL=");
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertEquals(". Mimetype=", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("", "", "");
      String string0 = unsupportedMimeTypeException0.getMimeType();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("", "", "");
      String string0 = unsupportedMimeTypeException0.toString();
      assertEquals("org.evosuite.runtime.mock.java.lang.MockThrowable: . Mimetype=, URL=", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      UnsupportedMimeTypeException unsupportedMimeTypeException0 = new UnsupportedMimeTypeException("", "", "");
      String string0 = unsupportedMimeTypeException0.getUrl();
      assertEquals("", string0);
  }
}