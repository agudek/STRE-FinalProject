/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:32:13 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.whitespace;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.checks.whitespace.GenericWhitespaceCheck;
import java.util.ArrayList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class GenericWhitespaceCheck_ESTest extends GenericWhitespaceCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setNextSibling(detailAST0);
      // Undeclared exception!
      genericWhitespaceCheck0.visitToken(detailAST0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      DetailAST detailAST0 = new DetailAST();
      MockFile mockFile0 = new MockFile("V^n[l");
      ArrayList<String> arrayList0 = new ArrayList<String>();
      FileText fileText0 = new FileText(mockFile0, arrayList0);
      FileContents fileContents0 = new FileContents(fileText0);
      genericWhitespaceCheck0.setFileContents(fileContents0);
      detailAST0.setType(172);
      // Undeclared exception!
      try { 
        genericWhitespaceCheck0.visitToken(detailAST0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 2147483647
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      int[] intArray0 = genericWhitespaceCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {172, 173}, intArray0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(173, "ws.notPreceded");
      // Undeclared exception!
      try { 
        genericWhitespaceCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.AbstractCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        genericWhitespaceCheck0.visitToken(detailAST0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown type null[-2147483648x-2147483648]
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.whitespace.GenericWhitespaceCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      int[] intArray0 = genericWhitespaceCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {172, 173}, intArray0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      int[] intArray0 = genericWhitespaceCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {172, 173}, intArray0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      GenericWhitespaceCheck genericWhitespaceCheck0 = new GenericWhitespaceCheck();
      DetailAST detailAST0 = new DetailAST();
      genericWhitespaceCheck0.beginTree(detailAST0);
      assertEquals(0, detailAST0.getLine());
  }
}
