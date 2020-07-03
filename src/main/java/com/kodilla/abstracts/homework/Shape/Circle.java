package com.kodilla.abstracts.homework.Shape;

public class Circle extends Shape {
    public Circle(int r) {
        super("Circle");
        this.r = r;
        about();//TODO Review kdrzazga - please call about() separately, not in constructor
    }
    private int r = 5;

    @Override
    public double area() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public double circuit() {
        return 2*Math.PI*r;
    }


}
