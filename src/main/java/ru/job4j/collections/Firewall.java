package ru.job4j.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Firewall {
    public static String checkName(String s, Set<String> words) {
        String rsl = "Вы сделали правильный выбор!";
        Set<String> tmp = new HashSet<>(List.of(s.split(" ")));
        for (String t : tmp) {
            if (words.contains(t)) {
                return "Выберите другую статью...";
            }
        }
        return rsl;
    }
}