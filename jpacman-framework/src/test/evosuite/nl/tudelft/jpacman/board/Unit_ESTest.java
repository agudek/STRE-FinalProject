/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 10:51:52 GMT 2018
 */

package nl.tudelft.jpacman.board;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.sprite.EmptySprite;
import nl.tudelft.jpacman.sprite.Sprite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Unit_ESTest extends Unit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Pellet pellet0 = new Pellet(99, (Sprite) null);
      Sprite sprite0 = pellet0.getSprite();
      assertNull(sprite0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet(0, emptySprite0);
      Sprite sprite0 = pellet0.getSprite();
      assertSame(emptySprite0, sprite0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-2342), emptySprite0);
      Direction direction0 = Direction.NORTH;
      pellet0.setDirection(direction0);
      Direction direction1 = pellet0.getDirection();
      assertEquals((-1), direction1.getDeltaY());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet(115, emptySprite0);
      Direction direction0 = Direction.SOUTH;
      pellet0.setDirection(direction0);
      Direction direction1 = pellet0.getDirection();
      assertSame(direction1, direction0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-2342), emptySprite0);
      Direction direction0 = Direction.WEST;
      pellet0.setDirection(direction0);
      Direction direction1 = pellet0.getDirection();
      assertSame(direction1, direction0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-84), emptySprite0);
      pellet0.leaveSquare();
      assertEquals((-84), pellet0.getValue());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-84), emptySprite0);
      // Undeclared exception!
      try { 
        pellet0.occupy((Square) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-764), emptySprite0);
      boolean boolean0 = pellet0.hasSquare();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-2364), emptySprite0);
      // Undeclared exception!
      try { 
        pellet0.getSquare();
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Pellet pellet0 = new Pellet((-2364), emptySprite0);
      Direction direction0 = pellet0.getDirection();
      pellet0.setDirection(direction0);
      assertFalse(pellet0.hasSquare());
  }
}
