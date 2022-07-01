package ru.job4j.arrays;

import java.util.Arrays;

public class Split {
    public static char[][] split(char[] str, char c) {
        char[][] result = new char[str.length / 2][str.length];
        int rowCount = 0;
        int cellCount = 0;
        for (int i = 0; i < str.length; i++) {
            if (str[i] == c) {
                result[rowCount] = Arrays.copyOf(result[rowCount], cellCount);
                cellCount = 0;
                rowCount++;
            } else {
                result[rowCount][cellCount++] = str[i];
            }
        }
        result[rowCount] = Arrays.copyOf(result[rowCount], cellCount);
        return Arrays.copyOf(result, rowCount + 1);

//        char[][] result = new char[str.length / 2][];
//        char[] temp = new char[str.length];
//        int commonCount = 0;
//        int index = 0;
//        for (char value : str) {
//            if (value != c) {
//                temp[index++] = value;
//            } else {
//                result[commonCount] = Arrays.copyOf(temp, index);
//                commonCount++;
//                index = 0;
//            }
//        }
//        result[commonCount] = Arrays.copyOf(temp, index);
//        return Arrays.copyOf(result, commonCount + 1);
    }
}