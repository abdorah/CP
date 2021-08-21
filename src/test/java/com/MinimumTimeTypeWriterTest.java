package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see MinimumTimeTypeWriter.minTimeToType
 */

public class MinimumTimeTypeWriterTest {
    @Test
    void testMinTimeToType1() {
        assertEquals(MinimumTimeTypeWriter.minTimeToType("abc"), 5);
    }

    @Test
    void testMinTimeToType2() {
        assertEquals(MinimumTimeTypeWriter.minTimeToType("zjpc"), 34);
    }
}
