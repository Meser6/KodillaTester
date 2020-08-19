package com.kodilla.spring.basic.dependency_injection.homework;

public class Application {

    public static void main(String[] args) {
        SendService sendService = new SendService();
        ShippingCenter shippingCenter = new ShippingCenter(sendService);
        shippingCenter.sendPackage("Hill Street 11, New York", 18.2);
    }
}
