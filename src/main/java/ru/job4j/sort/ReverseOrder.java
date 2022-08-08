package ru.job4j.sort;

import java.util.Comparator;

public class ReverseOrder {
    public static Comparator<String> reverseOrder() {
        return Comparator.reverseOrder();
    }
}
