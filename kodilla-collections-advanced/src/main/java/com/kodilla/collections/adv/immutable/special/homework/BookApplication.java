package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication extends BookManager {
    public static void main(String[] args) {
        Book one = createBook("XXX", "YYY");
        Book two = createBook("YYY", "ZZZ");
        Book three = createBook("XXX", "YYY");
        boolean address = one == two;
        System.out.println("The same address - " + address);
        boolean addressList = lists.get(0) == lists.get(2);
        System.out.println("List address: " + address);
    }
}
