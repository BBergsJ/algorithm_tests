package ru.job4j.lambda;

import java.util.Arrays;
import java.util.Optional;

public class OptionalIfPresent {
    public static void ifPresent(int[] data) {
        max(data).ifPresent(x -> System.out.println("Max: " + x));
    }

    private static Optional<Integer> max(int[] data) {
        //        return data.length == 0 ? Optional.empty() : Optional.of(Arrays.stream(data).max().getAsInt());
        if (data.length == 0) {
            return Optional.empty();
        }
        Arrays.sort(data);
        return Optional.of(data[data.length - 1]);
    }
}