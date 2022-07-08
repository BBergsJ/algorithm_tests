package ru.job4j.arrays;

public class SubtractMinMax {
    public static int calculate(int[] ints) {
        int max = ints[0], min = ints[0];
        for (int i : ints) {
            if (i > max) {
                max = i;
            } else if (i < min) {
                min = i;
            }
        }
        return max - min;
    }
}