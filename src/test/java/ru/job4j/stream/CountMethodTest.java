package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CountMethodTest {
    @Test
    public void test() {
        assertEquals(3, CountMethod.count(List.of(1, 2, 3).stream()));
    }
}