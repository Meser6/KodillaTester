package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTestSuite {

    @Autowired
    private Display displayBean;

    @Autowired
    private Calculator calculatorBean;

    @Test
    public void shouldGetGoodText() {
        String display = displayBean.display(513.5);
        Assertions.assertEquals("Score: 513.5", display);
    }

    @Test
    public void shouldGetGoodValueIfAdd() {
        double add = calculatorBean.add(5, 10.5);
        Assertions.assertEquals(15.5, add);
    }

    @Test
    public void shouldGetGoodValueIfSubtract() {
        double sub = calculatorBean.subtract(5.5, 10);
        Assertions.assertEquals(-4.5, sub);
    }

    @Test
    public void shouldGetGoodValueIfMultiply() {
        double mul = calculatorBean.multiply(5, 6);
        Assertions.assertEquals(30.0, mul);
    }


    @Test
    public void shouldGetGoodValueIfDivideWithGoodValue() throws WrongNumber {
        double divide = calculatorBean.divide(50, 10);
        Assertions.assertEquals(5.0, divide);
    }

    @Test
    public void Should_get_good_value_if_divide_with_wrong_value() {
        assertThrows(WrongNumber.class, () -> calculatorBean.divide(50, 0));
    }

}