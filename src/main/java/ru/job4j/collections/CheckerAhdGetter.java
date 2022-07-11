package ru.job4j.collections;

import java.util.List;

public class CheckerAhdGetter {
    public static String getElement(List<String> list) {
        if (list.isEmpty()) {
            return "";
        } else {
            return list.get(0);
        }
    }
}