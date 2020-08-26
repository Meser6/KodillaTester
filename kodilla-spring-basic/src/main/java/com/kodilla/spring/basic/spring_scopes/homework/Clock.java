package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {

    public LocalTime localTime() throws InterruptedException {
        Thread.sleep(10);
        LocalTime now = LocalTime.now();
        System.out.println(now);
        return now;
    }

}