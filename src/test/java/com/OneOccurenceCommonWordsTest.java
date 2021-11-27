package com;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see OneOccurenceCommonWords.countWords
 */
public class OneOccurenceCommonWordsTest {
    @Test
    void testCountWords() {
        assertEquals(2, OneOccurenceCommonWords.countWords(new String[]{"leetcode","is","amazing","as","is"}, new String[]{"amazing","leetcode","is"}));
    }
}
