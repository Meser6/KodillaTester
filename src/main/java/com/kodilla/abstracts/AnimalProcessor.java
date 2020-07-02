package com.kodilla.abstracts;

public class AnimalProcessor{
    public void process (Animal animal){
        System.out.println("Animal have " + animal.numberOfLegs + " legs.");
        animal.giveVoice();
    }
}
