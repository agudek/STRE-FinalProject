/*
 * This file was automatically generated by EvoSuite
 * Wed Apr 18 14:56:26 GMT 2018
 */

package com.puppycrawl.tools.checkstyle.checks.regexp;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.puppycrawl.tools.checkstyle.api.AbstractViolationReporter;
import com.puppycrawl.tools.checkstyle.api.FileText;
import com.puppycrawl.tools.checkstyle.checks.regexp.DetectorOptions;
import com.puppycrawl.tools.checkstyle.checks.regexp.MatchSuppressor;
import com.puppycrawl.tools.checkstyle.checks.regexp.SinglelineDetector;
import java.util.Stack;
import java.util.Vector;
import java.util.regex.Pattern;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class SinglelineDetector_ESTest extends SinglelineDetector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("com.puppycrawl.tools.checkstyle.checks.regexp.SinglelineDetector");
      DetectorOptions detectorOptions0 = mock(DetectorOptions.class, new ViolatedAssumptionAnswer());
      doReturn(pattern0).when(detectorOptions0).getPattern();
      doReturn((MatchSuppressor) null).when(detectorOptions0).getSuppressor();
      MockFile mockFile0 = new MockFile("yipmVcHm3`6C)@%8_LK");
      Vector<String> vector0 = new Vector<String>();
      vector0.addElement("com.puppycrawl.tools.checkstyle.checks.regexp.SinglelineDetector");
      FileText fileText0 = new FileText(mockFile0, vector0);
      SinglelineDetector singlelineDetector0 = new SinglelineDetector(detectorOptions0);
      // Undeclared exception!
      try { 
        singlelineDetector0.processLines(fileText0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.puppycrawl.tools.checkstyle.checks.regexp.SinglelineDetector", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DetectorOptions detectorOptions0 = mock(DetectorOptions.class, new ViolatedAssumptionAnswer());
      doReturn((-12931), (-26), (-26), (-610), 0).when(detectorOptions0).getMinimum();
      SinglelineDetector singlelineDetector0 = new SinglelineDetector(detectorOptions0);
      MockFile mockFile0 = new MockFile("AY$H", "regexp.minimum");
      Stack<String> stack0 = new Stack<String>();
      FileText fileText0 = new FileText(mockFile0, stack0);
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      assertEquals(0, fileText0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", (-610));
      MatchSuppressor matchSuppressor0 = mock(MatchSuppressor.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(matchSuppressor0).shouldSuppress(anyInt() , anyInt() , anyInt() , anyInt());
      AbstractViolationReporter abstractViolationReporter0 = mock(AbstractViolationReporter.class, new ViolatedAssumptionAnswer());
      AbstractViolationReporter abstractViolationReporter1 = mock(AbstractViolationReporter.class, new ViolatedAssumptionAnswer());
      MatchSuppressor matchSuppressor1 = mock(MatchSuppressor.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(matchSuppressor1).shouldSuppress(anyInt() , anyInt() , anyInt() , anyInt());
      AbstractViolationReporter abstractViolationReporter2 = mock(AbstractViolationReporter.class, new ViolatedAssumptionAnswer());
      DetectorOptions detectorOptions0 = mock(DetectorOptions.class, new ViolatedAssumptionAnswer());
      doReturn("").when(detectorOptions0).getFormat();
      doReturn((-610), (-610)).when(detectorOptions0).getMaximum();
      doReturn("", "", "4!|YfjF{K4ed*", "INTERFACE_ONLY", "u^&qRH").when(detectorOptions0).getMessage();
      doReturn((-12931), (-26), (-26), (-610), 8).when(detectorOptions0).getMinimum();
      doReturn(pattern0, pattern0).when(detectorOptions0).getPattern();
      doReturn(abstractViolationReporter0, abstractViolationReporter1, abstractViolationReporter2, abstractViolationReporter2).when(detectorOptions0).getReporter();
      doReturn(matchSuppressor0, matchSuppressor1).when(detectorOptions0).getSuppressor();
      SinglelineDetector singlelineDetector0 = new SinglelineDetector(detectorOptions0);
      MockFile mockFile0 = new MockFile("d6{Q", "regexp.minimum");
      Stack<String> stack0 = new Stack<String>();
      FileText fileText0 = new FileText(mockFile0, stack0);
      stack0.add("|{od");
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      singlelineDetector0.processLines(fileText0);
      FileText fileText1 = new FileText(mockFile0, stack0);
      singlelineDetector0.processLines(fileText1);
      singlelineDetector0.processLines(fileText1);
      assertEquals(1, fileText1.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("", (-610));
      MatchSuppressor matchSuppressor0 = mock(MatchSuppressor.class, new ViolatedAssumptionAnswer());
      doReturn(true).when(matchSuppressor0).shouldSuppress(anyInt() , anyInt() , anyInt() , anyInt());
      MatchSuppressor matchSuppressor1 = mock(MatchSuppressor.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(matchSuppressor1).shouldSuppress(anyInt() , anyInt() , anyInt() , anyInt());
      DetectorOptions detectorOptions0 = mock(DetectorOptions.class, new ViolatedAssumptionAnswer());
      doReturn(8232).when(detectorOptions0).getMaximum();
      doReturn((-12931)).when(detectorOptions0).getMinimum();
      doReturn(pattern0).when(detectorOptions0).getPattern();
      doReturn(matchSuppressor0, matchSuppressor1).when(detectorOptions0).getSuppressor();
      SinglelineDetector singlelineDetector0 = new SinglelineDetector(detectorOptions0);
      MockFile mockFile0 = new MockFile("AY$H", "regexp.minimum");
      Stack<String> stack0 = new Stack<String>();
      stack0.add("|{od");
      FileText fileText0 = new FileText(mockFile0, stack0);
      singlelineDetector0.processLines(fileText0);
      assertEquals(1, fileText0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Pattern pattern0 = Pattern.compile("com.puppycrawl.tools.checkstyle.checks.regexp.SinglelineDetector");
      AbstractViolationReporter abstractViolationReporter0 = mock(AbstractViolationReporter.class, new ViolatedAssumptionAnswer());
      DetectorOptions detectorOptions0 = mock(DetectorOptions.class, new ViolatedAssumptionAnswer());
      doReturn("DT<", "").when(detectorOptions0).getMessage();
      doReturn(780).when(detectorOptions0).getMinimum();
      doReturn(pattern0).when(detectorOptions0).getPattern();
      doReturn(abstractViolationReporter0).when(detectorOptions0).getReporter();
      SinglelineDetector singlelineDetector0 = new SinglelineDetector(detectorOptions0);
      MockFile mockFile0 = new MockFile("yipmVcHm3`6C)@%8_LK");
      Vector<String> vector0 = new Vector<String>();
      vector0.addElement("qfb_8_r_{q");
      FileText fileText0 = new FileText(mockFile0, vector0);
      singlelineDetector0.processLines(fileText0);
      assertEquals(1, fileText0.size());
  }
}