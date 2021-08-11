package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see LegalMove.checkMove
 */

public class LegalMoveTest {

    @Test
    void testCheckMove() {
        char[][] board = new char[][] { { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { '.', '.', '.', 'W', '.', '.', '.', '.' }, { '.', '.', '.', 'W', '.', '.', '.', '.' },
                { '.', '.', '.', 'W', '.', '.', '.', '.' }, { 'W', 'B', 'B', '.', 'W', 'W', 'W', 'B' },
                { '.', '.', '.', 'B', '.', '.', '.', '.' }, { '.', '.', '.', 'B', '.', '.', '.', '.' },
                { '.', '.', '.', 'W', '.', '.', '.', '.' } };
        assertTrue(LegalMove.checkMove(board, 4, 3, 'B'));
    }
}
