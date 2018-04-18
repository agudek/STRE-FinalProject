/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:14:17 GMT 2018
 */

package nl.tudelft.jpacman.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import nl.tudelft.jpacman.ui.Action;
import nl.tudelft.jpacman.ui.ButtonPanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ButtonPanel_ESTest extends ButtonPanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<String, Action> hashMap0 = new HashMap<String, Action>();
      ButtonPanel buttonPanel0 = null;
      try {
        buttonPanel0 = new ButtonPanel(hashMap0, (JFrame) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ButtonPanel buttonPanel0 = null;
      try {
        buttonPanel0 = new ButtonPanel((Map<String, Action>) null, (JFrame) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}