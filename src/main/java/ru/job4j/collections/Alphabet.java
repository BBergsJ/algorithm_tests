package ru.job4j.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Alphabet {
    public static String reformat(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        List<String> tmp = Arrays.asList(s.split(""));
        tmp.sort(String::compareTo);
        tmp.forEach(stringBuilder::append);
        return stringBuilder.toString();
    }
}
