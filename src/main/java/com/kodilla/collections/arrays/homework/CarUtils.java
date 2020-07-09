package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("-.-.-.-.-.-.-.-.-.-.");
        System.out.println("Car brand: " + getCarBrand(car));
        Random carNumber = new Random();
        System.out.println("Car race number: " + carNumber.nextInt(100));
        System.out.println("Car speed: " + car.increaseSpeed());
    }

    public static String getCarBrand(Car car) {
        if (car instanceof BMW)
            return "BMW";
        else if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Opel)
            return "Opel";
        else
            return "Unknown brand";
    }

}