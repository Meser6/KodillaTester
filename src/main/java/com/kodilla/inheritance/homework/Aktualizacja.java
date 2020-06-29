package com.kodilla.inheritance.homework;

public class Aktualizacja extends SystemOne {
    public void aktualizacja(){
        if (compatibile() == true && year >2018){
            System.out.println("Your system version is current");
        } else if (compatibile() == true && year <= 2018  && year >= 2015){
            System.out.println("Your system version isn't current, but it works ");
        } else {
            System.out.println("Your system is too old.");
        }
    }
}
