/*
 * This file was automatically generated by EvoSuite
 * Mon Apr 23 08:55:35 GMT 2018
 */

package org.jsoup.helper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.jsoup.helper.StringUtil;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class StringUtil_ESTest extends StringUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace((-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      String string0 = StringUtil.padding(21);
      assertNotNull(string0);
      assertEquals("                     ", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      String string0 = StringUtil.padding(0);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      String string0 = StringUtil.normaliseWhitespace("");
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      String[] stringArray0 = new String[0];
      String string0 = StringUtil.join(stringArray0, "");
      assertEquals(0, stringArray0.length);
      assertNotNull(string0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      String string0 = StringUtil.join((Collection) linkedList0, "p,");
      assertNotNull(string0);
      assertEquals("", string0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      try { 
        StringUtil.resolve((URL) null, "k}P|.VW#G3KWCvOJ");
        fail("Expecting exception: MalformedURLException");
      
      } catch(MalformedURLException e) {
         //
         // no protocol: k}P|.VW#G3KWCvOJ
         //
         verifyException("java.net.URL", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      assertNotNull(uRL0);
      assertEquals("some", uRL0.getAuthority());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertEquals("file", uRL0.getProtocol());
      assertNull(uRL0.getUserInfo());
      assertNull(uRL0.getQuery());
      assertEquals("some", uRL0.getHost());
      assertEquals((-1), uRL0.getPort());
      
      // Undeclared exception!
      try { 
        StringUtil.resolve(uRL0, (String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(iterator0).hasNext();
      doReturn((Object) null).when(iterator0).next();
      // Undeclared exception!
      try { 
        StringUtil.join(iterator0, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.join((Collection) null, "<^\"k");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.inSorted("wk(>6j.Z}{6@", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.in("#U*sMh)Bmg", (String[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      StringBuilder stringBuilder0 = StringUtil.stringBuilder();
      assertNotNull(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      
      // Undeclared exception!
      try { 
        StringUtil.appendNormalisedWhitespace(stringBuilder0, (String) null, false);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder("H9M:lz!rJyZ(d1f");
      assertNotNull(stringBuilder0);
      assertEquals("H9M:lz!rJyZ(d1f", stringBuilder0.toString());
      
      StringUtil.appendNormalisedWhitespace(stringBuilder0, "                 ", false);
      assertEquals("H9M:lz!rJyZ(d1f ", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(3564);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(8204);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(32);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(212);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(10);
      assertNotNull(integer0);
      assertEquals(10, (int)integer0);
      
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, true, true, false).when(iterator0).hasNext();
      doReturn(integer0, integer0).when(iterator0).next();
      String string0 = StringUtil.join(iterator0, "");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      Integer integer0 = new Integer(0);
      assertNotNull(integer0);
      assertEquals(0, (int)integer0);
      
      boolean boolean0 = linkedList0.add(integer0);
      assertTrue(boolean0);
      assertTrue(linkedList0.contains(0));
      assertEquals(1, linkedList0.size());
      
      ListIterator<Integer> listIterator0 = linkedList0.listIterator(0);
      assertNotNull(listIterator0);
      assertTrue(linkedList0.contains(0));
      assertEquals(1, linkedList0.size());
      assertFalse(listIterator0.hasPrevious());
      assertTrue(listIterator0.hasNext());
      
      String string0 = StringUtil.join((Iterator) listIterator0, "5txI;Hlcl&>BZY;[Jj");
      assertNotNull(string0);
      assertTrue(linkedList0.contains(0));
      assertEquals(1, linkedList0.size());
      assertTrue(listIterator0.hasPrevious());
      assertFalse(listIterator0.hasNext());
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      String string0 = "";
      String[] stringArray0 = new String[9];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "";
      stringArray0[5] = "";
      stringArray0[6] = "";
      stringArray0[7] = "";
      boolean boolean0 = StringUtil.in("", stringArray0);
      assertEquals(9, stringArray0.length);
      assertTrue(boolean0);
      
      boolean boolean1 = StringUtil.inSorted("", stringArray0);
      assertEquals(9, stringArray0.length);
      assertTrue(boolean1);
      assertTrue(boolean1 == boolean0);
      
      Iterator<Object> iterator0 = (Iterator<Object>) mock(Iterator.class, new ViolatedAssumptionAnswer());
      doReturn(true, false).when(iterator0).hasNext();
      doReturn("").when(iterator0).next();
      String string1 = "lF 3_Og5jX5?>";
      String string2 = StringUtil.join(iterator0, "lF 3_Og5jX5?>");
      assertNotNull(string2);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      
      String[] stringArray1 = new String[9];
      assertFalse(stringArray1.equals((Object)stringArray0));
      
      stringArray1[0] = string1;
      stringArray1[1] = string1;
      stringArray1[2] = string2;
      String string3 = "ca-HUsXXyB{*";
      stringArray1[3] = string3;
      stringArray1[4] = string2;
      String string4 = "\\PrG";
      stringArray1[5] = string4;
      stringArray1[6] = string0;
      stringArray1[7] = string1;
      String string5 = "YS,6,G2yxs+OsC5r8R";
      stringArray1[8] = string5;
      boolean boolean2 = StringUtil.in(string2, stringArray1);
      assertEquals(9, stringArray1.length);
      assertTrue(boolean2);
      assertTrue(boolean2 == boolean0);
      assertTrue(boolean2 == boolean1);
      assertFalse(string2.equals((Object)string0));
      assertFalse(string2.equals((Object)string1));
      assertFalse(string2.equals((Object)string4));
      assertFalse(string2.equals((Object)string5));
      assertFalse(string2.equals((Object)string3));
      assertFalse(stringArray1.equals((Object)stringArray0));
      assertNotSame(stringArray1, stringArray0);
      
      StringBuilder stringBuilder0 = StringUtil.stringBuilder();
      assertNotNull(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      
      URL uRL0 = MockURL.getHttpExample();
      assertNotNull(uRL0);
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getUserInfo());
      assertNull(uRL0.getRef());
      assertEquals((-1), uRL0.getDefaultPort());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
      assertEquals("http", uRL0.getProtocol());
      assertNull(uRL0.getQuery());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getAuthority());
      
      URL uRL1 = StringUtil.resolve(uRL0, stringArray0[6]);
      assertEquals(9, stringArray0.length);
      assertNotNull(uRL1);
      assertFalse(stringArray0.equals((Object)stringArray1));
      assertTrue(uRL1.equals((Object)uRL0));
      assertEquals((-1), uRL0.getPort());
      assertNull(uRL0.getUserInfo());
      assertNull(uRL0.getRef());
      assertEquals((-1), uRL0.getDefaultPort());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getHost());
      assertEquals("http", uRL0.getProtocol());
      assertNull(uRL0.getQuery());
      assertEquals("www.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL1.toString());
      assertEquals("www.someFakeButWellFormedURL.org", uRL1.getAuthority());
      assertEquals((-1), uRL1.getDefaultPort());
      assertEquals("http://www.someFakeButWellFormedURL.org/fooExample", uRL1.toExternalForm());
      assertNull(uRL1.getRef());
      assertNull(uRL1.getQuery());
      assertEquals("www.someFakeButWellFormedURL.org", uRL1.getHost());
      assertNull(uRL1.getUserInfo());
      assertEquals("http", uRL1.getProtocol());
      assertEquals((-1), uRL1.getPort());
      assertNotSame(stringArray0, stringArray1);
      assertNotSame(uRL0, uRL1);
      assertNotSame(uRL1, uRL0);
      
      StringBuilder stringBuilder1 = new StringBuilder((CharSequence) string1);
      assertNotNull(stringBuilder1);
      assertFalse(stringBuilder1.equals((Object)stringBuilder0));
      assertFalse(string1.equals((Object)string4));
      assertFalse(string1.equals((Object)string5));
      assertFalse(string1.equals((Object)string3));
      assertFalse(string1.equals((Object)string2));
      assertFalse(string1.equals((Object)string0));
      assertEquals("lF 3_Og5jX5?>", stringBuilder1.toString());
      
      int int0 = (-675);
      int int1 = 0;
      int int2 = 0;
      // Undeclared exception!
      try { 
        stringBuilder1.insert(int0, (CharSequence) stringArray0[8], int1, int2);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // dstOffset -675
         //
         verifyException("java.lang.AbstractStringBuilder", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      LinkedList<StringBuilder> linkedList0 = new LinkedList<StringBuilder>();
      assertNotNull(linkedList0);
      assertEquals(0, linkedList0.size());
      
      Iterator<StringBuilder> iterator0 = linkedList0.iterator();
      assertNotNull(iterator0);
      assertEquals(0, linkedList0.size());
      
      boolean boolean0 = linkedList0.add((StringBuilder) null);
      assertTrue(boolean0);
      assertEquals(1, linkedList0.size());
      
      // Undeclared exception!
      try { 
        StringUtil.join(iterator0, "q? tQrA&~6");
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.LinkedList$ListItr", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      URL uRL0 = MockURL.getFtpExample();
      assertNotNull(uRL0);
      assertEquals("ftp.someFakeButWellFormedURL.org", uRL0.getHost());
      assertEquals("ftp", uRL0.getProtocol());
      assertEquals("ftp.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertNull(uRL0.getQuery());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      
      URL uRL1 = StringUtil.resolve(uRL0, ".a");
      assertNotNull(uRL1);
      assertFalse(uRL1.equals((Object)uRL0));
      assertEquals("ftp.someFakeButWellFormedURL.org", uRL0.getHost());
      assertEquals("ftp", uRL0.getProtocol());
      assertEquals("ftp.someFakeButWellFormedURL.org", uRL0.getAuthority());
      assertNull(uRL0.getQuery());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getRef());
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", uRL0.toString());
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/fooExample", uRL0.toExternalForm());
      assertEquals((-1), uRL1.getPort());
      assertNull(uRL1.getRef());
      assertEquals((-1), uRL1.getDefaultPort());
      assertNull(uRL1.getUserInfo());
      assertEquals("ftp", uRL1.getProtocol());
      assertNull(uRL1.getQuery());
      assertEquals("ftp.someFakeButWellFormedURL.org", uRL1.getAuthority());
      assertEquals("ftp.someFakeButWellFormedURL.org", uRL1.getHost());
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/.a", uRL1.toString());
      assertEquals("ftp://ftp.someFakeButWellFormedURL.org/.a", uRL1.toExternalForm());
      assertNotSame(uRL0, uRL1);
      assertNotSame(uRL1, uRL0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      URL uRL0 = MockURL.getFileExample();
      assertNotNull(uRL0);
      assertEquals("some", uRL0.getAuthority());
      assertEquals("some", uRL0.getHost());
      assertEquals("file", uRL0.getProtocol());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getQuery());
      assertNull(uRL0.getRef());
      
      URL uRL1 = StringUtil.resolve(uRL0, "?VrE5EG");
      assertNotNull(uRL1);
      assertFalse(uRL1.equals((Object)uRL0));
      assertEquals("some", uRL0.getAuthority());
      assertEquals("some", uRL0.getHost());
      assertEquals("file", uRL0.getProtocol());
      assertNull(uRL0.getUserInfo());
      assertEquals((-1), uRL0.getPort());
      assertEquals((-1), uRL0.getDefaultPort());
      assertNull(uRL0.getQuery());
      assertNull(uRL0.getRef());
      assertEquals((-1), uRL1.getPort());
      assertNull(uRL1.getRef());
      assertEquals((-1), uRL1.getDefaultPort());
      assertNull(uRL1.getUserInfo());
      assertEquals("file", uRL1.getProtocol());
      assertEquals("VrE5EG", uRL1.getQuery());
      assertEquals("some", uRL1.getHost());
      assertEquals("some", uRL1.getAuthority());
      assertNotSame(uRL0, uRL1);
      assertNotSame(uRL1, uRL0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      boolean boolean0 = StringUtil.inSorted("/", stringArray0);
      assertEquals(1, stringArray0.length);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[2] = "";
      stringArray0[3] = "";
      stringArray0[4] = "                                                                                                                                                                                                                                                                                                                                                                               ";
      boolean boolean0 = StringUtil.inSorted("sZklc9T19rvP*A=or", stringArray0);
      assertEquals(5, stringArray0.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      stringArray0[1] = "";
      stringArray0[2] = "";
      stringArray0[3] = "g";
      stringArray0[4] = "";
      boolean boolean0 = StringUtil.in("o8.&pyI@Z/ojC", stringArray0);
      assertEquals(5, stringArray0.length);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      StringBuilder stringBuilder0 = new StringBuilder(860);
      assertNotNull(stringBuilder0);
      assertEquals("", stringBuilder0.toString());
      
      StringUtil.appendNormalisedWhitespace(stringBuilder0, "wq{*~>bqt%@( W4", true);
      assertEquals("wq{*~>bqt%@( W4", stringBuilder0.toString());
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      String string0 = StringUtil.normaliseWhitespace("  ");
      assertNotNull(string0);
      assertEquals(" ", string0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      boolean boolean0 = StringUtil.isInvisibleChar(8204);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(160);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      boolean boolean0 = StringUtil.isActuallyWhitespace(9);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      StringUtil.appendNormalisedWhitespace((StringBuilder) null, "                  ", true);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(13);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(12);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(10);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      boolean boolean0 = StringUtil.isWhitespace(9);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric("4");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric("z4bwqRyNKXk,irA*=");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      boolean boolean0 = StringUtil.isNumeric((String) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank("X]^HRinIrAQo$ZD");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank("");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test48()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank("                                                                                                                                                                                                                                                                                                                                                                               ");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test49()  throws Throwable  {
      boolean boolean0 = StringUtil.isBlank((String) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test50()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.padding((-1426));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // width must be > 0
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test51()  throws Throwable  {
      String string0 = StringUtil.padding(367);
      assertEquals("                                                                                                                                                                                                                                                                                                                                                                               ", string0);
  }

  @Test(timeout = 4000)
  public void test52()  throws Throwable  {
      LinkedList<String> linkedList0 = new LinkedList<String>();
      linkedList0.add("m+(&(T");
      String string0 = StringUtil.join((Collection) linkedList0, (String) null);
      assertFalse(linkedList0.contains(string0));
  }

  @Test(timeout = 4000)
  public void test53()  throws Throwable  {
      String[] stringArray0 = new String[5];
      stringArray0[0] = "";
      String string0 = StringUtil.join(stringArray0, "                                      ");
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test54()  throws Throwable  {
      LinkedList<StringBuilder> linkedList0 = new LinkedList<StringBuilder>();
      Iterator<StringBuilder> iterator0 = linkedList0.iterator();
      String string0 = StringUtil.join(iterator0, "<7\"rD+K{rwMx");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test55()  throws Throwable  {
      String string0 = StringUtil.resolve((String) null, "Z&s4fIQ}Y:?%e/t`V");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test56()  throws Throwable  {
      StringUtil stringUtil0 = new StringUtil();
  }

  @Test(timeout = 4000)
  public void test57()  throws Throwable  {
      // Undeclared exception!
      try { 
        StringUtil.normaliseWhitespace((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jsoup.helper.StringUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test58()  throws Throwable  {
      String[] stringArray0 = new String[5];
      // Undeclared exception!
      try { 
        StringUtil.join(stringArray0, "                                      ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.System", e);
      }
  }
}
