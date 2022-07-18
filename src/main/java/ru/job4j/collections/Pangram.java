package ru.job4j.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Pangram {
    public static boolean checkString(String s) {
        Set<String> tmp = new HashSet<>(List.of(s.replace(" ", "").split("")));
        return tmp.size() == 26;
    }
}