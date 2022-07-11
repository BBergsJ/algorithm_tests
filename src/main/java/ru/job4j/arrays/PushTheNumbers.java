package ru.job4j.arrays;

public class PushTheNumbers {
    public static void push(int[][] array, int row, int column) {
//        for (int one = array[row].length - 1; one > column; one--) {
//            array[row][one] = array[row][one - 1];
//        }
//        for (int two = 0; two < column; two++) {
//            array[row][two] = array[row][two + 1];
//        }
//        for (int tree = array.length - 1; tree > row; tree--) {
//            array[tree][column] = array[tree - 1][column];
//        }
//        for (int four = 0; four < row; four++) {
//            array[four][column] = array[four + 1][column];
//        }
//        array[row][column] = 0;

        for (int i = array[row].length - 1; i > column; i--) {
            array[row][i] = array[row][i - 1];
            if (i > row) {
                array[i][column] = array[i - 1][column];
            }
        }
        for (int j = 0; j < array.length; j++) {
            if (j < column) {
                array[row][j] = array[row][j + 1];
            }
            if (j < row) {
                array[j][column] = array[j + 1][column];
            }
        }
        array[row][column] = 0;
    }
}