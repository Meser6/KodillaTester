package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.NullAndEmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class StringValidatorTestSuite {

    @ParameterizedTest
    @ValueSource(strings = {"", " ", "   "})
    public void noneText(String string) {
        StringValidator stringValidator = new StringValidator();
        boolean x = stringValidator.isBlank(string);
        assertTrue(x);
    }

    @ParameterizedTest
    @ValueSource(strings = {".", "xx", " b  ", "6"})
    public void text(String string) {
        StringValidator stringValidator = new StringValidator();
        boolean x = stringValidator.isBlank(string);
        assertFalse(x);
    }

    @ParameterizedTest
    @NullAndEmptySource
    public void nullText(String string) {
        StringValidator stringValidator = new StringValidator();
        boolean x = stringValidator.isBlank(string);
        assertTrue(x);
    }
}
