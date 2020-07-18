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

    public int howManyPayment() { // wylicza ilosc wplaconej gotowki
        int payment = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] > 0) {
                payment += operations[i];
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
        if (howMuchPayment == 0)
            return 0;
        else
            return howManyPayment() / howMuchPayment;
    }

    public int howManyPayoff() { // wylicza ilosc wyplaconej gotowki
        int payoff = 0;
        for (int i = 0; i < operations.length; i++) {
            if (operations[i] < 0) {
                payoff += operations[i];
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
        if (howMuchPayoff == 0)
            return 0;
        else
            return howManyPayoff() / howMuchPayoff;
    }

    public int balance() {
        return howManyPayment() + howManyPayoff();
    }

}
