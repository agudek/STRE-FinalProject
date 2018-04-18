/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:33:34 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.blocks;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.checks.blocks.EmptyBlockCheck;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptyBlockCheck_ESTest extends EmptyBlockCheck_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST1.addChild(detailAST1);
      detailAST0.addNextSibling(detailAST1);
      detailAST0.setType(93);
      emptyBlockCheck0.visitToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(1911, (String) null);
      emptyBlockCheck0.visitToken(detailAST0);
      assertNull(emptyBlockCheck0.getId());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      // Undeclared exception!
      try { 
        emptyBlockCheck0.visitToken((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.blocks.EmptyBlockCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      // Undeclared exception!
      try { 
        emptyBlockCheck0.setOption((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.blocks.EmptyBlockCheck", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST1.addChild(detailAST0);
      detailAST0.addNextSibling(detailAST1);
      detailAST0.setType(93);
      emptyBlockCheck0.visitToken(detailAST0);
      assertNotSame(detailAST0, detailAST1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.addNextSibling(detailAST0);
      detailAST0.setType(93);
      emptyBlockCheck0.visitToken(detailAST0);
      assertNull(detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(94);
      emptyBlockCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, emptyBlockCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      DetailAST detailAST0 = new DetailAST();
      emptyBlockCheck0.visitToken(detailAST0);
      assertEquals(SeverityLevel.ERROR, emptyBlockCheck0.getSeverityLevel());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      int[] intArray0 = emptyBlockCheck0.getRequiredTokens();
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      int[] intArray0 = emptyBlockCheck0.getDefaultTokens();
      assertEquals(11, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      int[] intArray0 = emptyBlockCheck0.getAcceptableTokens();
      assertEquals(15, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EmptyBlockCheck emptyBlockCheck0 = new EmptyBlockCheck();
      // Undeclared exception!
      try { 
        emptyBlockCheck0.setOption("block.empty");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // unable to parse block.empty
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.blocks.EmptyBlockCheck", e);
      }
  }
}