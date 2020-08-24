package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        ShippingCenter shippingCenter = context.getBean(ShippingCenter.class);
        System.out.println(shippingCenter.sendPackage("Hill Street 11, New York", 18.2));
    }
}