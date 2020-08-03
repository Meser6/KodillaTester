package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumberCheckerTestSuite {

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 12, 0, -3, -9, -15})
    public void shouldReturnTrueForNumberDivisibleByThree(int number) {
        NumberChecker numberChecker = new NumberChecker();
        boolean x = numberChecker.isDivisibleByThree(number);
        assertTrue(x);
    }

    @ParameterizedTest
    @ValueSource(ints = {-1, -5, 1, 8})
    public void shouldReturnFalseForNumberNotDivisibleByThree(int number) {
        NumberChecker numberChecker = new NumberChecker();
        boolean x = numberChecker.isDivisibleByThree(number);
        assertFalse(x);
    }
}
