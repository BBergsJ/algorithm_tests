package ru.job4j.arrays;

public class SumOfDifferences {
    public static int sum(int[] nums) {
//        int sum = 0;
//        for (int i = nums.length - 1; i > 0; i--) {
//            sum += nums[i] - nums[i - 1];
//        }
//        return sum * -1;

        int sum = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            sum += nums[i] - nums[i + 1];
        }
        return sum;
    }
}