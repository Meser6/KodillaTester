package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Car opel = new Opel(20);
        doRace(opel);
        Car ford = new Ford(40);
        doRace(ford);
        Car BMW = new BMW(60);
        doRace(BMW);

    }

    private static void doRace(Car car) {
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.increaseSpeed();
        car.carSpeed();
    }

}

