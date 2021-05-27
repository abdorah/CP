package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class NiceStringTest {
    
    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(NiceString.longestNiceSubstring("MMmmsdflsmjfsmskkkkkkkkkKsj"), "kkkkkkkkkK");
    }

}