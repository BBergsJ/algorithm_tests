package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class OptionalFilterTest {
    @Test
    public void notExistAndNeedChild() {
        OptionalFilter.Child c1 = new OptionalFilter.Child("c1", 15);
        OptionalFilter.Child c2 = new OptionalFilter.Child("c2", 18);
        OptionalFilter.Child c3 = new OptionalFilter.Child("c1", 11);
        OptionalFilter.Child c4 = new OptionalFilter.Child("c2", 15);
        OptionalFilter.Worker worker1 = new OptionalFilter.Worker("123", List.of(c1, c2));
        OptionalFilter.Worker worker2 = new OptionalFilter.Worker("456", List.of(c3, c4));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void notExistAndChildrenOld() {
        OptionalFilter.Child c1 = new OptionalFilter.Child("c1", 15);
        OptionalFilter.Child c2 = new OptionalFilter.Child("c2", 18);
        OptionalFilter.Child c3 = new OptionalFilter.Child("c1", 20);
        OptionalFilter.Child c4 = new OptionalFilter.Child("c2", 15);
        OptionalFilter.Worker worker1 = new OptionalFilter.Worker("123", List.of(c1, c2, c3));
        OptionalFilter.Worker worker2 = new OptionalFilter.Worker("456", List.of(c4));
        assertEquals(List.of(), OptionalFilter.defineChildren(List.of(worker1, worker2), "123"));
    }

    @Test
    public void whenExists() {
        OptionalFilter.Child c1 = new OptionalFilter.Child("c1", 15);
        OptionalFilter.Child c2 = new OptionalFilter.Child("c2", 13);
        OptionalFilter.Child c3 = new OptionalFilter.Child("c1", 10);
        OptionalFilter.Child c4 = new OptionalFilter.Child("c2", 15);
        OptionalFilter.Worker worker1 = new OptionalFilter.Worker("123", List.of(c1, c2, c3));
        OptionalFilter.Worker worker2 = new OptionalFilter.Worker("456", List.of(c4));
        assertEquals(2, OptionalFilter.defineChildren(List.of(worker1, worker2), "123").size());
    }
}