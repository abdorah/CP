package com;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class FarmLand {

    int i;
    int j;
    int dimension;

    public FarmLand() {
    }

    public FarmLand(int i, int j, int dimension) {
        this.i = i;
        this.j = j;
        this.dimension = dimension;
    }

    /**
     * @param land
     * @return matrix of farm lands
     */
    public static int[][] findFarmland(int[][] land) {
        if (Arrays.stream(land).map(e -> Arrays.stream(e).sum()).reduce((a, b) -> a + b).get() == 0) {
            return new int[][] {};
        }
        if (land.length == 1 && Arrays.stream(land[0]).sum() == 1) {
            return new int[][] { { 0, 0, 0, 0 } };
        }
        int dimension;
        boolean done, actual;
        List<FarmLand> farms = new ArrayList<FarmLand>();
        for (int i = 0; i < land.length; i = i + dimension) {
            dimension = 0;
            done = false;
            columnsLoop: for (int j = 0; j < land[0].length; j++) {
                actual = false;
                if (land[i][j] == 1) {
                    ++dimension;
                    done = Arrays.stream(land[i]).skip(j + 1).sum() == 0;
                    actual = true;
                }
                if (done) {
                    farms.add(new FarmLand(i, (actual ? j : j - 1), dimension));
                    break columnsLoop;
                }
            }
        }
        int[][] result = new int[farms.size()][];
        for (int k = 0; k < farms.size(); k++) {
            if (farms.get(k).dimension == 1) {
                result[k] = new int[] { farms.get(k).i, farms.get(k).j, farms.get(k).i, farms.get(k).j };
            } else {
                result[k] = new int[] { farms.get(k).i,
                    farms.get(k).j - farms.get(k).dimension + 1,
                    farms.get(k).i + farms.get(k).dimension - 1,
                    farms.get(k).j};
            }
        }
        return result;
    }
}
