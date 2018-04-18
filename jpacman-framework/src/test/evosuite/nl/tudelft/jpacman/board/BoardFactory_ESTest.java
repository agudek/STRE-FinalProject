/*
 * This file was automatically generated by EvoSuite
 * Thu Apr 12 11:16:29 GMT 2018
 */

package nl.tudelft.jpacman.board;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import nl.tudelft.jpacman.board.Board;
import nl.tudelft.jpacman.board.BoardFactory;
import nl.tudelft.jpacman.board.Square;
import nl.tudelft.jpacman.sprite.PacManSprites;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true, useJEE = true) 
public class BoardFactory_ESTest extends BoardFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      Square[][] squareArray0 = new Square[2][0];
      Board board0 = boardFactory0.createBoard(squareArray0);
      assertEquals(0, board0.getHeight());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BoardFactory boardFactory0 = new BoardFactory((PacManSprites) null);
      // Undeclared exception!
      try { 
        boardFactory0.createWall();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.board.BoardFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BoardFactory boardFactory0 = new BoardFactory((PacManSprites) null);
      // Undeclared exception!
      try { 
        boardFactory0.createGround();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.board.BoardFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      Square[][] squareArray0 = new Square[0][3];
      // Undeclared exception!
      try { 
        boardFactory0.createBoard(squareArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // 0
         //
         verifyException("nl.tudelft.jpacman.board.Board", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      Square[][] squareArray0 = new Square[1][5];
      Square[] squareArray1 = new Square[7];
      Square square0 = boardFactory0.createWall();
      squareArray1[0] = square0;
      squareArray1[1] = square0;
      squareArray1[2] = square0;
      squareArray1[3] = square0;
      squareArray1[4] = square0;
      squareArray1[5] = square0;
      squareArray1[6] = square0;
      squareArray0[0] = squareArray1;
      Board board0 = boardFactory0.createBoard(squareArray0);
      assertEquals(7, board0.getHeight());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      // Undeclared exception!
      try { 
        boardFactory0.createBoard((Square[][]) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      Square[][] squareArray0 = new Square[1][5];
      // Undeclared exception!
      try { 
        boardFactory0.createBoard(squareArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.board.BoardFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      Square square0 = boardFactory0.createGround();
      assertNotNull(square0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      PacManSprites pacManSprites0 = new PacManSprites();
      BoardFactory boardFactory0 = new BoardFactory(pacManSprites0);
      Square square0 = boardFactory0.createWall();
      Square[][] squareArray0 = new Square[2][7];
      Square[] squareArray1 = new Square[3];
      squareArray1[0] = square0;
      squareArray1[1] = square0;
      squareArray1[2] = square0;
      squareArray0[0] = squareArray1;
      // Undeclared exception!
      try { 
        boardFactory0.createBoard(squareArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("nl.tudelft.jpacman.board.BoardFactory", e);
      }
  }
}
