package ru.job4j.lambda;

import java.util.List;
import java.util.Optional;

public class OptionalOfNullable {
    public static Optional<String> findValue(List<String> strings, String value) {
        for (String s : strings) {
            if (Optional.ofNullable(s).equals(Optional.ofNullable(value))) {
                return Optional.ofNullable(s);
            }
        }
        return Optional.empty();
    }
}