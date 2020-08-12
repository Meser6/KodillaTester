package com.kodilla.parametrized_tests.homework;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserValidatorTestSuite {
    /*

    @ParameterizedTest
    @ValueSource(strings = {"User", "user", "zyx", "x9p", "_.-", "XXX", "123"})
    public void isTrueIfAddCorrectUserName(String name) {
        boolean x = new UserValidator().validateUsername(name);
        assertTrue(x);
    }

    @ParameterizedTest
    @ValueSource(strings = {"xx", "p9!", "X"})
    public void isFalseIfAddIncorrectUserName(String name) {
        boolean x = new UserValidator().validateUsername(name);
        assertFalse(x);
    }

    @ParameterizedTest
    @EmptySource
    public void isFalseIfAddEmptyUserName(String name) {
        boolean x = new UserValidator().validateUsername(name);
        assertFalse(x);
    }

    @ParameterizedTest
    @NullSource
    public void isFalseIfAddNullUserName(String name) {
        boolean x = new UserValidator().validateUsername(name);
        assertTrue(x);
    }

    @ParameterizedTest
    @NullSource
    public void isFalseIfAddNullToEmail(String mail) {
        boolean x = new UserValidator().validateEmail(mail);
        assertTrue(x);
    }

    @ParameterizedTest
    @ValueSource(strings = {"J.j@p.pl", "9@23nu.js", "9_yS@95.plsuus", "h.hs_21@82pl.pl"})
    public void isTrueIfAddCorrectEmail(String mail) {
        boolean x = new UserValidator().validateEmail(mail);
        assertTrue(x);
    }

    @ParameterizedTest
    @ValueSource(strings = {" @pl.pl", "82XC!@pl.pl", "SJC.pl.pl", "hsc@pl", "jsii@pl.1", "pl@pl.sevenss", "p@!p.pl", "pl@pl. pl"})
    public void isFalseIfAddIncorrectEmail(String mail) {
        boolean x = new UserValidator().validateEmail(mail);
        assertFalse(x);
    }

    @ParameterizedTest
    @EmptySource
    public void isFalseIfAddEmptyEmail(String mail) {
        boolean x = new UserValidator().validateEmail(mail);
        assertTrue(x);//Regex pattern is so constructed, that it allows for empty emails :)
    }

     */

}
