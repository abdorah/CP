package com;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see LegalMove.checkMove
 */
public class LegalMoveTest {

  @Test
  void testCheckMove1() {
    char[][] board =
        new char[][] {
          {'.', '.', '.', 'B', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'},
          {'W', 'B', 'B', '.', 'W', 'W', 'W', 'B'},
          {'.', '.', '.', 'B', '.', '.', '.', '.'},
          {'.', '.', '.', 'B', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'}
        };
    assertTrue(LegalMove.checkMove(board, 4, 3, 'B'));
  }

  @Test
  void testCheckMove2() {
    char[][] board =
        new char[][] {
          {'.', '.', '.', '.', '.', '.', '.', '.'},
          {'.', 'B', '.', '.', 'W', '.', '.', '.'},
          {'.', '.', 'W', '.', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', 'B', '.', '.', '.'},
          {'.', '.', '.', '.', '.', '.', '.', '.'},
          {'.', '.', '.', '.', 'B', 'W', '.', '.'},
          {'.', '.', '.', '.', '.', '.', 'W', '.'},
          {'.', '.', '.', '.', '.', '.', '.', 'B'}
        };
    assertFalse(LegalMove.checkMove(board, 4, 4, 'W'));
  }

  @Test
  void testCheckMove3() {
    char[][] board =
        new char[][] {
          {'W', 'W', '.', 'B', '.', 'B', 'B', '.'},
          {'W', 'B', '.', '.', 'W', 'B', '.', '.'},
          {'B', 'B', 'B', 'B', 'W', 'W', 'B', '.'},
          {'W', 'B', '.', '.', 'B', 'B', 'B', '.'},
          {'W', 'W', 'B', '.', 'W', '.', 'B', 'B'},
          {'B', '.', 'B', 'W', '.', 'B', '.', '.'},
          {'.', 'B', 'B', 'W', 'B', 'B', '.', '.'},
          {'B', 'B', 'W', '.', '.', 'B', '.', '.'}
        };
    assertTrue(LegalMove.checkMove(board, 7, 4, 'B'));
  }

  @Test
  void testCheckMove4() {
    char[][] board =
        new char[][] {
          {'.', '.', '.', '.', 'W', 'B', 'B', 'B'},
          {'.', '.', '.', '.', '.', '.', '.', 'B'},
          {'W', '.', '.', 'W', '.', '.', 'W', '.'},
          {'B', '.', 'B', 'B', 'B', '.', '.', 'W'},
          {'W', '.', '.', 'B', 'W', 'B', 'B', '.'},
          {'W', 'B', '.', '.', 'W', 'B', 'B', '.'},
          {'.', 'W', 'B', 'B', 'W', 'B', '.', 'W'},
          {'B', '.', 'W', 'B', 'W', '.', 'W', '.'}
        };
    assertFalse(LegalMove.checkMove(board, 0, 0, 'B'));
  }

  @Test
  void testCheckMove5() {
    char[][] board =
        new char[][] {
          {'.', '.', '.', 'B', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'},
          {'W', 'B', 'B', '.', 'W', 'W', 'W', 'B'},
          {'.', '.', '.', 'B', '.', '.', '.', '.'},
          {'.', '.', '.', 'B', '.', '.', '.', '.'},
          {'.', '.', '.', 'W', '.', '.', '.', '.'}
        };
    assertTrue(LegalMove.checkMove(board, 4, 3, 'B'));
  }

  @Test
  void testCheckMove6() {
    char[][] board =
        new char[][] {
          {'.', '.', 'W', '.', 'B', 'W', 'W', 'B'},
          {'B', 'W', '.', 'W', '.', 'W', 'B', 'B'},
          {'.', 'W', 'B', 'W', 'W', '.', 'W', 'W'},
          {'W', 'W', '.', 'W', '.', '.', 'B', 'B'},
          {'B', 'W', 'B', 'B', 'W', 'W', 'B', '.'},
          {'W', '.', 'W', '.', '.', 'B', 'W', 'W'},
          {'B', '.', 'B', 'B', '.', '.', 'B', 'B'},
          {'.', 'W', '.', 'W', '.', 'W', '.', 'W'}
        };
    assertTrue(LegalMove.checkMove(board, 5, 4, 'W'));
  }

  @Test
  void testCheckMove7() {
    char[][] board =
        new char[][] {
          {'B', 'B', '.', '.', 'B', 'W', 'W', '.'},
          {'.', 'W', 'W', '.', 'B', 'W', 'B', 'B'},
          {'.', 'W', 'B', 'B', 'W', '.', 'W', '.'},
          {'B', '.', '.', 'B', 'W', 'W', 'W', '.'},
          {'W', 'W', 'W', 'B', 'W', '.', 'B', 'W'},
          {'.', '.', '.', 'W', '.', 'W', '.', 'B'},
          {'B', 'B', 'W', 'B', 'B', 'W', 'W', 'B'},
          {'W', '.', 'W', 'W', '.', 'B', '.', 'W'}
        };
    assertFalse(LegalMove.checkMove(board, 2, 5, 'W'));
  }

  @Test
  void testCheckMove8() {
    char[][] board =
        new char[][] {
          {'.', 'B', 'W', 'B', '.', 'B', '.', '.'},
          {'W', 'W', 'B', 'W', 'B', '.', 'B', 'W'},
          {'B', 'W', 'B', 'W', 'W', 'W', '.', 'W'},
          {'W', '.', '.', 'B', 'W', 'W', 'W', 'B'},
          {'.', 'B', 'W', '.', 'B', 'W', 'W', '.'},
          {'.', 'W', '.', 'B', 'W', '.', '.', '.'},
          {'.', 'W', 'W', 'W', 'W', 'W', 'W', 'B'},
          {'W', '.', '.', 'B', '.', 'W', 'W', 'B'}
        };
    assertTrue(LegalMove.checkMove(board, 1, 5, 'W'));
  }
}
