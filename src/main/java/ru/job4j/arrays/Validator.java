package ru.job4j.arrays;

import java.util.Arrays;

public class Validator {
    public static boolean checkArray(int[] data, int value) {
        int counter = (int) Arrays.stream(data).filter(i -> i == value).count();
        return counter <= (data.length / 2);
    }
}
