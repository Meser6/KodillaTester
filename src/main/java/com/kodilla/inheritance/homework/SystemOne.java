package com.kodilla.inheritance.homework;

public class SystemOne extends OperatingSystem {
    public boolean compatibile() {
        if (systemYear <= 2015) {
            return false;
        } else {
            return true;
        }
    }
    public void compatibileSystem(){
        if (compatibile() == true){
            System.out.println("Your system is compatible with this computer");
        } else {
            System.out.println("Your system is compatible with this computer");
        }
    }
}
