package ru.job4j.arrays;

import java.util.Arrays;

public class ToUpperCase {
    public static char[] onlyLowCase(char[] input) {
        char[] rsl = new char[input.length];
        int size = 0;
        for (char c : input) {
            if (Character.isLetter(c) && Character.isLowerCase(c)) {
                rsl[size++] = Character.toUpperCase(c);
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}