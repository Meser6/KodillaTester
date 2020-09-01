package com.kodilla.spring.basic.spring_configuration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;
import java.util.List;

class AnimalFactoryTestSuite {

  /*  @Test
   public void Should_get_Dog_if_createDog(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
         Dog dogBean = context.getBean(Dog.class);
         String voice = dogBean.getVoice();
        Assertions.assertEquals("Bark bark", voice);

    }

   */

    @Test
    void randomAnimal() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
        Animal animalBean = (Animal) context.getBean("randomAnimal");
        String x = animalBean.getVoice();
        System.out.println(x);
        List<String> voiceList = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(voiceList.contains(x));
    }

    @Test
    void random23nimal() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
        Animal animalBean = (Animal) context.getBean("randomAnimal");
        String x = animalBean.getVoice();
        System.out.println(x);
        List<String> voiceList = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(voiceList.contains(x));
    }

    @Test
    void random2Animal() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_configuration");
        Animal animalBean = (Animal) context.getBean("randomAnimal");
        String x = animalBean.getVoice();
        System.out.println(x);
        List<String> voiceList = Arrays.asList("Bark bark", "Meow meow", "Quack quack");
        Assertions.assertTrue(voiceList.contains(x));
    }


}