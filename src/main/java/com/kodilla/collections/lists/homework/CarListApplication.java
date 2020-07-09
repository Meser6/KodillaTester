package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.BMW;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.ArrayList;

public class CarListApplication {
    public static void main(String[] args) {
        ArrayList<Car> list = new ArrayList<>();
        list.add(new Ford(15));
        Car technicalCar = new Ford(39);
        list.add(technicalCar);
        list.add(new BMW(45));
        list.add(new BMW(66));
        list.add(new Opel(71));
        list.add(new Opel(93));

        for (Car car : list) {
            CarUtils.describeCar(car);
        }
        System.out.println("\n\n\n");
        list.remove(technicalCar);
        list.remove(4);

        for (Car car : list) {
            CarUtils.describeCar(car);
        }
        System.out.println("List size: " + list.size());
    }
}
