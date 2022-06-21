package ru.job4j.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InitialsTest {
    @Test
    public void test() {
        assertEquals("Иванов И.И.", Initials.convert(new String[] {"Иванов", "Иван", "Иваныч"}));
        assertEquals("Григорьев И.Н.", Initials.convert(new String[] {"Григорьев", "Игорь", "Николаевич"}));
    }
}