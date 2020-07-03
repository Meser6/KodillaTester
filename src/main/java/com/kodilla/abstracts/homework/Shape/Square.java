package com.kodilla.abstracts.homework.Shape;

public class Square extends Shape {


    private int a;

    protected Square(int a) {
        super("Square");
        this.a = a;
        about();//TODO Review kdrzazga - please call about() separately, not in constructor
    }

    @Override
    public double area() {
        return a * a;
    }

    @Override
    public double circuit() {
        return a * 4;
    }
}
