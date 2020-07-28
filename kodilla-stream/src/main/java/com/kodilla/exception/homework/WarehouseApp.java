package com.kodilla.exception.homework;

import java.util.Scanner;

public class WarehouseApp {
    public static void main(String[] args) {

        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("5"));
        warehouse.addOrder(new Order("6"));
        warehouse.addOrder(new Order("7"));
        warehouse.addOrder(new Order("8"));
        warehouse.addOrder(new Order("9"));
        warehouse.addOrder(new Order("10"));

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your orders number: ");
            String order = scanner.nextLine();
            try {
                System.out.println("Your orders number: " + warehouse.getOrder(order));
                break;
            } catch (Exception e) {
                System.out.println("Bad orders number");
            }
        }
    }
}