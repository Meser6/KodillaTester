package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class CarConfiguration {

    @Bean
    public SUV suv() {
        return new SUV();
    }

    @Bean
    public Cabrio cabrio() {
        return new Cabrio();
    }

    @Bean
    public Sedan sedan() {
        return new Sedan();
    }

    @Bean
    public Car seasonCar() {
        Car car;
     /*   switch (Season.random()) {
            case (WINTER):
                car = new SUV();
                break;
            case (SUMMER):
                car = new Cabrio();
                break;
            case (AUTUMN):
            case (SPRING):
                car = new Sedan();
                break;
            default:
                throw new IllegalStateException();
        }

      */
        return new Sedan();
    }

    @Bean
    public boolean lights() {
        return true;
    }

    private enum Season {
        WINTER,
        SPRING,
        SUMMER,
        AUTUMN;

        public static Season random() {
            int index = new Random().nextInt(4);
            return Season.values()[index];
        }

        ;
    }
}
