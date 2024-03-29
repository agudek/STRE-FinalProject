/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:19:43 GMT 2018
 */

package nl.tudelft.jpacman.npc.ghost;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Map;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.npc.ghost.Clyde;
import nl.tudelft.jpacman.npc.ghost.Inky;
import nl.tudelft.jpacman.sprite.EmptySprite;
import nl.tudelft.jpacman.sprite.Sprite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Ghost_ESTest extends Ghost_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Random.setNextRandom((-892));
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Inky inky0 = new Inky(hashMap0);
      long long0 = inky0.getInterval();
      assertEquals(292L, long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Direction direction0 = Direction.SOUTH;
      EmptySprite emptySprite0 = new EmptySprite();
      hashMap0.put(direction0, emptySprite0);
      Clyde clyde0 = new Clyde(hashMap0);
      clyde0.setDirection(direction0);
      Sprite sprite0 = clyde0.getSprite();
      assertEquals(0, sprite0.getWidth());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Clyde clyde0 = new Clyde((Map<Direction, Sprite>) null);
      // Undeclared exception!
      try { 
        clyde0.getSprite();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.npc.ghost.Ghost", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Inky inky0 = new Inky(hashMap0);
      // Undeclared exception!
      try { 
        inky0.randomMove();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.npc.ghost.Ghost", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Clyde clyde0 = new Clyde(hashMap0);
      Sprite sprite0 = clyde0.getSprite();
      assertNull(sprite0);
  }
}
