package ru.job4j.arrays;

public class ArrayInSquareArray {
    public static int[][] convertArray(int[] array) {
        int size = (int) Math.ceil(Math.sqrt(array.length));
        int[][] rsl = new int[size][size];
        for (int i = 0; i < rsl.length; i++) {
            for (int j = 0; j < rsl.length; j++) {
                rsl[i][j] = i * rsl.length + j < array.length ? array[i * rsl.length + j] : 0;
            }
        }
        return rsl;
    }
}