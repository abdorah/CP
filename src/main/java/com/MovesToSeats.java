package com;

import java.util.Arrays;

/**
 * @author KOTBI Abderrahmane
 * @version 1.1
 */

public class MovesToSeats {

    /**
     * @param seats
     * @param students
     * @return the number of move overall for each student to reach his/her seat.
     */

    public static int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int count = 0;
        for (int i = 0; i < seats.length; i++) {
            count += Math.abs(seats[i] - students[i]);
        }
        return count;
    }
}
