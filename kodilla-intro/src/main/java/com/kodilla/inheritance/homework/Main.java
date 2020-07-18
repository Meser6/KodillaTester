package com.kodilla.inheritance.homework;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.println("Enter your system production date:");
        Aktualizacja one = new Aktualizacja(year.nextInt(), 6);
        if (one.systemYear >2010){
            one.turnOn();
        } else {
            one.turnOff();
        }
        one.compatibileSystem();
        one.aktualizacja();
    }
}
