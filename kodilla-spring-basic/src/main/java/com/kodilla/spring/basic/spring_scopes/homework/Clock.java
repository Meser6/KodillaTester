package com.kodilla.spring.basic.spring_scopes.homework;

import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
public class Clock {

    public LocalTime localTime(){
        return localTime();
    }
}
