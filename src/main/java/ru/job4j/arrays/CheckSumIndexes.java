package ru.job4j.arrays;

import java.util.Arrays;

public class CheckSumIndexes {
    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };
        collectNewArray(data, 3);
    }

    public static int[] collectNewArray(int[][] data, int sum) {
        int[] rsl = new int[data.length * data[0].length];
        int zero = 0;
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (i + j == sum) {
                    zero++;
                } else {
                    rsl[counter++] = data[i][j];
                }
            }
        }
        return Arrays.copyOf(rsl, rsl.length - zero);
    }
}