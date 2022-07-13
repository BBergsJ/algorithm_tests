package ru.job4j.collections;

import java.util.List;

public class RepositionElement {
    public static List<String> changePosition(List<String> list, int index) {
        String tmp = list.remove(list.size() - 1);
        if (index < list.size() - 1) {
            list.set(index, tmp);
        }
        return list;
    }
}