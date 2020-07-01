package com.kodilla.abstracts.homework;

public abstract class Shape {
    String name;

    public Shape(String name) {
        this.name = name;
    }

    public abstract double area();

    public abstract double circuit();

    public void about() {
        System.out.println(name + " have: area: " + area() + ", circuit: " + circuit());
    }

}
