package ru.job4j.map;

import java.util.Map;
import java.util.TreeMap;

public class MostUsedCharacter {
    public static char getMaxCount(String str) {
        Map<Character, Integer> map = new TreeMap<>();
        String tmp =  str.toLowerCase().replaceAll("\\s+", "");
        for (Character c : tmp.toCharArray()) {
            map.computeIfPresent(c, (k, v) -> v + 1);
            map.putIfAbsent(c, 1);
        }
        char rsl = ' ';
        int i = 0;
        for (Character c : map.keySet()) {
            if (map.get(c) > i) {
                i = map.get(c);
                rsl = c;
            }
        }
        return rsl;
    }
}