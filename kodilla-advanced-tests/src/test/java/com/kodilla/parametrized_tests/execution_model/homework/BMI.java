package com.kodilla.parametrized_tests.execution_model.homework;

import com.kodilla.parametrized_tests.homework.Person;
import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

public class BMI {

    static Stream<Arguments> persons() {
        return Stream.of(
                Arguments.of(1.59, 54, "Normal (healthy weight)"),
                Arguments.of(1.98, 65, "Underweight"),
                Arguments.of(1.41, 63, "Obese Class I (Moderately obese)"),
                Arguments.of(1.60, 120, "Obese Class IV (Morbidly Obese)"),
                Arguments.of(2.10, 2.0, "Very severely underweight"),
                Arguments.of(1.50, 250, "Obese Class VI (Hyper Obese)")
        );
    }
}
