package com;

import java.util.ArrayList;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class FarmLand {

    /**
     * @param land
     * @return matrix of farm lands
     */
    public static int[][] findFarmland(int[][] land) {
        int m = land.length;
        int n = land[0].length;
        var result = new ArrayList<int[]>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (land[i][j] == 0)
                    continue;
                int c1 = j;
                while (c1 < n && land[i][c1] == 1)
                    c1++;
                int r2 = i;
                while (r2 < m && land[r2][j] == 1)
                    r2++;
                c1 = c1 == 0 ? c1 : c1 - 1;
                r2 = r2 == 0 ? r2 : r2 - 1;
                result.add(new int[] { i, j, r2, c1 });
                for (int k = i; k <= r2; k++)
                    for (int l = j; l <= c1; l++)
                        land[k][l] = 0;
            }
        }
        return result.toArray(int[][]::new);
    }
}
