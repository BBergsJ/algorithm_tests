package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class RangeMethodTest {
    @Test
    public void test() {
        List<Integer> result = RangeMethod.createStream(1, 3).boxed().collect(Collectors.toList());
        List<Integer> expect = List.of(1, 2, 3);
        assertEquals(expect, result);
    }
}