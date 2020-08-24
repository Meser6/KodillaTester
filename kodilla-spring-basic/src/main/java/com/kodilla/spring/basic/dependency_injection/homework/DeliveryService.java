package com.kodilla.spring.basic.dependency_injection.homework;

import org.springframework.stereotype.Component;

@Component
public class DeliveryService {

    public boolean deliverPackage(String address, double weight) {
        return !(weight > 30);
    }
}