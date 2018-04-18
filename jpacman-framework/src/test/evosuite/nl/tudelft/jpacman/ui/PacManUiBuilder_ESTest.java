/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 10:49:50 GMT 2018
 */

package nl.tudelft.jpacman.ui;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.HeadlessException;
import nl.tudelft.jpacman.game.Game;
import nl.tudelft.jpacman.ui.Action;
import nl.tudelft.jpacman.ui.PacManUiBuilder;
import nl.tudelft.jpacman.ui.ScorePanel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PacManUiBuilder_ESTest extends PacManUiBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      Action action0 = mock(Action.class, new ViolatedAssumptionAnswer());
      PacManUiBuilder pacManUiBuilder1 = pacManUiBuilder0.addButton("^", action0);
      assertSame(pacManUiBuilder0, pacManUiBuilder1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      Action action0 = mock(Action.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        pacManUiBuilder0.addButton("", action0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      Action action0 = mock(Action.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        pacManUiBuilder0.addButton((String) null, action0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      // Undeclared exception!
      try { 
        pacManUiBuilder0.addButton("zhRr?G>-/1J1#>=", (Action) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      Integer integer0 = new Integer(449);
      // Undeclared exception!
      try { 
        pacManUiBuilder0.addKey(integer0, (Action) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      Integer integer0 = new Integer((-44));
      Action action0 = mock(Action.class, new ViolatedAssumptionAnswer());
      PacManUiBuilder pacManUiBuilder1 = pacManUiBuilder0.addKey(integer0, action0);
      assertSame(pacManUiBuilder0, pacManUiBuilder1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      Action action0 = mock(Action.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        pacManUiBuilder0.addKey((Integer) null, action0);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Game game0 = mock(Game.class, new ViolatedAssumptionAnswer());
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      pacManUiBuilder0.withDefaultButtons();
      // Undeclared exception!
      try { 
        pacManUiBuilder0.build(game0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Game game0 = mock(Game.class, new ViolatedAssumptionAnswer());
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      // Undeclared exception!
      try { 
        pacManUiBuilder0.build(game0);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.awt.GraphicsEnvironment", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      // Undeclared exception!
      try { 
        pacManUiBuilder0.build((Game) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PacManUiBuilder pacManUiBuilder0 = new PacManUiBuilder();
      ScorePanel.ScoreFormatter scorePanel_ScoreFormatter0 = mock(ScorePanel.ScoreFormatter.class, new ViolatedAssumptionAnswer());
      PacManUiBuilder pacManUiBuilder1 = pacManUiBuilder0.withScoreFormatter(scorePanel_ScoreFormatter0);
      assertSame(pacManUiBuilder1, pacManUiBuilder0);
  }
}
