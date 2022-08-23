package ru.job4j.stream;

import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class AveragingMethodTest {
    @Test
    public void test() {
        AveragingMethod.Company c1 = new AveragingMethod.Company("Apple");
        AveragingMethod.Company c2 = new AveragingMethod.Company("Amazon");
        AveragingMethod.Company c3 = new AveragingMethod.Company("Microsoft");
        AveragingMethod.Worker w1 = new AveragingMethod.Worker(20, c1);
        AveragingMethod.Worker w2 = new AveragingMethod.Worker(25, c2);
        AveragingMethod.Worker w3 = new AveragingMethod.Worker(30, c2);
        AveragingMethod.Worker w4 = new AveragingMethod.Worker(35, c3);
        AveragingMethod.Worker w5 = new AveragingMethod.Worker(40, c3);
        AveragingMethod.Worker w6 = new AveragingMethod.Worker(45, c3);

        Map<String, Double> expect = Map.of(
                "Apple", 20D,
                "Amazon", 27.5D,
                "Microsoft", 40D
        );
        assertEquals(expect, AveragingMethod.averaging(List.of(w1, w2, w3, w4, w5, w6)));
    }
}