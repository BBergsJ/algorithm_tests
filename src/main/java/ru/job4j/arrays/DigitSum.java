package ru.job4j.arrays;

public class DigitSum {
    public static int sum(int num) {
        int sum = 0;
        for (; num > 0; num /= 10) {
            sum += num % 10;
        }
        return sum;
    }
}
