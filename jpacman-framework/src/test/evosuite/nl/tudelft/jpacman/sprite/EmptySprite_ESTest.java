/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:25:45 GMT 2018
 */

package nl.tudelft.jpacman.sprite;

import org.junit.Test;
import static org.junit.Assert.*;
import javax.swing.DebugGraphics;
import nl.tudelft.jpacman.sprite.EmptySprite;
import nl.tudelft.jpacman.sprite.Sprite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class EmptySprite_ESTest extends EmptySprite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      int int0 = emptySprite0.getHeight();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      Sprite sprite0 = emptySprite0.split(0, 0, 0, 0);
      assertEquals(0, sprite0.getHeight());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      DebugGraphics debugGraphics0 = new DebugGraphics();
      emptySprite0.draw(debugGraphics0, 0, 0, 0, 0);
      assertEquals(0, emptySprite0.getHeight());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EmptySprite emptySprite0 = new EmptySprite();
      int int0 = emptySprite0.getWidth();
      assertEquals(0, int0);
  }
}
