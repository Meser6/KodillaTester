package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertThrows;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void Should_get_good_text() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Display displayBean = applicationContext.getBean(Display.class);
        String display = displayBean.display(513.5);
        Assertions.assertEquals("Score: 513.5", display);
    }

    @Test
    public void Should_get_good_value_if_add() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = applicationContext.getBean(Calculator.class);
        double add = calculatorBean.add(5, 10.5);
        Assertions.assertEquals(15.5, add);
    }

    @Test
    public void Should_get_good_value_if_subtract() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = applicationContext.getBean(Calculator.class);
        double sub = calculatorBean.subtract(5.5, 10);
        Assertions.assertEquals(-4.5, sub);
    }

    @Test
    public void Should_get_good_value_if_multiply() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = applicationContext.getBean(Calculator.class);
        double mul = calculatorBean.multiply(5, 6);
        Assertions.assertEquals(30.0, mul);
    }


    @Test
    public void Should_get_good_value_if_divide_with_good_value() throws WrongNumber {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection.homework");
        Calculator calculatorBean = applicationContext.getBean(Calculator.class);
        double divide = calculatorBean.divide(50, 10);
        Assertions.assertEquals(5.0, divide);
    }

    @Test
    public void Should_get_good_value_if_divide_with_wrong_value() throws WrongNumber {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_dependency_injection");
        Calculator calculatorBean = applicationContext.getBean(Calculator.class);
        double divide = calculatorBean.divide(50, 0);
        assertThrows(WrongNumber.class, this::Should_get_good_value_if_divide_with_wrong_value); // TODO Jak napisać ten test w junit 5 zeby patrzyło mi ten bląd.
    }

}