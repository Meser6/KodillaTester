package com.kodilla.spring.basic.spring_scopes.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ClockTestSuite {

    @Test
    public void Should_get_difrence_time(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.spring_scopes.homewor");
        Clock time1 = context.getBean(Clock.class);
        LocalTime time11 = time1.localTime();
        Clock time2 = context.getBean(Clock.class);
        LocalTime time22 = time1.localTime();
        Clock time3 = context.getBean(Clock.class);
        LocalTime time33 = time1.localTime();
        Assertions.assertNotEquals(time11, time22);
        Assertions.assertNotEquals(time33, time22);
        Assertions.assertNotEquals(time33, time11);
    }

}