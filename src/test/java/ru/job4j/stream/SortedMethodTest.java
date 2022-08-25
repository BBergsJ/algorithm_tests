package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SortedMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("a", "b", "c"),
                SortedMethod.sorted(List.of("c", "b", "a"))
        );
    }
}