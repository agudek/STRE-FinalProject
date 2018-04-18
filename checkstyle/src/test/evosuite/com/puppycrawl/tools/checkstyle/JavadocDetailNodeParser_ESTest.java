/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 13:10:46 GMT 2018
 */

package com.puppycrawl.tools.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.DetailNode;
import com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl;
import org.antlr.v4.runtime.Token;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class JavadocDetailNodeParser_ESTest extends JavadocDetailNodeParser_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JavadocDetailNodeParser.ParseStatus javadocDetailNodeParser_ParseStatus0 = new JavadocDetailNodeParser.ParseStatus();
      boolean boolean0 = javadocDetailNodeParser_ParseStatus0.isNonTight();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      JavadocDetailNodeParser.ParseErrorMessage javadocDetailNodeParser_ParseErrorMessage0 = new JavadocDetailNodeParser.ParseErrorMessage(332, "|\"V}#V;", objectArray0);
      int int0 = javadocDetailNodeParser_ParseErrorMessage0.getLineNumber();
      assertEquals(332, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      JavadocDetailNodeParser.ParseErrorMessage javadocDetailNodeParser_ParseErrorMessage0 = new JavadocDetailNodeParser.ParseErrorMessage((-798), "0\u0660\u06F0\u07C0\u0966\u09E6\u0A66\u0AE6\u0B66\u0BE6\u0C66\u0CE6\u0D66\u0DE6\u0E50\u0ED0\u0F20\u1040\u1090\u17E0\u1810\u1946\u19D0\u1A80\u1A90\u1B50\u1BB0\u1C40\u1C50\uA620\uA8D0\uA900\uA9D0\uA9F0\uAA50\uABF0\uFF10", objectArray0);
      javadocDetailNodeParser_ParseErrorMessage0.getMessageKey();
      assertEquals((-798), javadocDetailNodeParser_ParseErrorMessage0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      JavadocDetailNodeParser.ParseErrorMessage javadocDetailNodeParser_ParseErrorMessage0 = new JavadocDetailNodeParser.ParseErrorMessage(332, "|\"V}#V;", objectArray0);
      javadocDetailNodeParser_ParseErrorMessage0.getMessageArguments();
      assertEquals(332, javadocDetailNodeParser_ParseErrorMessage0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JavadocDetailNodeParser javadocDetailNodeParser0 = new JavadocDetailNodeParser();
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        javadocDetailNodeParser0.parseJavadocAsDetailNode(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      JavadocDetailNodeParser.ParseStatus javadocDetailNodeParser_ParseStatus0 = new JavadocDetailNodeParser.ParseStatus();
      DetailNode detailNode0 = javadocDetailNodeParser_ParseStatus0.getTree();
      assertNull(detailNode0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      JavadocDetailNodeParser.ParseStatus javadocDetailNodeParser_ParseStatus0 = new JavadocDetailNodeParser.ParseStatus();
      JavadocDetailNodeParser.ParseErrorMessage javadocDetailNodeParser_ParseErrorMessage0 = javadocDetailNodeParser_ParseStatus0.getParseErrorMessage();
      assertNull(javadocDetailNodeParser_ParseErrorMessage0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      JavadocDetailNodeParser.ParseStatus javadocDetailNodeParser_ParseStatus0 = new JavadocDetailNodeParser.ParseStatus();
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocDetailNodeParser_ParseStatus0.setTree(javadocNodeImpl0);
      assertEquals(0, javadocNodeImpl0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Object[] objectArray0 = new Object[7];
      JavadocDetailNodeParser.ParseErrorMessage javadocDetailNodeParser_ParseErrorMessage0 = new JavadocDetailNodeParser.ParseErrorMessage(332, "|\"V}#V;", objectArray0);
      JavadocDetailNodeParser.ParseStatus javadocDetailNodeParser_ParseStatus0 = new JavadocDetailNodeParser.ParseStatus();
      javadocDetailNodeParser_ParseStatus0.setParseErrorMessage(javadocDetailNodeParser_ParseErrorMessage0);
      assertEquals(332, javadocDetailNodeParser_ParseErrorMessage0.getLineNumber());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      JavadocDetailNodeParser.ParseStatus javadocDetailNodeParser_ParseStatus0 = new JavadocDetailNodeParser.ParseStatus();
      Token token0 = javadocDetailNodeParser_ParseStatus0.getFirstNonTightHtmlTag();
      assertNull(token0);
  }
}
