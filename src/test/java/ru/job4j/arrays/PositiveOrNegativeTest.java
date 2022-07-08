package ru.job4j.arrays;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

class PositiveOrNegativeTest {
    @Test
    public void checkTrue() {
        int[] data = {-5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative.check(data);
        assertThat(check, is(true));
    }

    @Test
    public void checkFalse() {
        int[] data = {-6, -5, -4, -3, -2, -1, 1, 2, 3, 4, 5};
        boolean check = PositiveOrNegative.check(data);
        assertThat(check, is(false));
    }
}