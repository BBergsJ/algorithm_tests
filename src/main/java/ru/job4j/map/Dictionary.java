package ru.job4j.map;

import java.util.*;

public class Dictionary {
    public static Map<String, List<String>> collectData(String[] strings) {
        Map<String, List<String>> rsl = new HashMap<>();
        for (String s : strings) {
            String element = String.valueOf(s.charAt(0));
            rsl.putIfAbsent(element, new ArrayList<>());
            rsl.get(element).add(s);
        }
        return rsl;
    }
}