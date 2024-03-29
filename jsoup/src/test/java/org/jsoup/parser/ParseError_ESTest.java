/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:06:45 GMT 2018
 */

package org.jsoup.parser;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.FormatFlagsConversionMismatchException;
import java.util.IllegalFormatConversionException;
import java.util.IllegalFormatFlagsException;
import java.util.MissingFormatArgumentException;
import java.util.MissingFormatWidthException;
import java.util.UnknownFormatConversionException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.parser.ParseError;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseError_ESTest extends ParseError_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = new ParseError(0, "", objectArray0);
      int int0 = parseError0.getPosition();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      ParseError parseError0 = new ParseError(1, (String) null);
      int int0 = parseError0.getPosition();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseError parseError0 = new ParseError(1, (String) null);
      parseError0.getErrorMessage();
      assertEquals(1, parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = new ParseError(0, "", objectArray0);
      parseError0.getErrorMessage();
      assertEquals(0, parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[5];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(1, "(Y3Ovib^\" %`g", objectArray0);
        fail("Expecting exception: UnknownFormatConversionException");
      
      } catch(UnknownFormatConversionException e) {
         //
         // Conversion = '`'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, "%-d+", objectArray0);
        fail("Expecting exception: MissingFormatWidthException");
      
      } catch(MissingFormatWidthException e) {
         //
         // %-d
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(2239, "Y#q%0n''TS5n::aN", objectArray0);
        fail("Expecting exception: IllegalFormatFlagsException");
      
      } catch(IllegalFormatFlagsException e) {
         //
         // Flags = '0'
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      objectArray0[0] = (Object) "VWaU_U}dDKE%95AR-E{";
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, "VWaU_U}dDKE%95AR-E{", objectArray0);
        fail("Expecting exception: IllegalFormatConversionException");
      
      } catch(IllegalFormatConversionException e) {
         //
         // a != java.lang.String
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(59, "Ko%,S!ho$", objectArray0);
        fail("Expecting exception: FormatFlagsConversionMismatchException");
      
      } catch(FormatFlagsConversionMismatchException e) {
         //
         // Conversion = s, Flags = ,
         //
         verifyException("java.util.Formatter$FormatSpecifier", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError(0, (String) null, objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1), "!");
      String string0 = parseError0.toString();
      assertEquals("-1: !", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      ParseError parseError0 = null;
      try {
        parseError0 = new ParseError((-1296), "')A5%Bb{F+7GNYl^f{X", objectArray0);
        fail("Expecting exception: MissingFormatArgumentException");
      
      } catch(MissingFormatArgumentException e) {
         //
         // Format specifier '%B'
         //
         verifyException("java.util.Formatter", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1), "!");
      parseError0.getErrorMessage();
      assertEquals((-1), parseError0.getPosition());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParseError parseError0 = new ParseError((-1), "!");
      int int0 = parseError0.getPosition();
      assertEquals((-1), int0);
  }
}
