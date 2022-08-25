package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DropWhileMethodTest {
    @Test
    public void test() {
        assertEquals(
                List.of(1, 2, 3),
                DropWhileMethod.dropWhile(List.of(3, 2, 1, -1, -2))
        );
    }
}