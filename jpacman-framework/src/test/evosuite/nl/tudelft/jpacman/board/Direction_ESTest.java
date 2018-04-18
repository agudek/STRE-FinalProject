/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:24:07 GMT 2018
 */

package nl.tudelft.jpacman.board;

import org.junit.Test;
import static org.junit.Assert.*;
import nl.tudelft.jpacman.board.Direction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class Direction_ESTest extends Direction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Direction[] directionArray0 = Direction.values();
      assertEquals(4, directionArray0.length);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Direction direction0 = Direction.valueOf("NORTH");
      assertEquals(Direction.NORTH, direction0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Direction direction0 = Direction.valueOf("SOUTH");
      assertEquals(1, direction0.getDeltaY());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Direction direction0 = Direction.valueOf("EAST");
      assertEquals(0, direction0.getDeltaY());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Direction direction0 = Direction.valueOf("WEST");
      assertEquals(0, direction0.getDeltaY());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Direction direction0 = Direction.EAST;
      int int0 = direction0.getDeltaY();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Direction direction0 = Direction.SOUTH;
      int int0 = direction0.getDeltaY();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Direction direction0 = Direction.EAST;
      int int0 = direction0.getDeltaX();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Direction direction0 = Direction.WEST;
      int int0 = direction0.getDeltaX();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Direction direction0 = Direction.NORTH;
      int int0 = direction0.getDeltaY();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Direction direction0 = Direction.NORTH;
      int int0 = direction0.getDeltaX();
      assertEquals(0, int0);
  }
}