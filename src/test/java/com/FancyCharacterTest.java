package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FancyCharacterTest {
    @Test
    void testMakeFancyString() {
        assertEquals("leetcode", FancyCharacter.makeFancyString("leeetcode"));
    }
}
