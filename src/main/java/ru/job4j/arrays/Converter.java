package ru.job4j.arrays;

import java.util.Arrays;

public class Converter {
    public static int[][] convertInSquareArray(int[][] array) {
        int elements = (int) Arrays.stream(array).flatMapToInt(Arrays::stream).count();
        int size = (int) Math.ceil(Math.sqrt(elements));
        int[][] rsl = new int[size][size];
        int counter = 0;
        for (int[] ints : array) {
            for (int anInt : ints) {
                rsl[counter / size][counter % size] = anInt;
                counter++;
            }
        }
        return rsl;
    }
}