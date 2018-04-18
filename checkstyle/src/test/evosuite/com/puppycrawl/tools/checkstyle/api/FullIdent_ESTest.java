/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:45:14 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.api;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.FullIdent;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class FullIdent_ESTest extends FullIdent_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(79);
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      assertEquals(Integer.MIN_VALUE, fullIdent0.getLineNo());
      assertEquals(Integer.MIN_VALUE, fullIdent0.getColumnNo());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdentBelow(detailAST0);
      String string0 = fullIdent0.getText();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdentBelow(detailAST0);
      int int0 = fullIdent0.getLineNo();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setLineNo(1224);
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      int int0 = fullIdent0.getLineNo();
      assertEquals(1224, int0);
      assertEquals(Integer.MIN_VALUE, fullIdent0.getColumnNo());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      DetailAST detailAST1 = new DetailAST();
      detailAST1.addChild(detailAST0);
      FullIdent fullIdent0 = FullIdent.createFullIdentBelow(detailAST1);
      assertEquals(Integer.MIN_VALUE, fullIdent0.getLineNo());
      assertEquals(Integer.MIN_VALUE, fullIdent0.getColumnNo());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setColumnNo(174);
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      int int0 = fullIdent0.getColumnNo();
      assertEquals(174, int0);
      assertEquals(Integer.MIN_VALUE, fullIdent0.getLineNo());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FullIdent.createFullIdentBelow((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FullIdent", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setNextSibling(detailAST0);
      // Undeclared exception!
      FullIdent.createFullIdent(detailAST0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.setType(59);
      // Undeclared exception!
      try { 
        FullIdent.createFullIdent(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FullIdent", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      String string0 = fullIdent0.toString();
      assertEquals("null[-2147483648x-2147483648]", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      detailAST0.initialize(17, "");
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      assertEquals(0, fullIdent0.getLineNo());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      int int0 = fullIdent0.getLineNo();
      assertEquals(Integer.MIN_VALUE, fullIdent0.getColumnNo());
      assertEquals(Integer.MIN_VALUE, int0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      fullIdent0.getText();
      assertEquals(Integer.MIN_VALUE, fullIdent0.getColumnNo());
      assertEquals(Integer.MIN_VALUE, fullIdent0.getLineNo());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdentBelow(detailAST0);
      int int0 = fullIdent0.getColumnNo();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      FullIdent fullIdent0 = FullIdent.createFullIdent(detailAST0);
      int int0 = fullIdent0.getColumnNo();
      assertEquals(Integer.MIN_VALUE, int0);
      assertEquals(Integer.MIN_VALUE, fullIdent0.getLineNo());
  }
}