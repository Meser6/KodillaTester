package com.kodilla.abstracts.homework.Shape;

public class Rectangle extends Shape {

    private int a;
    private int b;

    protected Rectangle(int a, int b) {
        super("Rectangle");
        this.a = a;
        this.b = b;
        about();//TODO Review kdrzazga - please call about() separately, not in constructor
    }

    @Override
    public double area() {
        return a * b;
    }

    @Override
    public double circuit() {
        return 2 * a + 2 * b;
    }

    @Override
    public void about() {
        super.about();
    }
}
