package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see MovesToSeats.minMovesToSeat
 */

public class MovesToSeatsTest {
    
    @Test
    void testMinMovesToSeat() {
        assertEquals(4, MovesToSeats.minMovesToSeat(new int[]{3,1,5}, new int[]{2,7,4}));
    }
}
