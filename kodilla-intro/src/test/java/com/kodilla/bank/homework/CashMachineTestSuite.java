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
        cashMachine.add(-13);
        cashMachine.add(60);
        cashMachine.add(69);
        cashMachine.add(0);

        int[] operation = cashMachine.getOperation();
        assertEquals(2, operation.length);
        assertEquals(-50, operation[0]);
        assertEquals(60, operation[1]);
    }

    @Test
    public void howManyOperations() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(10);
        cashMachine.add(19);
        cashMachine.add(0);
        cashMachine.add(-50);
        cashMachine.add(-16);

        assertEquals(2, cashMachine.howManyOperation());
    }

    @Test
    public void howManyPayment() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(50);
        cashMachine.add(12);
        cashMachine.add(0);
        cashMachine.add(-10);
        cashMachine.add(-19);
        assertEquals(50, cashMachine.howManyPayment(), 0.01);
    }

    @Test
    public void howManyPayoff() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-30);
        cashMachine.add(-12);
        cashMachine.add(0);
        cashMachine.add(50);
        cashMachine.add(89);
        assertEquals(-30, cashMachine.howManyPayoff(), 0.01);
    }

    @Test
    public void finaleBalance() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-40);
        cashMachine.add(-15);
        cashMachine.add(0);
        cashMachine.add(90);
        cashMachine.add(61);
        assertEquals(50, cashMachine.balance());
    }

    @Test
    public void averageOfPayment() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(40);
        cashMachine.add(50);
        cashMachine.add(51);
        cashMachine.add(0);
        cashMachine.add(-30);
        cashMachine.add(-31);
        assertEquals(45, cashMachine.averageOfPayment(), 0.01);
    }

    @Test
    public void averageOfPaymentWithZeroOperation() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.averageOfPayment(), 0.01);
    }

    @Test
    public void averageOfPayoff() {
        CashMachine cashMachine = new CashMachine();
        cashMachine.add(-50);
        cashMachine.add(-100);
        cashMachine.add(0);
        cashMachine.add(15);
        cashMachine.add(60);
        assertEquals(-75, cashMachine.averageOfPayoff(), 0.01);

    }

    @Test
    public void averageOfPayoffWithZeroOperation() {
        CashMachine cashMachine = new CashMachine();
        assertEquals(0, cashMachine.averageOfPayoff(), 0.01);
    }
}
