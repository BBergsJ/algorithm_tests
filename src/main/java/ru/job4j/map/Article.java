package ru.job4j.map;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Article {
    public static boolean generateBy(String origin, String line) {
        Set<String> originSplitted = new HashSet<>(List.of(origin.toLowerCase().replaceAll("\\p{Punct}", "").split(" ")));
        Set<String> lineSplitted = new HashSet<>(List.of(line.toLowerCase().replaceAll("\\p{Punct}", "").split(" ")));
        return originSplitted.containsAll(lineSplitted);

//        HashSet<String> originSet = new HashSet<>(Arrays.asList(origin.split("[ ,!.;:]")));
//        HashSet<String> lineSet = new HashSet<>(Arrays.asList(line.split("[ ,!.;:]")));
//        boolean result = true;
//
//        for (String s : lineSet) {
//            if (!originSet.contains(s)) {
//                result = false;
//                break;
//            }
//        }
//
//        return result;
    }
}