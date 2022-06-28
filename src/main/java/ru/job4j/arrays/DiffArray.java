package ru.job4j.arrays;

import java.util.Arrays;

public class DiffArray {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int counter = 0;
        for (int i : left) {
            for (int j : right) {
                if (i == j) {
                    break;
                }
                rsl[counter++] = i;
            }
        }
        return right.length == 0 ? left : Arrays.copyOf(rsl, counter);
    }
}