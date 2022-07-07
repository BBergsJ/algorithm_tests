package ru.job4j.arrays;

import java.util.Arrays;

public class Anomaly {
    public static int[][] found(int[] data, int up, int down) {
        int[][] result = new int[data.length][];
        int count = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] <= down || data[i] >= up) {
                result[count] = new int[]{i, i};
                while (i < data.length && (data[i] <= down || data[i] >= up)) {
                    result[count][1] = i;
                    i++;
                }
                count++;
            }
        }
        return Arrays.copyOf(result, count);

//        int[][] result = new int[data.length][];
//        int count = 0;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] >= up || data[i] <= down) {
//                if (result[count] == null) {
//                    result[count] = new int[]{i, i};
//                } else {
//                    result[count][1] = i;
//                    count++;
//                }
//            }
//        }
//        if (result[0] != null && result[1] == null) {
//            count = 1;
//        }
//        return Arrays.copyOf(result, count);

//        int[][] result = new int[data.length][];
//        int count = 0;
//        for (int i = 0; i < data.length; i++) {
//            if (data[i] >= up || data[i] <= down) {
//                int[] buffer = new int[2];
//                buffer[0] = i;
//                while (data[i] >= up || data[i] <= down) {
//                    buffer[1] = i;
//                    i++;
//                    if (data.length - 1 < i) {
//                        break;
//                    }
//                }
//                result[count++] = buffer;
//            }
//        }
//        return Arrays.copyOf(result, count);
    }
}