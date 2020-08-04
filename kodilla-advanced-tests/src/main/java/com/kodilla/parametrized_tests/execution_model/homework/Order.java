package com.kodilla.parametrized_tests.execution_model.homework;

import java.time.LocalDate;

public class Order {

    private int orderValue;
    private LocalDate orderDate;
    private String login;

    public Order(int orderValue, LocalDate orderDate, String login) {
        this.orderValue = orderValue;
        this.orderDate = orderDate;
        this.login = login;
    }

    public int getOrderValue() {
        return orderValue;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public String getLogin() {
        return login;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderValue=" + orderValue +
                ", orderDate=" + orderDate +
                ", login='" + login + '\'' +
                '}';
    }
}
