package ru.job4j.map;

import java.util.*;

public class Concordance {
    public static Map<Character, List<Integer>> collectCharacters(String s) {
        Map<Character, List<Integer>> rsl = new HashMap<>();
        char[] tmp = s.toCharArray();
        for (int i = 0; i < s.length(); i++) {
            if (tmp[i] != ' ') {
                rsl.putIfAbsent(tmp[i], new ArrayList<>());
                rsl.get(tmp[i]).add(i);
            }
        }
        return rsl;
    }
}