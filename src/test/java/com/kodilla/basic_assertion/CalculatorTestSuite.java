package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        assertEquals(13, calculator.sum(a, b));
    }

    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        assertEquals(-3, calculator.sub(a, b));/*Review kdrzazga - pls move to a new test*/
    }

    public void testPow() {
        Calculator calculator = new Calculator();
        int a = 5;
        assertEquals(25, calculator.pow(a));/* Review kdrzazga - pls move to a new test*/

    }
}
