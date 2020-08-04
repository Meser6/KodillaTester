package com.kodilla.parametrized_tests.execution_model.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Shop {

    public List<Order> orders = new ArrayList<>();

    public void addOrder(Order order) {
        this.orders.add(order);
    }

    public List<Order> getOrdersBetweenTwoDates(LocalDate from, LocalDate to) {
        return this.orders
                .stream()
                .filter(o -> o.getOrderDate().isAfter(from) && o.getOrderDate().isBefore(to))
                .collect(Collectors.toList());
    }

    public List<Order> getOrdersBetweenTwoValues(int min, int max) {
        return this.orders
                .stream()
                .filter(o -> o.getOrderValue() >= min && o.getOrderValue() <= max)
                .collect(Collectors.toList());
    }

    public int getQuantityOfOrders() {
        return this.orders.size();
    }

    public int sumValue() {
        int x = 0;
        for (Order order : orders) {
            x += order.getOrderValue();
        }
        return x;
    }

}
