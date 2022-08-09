package ru.job4j.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task5 {
    public static List<Integer> multiAssign(List<Task> tasks) {
        List<Integer> rsl = new ArrayList<>();
        Map<Integer, Integer> rslMap = new HashMap<>();
        for (Task task : tasks) {
            rslMap.computeIfPresent(task.assignId(), (k, v) -> v + 1);
            rslMap.putIfAbsent(task.assignId(), 1);
        }
        for (Integer i : rslMap.keySet()) {
            if (rslMap.get(i) > 1) {
                rsl.add(i);
            }
        }
        return rsl;
    }

    public record Task(Integer taskId, Integer assignId) {
    }
}