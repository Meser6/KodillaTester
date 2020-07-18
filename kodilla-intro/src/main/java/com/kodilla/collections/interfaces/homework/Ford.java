package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    int speed;
    private final int a;

    public Ford(int a) {
        this.a = a;
    }

    @Override
    public int increaseSpeed() {
        return speed += a;
    }

    @Override
    public void decreaseSpeed() {
        speed -= 20;
    }

    @Override
    public void carSpeed() {
        System.out.println("Ford speed: " + speed + " km/h");
    }
}
