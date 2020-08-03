package com.kodilla.parametrized_tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class StringManipulatorTestSuite {

    @ParameterizedTest
    @CsvSource(value = {"test, tset", "OtHEr,rehto", "EVent,tneve", "null,llun", "A,a"})
    public void test(String input, String expected){
        StringManipulator stringManipulator = new StringManipulator();

    }
}
