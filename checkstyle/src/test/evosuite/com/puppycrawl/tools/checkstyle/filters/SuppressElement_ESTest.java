/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 12:57:56 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.filters;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.BoundType;
import com.puppycrawl.tools.checkstyle.api.AuditEvent;
import com.puppycrawl.tools.checkstyle.api.LocalizedMessage;
import com.puppycrawl.tools.checkstyle.api.SeverityLevel;
import com.puppycrawl.tools.checkstyle.filters.SuppressElement;
import java.util.regex.PatternSyntaxException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SuppressElement_ESTest extends SuppressElement_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "i-:IkjW4a", "UPx0|;;ucE?", "", "", (String) null);
      // Undeclared exception!
      try { 
        suppressElement0.accept((AuditEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.filters.SuppressElement", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      Object object0 = new Object();
      Object[] objectArray0 = new Object[8];
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      Class<BoundType> class0 = BoundType.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage((-1854394832), 5, "", "", objectArray0, severityLevel0, "", class0, "[UrR[8h0E9{74'~");
      AuditEvent auditEvent0 = new AuditEvent(object0, "[UrR[8h0E9{74'~", localizedMessage0);
      // Undeclared exception!
      try { 
        suppressElement0.accept(auditEvent0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unmatched braces in the pattern.
         //
         verifyException("java.text.MessageFormat", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SuppressElement suppressElement0 = null;
      try {
        suppressElement0 = new SuppressElement("{w(TD:%I)W-5[I5%Z5", "{w(TD:%I)W-5[I5%Z5", "{w(TD:%I)W-5[I5%Z5", "{w(TD:%I)W-5[I5%Z5", "GYtgL'C49c", "");
        fail("Expecting exception: PatternSyntaxException");
      
      } catch(PatternSyntaxException e) {
         //
         // Illegal repetition\r
         // {w(TD:%I)W-5[I5%Z5
         //
         verifyException("java.util.regex.Pattern", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SuppressElement suppressElement0 = null;
      try {
        suppressElement0 = new SuppressElement("!HO-", "n", "$=cUNd", "!HO-", "!HO-", "w6");
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"!HO\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      SuppressElement suppressElement1 = new SuppressElement("", "", "", (String) null, (String) null, (String) null);
      boolean boolean0 = suppressElement0.equals(suppressElement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "0@]QS_", "", "");
      SuppressElement suppressElement1 = new SuppressElement("", "", "0@]QS_", (String) null, (String) null, (String) null);
      boolean boolean0 = suppressElement0.equals(suppressElement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      SuppressElement suppressElement1 = new SuppressElement("", "Z8", "", "", "", "");
      boolean boolean0 = suppressElement0.equals(suppressElement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("Invalid IOCase name: ", "", "Invalid IOCase name: ", "com.google.common.base.CharMatcher$IsEither", "", "");
      SuppressElement suppressElement1 = new SuppressElement("", "", "com.google.common.base.CharMatcher$IsEither", (String) null, (String) null, (String) null);
      boolean boolean0 = suppressElement0.equals(suppressElement1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      SuppressElement suppressElement1 = new SuppressElement("", "", "", "", "", "");
      boolean boolean0 = suppressElement0.equals(suppressElement1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", (String) null, (String) null, (String) null, "");
      boolean boolean0 = suppressElement0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      boolean boolean0 = suppressElement0.equals(suppressElement0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      boolean boolean0 = suppressElement0.equals("");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", (String) null, (String) null, (String) null, "");
      Integer integer0 = new Integer(159);
      Object[] objectArray0 = new Object[7];
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      Class<SuppressElement> class0 = SuppressElement.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(65536, 2, 1159, 159, "", (String) null, objectArray0, severityLevel0, "", class0, "Q'<t^,J");
      AuditEvent auditEvent0 = new AuditEvent(integer0, "", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "Z8", "", "", "", "");
      Object object0 = new Object();
      Object[] objectArray0 = new Object[8];
      SeverityLevel severityLevel0 = SeverityLevel.INFO;
      Class<Object> class0 = Object.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(117, 117, 5, 5, "", "", objectArray0, severityLevel0, "", class0, "");
      AuditEvent auditEvent0 = new AuditEvent(object0, "Z8", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "0@]QS_", "", "");
      Object object0 = new Object();
      Object[] objectArray0 = new Object[8];
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      Class<Object> class0 = Object.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(117, 4539, 5, 5, "0@]QS_", "", objectArray0, severityLevel0, (String) null, class0, "");
      AuditEvent auditEvent0 = new AuditEvent(object0, "", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      Object object0 = new Object();
      Object[] objectArray0 = new Object[24];
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      Class<Object> class0 = Object.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(123, 123, 123, 123, "", "", objectArray0, severityLevel0, "", class0, "");
      AuditEvent auditEvent0 = new AuditEvent(object0, "", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("Invalid IOCase name: ", "", "Invalid IOCase name: ", "com.google.common.base.CharMatcher$IsEither", "", "");
      Object[] objectArray0 = new Object[2];
      SeverityLevel severityLevel0 = SeverityLevel.ERROR;
      Class<Integer> class0 = Integer.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(117, 117, "", "", objectArray0, severityLevel0, ">;AJ", class0, "Invalid IOCase name: ");
      AuditEvent auditEvent0 = new AuditEvent(suppressElement0, "com.google.common.base.CharMatcher$IsEither", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement((String) null, (String) null, (String) null, "XTDE1428", (String) null, "");
      Object[] objectArray0 = new Object[3];
      Class<Object> class0 = Object.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(31, (-2793), "", "com.puppycrawl.tools.checkstyle.filters.SuppressElement", objectArray0, "kG%", class0, "");
      AuditEvent auditEvent0 = new AuditEvent("", (String) null, localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement((String) null, (String) null, (String) null, (String) null, (String) null, (String) null);
      Object object0 = new Object();
      Object[] objectArray0 = new Object[2];
      SeverityLevel severityLevel0 = SeverityLevel.INFO;
      Class<Integer> class0 = Integer.TYPE;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(2000, 2000, "/@]Qq_", (String) null, objectArray0, severityLevel0, (String) null, class0, (String) null);
      AuditEvent auditEvent0 = new AuditEvent(object0, "/@]Qq_", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "0@]QS_", (String) null, (String) null, (String) null);
      Object object0 = new Object();
      Object[] objectArray0 = new Object[8];
      SeverityLevel severityLevel0 = SeverityLevel.WARNING;
      Class<Object> class0 = Object.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage(117, 4539, 5, 5, "0@]QS_", "", objectArray0, severityLevel0, (String) null, class0, "");
      AuditEvent auditEvent0 = new AuditEvent(object0, "", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement((String) null, (String) null, (String) null, "XTDE1428", (String) null, "");
      Object object0 = new Object();
      AuditEvent auditEvent0 = new AuditEvent(object0, "XTDE1428");
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement((String) null, "", "", (String) null, "", (String) null);
      BoundType boundType0 = BoundType.OPEN;
      Object[] objectArray0 = new Object[8];
      SeverityLevel severityLevel0 = SeverityLevel.IGNORE;
      Class<Integer> class0 = Integer.class;
      LocalizedMessage localizedMessage0 = new LocalizedMessage((-2226), (-2226), "Q]`\"D*T0&v}", "_Myb>Tfo%lwhX2ad&", objectArray0, severityLevel0, "Q]`\"D*T0&v}", class0, "3EL/v<@F3N]F");
      AuditEvent auditEvent0 = new AuditEvent(boundType0, "3EL/v<@F3N]F", localizedMessage0);
      boolean boolean0 = suppressElement0.accept(auditEvent0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SuppressElement suppressElement0 = new SuppressElement("", "", "", "", "", "");
      suppressElement0.hashCode();
  }
}