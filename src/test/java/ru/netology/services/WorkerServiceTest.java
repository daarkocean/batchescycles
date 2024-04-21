package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WorkerServiceTest {

    @Test
    public void ShouldCalculate1() {
        WorkerService service = new WorkerService();

        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void ShouldCalculate2() {
        WorkerService service = new WorkerService();

        int income = 100_000;
        int expenses = 60_000;
        int threshold = 150_000;

        int actual = service.calculate(income, expenses, threshold);
        int expected = 2;

        Assertions.assertEquals(expected, actual);
    }
}