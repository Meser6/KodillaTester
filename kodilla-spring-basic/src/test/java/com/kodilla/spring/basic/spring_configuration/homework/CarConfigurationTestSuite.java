package com.kodilla.spring.basic.spring_configuration.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CarConfigurationTestSuite {

    @Autowired
    private CarConfiguration car;

    @Test
    public void ShouldGetGoodCarTypeIfGetWinter() {
        Car car1 = car.seasonCar("Winter");
        Assertions.assertEquals("SUV", car1.getCarType());
    }

    @Test
    public void ShouldGetGoodCarTypeIfGetSpring() {
        Car car1 = car.seasonCar("spring");
        Assertions.assertEquals("Sedan", car1.getCarType());
    }

    @Test
    public void ShouldGetTurnOnLightsIfDay() {
        Assertions.assertTrue(car.lights(10));
    }

    @Test
    public void ShouldGetTurnOnLightsIfNight() {
        Assertions.assertFalse(car.lights(1));
    }
}