package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsAplication {
    public static void main(String[] args) {
        Set<Stamps> list = new HashSet<>();
        list.add(new Stamps("Royal", 5, 10, true));
        list.add(new Stamps("Ducal", 4, 10, false));
        list.add(new Stamps("Jubilee", 3, 7, true));
        list.add(new Stamps("Royal", 5, 10, false));
        list.add(new Stamps("Gold", 5, 10, false));
        list.add(new Stamps("Gold", 5, 10, false));

        System.out.println("Set size: " + list.size());
        for(Stamps set : list){
            System.out.println("------------");
            System.out.println(set.toString());
        }
    }

}
