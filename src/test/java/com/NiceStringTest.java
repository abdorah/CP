package com;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class NiceStringTest {
    
    @Test
    public void shouldAnswerWithTrue() {
        assertEquals(NiceString.longestNiceSubstring("MMmmsdflsmjfsmskkkkkkkkkKsj"), "kkkkkkkkkK");
    }

}