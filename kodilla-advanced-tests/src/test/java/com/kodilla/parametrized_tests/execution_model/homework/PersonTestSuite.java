package com.kodilla.parametrized_tests.execution_model.homework;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class PersonTestSuite {

    @ParameterizedTest
    @MethodSource(value = "com.kodilla.parametrized_tests.execution_model.homework.BMI#persons")
    public void isBMICorrectWithCorrectValues(double height, double weight, String result) {
        Person person = new Person(height, weight);
        Assertions.assertEquals(result, person.getBMI());
    }
}
