package ru.job4j.sort;

public class CompareMethod {
    public static int ascendingCompare(int first, int second) {
        return first == second
                ? 0
                : first > second
                ? 1
                : -1;
    }
    public static int descendingCompare(int first, int second) {
        return first == second
                ? 0
                : first > second
                ? -1
                : 1;
    }
}