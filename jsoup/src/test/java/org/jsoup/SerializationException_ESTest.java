/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:08:21 GMT 2018
 */

package org.jsoup;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.SerializationException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SerializationException_ESTest extends SerializationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException("");
      SerializationException serializationException1 = new SerializationException(serializationException0);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SerializationException serializationException0 = new SerializationException("");
      SerializationException serializationException1 = new SerializationException("", serializationException0);
      assertFalse(serializationException1.equals((Object)serializationException0));
  }
}
