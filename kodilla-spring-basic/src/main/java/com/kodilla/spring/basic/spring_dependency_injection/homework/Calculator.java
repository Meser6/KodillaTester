package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Calculator {

    @Autowired
    private Display display;

    public double add(double a, double b) {
        double x = a + b;
        display.display(x);
        return x;
    }

    public double subtract(double a, double b) {
        double x = a - b;
        display.display(x);
        return x;
    }

    public double multiply(double a, double b) {
        double x = a * b;
        display.display(x);
        return x;
    }

    public double divide(double a, double b) throws WrongNumber {
        if (b != 0.0) {
            double x = a / b;
            display.display(x);
            return x;
        } else {
            throw new WrongNumber();
        }
    }

}
