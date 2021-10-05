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
    void testFindFarmland1() {
        int[][] land = new int[][] {{1,0,0},{0,1,1},{0,1,1}};
        int[][] farms = new int[][]{{0,0,0,0},{1,1,2,2}};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }

    @Test
    void testFindFarmland2() {
        int[][] land = new int[][] {{0}};
        int[][] farms = new int[][]{};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }

    @Test
    void testFindFarmland3() {
        int[][] land = new int[][] {{0},{0}};
        int[][] farms = new int[][]{};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }

    @Test
    void testFindFarmland4() {
        int[][] land = new int[][] {{1}};
        int[][] farms = new int[][]{{0,0,0,0}};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }

    @Test
    void testFindFarmland5() {
        int[][] land = new int[][] {{0,1},{1,0}};
        int[][] farms = new int[][] {{0,1,0,1},{1,0,1,0}};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }

    @Test
    void testFindFarmland6() {
        int[][] land = new int[][] {{1,1},{0,0}};
        int[][] farms = new int[][] {{0,0,0,1}};
        assertArrayEquals(farms, FarmLand.findFarmland(land));
    }
}
