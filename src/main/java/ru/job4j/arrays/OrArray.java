package ru.job4j.arrays;

import java.util.Arrays;

public class OrArray {
    public static int[] or(int[] left, int[] right) {
        int[] tmp = Arrays.copyOf(left, left.length + right.length);
        int size = left.length;
        boolean checker = true;
        for (int i : right) {
            for (int t : tmp) {
                if (i == t) {
                    checker = false;
                    break;
                }
            }
            if (checker) {
                tmp[size++] = i;
            }
            checker = true;
        }
        return Arrays.copyOf(tmp, size);
    }
}
