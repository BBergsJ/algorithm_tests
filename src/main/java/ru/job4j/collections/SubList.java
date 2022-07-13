package ru.job4j.collections;

import java.util.List;

public class SubList {
    public static List<String> getElementsBetweenIndexes(List<String> list, String el) {
        if (!list.contains(el)) {
            return List.of();
        }
        return list.subList(list.indexOf(el), list.lastIndexOf(el));
    }
}
