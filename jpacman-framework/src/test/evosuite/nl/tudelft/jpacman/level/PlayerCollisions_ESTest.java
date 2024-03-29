/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:11:55 GMT 2018
 */

package nl.tudelft.jpacman.level;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.HashMap;
import java.util.Hashtable;
import nl.tudelft.jpacman.board.Direction;
import nl.tudelft.jpacman.board.Unit;
import nl.tudelft.jpacman.level.Pellet;
import nl.tudelft.jpacman.level.Player;
import nl.tudelft.jpacman.level.PlayerCollisions;
import nl.tudelft.jpacman.npc.ghost.Blinky;
import nl.tudelft.jpacman.npc.ghost.Ghost;
import nl.tudelft.jpacman.npc.ghost.Inky;
import nl.tudelft.jpacman.npc.ghost.Pinky;
import nl.tudelft.jpacman.sprite.AnimatedSprite;
import nl.tudelft.jpacman.sprite.Sprite;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class PlayerCollisions_ESTest extends PlayerCollisions_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Sprite[] spriteArray0 = new Sprite[0];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, 1037, true);
      Pellet pellet0 = new Pellet(1037, animatedSprite0);
      // Undeclared exception!
      try { 
        playerCollisions0.playerVersusPellet((Player) null, pellet0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.level.PlayerCollisions", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Hashtable<Direction, Sprite> hashtable0 = new Hashtable<Direction, Sprite>();
      Blinky blinky0 = new Blinky(hashtable0);
      // Undeclared exception!
      try { 
        playerCollisions0.playerVersusGhost((Player) null, blinky0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.level.PlayerCollisions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Hashtable<Direction, Sprite> hashtable0 = new Hashtable<Direction, Sprite>();
      Pellet pellet0 = new Pellet((-514), (Sprite) null);
      Inky inky0 = new Inky(hashtable0);
      playerCollisions0.collide(pellet0, inky0);
      assertFalse(pellet0.hasSquare());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Hashtable<Direction, Sprite> hashtable0 = new Hashtable<Direction, Sprite>();
      Blinky blinky0 = new Blinky(hashtable0);
      playerCollisions0.collide(blinky0, blinky0);
      assertFalse(blinky0.hasSquare());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Hashtable<Direction, Sprite> hashtable0 = new Hashtable<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[0];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, (-1), false);
      Player player0 = new Player(hashtable0, animatedSprite0);
      Pellet pellet0 = new Pellet((-514), (Sprite) null);
      playerCollisions0.collide(player0, pellet0);
      assertEquals((-514), player0.getScore());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Hashtable<Direction, Sprite> hashtable0 = new Hashtable<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[0];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, (-1), false);
      Player player0 = new Player(hashtable0, animatedSprite0);
      Inky inky0 = new Inky(hashtable0);
      playerCollisions0.collide(player0, inky0);
      assertFalse(player0.isAlive());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[3];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, 0, true);
      Player player0 = new Player(hashMap0, animatedSprite0);
      playerCollisions0.collide((Unit) null, player0);
      assertEquals(Direction.EAST, player0.getDirection());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      Hashtable<Direction, Sprite> hashtable0 = new Hashtable<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[0];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, (-1), false);
      Player player0 = new Player(hashtable0, animatedSprite0);
      Pinky pinky0 = new Pinky(hashtable0);
      playerCollisions0.collide(pinky0, player0);
      assertFalse(player0.isAlive());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[3];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, 0, true);
      Player player0 = new Player(hashMap0, animatedSprite0);
      Pellet pellet0 = new Pellet((-230), animatedSprite0);
      playerCollisions0.collide(pellet0, player0);
      assertEquals((-230), player0.getScore());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[3];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, 0, true);
      Player player0 = new Player(hashMap0, animatedSprite0);
      playerCollisions0.playerVersusGhost(player0, (Ghost) null);
      assertFalse(player0.isAlive());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      PlayerCollisions playerCollisions0 = new PlayerCollisions();
      HashMap<Direction, Sprite> hashMap0 = new HashMap<Direction, Sprite>();
      Sprite[] spriteArray0 = new Sprite[3];
      AnimatedSprite animatedSprite0 = new AnimatedSprite(spriteArray0, 0, true);
      Player player0 = new Player(hashMap0, animatedSprite0);
      Pellet pellet0 = new Pellet((-230), animatedSprite0);
      playerCollisions0.playerVersusPellet(player0, pellet0);
      assertEquals((-230), pellet0.getValue());
  }
}
