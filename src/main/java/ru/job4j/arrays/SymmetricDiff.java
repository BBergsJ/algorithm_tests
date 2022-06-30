package ru.job4j.arrays;

import java.util.Arrays;

public class SymmetricDiff {
    public static int[] diff(int[] left, int[] right) {
        int[] rsl = new int[left.length + right.length];
        int counter = 0, l = 0, r = 0;
        while (l < left.length && r < right.length) {
            if (left[l] == right[r]) {
                l++;
                r++;
            } else if (left[l] < right[r]) {
                rsl[counter++] = left[l++];
            } else {
                rsl[counter++] = right[r++];
            }
            if (l == left.length) {
                while (r != right.length) {
                    rsl[counter++] = right[r++];
                }
            } else if (r == right.length) {
                while (l != left.length) {
                    rsl[counter++] = left[l++];
                }
            }
        }
        return left.length == 0
                ? right
                : right.length == 0
                ? left
                : Arrays.copyOf(rsl, counter);
//        for (int i = 0; i < left.length; i++) {
//            for (int j = 0; j < right.length; j++) {
//                if (left[i] == right[j]) {
//                    checker = false;
//                    break;
//                }
//            }
//            if (checker) {
//                rsl[counter++] = left[i];
//            }
//            checker = true;
//        }
//
//        for (int i = 0; i < right.length; i++) {
//            for (int j = 0; j < left.length; j++) {
//                if (right[i] == left[j]) {
//                    checker = false;
//                    break;
//                }
//            }
//            if (checker) {
//                rsl[counter++] = right[i];
//            }
//            checker = true;
//        }
//        return Arrays.copyOf(rsl, counter);
    }
}
