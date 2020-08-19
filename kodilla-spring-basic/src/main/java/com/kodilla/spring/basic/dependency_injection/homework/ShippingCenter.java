package com.kodilla.spring.basic.dependency_injection.homework;

public class ShippingCenter  {

   private SendService sendService;

    public ShippingCenter (SendService sendService){
        this.sendService = sendService;
    }

    public void sendPackage(String address, double weight) {
        if (sendService.deliverPackage(address, weight)) {
            sendService.success(address);
        } else {
            sendService.fail(address);
        }
    }
}
