package ru.job4j.arrays;

public class WordsToText {
    public static String convert(String[] words) {
        String result = "";
        for (int i = 0; i < words.length; i++) {
            result += words[i];
            if (i + 1 < words.length) {
                result = result + " ";
            }
        }
        return result;
    }
}