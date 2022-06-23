package ru.job4j.arrays;

import java.util.Arrays;

public class NumberToArray {

    public static int[] resolve(int number) {
        int[] rsl = new int[Integer.toString(number).length()];
        for (int i = 0; i < rsl.length; i++, number /= 10) {
            rsl[i] = number % 10;
        }
        return rsl;
    }
}