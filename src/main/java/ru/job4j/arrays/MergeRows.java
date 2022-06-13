package ru.job4j.arrays;

public class MergeRows {
    public static int[] merge(int[][] data) {
        int[] rsl = new int[data.length * data.length];
        int counter = 0;
        for (int[] datum : data) {
            for (int i : datum) {
                rsl[counter++] = i;
            }
        }
        return rsl;
    }
}