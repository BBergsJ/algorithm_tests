package ru.job4j.arrays;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] rsl = new int[data.length * data.length];
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                rsl[i * data.length + j] = data[i][j];
            }
        }
        return rsl;
    }
}