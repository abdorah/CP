package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see MiddleIndex.findMiddleIndex
 */

public class MiddleIndexTest {

    @Test
    void testFindMiddleIndex1() {
        assertEquals(3, MiddleIndex.findMiddleIndex(new int[] { 2, 3, -1, 8, 4 }));
    }

    @Test
    void testFindMiddleIndex2() {
        assertEquals(-1, MiddleIndex.findMiddleIndex(new int[] { 2, 5 }));
    }
}
