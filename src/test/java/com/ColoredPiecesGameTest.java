package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see ColoredPiecesGame.winnerOfGame
 */

public class ColoredPiecesGameTest {
    @Test
    void testWinnerOfGame() {
        assertTrue(ColoredPiecesGame.winnerOfGame("AAABABB"));
    }
}
