/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 08:59:07 GMT 2018
 */

package org.jsoup.select;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.CDataNode;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.nodes.Node;
import org.jsoup.select.Elements;
import org.jsoup.select.NodeFilter;
import org.jsoup.select.NodeTraversor;
import org.jsoup.select.NodeVisitor;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class NodeTraversor_ESTest extends NodeTraversor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Element element0 = new Element("org.jsoup.select.NodeTraversor");
      assertNotNull(element0);
      assertFalse(element0.isBlock());
      assertEquals("org.jsoup.select.NodeTraversor", element0.nodeName());
      assertFalse(element0.hasParent());
      assertEquals("", element0.baseUri());
      assertEquals(0, element0.childNodeSize());
      assertEquals("org.jsoup.select.NodeTraversor", element0.tagName());
      assertEquals(0, element0.siblingIndex());
      
      Elements elements0 = element0.getElementsContainingOwnText("org.jsoup.select.NodeTraversor");
      assertNotNull(elements0);
      assertFalse(element0.isBlock());
      assertEquals("org.jsoup.select.NodeTraversor", element0.nodeName());
      assertFalse(element0.hasParent());
      assertEquals("", element0.baseUri());
      assertEquals(0, element0.childNodeSize());
      assertEquals("org.jsoup.select.NodeTraversor", element0.tagName());
      assertEquals(0, element0.siblingIndex());
      assertEquals(0, elements0.size());
      assertTrue(elements0.isEmpty());
      
      // Undeclared exception!
      try { 
        NodeTraversor.traverse((NodeVisitor) null, elements0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode((String) null);
      assertNotNull(cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      
      // Undeclared exception!
      try { 
        NodeTraversor.traverse((NodeVisitor) null, (Node) cDataNode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.NodeTraversor", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        NodeTraversor.filter(nodeFilter0, (Elements) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Document document0 = new Document("_uz\"p");
      assertNotNull(document0);
      assertEquals("_uz\"p", document0.location());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.childNodeSize());
      assertEquals("_uz\"p", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.isBlock());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.siblingIndex());
      
      // Undeclared exception!
      try { 
        NodeTraversor.filter((NodeFilter) null, (Node) document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.NodeTraversor", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.REMOVE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1, nodeFilter_FilterResult1, (NodeFilter.FilterResult) null, (NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Document document0 = Document.createShell("'RJ{1hwI(bBX%@T");
      assertNotNull(document0);
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("'RJ{1hwI(bBX%@T", document0.location());
      assertFalse(document0.hasParent());
      assertFalse(document0.isBlock());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertEquals("'RJ{1hwI(bBX%@T", document0.baseUri());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.tagName());
      
      NodeTraversor.filter(nodeFilter0, (Node) document0);
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("'RJ{1hwI(bBX%@T", document0.location());
      assertFalse(document0.hasParent());
      assertFalse(document0.isBlock());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertEquals("'RJ{1hwI(bBX%@T", document0.baseUri());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.tagName());
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult0));
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      CDataNode cDataNode0 = new CDataNode(":matches(%s)");
      assertNotNull(cDataNode0);
      assertEquals(0, cDataNode0.siblingIndex());
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.SKIP_ENTIRELY;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, (Node) cDataNode0);
      assertEquals(0, cDataNode0.siblingIndex());
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(NodeFilter.FilterResult.SKIP_ENTIRELY, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      CDataNode cDataNode0 = new CDataNode(":matches(%s)");
      assertNotNull(cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeTraversor.filter(nodeFilter0, (Node) cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult2);
      assertSame(nodeFilter_FilterResult0, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult2, nodeFilter_FilterResult0);
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult1));
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      Document document0 = Document.createShell("'RJ{1hwI(bBX%@T");
      assertNotNull(document0);
      assertEquals("#root", document0.tagName());
      assertEquals("'RJ{1hwI(bBX%@T", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.isBlock());
      assertEquals("'RJ{1hwI(bBX%@T", document0.location());
      assertFalse(document0.hasParent());
      
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.REMOVE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeTraversor.filter(nodeFilter0, (Node) document0);
      assertEquals("#root", document0.tagName());
      assertEquals("'RJ{1hwI(bBX%@T", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.childNodeSize());
      assertFalse(document0.isBlock());
      assertEquals("'RJ{1hwI(bBX%@T", document0.location());
      assertFalse(document0.hasParent());
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult2);
      assertSame(nodeFilter_FilterResult0, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      assertSame(nodeFilter_FilterResult2, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult1);
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult1));
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0, nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult0, (NodeFilter.FilterResult) null, (NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Document document0 = Document.createShell("'RJ{1hwI(bBX%@T");
      assertNotNull(document0);
      assertFalse(document0.isBlock());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(1, document0.childNodeSize());
      assertEquals("'RJ{1hwI(bBX%@T", document0.baseUri());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.hasParent());
      assertEquals("'RJ{1hwI(bBX%@T", document0.location());
      
      NodeTraversor.filter(nodeFilter0, (Node) document0);
      assertFalse(document0.isBlock());
      assertEquals("#document", document0.nodeName());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(1, document0.childNodeSize());
      assertEquals("'RJ{1hwI(bBX%@T", document0.baseUri());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#root", document0.tagName());
      assertFalse(document0.hasParent());
      assertEquals("'RJ{1hwI(bBX%@T", document0.location());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", 726);
      assertNotNull(pattern0);
      assertEquals("", pattern0.pattern());
      assertEquals("", pattern0.toString());
      assertEquals(726, pattern0.flags());
      
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Document document0 = Document.createShell("");
      assertNotNull(document0);
      assertFalse(document0.isBlock());
      assertEquals(0, document0.siblingIndex());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals("#root", document0.tagName());
      assertEquals(1, document0.childNodeSize());
      assertEquals("", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.hasParent());
      
      Elements elements0 = document0.getElementsMatchingText(pattern0);
      assertNotNull(elements0);
      assertEquals("", pattern0.pattern());
      assertEquals("", pattern0.toString());
      assertEquals(726, pattern0.flags());
      assertFalse(document0.isBlock());
      assertEquals(0, document0.siblingIndex());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals("#root", document0.tagName());
      assertEquals(1, document0.childNodeSize());
      assertEquals("", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.hasParent());
      assertFalse(elements0.isEmpty());
      assertEquals(4, elements0.size());
      
      NodeTraversor.traverse(nodeVisitor0, elements0);
      assertEquals("", pattern0.pattern());
      assertEquals("", pattern0.toString());
      assertEquals(726, pattern0.flags());
      assertFalse(document0.isBlock());
      assertEquals(0, document0.siblingIndex());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals("#root", document0.tagName());
      assertEquals(1, document0.childNodeSize());
      assertEquals("", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.hasParent());
      assertFalse(elements0.isEmpty());
      assertEquals(4, elements0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      Document document0 = Document.createShell("");
      assertNotNull(document0);
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.siblingIndex());
      assertEquals("", document0.baseUri());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(1, document0.childNodeSize());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      
      NodeTraversor.traverse(nodeVisitor0, (Node) document0);
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.siblingIndex());
      assertEquals("", document0.baseUri());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(1, document0.childNodeSize());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.REMOVE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.SKIP_ENTIRELY;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1, nodeFilter_FilterResult1, nodeFilter_FilterResult2, nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult2, nodeFilter_FilterResult0).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Document document0 = Document.createShell("");
      assertNotNull(document0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals("#root", document0.tagName());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals(1, document0.childNodeSize());
      
      Elements elements0 = document0.getElementsByIndexLessThan((-74));
      assertNotNull(elements0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals("#root", document0.tagName());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals(1, document0.childNodeSize());
      assertTrue(elements0.isEmpty());
      assertEquals(0, elements0.size());
      
      boolean boolean0 = elements0.add((Element) document0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals("#root", document0.tagName());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals(1, document0.childNodeSize());
      assertFalse(elements0.isEmpty());
      assertEquals(1, elements0.size());
      assertTrue(boolean0);
      
      boolean boolean1 = elements0.add((Element) document0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals("#root", document0.tagName());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals(1, document0.childNodeSize());
      assertEquals(2, elements0.size());
      assertFalse(elements0.isEmpty());
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      NodeTraversor.filter(nodeFilter0, elements0);
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.updateMetaCharsetElement());
      assertFalse(document0.isBlock());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals("#root", document0.tagName());
      assertEquals("#document", document0.nodeName());
      assertEquals("", document0.location());
      assertEquals(1, document0.childNodeSize());
      assertEquals(2, elements0.size());
      assertFalse(elements0.isEmpty());
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult1);
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult2));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult2));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult1));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult2).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Document document0 = Document.createShell("");
      assertNotNull(document0);
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertEquals("#root", document0.tagName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      
      NodeFilter.FilterResult nodeFilter_FilterResult3 = NodeTraversor.filter(nodeFilter0, (Node) document0);
      assertEquals("", document0.location());
      assertEquals("#document", document0.nodeName());
      assertEquals("#root", document0.tagName());
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals(1, document0.childNodeSize());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("", document0.baseUri());
      assertFalse(document0.hasParent());
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult2);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult2, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult3, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult3, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult3, nodeFilter_FilterResult2);
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult2));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult2));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult3.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult3.equals((Object)nodeFilter_FilterResult1));
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      CDataNode cDataNode0 = new CDataNode(":matches(%s)");
      assertNotNull(cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeTraversor.filter(nodeFilter0, (Node) cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      
      NodeFilter.FilterResult nodeFilter_FilterResult2 = NodeFilter.FilterResult.CONTINUE;
      NodeFilter nodeFilter1 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult2).when(nodeFilter1).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn(nodeFilter_FilterResult1).when(nodeFilter1).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      NodeFilter.FilterResult nodeFilter_FilterResult3 = NodeTraversor.filter(nodeFilter1, (Node) cDataNode0);
      assertFalse(cDataNode0.hasParent());
      assertEquals("#cdata", cDataNode0.nodeName());
      assertEquals(0, cDataNode0.siblingIndex());
      assertEquals(NodeFilter.FilterResult.STOP, nodeFilter_FilterResult3);
      assertSame(nodeFilter_FilterResult0, nodeFilter_FilterResult1);
      assertSame(nodeFilter_FilterResult0, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult0, nodeFilter_FilterResult2);
      assertSame(nodeFilter_FilterResult1, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult1, nodeFilter_FilterResult2);
      assertSame(nodeFilter_FilterResult1, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult0);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult1);
      assertNotSame(nodeFilter_FilterResult2, nodeFilter_FilterResult3);
      assertNotSame(nodeFilter_FilterResult3, nodeFilter_FilterResult2);
      assertSame(nodeFilter_FilterResult3, nodeFilter_FilterResult0);
      assertSame(nodeFilter_FilterResult3, nodeFilter_FilterResult1);
      assertFalse(nodeFilter_FilterResult0.equals((Object)nodeFilter_FilterResult2));
      assertFalse(nodeFilter_FilterResult1.equals((Object)nodeFilter_FilterResult2));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult0));
      assertFalse(nodeFilter_FilterResult2.equals((Object)nodeFilter_FilterResult1));
      assertFalse(nodeFilter_FilterResult3.equals((Object)nodeFilter_FilterResult2));
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeFilter.FilterResult.SKIP_CHILDREN;
      NodeFilter.FilterResult nodeFilter_FilterResult1 = NodeFilter.FilterResult.STOP;
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      doReturn(nodeFilter_FilterResult0, nodeFilter_FilterResult1).when(nodeFilter0).head(any(org.jsoup.nodes.Node.class) , anyInt());
      doReturn((NodeFilter.FilterResult) null).when(nodeFilter0).tail(any(org.jsoup.nodes.Node.class) , anyInt());
      Document document0 = Document.createShell("");
      Elements elements0 = document0.getElementsByIndexLessThan(1);
      NodeTraversor.filter(nodeFilter0, elements0);
      assertEquals(2, elements0.size());
      assertFalse(elements0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      NodeFilter nodeFilter0 = mock(NodeFilter.class, new ViolatedAssumptionAnswer());
      NodeFilter.FilterResult nodeFilter_FilterResult0 = NodeTraversor.filter(nodeFilter0, (Node) null);
      assertEquals(NodeFilter.FilterResult.CONTINUE, nodeFilter_FilterResult0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      NodeVisitor nodeVisitor0 = mock(NodeVisitor.class, new ViolatedAssumptionAnswer());
      NodeTraversor.traverse(nodeVisitor0, (Node) null);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Document document0 = Document.createShell("");
      NodeTraversor nodeTraversor0 = new NodeTraversor((NodeVisitor) null);
      // Undeclared exception!
      try { 
        nodeTraversor0.traverse((Node) document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.select.NodeTraversor", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      NodeTraversor nodeTraversor0 = new NodeTraversor((NodeVisitor) null);
      nodeTraversor0.traverse((Node) null);
  }
}