package ru.job4j.arrays;

public class RandomDream {
    public static String random(String[] prizes, int num) {
//        return num % prizes.length == 1
//                ? prizes[0]
//                : num % prizes.length == 2
//                ? prizes[1]
//                : num % prizes.length == 3
//                ? prizes[2]
//                : num % prizes.length == 0
//                ? prizes[3]
//                : "null";
        return prizes[num % prizes.length == 0
                ? prizes.length - 1
                : num % prizes.length - 1];
    }
}
