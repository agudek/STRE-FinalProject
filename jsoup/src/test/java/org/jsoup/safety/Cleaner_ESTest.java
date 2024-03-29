/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:02:41 GMT 2018
 */

package org.jsoup.safety;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.safety.Cleaner;
import org.jsoup.safety.Whitelist;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Cleaner_ESTest extends Cleaner_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basic();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      // Undeclared exception!
      try { 
        cleaner0.isValidBodyHtml((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.StringReader", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basicWithImages();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      // Undeclared exception!
      try { 
        cleaner0.isValid((Document) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Whitelist whitelist0 = Whitelist.basicWithImages();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      // Undeclared exception!
      try { 
        cleaner0.clean((Document) null);
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
      Whitelist whitelist0 = mock(Whitelist.class, new ViolatedAssumptionAnswer());
      doReturn(false, true).when(whitelist0).isSafeTag(anyString());
      Cleaner cleaner0 = new Cleaner(whitelist0);
      cleaner0.isValidBodyHtml("E-v$!<Q%VJ]dkA");
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Whitelist whitelist0 = mock(Whitelist.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false, false, true).when(whitelist0).isSafeTag(anyString());
      Cleaner cleaner0 = new Cleaner(whitelist0);
      Element element0 = mock(Element.class, new ViolatedAssumptionAnswer());
      Document document0 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn(element0, (Element) null).when(document0).body();
      doReturn("encoding").when(document0).baseUri();
      Document document1 = cleaner0.clean(document0);
      Document document2 = mock(Document.class, new ViolatedAssumptionAnswer());
      doReturn(document1, document1).when(document2).body();
      doReturn("encoding").when(document2).baseUri();
      // Undeclared exception!
      try { 
        cleaner0.clean(document2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.safety.Whitelist", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      cleaner0.isValidBodyHtml("0ql;L.*i:.-?\">Kp");
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      assertNotNull(whitelist0);
      
      Cleaner cleaner0 = new Cleaner(whitelist0);
      assertNotNull(cleaner0);
      
      boolean boolean0 = cleaner0.isValidBodyHtml("d@GuU^<!q");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      assertNotNull(whitelist0);
      
      Cleaner cleaner0 = new Cleaner(whitelist0);
      assertNotNull(cleaner0);
      
      Document document0 = new Document("0ql;L.*i:.-?\">Kp");
      assertNotNull(document0);
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      
      Document document1 = cleaner0.clean(document0);
      assertNotSame(document0, document1);
      assertNotSame(document1, document0);
      assertNotNull(document1);
      assertFalse(document1.equals((Object)document0));
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("#root", document1.tagName());
      assertEquals(1, document1.childNodeSize());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.baseUri());
      assertFalse(document1.updateMetaCharsetElement());
      assertFalse(document1.hasParent());
      assertFalse(document1.isBlock());
      assertEquals("#document", document1.nodeName());
      assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
      assertEquals(0, document1.siblingIndex());
      
      boolean boolean0 = cleaner0.isValid(document1);
      assertNotSame(document0, document1);
      assertNotSame(document1, document0);
      assertTrue(boolean0);
      assertFalse(document0.equals((Object)document1));
      assertFalse(document1.equals((Object)document0));
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertEquals("#document", document0.nodeName());
      assertFalse(document0.hasParent());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#root", document0.tagName());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals(0, document0.siblingIndex());
      assertFalse(document0.isBlock());
      assertEquals("#root", document1.tagName());
      assertEquals(1, document1.childNodeSize());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.baseUri());
      assertFalse(document1.updateMetaCharsetElement());
      assertFalse(document1.hasParent());
      assertFalse(document1.isBlock());
      assertEquals("#document", document1.nodeName());
      assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
      assertEquals(0, document1.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      assertNotNull(whitelist0);
      
      Cleaner cleaner0 = new Cleaner(whitelist0);
      assertNotNull(cleaner0);
      
      Document document0 = new Document("0ql;L.*i:.-?\">Kp");
      assertNotNull(document0);
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#document", document0.nodeName());
      
      Document document1 = cleaner0.clean(document0);
      assertNotSame(document0, document1);
      assertNotSame(document1, document0);
      assertNotNull(document1);
      assertFalse(document1.equals((Object)document0));
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#document", document0.nodeName());
      assertFalse(document1.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.baseUri());
      assertFalse(document1.isBlock());
      assertEquals("#document", document1.nodeName());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals(1, document1.childNodeSize());
      assertEquals("#root", document1.tagName());
      assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
      assertEquals(0, document1.siblingIndex());
      
      document1.title("0ql;L.*i:.-?\">Kp");
      assertNotSame(document0, document1);
      assertNotSame(document1, document0);
      assertFalse(document0.equals((Object)document1));
      assertFalse(document1.equals((Object)document0));
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#document", document0.nodeName());
      assertFalse(document1.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.baseUri());
      assertFalse(document1.isBlock());
      assertEquals("#document", document1.nodeName());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals(1, document1.childNodeSize());
      assertEquals("#root", document1.tagName());
      assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
      assertEquals(0, document1.siblingIndex());
      
      boolean boolean0 = cleaner0.isValid(document1);
      assertNotSame(document0, document1);
      assertNotSame(document1, document0);
      assertFalse(boolean0);
      assertFalse(document0.equals((Object)document1));
      assertFalse(document1.equals((Object)document0));
      assertEquals(Document.QuirksMode.noQuirks, document0.quirksMode());
      assertFalse(document0.isBlock());
      assertFalse(document0.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document0.baseUri());
      assertFalse(document0.updateMetaCharsetElement());
      assertEquals(0, document0.siblingIndex());
      assertEquals("#root", document0.tagName());
      assertEquals(0, document0.childNodeSize());
      assertEquals("#document", document0.nodeName());
      assertFalse(document1.hasParent());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.location());
      assertEquals("0ql;L.*i:.-?\">Kp", document1.baseUri());
      assertFalse(document1.isBlock());
      assertEquals("#document", document1.nodeName());
      assertFalse(document1.updateMetaCharsetElement());
      assertEquals(1, document1.childNodeSize());
      assertEquals("#root", document1.tagName());
      assertEquals(Document.QuirksMode.noQuirks, document1.quirksMode());
      assertEquals(0, document1.siblingIndex());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Whitelist whitelist0 = new Whitelist();
      Cleaner cleaner0 = new Cleaner(whitelist0);
      Document document0 = new Document("0ql;L.*i:.-?\">Kp");
      // Undeclared exception!
      try { 
        cleaner0.isValid(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.safety.Cleaner", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Cleaner cleaner0 = null;
      try {
        cleaner0 = new Cleaner((Whitelist) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Object must not be null
         //
         verifyException("org.jsoup.helper.Validate", e);
      }
  }
}
