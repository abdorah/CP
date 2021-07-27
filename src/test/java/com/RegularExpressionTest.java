package com;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class RegularExpressionTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(RegularExpression.isMatch("aaa", "a*aaa"));
    }
}