package ru.job4j.collections;

import java.util.List;

public class UniqueElement {
    public static boolean checkList(List<String> list, String str) {
        return list.indexOf(str) == list.lastIndexOf(str)
                && list.indexOf(str) != -1;
    }
}