package com.kodilla.bank.homework;

public class Bank {

    private CashMachine operation;

    public Bank() {
        this.operation = new CashMachine();
    }

    public void addOperation(int operations) {
        if (operations != 0 && operations % 10 == 0) {
            this.operation.add(operations);
        }
    }

    public int howManyOperation() {
        return this.operation.howManyOperation();
    }

    public int balance() {
        return this.operation.balance();
    }

    public int howManyPayment() {
        return this.operation.howManyPayoff();
    }

    public double averageOfPayment() {
        return this.operation.averageOfPayment();
    }

    public double howManyPayoff() {
        return this.operation.averageOfPayoff();
    }


}

