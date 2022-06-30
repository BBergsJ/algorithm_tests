package ru.job4j.arrays;

public class RightShift {

    public static void shift(int[] nums, int count) {
        while (count-- > 0) {
            shift(nums);
        }
    }

    // метод делает сдвиг с шагом 1
    private static void shift(int[] nums) {
        for (int i = nums.length - 1; i > 0; i--) {
            int tmp1 = nums[i - 1];
            nums[i - 1] = nums[i];
            nums[i] = tmp1;
        }
    }
}