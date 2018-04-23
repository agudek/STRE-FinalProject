/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:02:27 GMT 2018
 */

package org.jsoup.nodes;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFileWriter;
import org.jsoup.nodes.Attributes;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Comment;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.DocumentType;
import org.jsoup.nodes.Node;
import org.jsoup.nodes.TextNode;
import org.jsoup.nodes.XmlDeclaration;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class LeafNode_ESTest extends LeafNode_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertFalse(cDataNode0.hasParent());
      assertNotNull(cDataNode0);
      
      cDataNode0.coreValue("");
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertFalse(cDataNode0.hasParent());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, (String) null, (String) null);
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      assertNotNull(documentType0);
      
      documentType0.siblingIndex = 1;
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      assertEquals(1, documentType0.siblingIndex());
      
      Node node0 = documentType0.removeAttr("org.jsoup.nodes.LeafNode");
      assertSame(documentType0, node0);
      assertSame(node0, documentType0);
      assertEquals("#doctype", documentType0.nodeName());
      assertFalse(documentType0.hasParent());
      assertEquals(1, documentType0.siblingIndex());
      assertEquals(1, node0.siblingIndex());
      assertEquals("#doctype", node0.nodeName());
      assertFalse(node0.hasParent());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, (String) null, (String) null);
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertNotNull(documentType0);
      
      documentType0.siblingIndex = (-294);
      assertFalse(documentType0.hasParent());
      assertEquals((-294), documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      
      Node node0 = documentType0.removeAttr("org.jsoup.nodes.LeafNode");
      assertSame(documentType0, node0);
      assertSame(node0, documentType0);
      assertFalse(documentType0.hasParent());
      assertEquals((-294), documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals((-294), node0.siblingIndex());
      assertFalse(node0.hasParent());
      assertEquals("#doctype", node0.nodeName());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      DocumentType documentType0 = new DocumentType(">*_aGXVSA7n\u0001w%cY", "T0zqjP_>9", "T0zqjP_>9");
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertNotNull(documentType0);
      
      boolean boolean0 = documentType0.hasAttributes();
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Comment comment0 = new Comment("<Uc2'2.{^", "?O4~Qu4!u7h$r J]");
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      assertNotNull(comment0);
      
      boolean boolean0 = comment0.hasAttributes();
      assertEquals(0, comment0.siblingIndex());
      assertEquals("#comment", comment0.nodeName());
      assertFalse(comment0.hasParent());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("|kzLrjId9(?E", "");
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertEquals(0, dataNode0.siblingIndex());
      assertNotNull(dataNode0);
      
      boolean boolean0 = dataNode0.hasAttr("#data");
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertEquals(0, dataNode0.siblingIndex());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      TextNode textNode0 = TextNode.createFromEncoded("nebYX]");
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(textNode0);
      
      boolean boolean0 = textNode0.hasAttr("nebYX]");
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Comment comment0 = new Comment((String) null, (String) null);
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      assertNotNull(comment0);
      
      String string0 = comment0.coreValue();
      assertEquals(0, comment0.siblingIndex());
      assertFalse(comment0.hasParent());
      assertEquals("#comment", comment0.nodeName());
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      TextNode textNode0 = new TextNode("fyJ-o(");
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertNotNull(textNode0);
      
      String string0 = textNode0.coreValue();
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertNotNull(string0);
      assertEquals("fyJ-o(", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("!s`", "!s`", "!s`");
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      assertNotNull(documentType0);
      
      String string0 = documentType0.coreValue();
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null, (String) null);
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertEquals(0, dataNode0.siblingIndex());
      assertNotNull(dataNode0);
      
      Attributes attributes0 = dataNode0.attributes();
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals(0, attributes0.size());
      assertNotNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      TextNode textNode0 = new TextNode(")]zTCR>@");
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(textNode0);
      
      textNode0.siblingIndex = 1373;
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(1373, textNode0.siblingIndex());
      
      Node node0 = textNode0.attr("86f9x", (String) null);
      assertSame(textNode0, node0);
      assertSame(node0, textNode0);
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(1373, textNode0.siblingIndex());
      assertFalse(node0.hasParent());
      assertEquals(1373, node0.siblingIndex());
      assertEquals("#text", node0.nodeName());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      DataNode dataNode0 = DataNode.createFromEncoded("1bKHib&B4n0*g$`", "1bKHib&B4n0*g$`");
      assertEquals(0, dataNode0.siblingIndex());
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertNotNull(dataNode0);
      
      dataNode0.reparentChild(dataNode0);
      assertEquals(0, dataNode0.siblingIndex());
      assertTrue(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      
      Node node0 = dataNode0.attr("SYSTEM", "SYSTEM");
      assertSame(dataNode0, node0);
      assertSame(node0, dataNode0);
      assertEquals(0, dataNode0.siblingIndex());
      assertTrue(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertEquals("#data", node0.nodeName());
      assertTrue(node0.hasParent());
      assertEquals(0, node0.siblingIndex());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("SYSTEM", "", false);
      assertFalse(xmlDeclaration0.hasParent());
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertNotNull(xmlDeclaration0);
      
      String string0 = xmlDeclaration0.attr("#declaration");
      assertFalse(xmlDeclaration0.hasParent());
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertNotNull(string0);
      assertEquals("SYSTEM", string0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      DataNode dataNode0 = new DataNode("A_[,?cZWv", "A_[,?cZWv");
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertNotNull(dataNode0);
      
      String string0 = dataNode0.absUrl("A_[,?cZWv");
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, (String) null, (String) null);
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertNotNull(documentType0);
      
      // Undeclared exception!
      try { 
        documentType0.removeAttr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null, (String) null);
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      assertNotNull(dataNode0);
      
      MockFileWriter mockFileWriter0 = new MockFileWriter("EEOPZfKPEX]N!7vy]X", false);
      assertNotNull(mockFileWriter0);
      
      dataNode0.value = (Object) mockFileWriter0;
      assertEquals(0, dataNode0.siblingIndex());
      assertEquals("#data", dataNode0.nodeName());
      assertFalse(dataNode0.hasParent());
      
      // Undeclared exception!
      try { 
        dataNode0.hasAttr((String) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.evosuite.runtime.mock.java.io.MockFileWriter cannot be cast to java.lang.String
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null);
      assertFalse(dataNode0.hasParent());
      assertEquals("#data", dataNode0.nodeName());
      assertEquals(0, dataNode0.siblingIndex());
      assertNotNull(dataNode0);
      
      // Undeclared exception!
      try { 
        dataNode0.attr((String) null, "lw5'sC");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, (String) null, (String) null);
      assertFalse(documentType0.hasParent());
      assertEquals(0, documentType0.siblingIndex());
      assertEquals("#doctype", documentType0.nodeName());
      assertNotNull(documentType0);
      
      // Undeclared exception!
      try { 
        documentType0.attr((String) null, "SYSTEM");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("5Rnp79fnKCi(|O.@", "5Rnp79fnKCi(|O.@", "4SBCBlB~hs~i]-oEy", "4SBCBlB~hs~i]-oEy", "4SBCBlB~hs~i]-oEy");
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertNotNull(documentType0);
      
      // Undeclared exception!
      try { 
        documentType0.attr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      DocumentType documentType0 = new DocumentType("i13BX]'s7JQCIQ?&QWJ", "86Q9x", "86Q9x");
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertNotNull(documentType0);
      
      TextNode textNode0 = TextNode.createFromEncoded("", "PUBLIC");
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(textNode0);
      
      documentType0.value = (Object) textNode0;
      assertFalse(documentType0.hasParent());
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      
      // Undeclared exception!
      try { 
        documentType0.absUrl("Tag name must not be empty.");
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // org.jsoup.nodes.TextNode cannot be cast to java.lang.String
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode("");
      assertFalse(cDataNode0.hasParent());
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertNotNull(cDataNode0);
      
      Attributes attributes0 = cDataNode0.attributes();
      assertFalse(cDataNode0.hasParent());
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(1, attributes0.size());
      assertNotNull(attributes0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(textNode0);
      
      CDataNode cDataNode0 = new CDataNode("");
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertFalse(cDataNode0.hasParent());
      assertNotNull(cDataNode0);
      
      cDataNode0.setParentNode(textNode0);
      assertFalse(textNode0.hasParent());
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertTrue(cDataNode0.hasParent());
      
      // Undeclared exception!
      try { 
        cDataNode0.before("");
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      TextNode textNode0 = new TextNode(")]zTCR>@");
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(textNode0);
      
      String string0 = textNode0.baseUri();
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      TextNode textNode0 = new TextNode((String) null);
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertNotNull(textNode0);
      
      String string0 = textNode0.attr(">Y]");
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertNotNull(textNode0);
      
      int int0 = textNode0.childNodeSize();
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertEquals(0, textNode0.siblingIndex());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      XmlDeclaration xmlDeclaration0 = new XmlDeclaration("`PpQ >R&eEV [kMm", false);
      assertFalse(xmlDeclaration0.hasParent());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertEquals(0, xmlDeclaration0.siblingIndex());
      assertNotNull(xmlDeclaration0);
      
      xmlDeclaration0.doSetBaseUri("nebYX]");
      assertFalse(xmlDeclaration0.hasParent());
      assertEquals("#declaration", xmlDeclaration0.nodeName());
      assertEquals(0, xmlDeclaration0.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      assertEquals("#text", textNode0.nodeName());
      assertEquals(0, textNode0.siblingIndex());
      assertFalse(textNode0.hasParent());
      assertNotNull(textNode0);
      
      // Undeclared exception!
      try { 
        textNode0.absUrl("");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // String must not be empty
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TextNode textNode0 = new TextNode("");
      assertEquals(0, textNode0.siblingIndex());
      assertEquals("#text", textNode0.nodeName());
      assertFalse(textNode0.hasParent());
      assertNotNull(textNode0);
      
      // Undeclared exception!
      try { 
        textNode0.ensureChildNodes();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // Leaf Nodes do not have child nodes.
         //
         verifyException("org.jsoup.nodes.LeafNode", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      DocumentType documentType0 = new DocumentType((String) null, (String) null, (String) null, (String) null);
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      assertNotNull(documentType0);
      
      Node node0 = documentType0.removeAttr("org.jsoup.nodes.LeafNode");
      assertSame(documentType0, node0);
      assertSame(node0, documentType0);
      assertEquals("#doctype", documentType0.nodeName());
      assertEquals(0, documentType0.siblingIndex());
      assertFalse(documentType0.hasParent());
      assertEquals(0, node0.siblingIndex());
      assertEquals("#doctype", node0.nodeName());
      assertFalse(node0.hasParent());
      assertNotNull(node0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      DataNode dataNode0 = new DataNode((String) null, (String) null);
      // Undeclared exception!
      try { 
        dataNode0.hasAttr((String) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}