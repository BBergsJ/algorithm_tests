package ru.job4j.sort;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.jupiter.api.Assertions.*;

class SortBySetUsingComparatorTest {
    @Test
    public void test() {
        List<String> input = Arrays.asList("1", "2", "3", "4", "5");
        Set<String> result = SortBySetUsingComparator.sort(input);
        Set<String> expect = new TreeSet<>(Set.of("5", "4", "3", "2", "1"));
        Assert.assertEquals(expect, result);
    }
}