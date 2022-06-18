package ru.job4j.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class ValidatorTest {
    @Test
    public void checkArrayFalse() {
        int[] data = {1, 2, 1, 3, 1, 4, 1};
        int value = 1;
        boolean rsl = Validator.checkArray(data, value);
        assertThat(rsl, is(false));
    }

    @Test
    public void checkArrayTrue() {
        int[] data = {1, 2, 3, 1, 4, 1, 5, 6, 7, 1, 8, 9};
        int value = 1;
        boolean rsl = Validator.checkArray(data, value);
        assertThat(rsl, is(true));
    }

    @Test
    public void checkArrayTrue2() {
        int[] data = {1, 2, 3, 1, 1, 1, 2, 6, 7, 1, 8};
        int value = 1;
        boolean rsl = Validator.checkArray(data, value);
        assertThat(rsl, is(true));
    }
}