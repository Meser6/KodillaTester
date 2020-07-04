package com.kodilla.abstracts.homework.Shape;

public class Hexagon extends Shape {

    public Hexagon(int a) {
        super("Hexagon");
        this.a = a;

    }

    private int a = 5;

    @Override
    public double area() {
        return 6 * ((Math.pow(a, 2) * Math.sqrt(3)) / 4);
    }

    @Override
    public double circuit() {
        return 6 * a;
    }

}
