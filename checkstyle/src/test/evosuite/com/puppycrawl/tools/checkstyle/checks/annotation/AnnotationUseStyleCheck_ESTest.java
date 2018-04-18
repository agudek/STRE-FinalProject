/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:49:51 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.annotation;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AnnotationUseStyleCheck_ESTest extends AnnotationUseStyleCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(1073741824, "com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck$ElementStyle");
      detailAST0.addChild(detailAST0);
      annotationUseStyleCheck0.visitToken(detailAST0);
      assertEquals("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck$ElementStyle", detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST0.addChild(detailAST1);
      annotationUseStyleCheck0.visitToken(detailAST0);
      assertNull(annotationUseStyleCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      annotationUseStyleCheck0.setTrailingArrayComma("NEVER");
      assertEquals(SeverityLevel.ERROR, annotationUseStyleCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      annotationUseStyleCheck0.setElementStyle("COMPACT");
      assertEquals(SeverityLevel.ERROR, annotationUseStyleCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      annotationUseStyleCheck0.setClosingParens("ALWAYS");
      assertEquals(SeverityLevel.ERROR, annotationUseStyleCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.setTrailingArrayComma((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.setElementStyle("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unable to parse 
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.setClosingParens((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      int[] intArray0 = annotationUseStyleCheck0.getRequiredTokens();
      assertArrayEquals(new int[] {159}, intArray0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(77);
      detailAST0.addChild(detailAST0);
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.visitToken(detailAST0);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.visitToken(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      int[] intArray0 = annotationUseStyleCheck0.getAcceptableTokens();
      assertArrayEquals(new int[] {159}, intArray0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.setTrailingArrayComma("annotation.trailing.comma.missing");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unable to parse annotation.trailing.comma.missing
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      int[] intArray0 = annotationUseStyleCheck0.getDefaultTokens();
      assertArrayEquals(new int[] {159}, intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.setClosingParens("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unable to parse 
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      AnnotationUseStyleCheck annotationUseStyleCheck0 = new AnnotationUseStyleCheck();
      // Undeclared exception!
      try { 
        annotationUseStyleCheck0.setElementStyle((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.annotation.AnnotationUseStyleCheck", e);
      }
  }
}
