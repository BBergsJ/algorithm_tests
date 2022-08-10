package ru.job4j.lambda;

import org.junit.jupiter.api.Test;

import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.*;

class MRSupplierTest {
    @Test
    public void test() {
        Supplier<String> supplier = MRSupplier.supplier();
        assertEquals("", supplier.get());
    }
}