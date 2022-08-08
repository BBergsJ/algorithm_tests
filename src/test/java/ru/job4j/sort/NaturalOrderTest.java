package ru.job4j.sort;

import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.*;

class NaturalOrderTest {
    @Test
    public void test() {
        assertEquals(
                Comparator.naturalOrder()
                , NaturalOrder.naturalOrder()
        );
    }
}