package com;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RegularExpressionTest {

    @Test
    public void shouldAnswerWithTrue() {
        assertTrue(RegularExpression.isMatch("aaa", "a*aaa"));
    }
}