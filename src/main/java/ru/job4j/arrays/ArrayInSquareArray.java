package ru.job4j.arrays;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int[][] rsl = new int[array.length / 2][];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                rsl[i][j] = i * rsl.length + j  > array.length - 1 ? array[i * rsl.length + j] : 0;
            }
        }
        return rsl;
    }
}