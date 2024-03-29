/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:07:00 GMT 2018
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import java.io.IOException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockIOException;
import org.jsoup.UncheckedIOException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class UncheckedIOException_ESTest extends UncheckedIOException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UncheckedIOException uncheckedIOException0 = new UncheckedIOException((IOException) null);
      IOException iOException0 = uncheckedIOException0.ioException();
      assertNull(iOException0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MockIOException mockIOException0 = new MockIOException();
      UncheckedIOException uncheckedIOException0 = new UncheckedIOException(mockIOException0);
      IOException iOException0 = uncheckedIOException0.ioException();
      assertSame(mockIOException0, iOException0);
  }
}
