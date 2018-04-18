/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:08:58 GMT 2018
 */

package nl.tudelft.jpacman.npc.ghost;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.ghost.Blinky;
import nl.tudelft.jpacman.sprite.Sprite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Blinky_ESTest extends Blinky_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Blinky blinky0 = new Blinky(hashMap0);
      // Undeclared exception!
      try { 
        blinky0.nextMove();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }
}
