package com.kodilla.spring.basic.spring_configuration.homework;

public class SUV implements Car {

    @Override
    public boolean hasHeadlightsTurnedOn(int hour) {
        if (hour >= 6 && hour <= 20) {
            return true;
        } else return false;
    }

    @Override
    public String getCarType() {
        return "SUV";
    }
}
