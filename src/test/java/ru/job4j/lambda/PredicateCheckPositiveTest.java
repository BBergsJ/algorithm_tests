package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PredicateCheckPositiveTest {
    @Test
    public void whenPositive() {
        assertTrue(PredicateCheckPositive.check(1));
        assertFalse(PredicateCheckPositive.check(-1));
        assertFalse(PredicateCheckPositive.check(0));
    }
}