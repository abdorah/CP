package com;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class LegalMove {

    public static LinkedList<Character> rotateMatrix(char[][] b, int r, int c) {
        LinkedList<Character> linkedList = new LinkedList<>();
        IntStream.range(7 - r, 8).forEach(i -> linkedList.add(b[c][7 - r]));
        return linkedList;
    }

    public static boolean checkMoveLeftRight(LinkedList<Character> linkedList, int r, int c, char color) {
        if (linkedList.isEmpty()) {
            return false;
        } else {
            char l = linkedList.peekLast();
            while (color == l && linkedList.size() >= 3) {
                l = linkedList.pollLast();
            }
            linkedList.removeFirst();
            if (linkedList.size() >= 2 && linkedList.poll() != color && !linkedList.contains('.')) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean checkMove(char[][] b, int r, int c, char color) {
        LinkedList<Character> linkedList = new LinkedList<>();
        final int row = r;
        IntStream.range(c, 8).forEach(i -> linkedList.add(b[row][i]));
        boolean result1 = checkMoveLeftRight(linkedList, r, c, color);
        int temp;
        rotateMatrix(b, r, c);
        temp = 7 - r;
        r = c;
        c = temp;
        boolean result2 = checkMoveLeftRight(linkedList, r, c, color);
        rotateMatrix(b, r, c);
        temp = 7 - r;
        r = c;
        c = temp;
        boolean result3 = checkMoveLeftRight(linkedList, r, c, color);
        rotateMatrix(b, r, c);
        temp = 7 - r;
        r = c;
        c = temp;
        boolean result4 = checkMoveLeftRight(linkedList, r, c, color);
        boolean result = (result1 ^ result3) || (result2 ^ result4);
        return result;
    }
}
