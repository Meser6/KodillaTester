package com.kodilla.collections.sets;

import java.util.HashSet;
import java.util.Set;

public class OrderAplication {
    public static void main(String[] args) {

        Set<Order> list = new HashSet<>();
        list.add(new Order("1/20190", "Iron", 1));
        list.add(new Order("2/20190", "Cutlery", 6));
        list.add(new Order("3/20190", "Chair", 1));
        list.add(new Order("1/20190", "Iron", 1));

        System.out.println("List size: " + list.size());
        for (Order order : list){
            System.out.println(order.toString());
        }
    }
}
