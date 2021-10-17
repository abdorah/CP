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
    var result = new ArrayList<int[]>();
    int row = land.length;
    int column = land[0].length;

    for (int i = 0; i < row; ++i)
      for (int j = 0; j < column; ++j)
        if (land[i][j] == 1) {
          if (i > 0 && land[i - 1][j] == 1) continue;
          if (j > 0 && land[i][j - 1] == 1) continue;
          int[] buffer = new int[4];
          buffer[0] = i;
          buffer[1] = j;
          int x, y;
          for (x = i; x < row; ++x) if (land[x][j] == 0) break;
          for (y = j; y < column; ++y) if (land[i][y] == 0) break;
          buffer[2] = x - 1;
          buffer[3] = y - 1;
          result.add(buffer);
        }
    return result.stream().toArray(int[][]::new);
  }
}
