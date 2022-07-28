package ru.job4j.map;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        String tmp =  str.toLowerCase().replace(" ", "");
        for (Character c : tmp.toCharArray()) {
            map.computeIfPresent(c, (k, v) -> v + 1);
            map.putIfAbsent(c, 1);
        }
        char rsl = ' ';
        int i = 0;
        for (Map.Entry<Character, Integer> m : map.entrySet()) {
            if (m.getValue() > i) {
                i = m.getValue();
                rsl = m.getKey();
            }
        }
        return rsl;
    }
}