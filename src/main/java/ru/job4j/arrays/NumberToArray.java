package ru.job4j.arrays;

import java.util.Arrays;

public class NumberToArray {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(resolve(12344)));
    }
    public static int[] resolve(int number) {
        int c = number;
        int[] rsl = new int[Integer.toString(number).length()];
        for (int i = 0; i < rsl.length; i++) {
            c = c % 10;
            rsl[i] = c;
        }
        return rsl;
    }
}
