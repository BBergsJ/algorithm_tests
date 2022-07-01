package ru.job4j.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SplitTest {
    @Test
    public void test() {
        assertArrayEquals(new String[] {"one", "two"}, convert(Split.split("one two".toCharArray(), ' ')));
        assertArrayEquals(new String[] {"one", "two", "three"}, convert(Split.split("one two three".toCharArray(), ' ')));
        assertArrayEquals(new String[] {"onetwothree"}, convert(Split.split("onetwothree".toCharArray(), ' ')));
    }

    private String[] convert(char[][] splitted) {
        String[] result = new String[splitted.length];
        int ri = 0;
        for (char[] row : splitted) {
            result[ri++] = new String(row);
        }
        return result;
    }
}