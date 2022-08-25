package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StringMapTest {
    @Test
    public void test() {
        List<String> input = List.of("One", "Two");
        List<String> expect = List.of("One.java", "Two.java");
        assertEquals(expect, StringMap.map(input));
    }
}