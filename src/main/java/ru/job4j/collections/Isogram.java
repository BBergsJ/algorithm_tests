package ru.job4j.collections;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Isogram {
    public static boolean checkString(String s) {
        Set<String> rsl = new HashSet<>(List.of(s.split("")));
        return rsl.size() == s.length();
    }
}
