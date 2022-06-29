package ru.job4j.arrays;

public class Recursi {
    public static void main(String[] args) {
        in(5, new int[]{1, 2, 3, 4, 5});
    }

    public static void in(int i, int[] numbers) {
        if (i > 0) {
            in(i - 1, numbers);
            System.out.print(numbers[numbers.length - i]);
        }
    }
}