package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see DistinctString.kthDistinct
 */
public class DistinctStringTest {
    @Test
    void testKthDistinct() {
        assertEquals("a" , DistinctString.kthDistinct(new String[]{"d","b","c","b","c","a"}, 2));
    }
}
