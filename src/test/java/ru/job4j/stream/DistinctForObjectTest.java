package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DistinctForObjectTest {
    @Test
    public void test() {
        DistinctForObject.User user1 = new DistinctForObject.User("A", 20);
        DistinctForObject.User user2 = new DistinctForObject.User("B", 20);
        DistinctForObject.User user3 = new DistinctForObject.User("A", 21);
        DistinctForObject.User user4 = new DistinctForObject.User("A", 20);
        assertEquals(
                List.of(user1, user2, user3),
                DistinctForObject.distinct(List.of(
                        user1, user2, user3, user4
                ))
        );
    }
}