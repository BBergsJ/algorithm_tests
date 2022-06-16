package ru.job4j.arrays;

import java.util.Arrays;

public class EvenSumElements {
    public static boolean checkArray(int[] data) {
        return Arrays.stream(data).sum() % 2 == 0;
    }
}