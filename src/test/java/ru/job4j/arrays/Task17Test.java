package ru.job4j.arrays;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task17Test {
    @Test
    public void shouldOutputSqrAndCubeOf6() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task17.main(null);
        String expected = "6" + System.lineSeparator() + "36" + System.lineSeparator() + "216";
        assertThat(out.toString(), is(expected));
    }
}