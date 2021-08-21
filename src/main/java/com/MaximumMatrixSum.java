package com;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class MaximumMatrixSum {

    /**
     * @param matrix
     * @return the biggest sum to get out of summing all values of matrix
     */
    public static long maxMatrixSum(int[][] matrix) {
        long result = 0;
        int length = matrix.length;
        int counter = 0;
        int min = Math.abs(matrix[0][0]);
        for (int i = 0; i < length; i++) {
            for (int j = 0; j < length; j++) {
                result = result + Math.abs(matrix[i][j]);
                if (matrix[i][j] < 0) {
                    counter++;
                }
                min = Math.min(min, Math.abs(matrix[i][j]));
            }
        }
        if (counter % 2 == 1) {
            result -= 2 * min;
        }
        return result;
    }
}
