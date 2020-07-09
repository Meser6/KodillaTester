package com.kodilla.collections.interfaces.homework;

public class BMW implements Car {
    private int speed;
    private final int a;

    public BMW(int a) {
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
        System.out.println("BMW speed: " + speed + " km/h");
    }
}
