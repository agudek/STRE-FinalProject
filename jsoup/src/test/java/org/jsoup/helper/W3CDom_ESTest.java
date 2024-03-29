/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 09:05:50 GMT 2018
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.nio.charset.Charset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.jsoup.helper.W3CDom;
import org.jsoup.nodes.DataNode;
import org.jsoup.nodes.Node;
import org.junit.runner.RunWith;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class W3CDom_ESTest extends W3CDom_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder((Document) null);
      w3CDom_W3CBuilder0.tail((Node) null, 0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("option");
      document0.prependElement(":");
      W3CDom w3CDom0 = new W3CDom();
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      w3CDom0.factory = null;
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("xmlns:");
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup((org.jsoup.nodes.Document) null);
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
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("");
      // Undeclared exception!
      try { 
        w3CDom0.convert(document0, (Document) null);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("");
      org.jsoup.nodes.Document document1 = document0.normalise();
      Document document2 = w3CDom0.fromJsoup(document1);
      // Undeclared exception!
      try { 
        w3CDom0.convert(document1, document2);
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"no\"?>");
      // Undeclared exception!
      try { 
        w3CDom0.convert(document0, (Document) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("option");
      W3CDom w3CDom0 = new W3CDom();
      Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      document0.tagName("xmlns:q*qO$`x7oSQEyq^Sk3");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(document0, (-2864));
        fail("Expecting exception: DOMException");
      
      } catch(DOMException e) {
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("");
      Charset charset0 = Charset.defaultCharset();
      document0.charset(charset0);
      org.jsoup.nodes.Document document1 = document0.normalise();
      w3CDom0.fromJsoup(document1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("option");
      Document document1 = w3CDom0.fromJsoup(document0);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document1);
      DataNode dataNode0 = new DataNode("option", "tAyP*p&Ob.x=]@o!bi");
      // Undeclared exception!
      try { 
        w3CDom_W3CBuilder0.head(dataNode0, (-2849));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.W3CDom$W3CBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = org.jsoup.nodes.Document.createShell("");
      document0.title("");
      w3CDom0.fromJsoup(document0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("charset");
      org.jsoup.nodes.Document document1 = document0.normalise();
      Document document2 = w3CDom0.fromJsoup(document1);
      W3CDom.W3CBuilder w3CDom_W3CBuilder0 = new W3CDom.W3CBuilder(document2);
      w3CDom_W3CBuilder0.head((Node) null, (-1128550499));
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("");
      // Undeclared exception!
      try { 
        w3CDom0.fromJsoup(document0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      W3CDom w3CDom0 = new W3CDom();
      org.jsoup.nodes.Document document0 = new org.jsoup.nodes.Document("charset");
      org.jsoup.nodes.Document document1 = document0.normalise();
      Document document2 = w3CDom0.fromJsoup(document1);
      w3CDom0.asString(document2);
  }
}
