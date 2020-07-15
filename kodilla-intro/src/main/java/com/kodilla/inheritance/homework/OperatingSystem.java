package com.kodilla.inheritance.homework;

public class OperatingSystem {
    int systemYear;
    static int id;
    public static int osNumber;
    double pi = 3.14;

    public void turnOn() {
        System.out.println("System will be turn on");
    }

    public void turnOff() {
        System.out.println("System will be turn off");
    }

    public OperatingSystem(int systemYear, int id) {
        this.systemYear = systemYear;
        this.id = id;
        osNumber++;
    }
}
