package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CarConfigurationTestSuite {

    ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");

    @Test
    public void costam(){
        CarConfiguration car = (CarConfiguration) context.getBean("seasonCar");
        Car car1 = car.seasonCar("Winter");
        String x = car1.getCarType();
        System.out.println(x);
        Assertions.assertEquals("SUV", x);
    }

    @Test
    public void dupa(){
        CarConfiguration car = context.getBean(CarConfiguration.class);
        Boolean x = car.lights(10);
        Assertions.assertTrue(x);
    }

    //TODO
}