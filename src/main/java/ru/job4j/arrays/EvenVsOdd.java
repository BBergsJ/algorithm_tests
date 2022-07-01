package ru.job4j.arrays;

public class EvenVsOdd {
    public static int whoWin(int[] players) {
        int a = 0, b = 1;
        for (int i = 0; i < players.length - 1; i++) {
            a += players[i++];
            b += players[i++];
        }
        return a > b
                ? 1
                : a < b
                ? 2
                : 0;
    }
}