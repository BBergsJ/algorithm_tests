package ru.job4j.arrays;

import java.util.Arrays;

public class NumberToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(resolve(12344)));
    }
    public static int[] resolve(int number) {
        int[] rsl = new int[Integer.toString(number).length()];
        for (int i = 0; i < rsl.length; i++) {
            rsl[i] = Integer.parseInt(String.valueOf(String.valueOf(number).charAt(rsl.length - 1 - i)));
        }
        return rsl;
    }
}
