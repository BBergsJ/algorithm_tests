package ru.job4j.arrays;

public class PositiveOrNegative {
    public static boolean check(int[] data) {
        int sum = 0;
        for (int i : data) {
            sum = i < 0 ? sum + 1 : sum;
        }
        return sum % 2 != 0;
    }
}
