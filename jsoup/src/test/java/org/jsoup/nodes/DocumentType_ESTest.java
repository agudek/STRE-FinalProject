/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:01:14 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.CharArrayWriter;
import java.io.IOException;
import java.io.PipedWriter;
import java.io.StringWriter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Entities;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class DocumentType_ESTest extends DocumentType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("publicId", "publicId", "publicId", "publicId");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      documentType0.outerHtmlTail(stringWriter0, (-1231), (Document.OutputSettings) null);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("", stringWriter0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      CharArrayWriter charArrayWriter0 = new CharArrayWriter();
      assertNotNull(charArrayWriter0);
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      documentType0.value = (Object) charArrayWriter0;
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("", charArrayWriter0.toString());
      assertEquals(0, charArrayWriter0.size());
      
      // Undeclared exception!
      try { 
        documentType0.setPubSysKey("SYSTEM");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.io.CharArrayWriter cannot be cast to java.lang.String
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("=bCu10:}D-:T", "?pX8y'[", "=bCu10:}D-:T", "`_4l2tSZKWc_<:A@q");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      
      PipedWriter pipedWriter0 = new PipedWriter();
      assertNotNull(pipedWriter0);
      
      Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
      assertNotNull(document_OutputSettings0);
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      
      try { 
        documentType0.outerHtmlHead(pipedWriter0, 790, document_OutputSettings0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedWriter", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DocumentType documentType0 = null;
      try {
        documentType0 = new DocumentType((String) null, (String) null, "Ji63G6pdf'j5n");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("cLO", "cLO", "", "Kv`g-+t2v,", "cLO");
      assertNotNull(documentType0);
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      
      String string0 = documentType0.nodeName();
      assertNotNull(string0);
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("cLO", "cLO", "", "Kv`g-+t2v,", "cLO");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
      assertNotNull(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      
      Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
      assertNotNull(document_OutputSettings0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      
      documentType0.outerHtmlHead(stringBuilder0, 62, document_OutputSettings0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("<!DOCTYPE cLO cLO \"Kv`g-+t2v,\">", stringBuilder0.toString());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      Node node0 = documentType0.clearAttributes();
      assertNotNull(node0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(node0.hasParent());
      assertEquals("#doctype", node0.nodeName());
      assertEquals(0, node0.siblingIndex());
      assertSame(documentType0, node0);
      assertSame(node0, documentType0);
      
      String string0 = documentType0.outerHtml();
      assertNotNull(string0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("<!doctype>", string0);
      assertSame(documentType0, node0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("cLO", "cLO", "", "Kv`g-+t2v,", "cLO");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      StringBuilder stringBuilder0 = new StringBuilder((CharSequence) "");
      assertNotNull(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      
      Document.OutputSettings document_OutputSettings0 = documentType0.getOutputSettings();
      assertNotNull(document_OutputSettings0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals(Document.OutputSettings.Syntax.html, document_OutputSettings0.syntax());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      
      Document.OutputSettings.Syntax document_OutputSettings_Syntax0 = Document.OutputSettings.Syntax.xml;
      Document.OutputSettings document_OutputSettings1 = document_OutputSettings0.syntax(document_OutputSettings_Syntax0);
      assertNotNull(document_OutputSettings1);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings0.syntax());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertTrue(document_OutputSettings1.prettyPrint());
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings1.syntax());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings1.escapeMode());
      assertEquals(1, document_OutputSettings1.indentAmount());
      assertFalse(document_OutputSettings1.outline());
      assertSame(document_OutputSettings0, document_OutputSettings1);
      assertSame(document_OutputSettings1, document_OutputSettings0);
      
      documentType0.outerHtmlHead(stringBuilder0, 62, document_OutputSettings0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("<!DOCTYPE cLO cLO \"Kv`g-+t2v,\">", stringBuilder0.toString());
      assertTrue(document_OutputSettings0.prettyPrint());
      assertEquals(1, document_OutputSettings0.indentAmount());
      assertEquals(Document.OutputSettings.Syntax.xml, document_OutputSettings0.syntax());
      assertFalse(document_OutputSettings0.outline());
      assertEquals(Entities.EscapeMode.base, document_OutputSettings0.escapeMode());
      assertSame(document_OutputSettings0, document_OutputSettings1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      documentType0.setPubSysKey("SYSTEM");
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("4_Rv]\"ZBwO[0_%i", "4_Rv]\"ZBwO[0_%i", (String) null, "<!doctype");
      assertNotNull(documentType0);
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      
      documentType0.setPubSysKey((String) null);
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, (String) null, (String) null, (String) null);
      assertNotNull(documentType0);
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("publicId", "publicId", "publicId", "publicId");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      
      StringWriter stringWriter0 = new StringWriter();
      assertNotNull(stringWriter0);
      assertEquals("", stringWriter0.toString());
      
      // Undeclared exception!
      try { 
        documentType0.outerHtmlHead(stringWriter0, (-1231), (Document.OutputSettings) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.nodes.DocumentType", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "", "");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("j0_yNFg%qT,oj5", "j0_yNFg%qT,oj5", "j0_yNFg%qT,oj5");
      assertNotNull(documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=", "Xsxqe?KC1?xfu=");
      documentType0.outerHtml();
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("", "", "");
      assertEquals("#doctype", documentType0.nodeName());
  }
}
