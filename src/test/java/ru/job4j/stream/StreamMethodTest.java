package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StreamMethodTest {
    @Test
    public void whenUserStreamMethod() {
        assertEquals(3, StreamMethod.createStream(
                List.of(1, 2, 3)
        ).count());
    }
}