package com;

import java.util.Arrays;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */
public class LonguestSentence {

    /**
     * @param sentences
     * @return the longest sentence of the array sentences
     */
    public static int mostWordsFound(String[] sentences) {
        return Arrays.stream(sentences).max((a, n) -> a.split(" ").length - n.split(" ").length).get().split(" ").length;
    }
}
