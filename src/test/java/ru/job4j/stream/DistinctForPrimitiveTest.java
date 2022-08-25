package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistinctForPrimitiveTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                DistinctForPrimitive.collect(new int[] {1, 2, 3, 1, 2, 3})
        );
    }
}