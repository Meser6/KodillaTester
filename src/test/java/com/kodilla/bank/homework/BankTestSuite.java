package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {
    @Test
    public void nonOpeartion() {
        Bank bank = new Bank();
        assertEquals(0, bank.balance());
    }

    @Test
    public void goodOperation() {
        Bank bank = new Bank();
        bank.addOperation(-50);
        bank.addOperation(50);
        bank.addOperation(100);
        bank.addOperation(-70);
        assertEquals(30, bank.balance());
    }

    @Test
    public void nonEveryOperationGood() {
        Bank bank = new Bank();
        bank.addOperation(-90);
        bank.addOperation(60);
        bank.addOperation(0);
        bank.addOperation(-8);
        bank.addOperation(12);
        assertEquals(-30, bank.balance());
    }
}