package ru.job4j.map;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Task15Test {
    @Test
    public void eachSequenceOfSameSymbolsOnSeparateLine() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        System.setOut(new PrintStream(out));
        Task15.main(null);
        String expected = String.format("+++%S!!!!%S??", System.lineSeparator(), System.lineSeparator());
        assertThat(out.toString(), is(expected));
    }
}