package com.kodilla.spring.basic.spring_configuration.homework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/*
4. W klasie konfiguracyjnej utwórz metodę, która będzie zwracać beana w zależności od pory roku. Jeśli jest lato, chcemy
 jeździć kabrioletem, zimą SUVem, wiosną i jesienią sedanem.

 Dodatkowo, samochód powinien mieć włączone światła, jeśli
 godzina jest w zakresie 20:00 – 06:00.
 */

@Configuration
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
    public Car seasonCar(String season) {
        Car car = null;
        switch (season) {
            case ("Winter"):
                car = new SUV();
                break;
            case ("Summer"):
                car = new Cabrio();
                break;
            case ("Spring"):
                car = new Sedan();
                break;
            case ("Autumn"):
                car = new Sedan();
                break;
        }
        return car;
    }

    @Bean
    public boolean lights(int hour) {
        if (hour >= 6 && hour <= 20) {
            return true;
        } else return false;
    }


}
