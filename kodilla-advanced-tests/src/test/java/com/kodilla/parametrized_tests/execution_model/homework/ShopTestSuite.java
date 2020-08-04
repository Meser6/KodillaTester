package com.kodilla.parametrized_tests.execution_model.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import java.time.LocalDate;
import java.util.List;

public class ShopTestSuite {

    Shop shop = new Shop();

    Order o1 = new Order(25, LocalDate.of(2020, 11, 25), "XXX");
    Order o2 = new Order(57, LocalDate.of(2014, 6, 5), "YYY");
    Order o3 = new Order(75, LocalDate.of(2017, 10, 22), "ZZZ");
    Order o4 = new Order(134, LocalDate.of(2018, 1, 17), "AAA");
    Order o5 = new Order(16, LocalDate.of(2013, 1, 1), "OOO");

    @BeforeEach
    public void add() {
        shop.addOrder(o1);
        shop.addOrder(o2);
        shop.addOrder(o3);
        shop.addOrder(o4);
        shop.addOrder(o5);
    }

    @Test
    public void addOrderWorksCorrect() {
        shop.addOrder(new Order(18, LocalDate.of(2010, 10, 10), "LLL"));
        Assertions.assertEquals(6, shop.orders.size());
    }

    @Test
    public void ordersBetweenTwoDates() {
        List<Order> newOrderList = shop.getOrdersBetweenTwoDates(LocalDate.of(2014, 1,
                1), LocalDate.of(2019, 1, 1));
        Assertions.assertEquals(3, newOrderList.size());
        Assertions.assertSame(shop.orders.get(1), newOrderList.get(0));
        Assertions.assertSame(shop.orders.get(2), newOrderList.get(1));
        Assertions.assertSame(shop.orders.get(3), newOrderList.get(2));
    }

    @Test
    public void ordersBetweenTwoDatesNotExist() {
        List<Order> newOrderList = shop.getOrdersBetweenTwoDates(LocalDate.of(2024, 1,
                1), LocalDate.of(2029, 1, 1));
        Assertions.assertTrue(newOrderList.isEmpty());
    }

    @Test
    public void ordersBetweenTwoValues() {
        List<Order> newOrderList = shop.getOrdersBetweenTwoValues(20, 60);
        Assertions.assertEquals(2, newOrderList.size());
        Assertions.assertSame(shop.orders.get(0), newOrderList.get(0));
        Assertions.assertSame(shop.orders.get(1), newOrderList.get(1));
    }

    @ParameterizedTest
    @CsvSource(value = {"200,300", "-200,-100"})
    public void ordersBetweenTwoValuesNotExist(int min, int max) {
        List<Order> newOrderList = shop.getOrdersBetweenTwoValues(min, max);
        Assertions.assertTrue(newOrderList.isEmpty());
    }

    @Test
    public void quantityOfOrdersWorksCorrect() {
        Assertions.assertEquals(5, shop.getQuantityOfOrders());
    }

    @Test
    public void sumValueWorksCorrect() {
        Assertions.assertEquals(307, shop.sumValue());
    }

    @Test
    public void sumValueWitchOutEnyOrder() {
        shop.orders.clear();
        Assertions.assertEquals(0, shop.sumValue());
    }
}
