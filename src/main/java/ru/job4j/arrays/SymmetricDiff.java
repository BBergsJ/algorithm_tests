package ru.job4j.arrays;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int counter = 0;
        boolean checker = true;
        for (int i = 0; i < left.length; i++) {
            for (int j = 0; j < right.length; j++) {
                if (left[i] == right[j]) {
                    checker = false;
                    break;
                }
            }
            if (checker) {
                rsl[counter++] = left[i];
            }
            checker = true;
        }

        for (int i = 0; i < right.length; i++) {
            for (int j = 0; j < left.length; j++) {
                if (right[i] == left[j]) {
                    checker = false;
                    break;
                }
            }
            if (checker) {
                rsl[counter++] = right[i];
            }
            checker = true;
        }
        return Arrays.copyOf(rsl, counter);
    }
}
