package com;

import java.util.LinkedList;
import java.util.stream.IntStream;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class LegalMove {

    /**
     * @param b
     * @param r
     * @param c
     * @param round
     * @return linkedList for a selected direction in the matrix that start from the
     *         point(r,c) till the end of the matrix following on of the eight
     *         directions
     */
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

    /**
     * @param linkedList
     * @param r
     * @param c
     * @param color
     * @return boolean that checks if the move is legal for one direction
     */
    public static boolean checkMoveOneDirection(LinkedList<Character> linkedList, int r, int c, char color) {
        if (linkedList.size() < 3) {
            return false;
        } else {
            linkedList.removeFirst();
            char revColor = color == 'W' ? 'B' : 'W';
            if (linkedList.getFirst() == revColor) {
                linkedList.removeFirst();
                for (char v : linkedList) {
                    if (v == '.') {
                        return false;
                    } else if (v == color) {
                        return true;
                    }
                }
            }
            return false;
        }
    }

    /**
     * @param b
     * @param r
     * @param c
     * @param color
     * @return boolean that checks if the move is legal for all the eight directions
     */
    public static boolean checkMove(char[][] b, int r, int c, char color) {
        boolean result0 = checkMoveOneDirection(rotateMatrix(b, r, c, 0), r, c, color);
        boolean result1 = checkMoveOneDirection(rotateMatrix(b, r, c, 1), r, c, color);
        boolean result2 = checkMoveOneDirection(rotateMatrix(b, r, c, 2), r, c, color);
        boolean result3 = checkMoveOneDirection(rotateMatrix(b, r, c, 3), r, c, color);
        boolean result4 = checkMoveOneDirection(rotateMatrix(b, r, c, 4), r, c, color);
        boolean result5 = checkMoveOneDirection(rotateMatrix(b, r, c, 5), r, c, color);
        boolean result6 = checkMoveOneDirection(rotateMatrix(b, r, c, 6), r, c, color);
        boolean result7 = checkMoveOneDirection(rotateMatrix(b, r, c, 7), r, c, color);
        boolean result = result0 || result2 || result1 || result3 || result4 || result6 || result5 || result7;
        return result;
    }
}
