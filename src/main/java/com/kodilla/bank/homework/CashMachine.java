package com.kodilla.bank.homework;

public class CashMachine {
    private int[] operations;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.operations = new int[0];
    }

    public void add(int value) {
        if (value != 0 && value % 10 == 0) {
            this.size++;
            int[] newTab = new int[this.size];
            System.arraycopy(operations, 0, newTab, 0, operations.length);
            newTab[this.size - 1] = value;
            this.operations = newTab;
        }
    }


    public int[] getOperation() {
        return operations;
    }


    public int howManyOperation() {
        return this.operations.length;
    }

    public int howManyPayment() {
        int payment = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] > 0) {
                payment = operations[i] + payment;
            }
        }
        return payment;
    }

    public double averageOfPayment() {
        int howMuchPayment = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] > 0) {
                howMuchPayment++;
            }
        }
        return howManyPayment() / howMuchPayment;
    }

    public int howManyPayoff() {
        int payoff = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] < 0) {
                payoff = operations[i] + payoff;
            }
        }
        return payoff;
    }

    public double averageOfPayoff() {
        int howMuchPayoff = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] < 0) {
                howMuchPayoff++;
            }
        }
        return howManyPayoff() / howMuchPayoff;
    }

    public int balance() {
        return howManyPayment() + howManyPayoff();
    }

}