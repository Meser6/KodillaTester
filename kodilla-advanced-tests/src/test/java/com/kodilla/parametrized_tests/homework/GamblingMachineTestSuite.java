package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import java.util.HashSet;
import java.util.Set;

public class GamblingMachineTestSuite {

    @ParameterizedTest
    @CsvFileSource(resources = "/myNumber.csv")
    public void test(int value1,int value2,int value3,int value4,int value5,int value6) throws InvalidNumbersException {
        GamblingMachine gamblingMachine = new GamblingMachine();
        Set<Integer> set = new HashSet<>();
        set.add(value1);
        set.add(value2);
        set.add(value3);
        set.add(value4);
        set.add(value5);
        set.add(value6);
        int x  = gamblingMachine.howManyWins(set);
        Assertions.assertTrue(x <=6);
        Assertions.assertTrue(x >=0);



    }
}
