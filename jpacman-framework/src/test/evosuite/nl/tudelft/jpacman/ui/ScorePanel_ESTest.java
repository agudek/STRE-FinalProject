/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:07:34 GMT 2018
 */

package nl.tudelft.jpacman.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.ui.ScorePanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ScorePanel_ESTest extends ScorePanel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ScorePanel.ScoreFormatter scorePanel_ScoreFormatter0 = ScorePanel.DEFAULT_SCORE_FORMATTER;
      assertNotNull(scorePanel_ScoreFormatter0);
      
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((-1216)).when(player0).getScore();
      String string0 = scorePanel_ScoreFormatter0.format(player0);
      assertEquals("Score: -1216", string0);
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertNotNull(arrayList0);
      
      ScorePanel scorePanel0 = new ScorePanel(arrayList0);
      assertEquals(0, arrayList0.size());
      assertTrue(arrayList0.isEmpty());
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
      assertFalse(scorePanel0.getIgnoreRepaint());
      assertFalse(scorePanel0.isFocusTraversalPolicyProvider());
      assertFalse(scorePanel0.isFocusTraversalPolicySet());
      assertFalse(scorePanel0.isFocusCycleRoot());
      assertNotNull(scorePanel0);
      
      // Undeclared exception!
      try { 
        scorePanel0.DEFAULT_SCORE_FORMATTER.format((Player) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.ui.ScorePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stack<Player> stack0 = new Stack<Player>();
      assertEquals(0, stack0.size());
      assertEquals(10, stack0.capacity());
      assertEquals("[]", stack0.toString());
      assertTrue(stack0.isEmpty());
      assertTrue(stack0.empty());
      assertNotNull(stack0);
      
      boolean boolean0 = stack0.add((Player) null);
      assertTrue(boolean0);
      assertFalse(stack0.empty());
      assertEquals(1, stack0.size());
      assertFalse(stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertEquals("[null]", stack0.toString());
      
      ScorePanel scorePanel0 = new ScorePanel(stack0);
      assertFalse(stack0.empty());
      assertEquals(1, stack0.size());
      assertFalse(stack0.isEmpty());
      assertEquals(10, stack0.capacity());
      assertEquals("[null]", stack0.toString());
      assertFalse(scorePanel0.getIgnoreRepaint());
      assertFalse(scorePanel0.isFocusTraversalPolicyProvider());
      assertFalse(scorePanel0.isFocusCycleRoot());
      assertFalse(scorePanel0.isFocusTraversalPolicySet());
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
      assertNotNull(scorePanel0);
      
      // Undeclared exception!
      try { 
        scorePanel0.refresh();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.ui.ScorePanel", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Vector<Player> vector0 = new Vector<Player>();
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertNotNull(vector0);
      
      ScorePanel scorePanel0 = new ScorePanel(vector0);
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertFalse(scorePanel0.isFocusTraversalPolicyProvider());
      assertFalse(scorePanel0.isFocusTraversalPolicySet());
      assertFalse(scorePanel0.isFocusCycleRoot());
      assertFalse(scorePanel0.getIgnoreRepaint());
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
      assertNotNull(scorePanel0);
      
      scorePanel0.setScoreFormatter(scorePanel0.DEFAULT_SCORE_FORMATTER);
      assertTrue(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertFalse(scorePanel0.isFocusTraversalPolicyProvider());
      assertFalse(scorePanel0.isFocusTraversalPolicySet());
      assertFalse(scorePanel0.isFocusCycleRoot());
      assertFalse(scorePanel0.getIgnoreRepaint());
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Vector<Player> vector0 = new Vector<Player>();
      assertTrue(vector0.isEmpty());
      assertEquals("[]", vector0.toString());
      assertEquals(0, vector0.size());
      assertEquals(10, vector0.capacity());
      assertNotNull(vector0);
      
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((-770)).when(player0).getScore();
      doReturn(false).when(player0).isAlive();
      boolean boolean0 = vector0.add(player0);
      assertTrue(vector0.contains(player0));
      assertTrue(boolean0);
      assertEquals(1, vector0.size());
      assertFalse(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      
      ScorePanel scorePanel0 = new ScorePanel(vector0);
      assertTrue(vector0.contains(player0));
      assertEquals(1, vector0.size());
      assertFalse(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
      assertFalse(scorePanel0.isFocusTraversalPolicySet());
      assertFalse(scorePanel0.getIgnoreRepaint());
      assertFalse(scorePanel0.isFocusCycleRoot());
      assertFalse(scorePanel0.isFocusTraversalPolicyProvider());
      assertNotNull(scorePanel0);
      
      scorePanel0.refresh();
      assertTrue(vector0.contains(player0));
      assertEquals(1, vector0.size());
      assertFalse(vector0.isEmpty());
      assertEquals(10, vector0.capacity());
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
      assertFalse(scorePanel0.isFocusTraversalPolicySet());
      assertFalse(scorePanel0.getIgnoreRepaint());
      assertFalse(scorePanel0.isFocusCycleRoot());
      assertFalse(scorePanel0.isFocusTraversalPolicyProvider());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Player> linkedList0 = new LinkedList<Player>();
      Player player0 = mock(Player.class, new ViolatedAssumptionAnswer());
      doReturn((-1216)).when(player0).getScore();
      doReturn(true).when(player0).isAlive();
      linkedList0.add(player0);
      ScorePanel scorePanel0 = new ScorePanel(linkedList0);
      scorePanel0.refresh();
      assertTrue(scorePanel0.getFocusTraversalKeysEnabled());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ScorePanel scorePanel0 = null;
      try {
        scorePanel0 = new ScorePanel((List<Player>) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ArrayList<Player> arrayList0 = new ArrayList<Player>();
      ScorePanel scorePanel0 = new ScorePanel(arrayList0);
      // Undeclared exception!
      try { 
        scorePanel0.setScoreFormatter((ScorePanel.ScoreFormatter) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
