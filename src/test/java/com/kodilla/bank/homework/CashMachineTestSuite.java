package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {
    @Test
    public void zeroLength() {
        CashMachine cashMachine = new CashMachine();
        int[] operation = cashMachine.getOperation();
        assertEquals(0, operation.length);
    }

    @Test
    public void addTwoOperations() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-50);
        cashMachine.add(60);

        int[] operation = cashMachine.getOperation();
        assertEquals(2, operation.length);
        assertEquals(-50, operation[0]);
        assertEquals(60, operation[1]);
    }

    @Test
    public void howManyOperationsAndOthers() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(0);
        cashMachine.add(-50);
        cashMachine.add(20);
        cashMachine.add(-100);

        int[] operation = cashMachine.getOperation();
        assertEquals(5, cashMachine.howManyOperation());
        assertEquals(30, cashMachine.howManyPayment(), 0.01);
        assertEquals(-150, cashMachine.howManyPayoff(), 0.01);
        assertEquals(-120, cashMachine.balance());
        assertEquals(15, cashMachine.averageOfPayment(), 0.01);
        assertEquals(-75, cashMachine.averageOfPayoff(), 0.01);

    }
}


