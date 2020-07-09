package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random howManyCars = new Random();
        Car[] cars = new Car[howManyCars.nextInt(15) + 1];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random identification = new Random();
        int carsIdentification = identification.nextInt(3);
        int speed = new Random().nextInt(200);
        if (carsIdentification == 0)
            return new BMW(speed);
        else if (carsIdentification == 1)
            return new Ford(speed);
        else
            return new Opel(speed);
    }
}
