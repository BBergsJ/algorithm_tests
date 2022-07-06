package ru.job4j.arrays;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] >= up || data[i] <= down) {
                if (result[count] == null) {
                    result[count] = new int[]{i, i};
                } else {
                    result[count][1] = i;
                    count++;
                }
            }
        }
        if (result[0] != null && result[1] == null) {
            count = 1;
        }
        return Arrays.copyOf(result, count);
    }
}