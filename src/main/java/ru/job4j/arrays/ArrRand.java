package ru.job4j.arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ArrRand {
    public static void main(String[] args) {
        int[] arr = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Random random = ThreadLocalRandom.current();
        for (int i = 0; i < arr.length; i++) {
            int r = random.nextInt(arr.length);
            int tmp = arr[r];
            arr[r] = arr[i];
            arr[i] = r;
        }
        Arrays.stream(arr).forEach(System.out::print);
    }
}