package ru.job4j.arrays;

import java.util.Arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int elements = (int) Arrays.stream(array).flatMapToInt(Arrays::stream).count();
        int size = (int) Math.ceil(Math.sqrt(elements));
        int[][] rsl = new int[size][size];
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                rsl[counter / size][counter % size] = array[i][j];
                counter++;
            }
        }
        return rsl;
    }
}