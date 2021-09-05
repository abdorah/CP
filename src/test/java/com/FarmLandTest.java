package com;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 * @see FarmLand.findFarmland
 */

public class FarmLandTest {

    @Test
    void testFindFarmland() {
        int[][] land = new int[][] {{1,0,0},{0,1,1},{0,1,1}};
        int[][] farms = new int[][]{{0,0,0,0},{1,1,2,2}};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }
}
