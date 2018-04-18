/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:50:22 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FileContents;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AvoidEscapedUnicodeCharactersCheck_ESTest extends AvoidEscapedUnicodeCharactersCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = new DetailAST();
      MockFile mockFile0 = new MockFile("forbid.escaped.unicode.char", "$y#,uvJ.M");
      Vector<String> vector0 = new Vector<String>();
      FileText fileText0 = new FileText(mockFile0, vector0);
      FileContents fileContents0 = new FileContents(fileText0);
      avoidEscapedUnicodeCharactersCheck0.setFileContents(fileContents0);
      avoidEscapedUnicodeCharactersCheck0.beginTree(detailAST0);
      assertEquals(0, detailAST0.getNumberOfChildren());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      int[] intArray0 = avoidEscapedUnicodeCharactersCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {139, 138}, intArray0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setText("forbid.escaped.unicode.char");
      avoidEscapedUnicodeCharactersCheck0.visitToken(detailAST0);
      assertFalse(avoidEscapedUnicodeCharactersCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowNonPrintableEscapes(false);
      assertFalse(avoidEscapedUnicodeCharactersCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowIfAllCharactersEscaped(true);
      assertEquals(SeverityLevel.ERROR, avoidEscapedUnicodeCharactersCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      int[] intArray0 = avoidEscapedUnicodeCharactersCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {139, 138}, intArray0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        avoidEscapedUnicodeCharactersCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        avoidEscapedUnicodeCharactersCheck0.beginTree(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.AvoidEscapedUnicodeCharactersCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowByTailComment(false);
      assertNull(avoidEscapedUnicodeCharactersCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      avoidEscapedUnicodeCharactersCheck0.setAllowEscapesForControlCharacters(true);
      assertFalse(avoidEscapedUnicodeCharactersCheck0.isCommentNodesRequired());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AvoidEscapedUnicodeCharactersCheck avoidEscapedUnicodeCharactersCheck0 = new AvoidEscapedUnicodeCharactersCheck();
      int[] intArray0 = avoidEscapedUnicodeCharactersCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {139, 138}, intArray0);
  }
}