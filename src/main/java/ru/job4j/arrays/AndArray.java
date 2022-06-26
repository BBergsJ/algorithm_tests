package ru.job4j.arrays;

import java.util.Arrays;

public class AndArray {
    public static int[] and(int[] left, int[] right) {
        int[] rsl = new int[Math.min(left.length, right.length)];
        int counter = 0;
        for (int j : left) {
            for (int k : right) {
                if (j == k) {
                    rsl[counter] = j;
                    counter++;
                }
            }
        }
        return Arrays.copyOf(rsl, counter);
    }
}