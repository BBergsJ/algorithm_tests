package ru.job4j.arrays;

import java.util.Arrays;

public class SumWithStopEl {
    public static int count(int[] data, int el) {
        int sum = Arrays.stream(data).takeWhile(i -> i != el).sum();
        return sum % 2 == 0 ? sum : 0;
    }
}