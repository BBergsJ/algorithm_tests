package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class NoneMatchMethodTest {
    @Test
    public void test() {
        assertTrue(NoneMatchMethod.check(List.of("1", "2", "3")));
        assertFalse(NoneMatchMethod.check(List.of("1", "", "3")));
    }
}