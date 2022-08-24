package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AnyMatchMethodTest {
    @Test
    public void test() {
        assertTrue(AnyMatchMethod.check(List.of("academy", "job4j")));
        assertFalse(AnyMatchMethod.check(List.of("academy", "university")));
    }
}