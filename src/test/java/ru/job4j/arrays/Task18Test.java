package ru.job4j.arrays;

import org.junit.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.StringJoiner;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;
class Task18Test {
    @Test
    public void checkOutHelloJob4j() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        String input = String.format("%f %f", 33.3, 33.3);
        System.setIn(new ByteArrayInputStream(
                input.getBytes()
        ));
        System.setOut(new PrintStream(out));
        Task18.main(null);
        String expected = new StringJoiner(
                System.lineSeparator(), "", System.lineSeparator()
        )
                .add("133.2")
                .add("209.2")
                .add("3483.7")
                .toString();
        assertThat(out.toString(), is(expected));
    }
}