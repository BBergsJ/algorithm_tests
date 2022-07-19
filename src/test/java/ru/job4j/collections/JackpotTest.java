package ru.job4j.collections;

import org.junit.jupiter.api.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class JackpotTest {
    @Test
    public void checkYourWinTrue() {
        String[] strings = {"@", "@", "@", "@"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(true));
    }

    @Test
    public void checkYourWinFalse() {
        String[] strings = {"&&", "&", "&&&", "&&&&"};
        boolean win = Jackpot.checkYourWin(strings);
        assertThat(win, is(false));
    }
}