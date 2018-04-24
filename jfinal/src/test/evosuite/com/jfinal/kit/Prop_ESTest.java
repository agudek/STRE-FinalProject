/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:07:54 GMT 2018
 */

package com.jfinal.kit;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.jfinal.kit.Prop;
import java.io.File;
import java.util.Properties;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = false, useJEE = true)
public class Prop_ESTest extends Prop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Prop prop0 = new Prop("");
      Properties properties0 = prop0.getProperties();
      assertEquals(1, properties0.size());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Prop prop0 = new Prop("");
      Long long0 = new Long(0L);
      Long long1 = prop0.getLong("", long0);
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Prop prop0 = new Prop("");
      Long long0 = new Long(2394L);
      Long long1 = prop0.getLong("", long0);
      assertEquals(2394L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Prop prop0 = new Prop("");
      Integer integer0 = prop0.getInt("File not found : ", (Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Prop prop0 = new Prop("");
      Integer integer0 = new Integer(0);
      Integer integer1 = prop0.getInt("", integer0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Prop prop0 = new Prop("");
      Integer integer0 = new Integer(1244);
      Integer integer1 = prop0.getInt("", integer0);
      assertEquals(1244, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Prop prop0 = new Prop("");
      Boolean boolean0 = Boolean.TRUE;
      Boolean boolean1 = prop0.getBoolean("K0;cSC;9C4#&L_", boolean0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      File file0 = MockFile.createTempFile("_ku5", "_ku5");
      Prop prop0 = new Prop(file0);
      Boolean boolean0 = new Boolean(false);
      Boolean boolean1 = prop0.getBoolean("_ku5", boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("[q{E;Ez");
      File file0 = MockFile.createTempFile("[q{E;Ez", "[q{E;Ez", (File) mockFile0);
      Prop prop0 = new Prop(file0);
      String string0 = prop0.get("", (String) null);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Prop prop0 = new Prop("");
      String string0 = prop0.get("", "");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "Yc(@.S.VQ_@E@U{b'HV");
      Prop prop0 = new Prop(file0);
      Prop prop1 = prop0.append(file0, "UTF-8");
      assertSame(prop0, prop1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      File file0 = MockFile.createTempFile("z%R", "z%R");
      Prop prop0 = new Prop(file0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        prop0.getInt((String) null, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.getInt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Prop prop0 = new Prop("");
      prop0.appendIfExists((String) null);
      // Undeclared exception!
      try { 
        prop0.getInt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.getBoolean((String) null, (Boolean) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      File file0 = MockFile.createTempFile("cC m(P:u", "cC m(P:u");
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.getBoolean((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      File file0 = MockFile.createTempFile("File can not be null.", "] cannot be instantiated due to access restrictions");
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.get((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.containsKey((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Hashtable", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.appendIfExists((File) null, "UzGOEg");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Prop prop0 = new Prop("");
      MockFile mockFile0 = new MockFile("");
      // Undeclared exception!
      try { 
        prop0.appendIfExists((File) mockFile0, "[rZ,j@g:\"");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File not found : 
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "Yc(@.S.VQ_@E@U{b'HV");
      Prop prop0 = new Prop(file0, "UTF-8");
      FileSystemHandling.shouldAllThrowIOExceptions();
      // Undeclared exception!
      try { 
        prop0.appendIfExists(file0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      File file0 = MockFile.createTempFile("*9A/R", "uBB*B{VN52", (File) null);
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.appendIfExists((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Prop prop0 = new Prop("");
      MockFile mockFile0 = new MockFile((String) null, "");
      // Undeclared exception!
      try { 
        prop0.appendIfExists((File) mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File not found : 
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.append("", "The value can not parse to Boolean : ");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.append((String) null, "7Mn3RD&q$XVsf");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      File file0 = MockFile.createTempFile("_ku5", "_ku5");
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.append("log4j:WARN ", "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Properties file not found in classpath: log4j:WARN 
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.append((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("}", "}");
      mockFile0.createNewFile();
      Prop prop0 = new Prop(mockFile0);
      // Undeclared exception!
      try { 
        prop0.append("}");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Properties file not found in classpath: }
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      File file0 = MockFile.createTempFile("T)G8):mcqcBP X I", "MYP>8q{nzn");
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.append(file0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charsetName
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.append((File) null, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File can not be null.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      Prop prop0 = new Prop("");
      MockFile mockFile0 = new MockFile("K0;cSC;9C4#&L_");
      // Undeclared exception!
      try { 
        prop0.append((File) mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop((String) null, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop("Z21))S8Q");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Properties file not found in classpath: Z21))S8Q
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "Yc(@.S.VQ_@E@U{b'HV");
      Prop prop0 = new Prop(file0);
      Boolean boolean0 = prop0.getBoolean(":.9ll*{", (Boolean) null);
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "Yc(@.S.VQ_@E@U{b'HV");
      Prop prop0 = new Prop(file0);
      Long long0 = prop0.getLong("UTF-8", (Long) null);
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      MockFile mockFile0 = new MockFile("}", "}");
      mockFile0.createNewFile();
      Prop prop0 = new Prop(mockFile0);
      Integer integer0 = new Integer((-1419));
      Integer integer1 = prop0.getInt("+*:m5\"Ud{kfI=*3f", integer0);
      assertEquals((-1419), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("A9EF#R[7");
      Prop prop0 = new Prop("");
      Prop prop1 = prop0.appendIfExists((File) mockFile0, "");
      assertSame(prop1, prop0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "Yc(@.S.VQ_@E@U{b'HV");
      Prop prop0 = new Prop(file0);
      Prop prop1 = prop0.append(prop0);
      assertSame(prop0, prop1);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      File file0 = MockFile.createTempFile("hd:mAy;FHqGBek0", "hd:mAy;FHqGBek0");
      Prop prop0 = null;
      try {
        prop0 = new Prop(file0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // charsetName
         //
         verifyException("java.io.InputStreamReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      MockFile mockFile0 = new MockFile("?NU##C#s%_(rH.c=0D");
      Prop prop0 = null;
      try {
        prop0 = new Prop(mockFile0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Prop prop0 = null;
      try {
        prop0 = new Prop(mockFile0, "");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File not found : 
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop((File) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File can not be null.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Prop prop0 = new Prop("", "UTF-8");
      Long long0 = new Long((-2630L));
      Long long1 = prop0.getLong("", long0);
      assertEquals((-2630L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop("!JL[rOrELQ", "!JL[rOrELQ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Properties file not found in classpath: !JL[rOrELQ
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop("", "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      File file0 = MockFile.createTempFile("Was not allowed to read system property \"", "Properties file not found in classpath: ");
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.append(file0, "u0_Uj&>_b+P");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "Yc(@.S.VQ_@E@U{b'HV");
      Prop prop0 = new Prop(file0);
      Prop prop1 = prop0.append("", "UTF-8");
      assertSame(prop1, prop0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      File file0 = MockFile.createTempFile("Was not allowed to read system property \"", "Properties file not found in classpath: ");
      Prop prop0 = new Prop(file0);
      Properties properties0 = prop0.getProperties();
      assertTrue(properties0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      File file0 = MockFile.createTempFile("*9A/R", "uBB*B{VN52", (File) null);
      Prop prop0 = new Prop(file0);
      Long long0 = prop0.getLong("uBB*B{VN52");
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      File file0 = MockFile.createTempFile("The value can not parse to Boolean : ", "The value can not parse to Boolean : ");
      Prop prop0 = new Prop(file0);
      // Undeclared exception!
      try { 
        prop0.append((Prop) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // prop can not be null
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      Prop prop0 = new Prop("");
      File file0 = MockFile.createTempFile("Attempted to reset the LoggerFactory without possessing the guard.", "");
      // Undeclared exception!
      try { 
        prop0.appendIfExists(file0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      Prop prop0 = new Prop("");
      MockFile mockFile0 = new MockFile("");
      // Undeclared exception!
      try { 
        prop0.append((File) mockFile0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File not found : 
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      Prop prop0 = null;
      try {
        prop0 = new Prop((File) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // File can not be null.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      Prop prop0 = new Prop("");
      Prop prop1 = prop0.appendIfExists("", "7Mn3RD&q$XVsf");
      assertSame(prop1, prop0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      Prop prop0 = new Prop("");
      Boolean boolean0 = prop0.getBoolean("");
      assertNull(boolean0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      File file0 = MockFile.createTempFile("*9A/R", "uBB*B{VN52", (File) null);
      Prop prop0 = new Prop(file0);
      String string0 = prop0.get("*9A/R", "uBB*B{VN52");
      assertEquals("uBB*B{VN52", string0);
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      File file0 = MockFile.createTempFile("*9A/R", "uBB*B{VN52", (File) null);
      Prop prop0 = new Prop(file0);
      Prop prop1 = prop0.append(file0);
      assertSame(prop0, prop1);
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      Prop prop0 = new Prop("");
      // Undeclared exception!
      try { 
        prop0.getLong((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test59()  throws Throwable  {
      Prop prop0 = new Prop("");
      boolean boolean0 = prop0.containsKey("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test60()  throws Throwable  {
      Prop prop0 = new Prop("");
      MockFile mockFile0 = new MockFile("K0;cSC;9C4#&L_");
      Prop prop1 = prop0.appendIfExists((File) mockFile0);
      assertSame(prop0, prop1);
  }

  @Test(timeout = 4000)
  public void test61()  throws Throwable  {
      Prop prop0 = new Prop("");
      Integer integer0 = prop0.getInt("");
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test62()  throws Throwable  {
      Prop prop0 = new Prop("");
      Prop prop1 = prop0.append("");
      assertSame(prop0, prop1);
  }

  @Test(timeout = 4000)
  public void test63()  throws Throwable  {
      Prop prop0 = new Prop("");
      String string0 = prop0.get("File not found : ");
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test64()  throws Throwable  {
      MockFile mockFile0 = new MockFile("}xq};OD`{4  WN@_/", "}xq};OD`{4  WN@_/");
      Prop prop0 = null;
      try {
        prop0 = new Prop(mockFile0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Error loading properties file.
         //
         verifyException("com.jfinal.kit.Prop", e);
      }
  }
}