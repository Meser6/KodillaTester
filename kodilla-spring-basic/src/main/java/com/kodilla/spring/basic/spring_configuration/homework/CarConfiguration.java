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
        Car car;
        switch (season) {
            case ("Winter"):
            case ("winter"):
                car = new SUV();
                break;
            case ("Summer"):
            case ("summer"):
                car = new Cabrio();
                break;
            case ("Spring"):
            case ("spring"):
            case ("Autumn"):
            case ("autumn"):
                car = new Sedan();
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + season);
        }
        return car;
    }

    @Bean
    public boolean lights(int hour) {
        return hour >= 6 && hour <= 20;
    }
}
