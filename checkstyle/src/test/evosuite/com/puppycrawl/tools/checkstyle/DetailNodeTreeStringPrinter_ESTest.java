/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:43:19 GMT 2018
 */

package com.puppycrawl.tools.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.DetailNodeTreeStringPrinter;
import com.puppycrawl.tools.checkstyle.api.DetailAST;
import com.puppycrawl.tools.checkstyle.api.DetailNode;
import com.puppycrawl.tools.checkstyle.checks.javadoc.JavadocNodeImpl;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.AccessDeniedException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DetailNodeTreeStringPrinter_ESTest extends DetailNodeTreeStringPrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.setLineNumber(988);
      javadocNodeImpl0.setIndex(988);
      javadocNodeImpl0.getChildren();
      javadocNodeImpl0.setParent(javadocNodeImpl0);
      String string0 = "";
      String string1 = null;
      // Undeclared exception!
      DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", (String) null);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.getChildren();
      JavadocNodeImpl javadocNodeImpl1 = new JavadocNodeImpl();
      javadocNodeImpl1.setLineNumber(988);
      javadocNodeImpl0.setIndex(988);
      javadocNodeImpl0.setIndex((-1393));
      javadocNodeImpl1.getChildren();
      javadocNodeImpl0.setParent(javadocNodeImpl1);
      String string0 = "";
      String string1 = null;
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", (String) null);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // -1392
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      JavadocNodeImpl javadocNodeImpl1 = new JavadocNodeImpl();
      JavadocNodeImpl javadocNodeImpl2 = new JavadocNodeImpl();
      javadocNodeImpl1.setParent(javadocNodeImpl2);
      javadocNodeImpl1.setLineNumber(988);
      javadocNodeImpl0.setIndex(988);
      javadocNodeImpl0.setType(58);
      javadocNodeImpl1.getChildren();
      javadocNodeImpl0.setParent(javadocNodeImpl1);
      String string0 = "";
      String string1 = null;
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      try { 
        DetailNodeTreeStringPrinter.printFileAst(mockFile0);
        fail("Expecting exception: AccessDeniedException");
      
      } catch(AccessDeniedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.getChildren();
      javadocNodeImpl0.setText("0");
      JavadocNodeImpl javadocNodeImpl1 = new JavadocNodeImpl();
      javadocNodeImpl0.setParent(javadocNodeImpl1);
      DetailNode detailNode0 = javadocNodeImpl0.getParent();
      javadocNodeImpl0.setParent(detailNode0);
      String string0 = " -> ";
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", " -> ");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown javadoc token id. Given id: 0
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.parseJavadocAsDetailNode((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DetailAST detailAST0 = new DetailAST();
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.parseJavadocAsDetailNode(detailAST0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("Unknown javadoc token name. Given name ", "Unknown javadoc token name. Given name ");
      mockFile0.mkdir();
      MockFile.createTempFile("\u04F9\u05BE\u05EA\u05F4\u06FF\u077F\u0E7F\u20AF\u213A\uFDFF\uFEFF\uFFDC", "Unknown javadoc token name. Given name ", (File) mockFile0);
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printFileAst(mockFile0);
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "com.google.common.collect.DiscreteDomain$LongDomain");
      mockFile0.mkdir();
      try { 
        DetailNodeTreeStringPrinter.printFileAst(mockFile0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      String string0 = "`--";
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "`--", "`--");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown javadoc token id. Given id: 0
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, (String) null, (String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unknown javadoc token id. Given id: 0
         //
         verifyException("com.puppycrawl.tools.checkstyle.utils.JavadocUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      MockFile mockFile0 = new MockFile(":XJy)=N]Q8iDl|Tv");
      mockFile0.setWritable(true);
      mockFile0.setExecutable(true, true);
      try { 
        DetailNodeTreeStringPrinter.printFileAst(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // C:\\Users\\Gudek-Home\\Documents\\TU\\STRE\\STRE-FinalProject\\checkstyle\\:XJy)=N]Q8iDl|Tv (No such file or directory)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      File file0 = null;
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printFileAst((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.DetailNodeTreeStringPrinter", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DetailNodeTreeStringPrinter.printTree((DetailNode) null, "3o~++=Y_}D", "/rPD");
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.setLineNumber(1004);
      javadocNodeImpl0.setIndex(1004);
      javadocNodeImpl0.getChildren();
      javadocNodeImpl0.setParent(javadocNodeImpl0);
      String string0 = "";
      String string1 = null;
      // Undeclared exception!
      DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", (String) null);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      javadocNodeImpl0.setLineNumber((-2475));
      javadocNodeImpl0.setType(10000);
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      JavadocNodeImpl javadocNodeImpl0 = new JavadocNodeImpl();
      JavadocNodeImpl javadocNodeImpl1 = new JavadocNodeImpl();
      JavadocNodeImpl javadocNodeImpl2 = new JavadocNodeImpl();
      javadocNodeImpl1.setParent(javadocNodeImpl2);
      javadocNodeImpl1.setLineNumber(988);
      javadocNodeImpl0.setIndex(988);
      javadocNodeImpl0.setText("");
      javadocNodeImpl0.setType(58);
      javadocNodeImpl1.getChildren();
      javadocNodeImpl0.setParent(javadocNodeImpl1);
      String string0 = "";
      String string1 = null;
      DetailNodeTreeStringPrinter.printTree(javadocNodeImpl0, "", (String) null);
      DetailAST detailAST0 = new DetailAST();
      detailAST0.getLastChild();
      // Undeclared exception!
      try { 
        DetailNodeTreeStringPrinter.parseJavadocAsDetailNode((DetailAST) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.JavadocDetailNodeParser", e);
      }
  }
}