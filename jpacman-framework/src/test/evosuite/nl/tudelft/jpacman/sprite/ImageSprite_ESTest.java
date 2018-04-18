/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:13:10 GMT 2018
 */

package nl.tudelft.jpacman.sprite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import nl.tudelft.jpacman.sprite.ImageSprite;
import nl.tudelft.jpacman.sprite.Sprite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import sun.java2d.SunGraphics2D;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class ImageSprite_ESTest extends ImageSprite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      Sprite sprite0 = imageSprite0.split(0, 45, 0, 317);
      assertEquals(0, sprite0.getWidth());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      Sprite sprite0 = imageSprite0.split(0, 1, 673, 317);
      assertEquals(0, sprite0.getHeight());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      // Undeclared exception!
      try { 
        imageSprite0.split(0, 0, 1, 2);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      // Undeclared exception!
      try { 
        imageSprite0.split(1, 0, 1, 1);
        fail("Expecting exception: HeadlessException");
      
      } catch(HeadlessException e) {
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      SunGraphics2D sunGraphics2D0 = (SunGraphics2D)bufferedImage0.getGraphics();
      imageSprite0.draw(sunGraphics2D0, 0, (-1748), (-9), 134);
      assertEquals(0, sunGraphics2D0.clipState);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImageSprite imageSprite0 = new ImageSprite((Image) null);
      // Undeclared exception!
      try { 
        imageSprite0.split((-4950), (-4950), (-1), 0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.sprite.ImageSprite", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      ImageSprite imageSprite0 = new ImageSprite((Image) null);
      // Undeclared exception!
      try { 
        imageSprite0.getWidth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.sprite.ImageSprite", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      ImageSprite imageSprite0 = new ImageSprite((Image) null);
      // Undeclared exception!
      try { 
        imageSprite0.getHeight();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.sprite.ImageSprite", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      Sprite sprite0 = imageSprite0.split(1, 2, 2, 2);
      assertEquals(0, sprite0.getHeight());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      Sprite sprite0 = imageSprite0.split(0, 0, 0, 0);
      assertEquals(0, sprite0.getWidth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      Sprite sprite0 = imageSprite0.split(0, 0, 2, 0);
      assertEquals(0, sprite0.getHeight());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      Sprite sprite0 = imageSprite0.split(2, 2, 2, 2);
      assertEquals(0, sprite0.getHeight());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      int int0 = imageSprite0.getWidth();
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      // Undeclared exception!
      try { 
        imageSprite0.draw((Graphics) null, 2, 2, 2, 2);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.sprite.ImageSprite", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      BufferedImage bufferedImage0 = new BufferedImage(2, 2, 2);
      ImageSprite imageSprite0 = new ImageSprite(bufferedImage0);
      int int0 = imageSprite0.getHeight();
      assertEquals(2, int0);
  }
}