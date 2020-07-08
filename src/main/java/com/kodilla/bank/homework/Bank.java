package com.kodilla.bank.homework;

public class Bank {

    static int payment;
    static int howManyPayment;
    static int payoff;
    static int howManyPayoff;
    private CashMachine operation;

    public Bank() {
        this.operation = new CashMachine();
    }

    public void addOperation(int operations) {
        this.operation.add(operations);
        if (operations > 0) {
            payment += operations;
            howManyPayment++;
        } else if (operations < 0) {
            payoff += operations;
            howManyPayoff++;
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

    public static double averageOfEveryPayment() {
        if (howManyPayment == 0)
            return 0;
        else
            return payment / howManyPayment;

    }

    public static double averageOfEveryPayoff() {
        if (howManyPayoff == 0)
            return 0;
        else
            return payoff / howManyPayoff;

    }
}