package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void Should_delivery_services_is_false_if_weight_is_over_30() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        DeliveryService deliveryServiceBean = applicationContext.getBean(DeliveryService.class);
        boolean x = deliveryServiceBean.deliverPackage("xx", 500);
        Assertions.assertFalse(x);
    }

    @Test
    public void Should_delivery_services_is_true_if_weight_is_smaller_then_30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        DeliveryService deliveryServiceBean = context.getBean(DeliveryService.class);
        boolean x = deliveryServiceBean.deliverPackage("xx", 5);
        Assertions.assertTrue(x);
    }

    @Test
    public void Should_get_correct_text_if_used_success() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        NotificationService notificationServiceBean = context.getBean(NotificationService.class);
        String x = notificationServiceBean.success("X");
        Assertions.assertEquals("Package delivered to: X", x);
    }

    @Test
    public void Should_get_correct_text_if_used_fail() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        NotificationService notificationServiceBean = context.getBean(NotificationService.class);
        String x = notificationServiceBean.success("X");
        Assertions.assertEquals("Package not delivered to: X", x);
    }

    @Test
    public void Should_get_correct_text_if_weight_is_bigger_then_30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);
        String x = shippingCenterBean.sendPackage("X", 200);
        Assertions.assertEquals("Package not delivered to: X", x);
    }

    @Test
    public void Should_get_correct_text_if_weight_is_smaller_then_30() {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic.dependency_injection");
        ShippingCenter shippingCenterBean = context.getBean(ShippingCenter.class);
        String x = shippingCenterBean.sendPackage("X", 2);
        Assertions.assertEquals("Package delivered to: X", x);
    }

}