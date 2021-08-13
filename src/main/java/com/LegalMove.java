package com;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class LegalMove {

    public static LinkedList<Character> rotateMatrix(char[][] b, int r, int c, int round) {
        LinkedList<Character> linkedList = new LinkedList<>();
        switch (round) {
            case 0:
                IntStream.range(c, 8).forEach(i -> linkedList.add(b[r][i]));
                break;
            case 1:
                IntStream.range(7 - r, 8).forEach(i -> linkedList.add(b[7 - i][c]));
                break;
            case 2:
                IntStream.range(7 - c, 8).forEach(i -> linkedList.add(b[r][7 - i]));
                break;
            case 3:
                IntStream.range(r, 8).forEach(i -> linkedList.add(b[i][c]));
                break;
            case 4:
                IntStream.range(0, Math.min(r + 1, 8 - c)).forEach(i -> linkedList.add(b[r - i][c + i]));
                break;
            case 5:
                IntStream.range(0, Math.min(r + 1, c + 1)).forEach(i -> linkedList.add(b[r - i][c - i]));
                break;
            case 6:
                IntStream.range(0, Math.min(8 - r, c + 1)).forEach(i -> linkedList.add(b[r + i][c - i]));
                break;
            case 7:
                IntStream.range(0, Math.min(8 - r, 8 - c)).forEach(i -> linkedList.add(b[r + i][c + i]));
                break;
        }
        return linkedList;
    }

    public static boolean checkMoveLeftRight(LinkedList<Character> linkedList, int r, int c, char color) {
        if (linkedList.size() < 3) {
            return false;
        } else {
            char l = linkedList.peekLast();
            while ((l == '.' || color == l) && linkedList.size() >= 3) {
                l = linkedList.pollLast();
            }
            linkedList.removeFirst();
            if (linkedList.size() >= 2 && !linkedList.contains('.')) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static boolean checkMove(char[][] b, int r, int c, char color) {
        boolean result1 = checkMoveLeftRight(rotateMatrix(b, r, c, 0), r, c, color);
        boolean result2 = checkMoveLeftRight(rotateMatrix(b, r, c, 1), r, c, color);
        boolean result3 = checkMoveLeftRight(rotateMatrix(b, r, c, 2), r, c, color);
        boolean result4 = checkMoveLeftRight(rotateMatrix(b, r, c, 3), r, c, color);
        boolean result5 = checkMoveLeftRight(rotateMatrix(b, r, c, 4), r, c, color);
        boolean result6 = checkMoveLeftRight(rotateMatrix(b, r, c, 5), r, c, color);
        boolean result7 = checkMoveLeftRight(rotateMatrix(b, r, c, 6), r, c, color);
        boolean result8 = checkMoveLeftRight(rotateMatrix(b, r, c, 7), r, c, color);
        boolean result = (result1 ^ result3) || (result2 ^ result4) || (result5 ^ result7) || (result6 ^ result8);
        return result;
    }
}
