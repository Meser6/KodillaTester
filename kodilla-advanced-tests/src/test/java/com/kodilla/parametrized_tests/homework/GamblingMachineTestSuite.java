package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/GoodNumbers.csv")
    public void should_check_wins_works(int value1, int value2, int value3, int value4, int value5, int value6)
            throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(value1);
        set.add(value2);
        set.add(value3);
        set.add(value4);
        set.add(value5);
        set.add(value6);
        int x = gamblingMachine.howManyWins(set);
        Assertions.assertTrue(x <= 6);
        Assertions.assertTrue(x >= 0);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/WrongNumbers.csv")

    public void should_error_if_add_bad_values_only_numbers(int value1, int value2, int value3, int value4, int value5, int value6) {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(value1);
        set.add(value2);
        set.add(value3);
        set.add(value4);
        set.add(value5);
        set.add(value6);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });

    }

    @Test
    public void should_error_if_add_one_good_value() {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(5);
        Assertions.assertThrows(InvalidNumbersException.class, () -> {
            gamblingMachine.howManyWins(set);
        });
    }

    @Test
    public void should_computer_add_good_values()  {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = gamblingMachine.getGenerateComputerNumbers();
        Assertions.assertEquals(6, set.size());
        Assertions.assertTrue(Collections.max(set) <= 50);
        Assertions.assertTrue(Collections.min(set) > 0);
    }
}
