package ru.job4j.arrays;

public class UpperCase {
    public static char[] toUpperCase(char[] string) {
        char[] rsl = new char[string.length];
        for (int i = 0; i < string.length; i++) {
            rsl[i] = Character.toUpperCase(string[i]);
        }
        return rsl;
    }
}
