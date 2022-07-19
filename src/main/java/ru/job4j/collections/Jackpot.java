package ru.job4j.collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Jackpot {
    public static boolean checkYourWin(String[] combination) {
        Set<String> rsl = new HashSet<>(Arrays.asList(combination));
        return rsl.size() == 1;
    }
}
