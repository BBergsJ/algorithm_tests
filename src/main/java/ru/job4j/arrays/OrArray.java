package ru.job4j.arrays;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        if (left.length == 0) {
            return right;
        } else if (right.length == 0) {
            return left;
        }
        int[] rsl = Arrays.copyOf(left, left.length + right.length);
        int count = 0;


        return Arrays.copyOf(rsl, count);
    }
}
