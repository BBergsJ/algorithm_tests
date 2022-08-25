package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LimitMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of("A", "B", "C"),
                LimitMethod.firstThree(List.of("A", "B", "C", "D", "E"))
        );
    }
}