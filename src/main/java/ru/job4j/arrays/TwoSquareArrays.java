package ru.job4j.arrays;

public class TwoSquareArrays {
    public static int[] collectArray(int[][] left, int[][] right) {
        int[] rsl = new int[left.length * right.length];
        int counter = 0;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                rsl[counter] = Math.max(left[i][j], right[i][j]);
                counter++;
            }
        }
        return rsl;
    }
}
