package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SkipMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("C", "D", "E"),
                SkipMethod.lastThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}