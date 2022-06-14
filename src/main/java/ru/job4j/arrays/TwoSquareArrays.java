package ru.job4j.arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * right.length];
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                rsl[i * left.length + j] = Math.max(left[i][j], right[i][j]);
            }
        }
        return rsl;
    }
}
