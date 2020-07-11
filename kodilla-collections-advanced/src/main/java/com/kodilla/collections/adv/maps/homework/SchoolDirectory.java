package com.kodilla.collections.adv.maps.homework;

import java.util.HashMap;
import java.util.Map;

public class SchoolDirectory {
    public static void main(String[] args) {
        Map<Principal, School> principalMap = new HashMap<>();
        Principal kuba = new Principal("Jakub", "Kaczmarczyk");
        Principal gosia = new Principal("Małgorzata", "Kutarba");
        Principal ola = new Principal("Aleksandra", "Zdeb");
        Principal piotr = new Principal("Piotr", "Skrobich");

        School firstSchool = new School("I LO", 3, 5, 9);
        School secondSchool = new School("II LO", 10, 30, 19);
        School thirdSchool = new School("III LO", 18, 19, 12);
        School fourthSchool = new School("IV LI", 18, 19, 12);

        principalMap.put(kuba, firstSchool);
        principalMap.put(gosia, thirdSchool);
        principalMap.put(ola, fourthSchool);
        principalMap.put(piotr, secondSchool);

        for (Map.Entry<Principal, School> schools : principalMap.entrySet())
            System.out.println(schools.getKey() + " is principal in " + schools.getValue() + " and he care about " + schools.getValue().getSum() + " students.");


    }
}
