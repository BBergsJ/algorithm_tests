package ru.job4j.arrays;

import java.util.Arrays;

public class ArrayWithoutEvenElements {
    public static int[] changeData(int[] data) {
        int[] rsl = new int[data.length];
        int counter = 0;
        for (int i : data) {
            if (i % 2 != 0) {
                rsl[counter] = i;
                counter++;
            }
        }
        return Arrays.copyOf(rsl, counter);
    }
}