package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FilterStringTest {
    @Test
    public void test() {
        List<String> list = List.of("Abc.java", "abc.java", "Abc");
        assertEquals(List.of("Abc.java"), FilterString.filter(list));
    }
}