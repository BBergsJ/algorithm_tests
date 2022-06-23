package ru.job4j.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordsToTextTest {
    @Test
    public void test() {
        assertEquals("Hello World", WordsToText.convert(new String[] {"Hello", "World"}));
        assertEquals("one two three", WordsToText.convert(new String[] {"one", "two", "three"}));
        assertEquals("one", WordsToText.convert(new String[] {"one"}));
    }
}