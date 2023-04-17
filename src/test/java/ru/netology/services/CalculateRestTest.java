package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class CalculateRestTest {
    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/profit_and_loss.csv")
    void testMonthsRest(int expected, int income, int expenses, int threshold) {
        CalculateRest service = new CalculateRest();
        int actual = service.calcMonthsRest(income, expenses, threshold);
        Assertions.assertEquals(expected, actual);
    }
}




