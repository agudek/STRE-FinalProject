/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:59:39 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.gui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import antlr.ASTNULLType;
import antlr.ParseTreeToken;
import antlr.Token;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.DetailNode;
import com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl;
import com.puppycrawl.tools.checkstyle.gui.MainFrameModel;
import com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation;
import javax.swing.JLayeredPane;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ParseTreeTablePresentation_ESTest extends ParseTreeTablePresentation_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.setType((-1));
      Object object0 = parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 1);
      assertEquals("EOF", object0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Object object0 = parseTreeTablePresentation0.getValueAt(detailAST0, 3);
      assertEquals(Integer.MIN_VALUE, object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      DetailAST detailAST0 = (DetailAST)parseTreeTablePresentation0.getRoot();
      assertEquals(1, detailAST0.getType());
      
      parseTreeTablePresentation0.getValueAt(detailAST0, 1);
      assertEquals("ROOT", detailAST0.getText());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      DetailAST detailAST1 = detailAST0.getParent();
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChild(detailAST1, 579);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      String string0 = parseTreeTablePresentation0.getColumnName(0);
      assertEquals("Tree", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      DetailAST detailAST1 = detailAST0.getParent();
      int int0 = parseTreeTablePresentation0.getChildCount(detailAST1);
      assertEquals("ROOT", detailAST1.getText());
      assertEquals(1, int0);
      assertEquals(1, detailAST1.getType());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      DetailAST detailAST1 = (DetailAST)parseTreeTablePresentation0.getRoot();
      DetailAST detailAST2 = (DetailAST)parseTreeTablePresentation0.getChild(detailAST1, 0);
      assertNotNull(detailAST2);
      assertEquals(1, detailAST1.getType());
      assertEquals("ROOT", detailAST1.getText());
      assertEquals(0, detailAST2.getType());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      detailAST0.setFirstChild(detailAST0);
      // Undeclared exception!
      parseTreeTablePresentation0.setParseTree(detailAST0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.isLeaf((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      ASTNULLType aSTNULLType0 = new ASTNULLType();
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.isLeaf(aSTNULLType0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // antlr.ASTNULLType cannot be cast to com.puppycrawl.tools.checkstyle.api.DetailAST
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Integer integer0 = new Integer(0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt(integer0, 0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.puppycrawl.tools.checkstyle.api.DetailAST
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.setType((-1950));
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 1);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1950
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Token token0 = new Token();
      ParseTreeToken parseTreeToken0 = new ParseTreeToken(token0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getIndexOfChild(parseTreeToken0, parseTreeToken0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // antlr.ParseTreeToken cannot be cast to com.puppycrawl.tools.checkstyle.api.DetailAST
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChildCount((Object) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChildCount("Line");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to com.puppycrawl.tools.checkstyle.api.DetailAST
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      Integer integer0 = JLayeredPane.FRAME_CONTENT_LAYER;
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChild(integer0, (-1017));
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Integer cannot be cast to com.puppycrawl.tools.checkstyle.api.DetailAST
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      int int0 = parseTreeTablePresentation0.getChildCount(detailAST0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      int int0 = parseTreeTablePresentation0.getChildCount(javadocNodeImpl0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChild(javadocNodeImpl0, 0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt((Object) null, (-1379));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unknown column
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Object object0 = parseTreeTablePresentation0.getValueAt(detailAST0, 4);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt((Object) null, 3);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      Object object0 = parseTreeTablePresentation0.getValueAt(detailAST0, 2);
      assertEquals(Integer.MIN_VALUE, object0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Object object0 = parseTreeTablePresentation0.getValueAt(detailAST0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      Object object0 = parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 4);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      Object object0 = parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 3);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      Object object0 = parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 2);
      assertEquals(0, object0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 1);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown javadoc token id. Given id: 0
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      Object object0 = parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, 0);
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      MainFrameModel.ParseMode mainFrameModel_ParseMode0 = MainFrameModel.ParseMode.JAVA_WITH_JAVADOC_AND_COMMENTS;
      parseTreeTablePresentation0.setParseMode(mainFrameModel_ParseMode0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChild(detailAST0, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      DetailNode[] detailNodeArray0 = new DetailNode[3];
      detailNodeArray0[0] = (DetailNode) javadocNodeImpl0;
      detailNodeArray0[1] = detailNodeArray0[0];
      detailNodeArray0[2] = (DetailNode) javadocNodeImpl0;
      javadocNodeImpl0.setChildren(detailNodeArray0);
      int int0 = parseTreeTablePresentation0.getIndexOfChild(detailNodeArray0[1], detailNodeArray0[2]);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      DetailNode[] detailNodeArray0 = new DetailNode[3];
      detailNodeArray0[0] = (DetailNode) javadocNodeImpl0;
      javadocNodeImpl0.setChildren(detailNodeArray0);
      Integer integer0 = JLayeredPane.MODAL_LAYER;
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getIndexOfChild(javadocNodeImpl0, integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      boolean boolean0 = parseTreeTablePresentation0.isLeaf(javadocNodeImpl0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      DetailNode[] detailNodeArray0 = new DetailNode[3];
      javadocNodeImpl0.setChildren(detailNodeArray0);
      boolean boolean0 = parseTreeTablePresentation0.isLeaf(javadocNodeImpl0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      MainFrameModel.ParseMode mainFrameModel_ParseMode0 = MainFrameModel.ParseMode.JAVA_WITH_JAVADOC_AND_COMMENTS;
      parseTreeTablePresentation0.setParseMode(mainFrameModel_ParseMode0);
      int int0 = parseTreeTablePresentation0.getChildCount(detailAST0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      int int0 = parseTreeTablePresentation0.getIndexOfChild(detailAST0, (Object) null);
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Object object0 = parseTreeTablePresentation0.getChild(detailAST0, (-251));
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt(javadocNodeImpl0, (-1));
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unknown column
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getColumnClass(48);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unknown column
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Class<?> class0 = parseTreeTablePresentation0.getColumnClass(4);
      assertFalse(class0.isSynthetic());
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Class<?> class0 = parseTreeTablePresentation0.getColumnClass(3);
      assertEquals("class java.lang.Integer", class0.toString());
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Class<?> class0 = parseTreeTablePresentation0.getColumnClass(2);
      assertFalse(class0.isPrimitive());
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      Class<?> class0 = parseTreeTablePresentation0.getColumnClass(1);
      assertEquals("class java.lang.String", class0.toString());
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      Class<?> class0 = parseTreeTablePresentation0.getColumnClass(0);
      assertEquals("class com.puppycrawl.tools.checkstyle.gui.ParseTreeTableModel", class0.toString());
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      DetailAST detailAST0 = (DetailAST)parseTreeTablePresentation0.getRoot();
      parseTreeTablePresentation0.setParseTree(detailAST0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getValueAt(detailAST0, 2);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getColumnName((-251));
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -251
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      int int0 = parseTreeTablePresentation0.getColumnCount();
      assertEquals(5, int0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation((DetailAST) null);
      boolean boolean0 = parseTreeTablePresentation0.isCellEditable((-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      ParseTreeTablePresentation parseTreeTablePresentation0 = new ParseTreeTablePresentation(detailAST0);
      MainFrameModel.ParseMode mainFrameModel_ParseMode0 = MainFrameModel.ParseMode.JAVA_WITH_JAVADOC_AND_COMMENTS;
      parseTreeTablePresentation0.setParseMode(mainFrameModel_ParseMode0);
      detailAST0.setType(10040);
      // Undeclared exception!
      try { 
        parseTreeTablePresentation0.getChild(detailAST0, 47);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.gui.ParseTreeTablePresentation", e);
      }
  }
}
