package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicateCheckEvenTest {
    @Test
    public void test() {
        assertTrue(PredicateCheckEven.check(2));
        assertFalse(PredicateCheckEven.check(1));
    }
}