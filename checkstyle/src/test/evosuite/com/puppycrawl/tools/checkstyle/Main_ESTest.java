/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:00:29 GMT 2018
 */

package com.puppycrawl.tools.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.Main;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.System;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Main_ESTest extends Main_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[7];
      stringArray0[0] = "ExplicitInitializationCheck";
      stringArray0[1] = "*EN1e^&KXT-Y";
      stringArray0[2] = "NIhzWP*=}]@17O#x8L";
      stringArray0[3] = "W";
      stringArray0[4] = "-=RCnYqc=k";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: StringIndexOutOfBoundsException");
      
      } catch(StringIndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("f]");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      String[] stringArray0 = new String[5];
      stringArray0[0] = "Lv}HxcbWqJW7MGU_!";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "f]";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "-eW.1Bu|*;PILkoYM";
      stringArray0[1] = "-eW.1Bu|*;PILkoYM";
      stringArray0[2] = "-eW.1Bu|*;PILkoYM";
      stringArray0[3] = "";
      stringArray0[4] = "";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[14];
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.cli.DefaultParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[21];
      stringArray0[0] = "ExplicitInitiTlizationCheck";
      stringArray0[1] = "ExplicitInitiTlizationCheck";
      stringArray0[2] = "ExplicitInitiTlizationCheck";
      stringArray0[3] = "W";
      stringArray0[4] = "-5=RCnYqc=k";
      // Undeclared exception!
      try { 
        Main.main(stringArray0);
        fail("Expecting exception: System.SystemExitException");
      
      } catch(System.SystemExitException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}