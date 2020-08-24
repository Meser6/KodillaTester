package com.kodilla.spring.basic.dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShippingCenterTestSuite {

    @Autowired
    private DeliveryService deliveryServiceBean;

    @Autowired
    private NotificationService notificationServiceBean;

    @Autowired
    private ShippingCenter shippingCenterBean;

    @Test
    public void Should_delivery_services_is_false_if_weight_is_over_30() {
        boolean x = deliveryServiceBean.deliverPackage("xx", 500);
        Assertions.assertFalse(x);
    }

    @Test
    public void Should_delivery_services_is_true_if_weight_is_smaller_then_30() {
        boolean x = deliveryServiceBean.deliverPackage("xx", 5);
        Assertions.assertTrue(x);
    }

    @Test
    public void Should_get_correct_text_if_used_success() {
        String x = notificationServiceBean.success("X");
        Assertions.assertEquals("Package delivered to: X", x);
    }

    @Test
    public void Should_get_correct_text_if_used_fail() {
        String x = notificationServiceBean.fail("X");
        Assertions.assertEquals("Package not delivered to: X", x);
    }

    @Test
    public void Should_get_correct_text_if_weight_is_bigger_then_30() {
        String x = shippingCenterBean.sendPackage("X", 200);
        Assertions.assertEquals("Package not delivered to: X", x);
    }

    @Test
    public void Should_get_correct_text_if_weight_is_smaller_then_30() {
        String x = shippingCenterBean.sendPackage("X", 2);
        Assertions.assertEquals("Package delivered to: X", x);
    }

}