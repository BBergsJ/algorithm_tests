package ru.job4j.arrays;

public class DestroySequence {
    public static char[] destroy(char[] seq) {
        char[] rsl = new char[seq.length];
        for (int i = 0; i < seq.length; i++) {
            rsl[i] = seq[seq.length - 1 - i];
        }
        return rsl;
    }
}
