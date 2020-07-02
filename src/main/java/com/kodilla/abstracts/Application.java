package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 6;
        int b = 7;
        int addResult = calculator.add(a, b);
        boolean correctAdd = ResultChecker.assertEquals(13, addResult);
        if (correctAdd) {
            System.out.println("Metoda add działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda add nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int subResult = calculator.sub(a, b);
        boolean correctSub = ResultChecker.assertEquals(-1, subResult);
        if (correctAdd) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }
        int powResult = calculator.pow(a);
        boolean correctPow = ResultChecker.assertEquals(36, powResult);
        if (correctPow) {
            System.out.println("Metoda pow działa poprawnie dla liczby " + a);
        } else {
            System.out.println("Metoda pow nie działa poprawnie dla liczby " + a);
        }
    }
}
