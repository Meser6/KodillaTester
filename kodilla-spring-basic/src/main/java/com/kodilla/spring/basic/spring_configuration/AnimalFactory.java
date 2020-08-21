package com.kodilla.spring.basic.spring_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Random;

@Configuration
public class AnimalFactory {

    @Bean
    public Dog createDog() {
        return new Dog();
    }

    @Bean
    public Cat createCat() {
        return new Cat();
    }

    @Bean
    public Duck createDuck() {
        return new Duck();
    }

    @Bean
    public Animal randomAnimal() {
        Animal animal = null;
        Random random = new Random();
        int i = random.nextInt(3);
        if (i == 0) {
            animal = new Dog();
        } else if (i == 1) {
            animal = new Cat();
        } else if (i == 2) {
            animal = new Duck();
        }
        return animal;
    }

}
