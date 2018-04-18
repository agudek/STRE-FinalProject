/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:33:24 GMT 2018
 */

package com.puppycrawl.tools.checkstyle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.AstTreeStringPrinter;
import com.puppycrawl.tools.checkstyle.JavaParser;
import com.puppycrawl.tools.checkstyle.api.FileText;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.URI;
import java.nio.file.AccessDeniedException;
import java.nio.file.InvalidPathException;
import java.nio.file.NoSuchFileException;
import java.util.LinkedList;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class AstTreeStringPrinter_ESTest extends AstTreeStringPrinter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MockFile mockFile0 = new MockFile("   `--", "");
      File file0 = MockFile.createTempFile("`C'yZoCzuq'vk", "VK%%", (File) mockFile0);
      try { 
        AstTreeStringPrinter.printJavaAndJavadocTree(file0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      try { 
        AstTreeStringPrinter.printJavaAndJavadocTree(mockFile0);
        fail("Expecting exception: AccessDeniedException");
      
      } catch(AccessDeniedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MockFile mockFile0 = new MockFile("%l2");
      try { 
        AstTreeStringPrinter.printJavaAndJavadocTree(mockFile0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // C:\\Users\\Gudek-Home\\Documents\\TU\\STRE\\STRE-FinalProject\\checkstyle\\%l2 (No such file or directory)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_J1TBW", "^u.ny`");
      mockFile0.createNewFile();
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITH_COMMENTS;
      try { 
        AstTreeStringPrinter.printFileAst(mockFile0, javaParser_Options0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      File file0 = MockFile.createTempFile("G}kSCqZUo_<%LyLvc", "g|(&/*ci~doXM$#S~DK");
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITH_COMMENTS;
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printFileAst(file0, javaParser_Options0);
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      try { 
        AstTreeStringPrinter.printFileAst(mockFile0, javaParser_Options0);
        fail("Expecting exception: AccessDeniedException");
      
      } catch(AccessDeniedException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printFileAst((File) null, javaParser_Options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.JavaParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("oC;iy/LE");
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      FileText fileText0 = new FileText(mockFile0, linkedList0);
      try { 
        AstTreeStringPrinter.printAst(fileText0, javaParser_Options0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // NoViableAltException occurred while parsing file \\tmp\\foo.bar.
         //
         verifyException("com.puppycrawl.tools.checkstyle.JavaParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      LinkedList<String> linkedList0 = new LinkedList<String>();
      FileText fileText0 = new FileText(mockFile0, linkedList0);
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      String string0 = AstTreeStringPrinter.printAst(fileText0, javaParser_Options0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printJavaAndJavadocTree((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.JavaParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITHOUT_COMMENTS;
      try { 
        AstTreeStringPrinter.printFileAst(mockFile0, javaParser_Options0);
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // C:\\Users\\Gudek-Home\\Documents\\TU\\STRE\\STRE-FinalProject\\checkstyle\\tmp\\foo.bar (No such file or directory)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileText", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      JavaParser.Options javaParser_Options0 = JavaParser.Options.WITH_COMMENTS;
      // Undeclared exception!
      try { 
        AstTreeStringPrinter.printAst((FileText) null, javaParser_Options0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.api.FileContents", e);
      }
  }
}