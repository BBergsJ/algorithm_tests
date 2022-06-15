package ru.job4j.arrays;

import java.util.Arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int counter = (int) Arrays.stream(array).flatMapToInt(Arrays::stream).count();
        int size = (int) Math.ceil(Math.sqrt(counter));
        int[][] rsl = new int[size][size];
        int row = 0;
        int column = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (column == size) {
                    column = 0;
                    row++;
                }
                rsl[row][column] = array[i][j];
                column++;
            }
        }
        return rsl;
    }
}
