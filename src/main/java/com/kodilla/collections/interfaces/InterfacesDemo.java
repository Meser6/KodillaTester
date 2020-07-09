package com.kodilla.collections.interfaces;

public class InterfacesDemo {
    public static void main(String[] args) {
        Shape square = new Square(10.00);
        showShapeDetails(square);
        Shape circle = new Circle(7);
        showShapeDetails(circle);
        Shape triangle = new Triangle(10, 10, Math.sqrt(200));
        showShapeDetails(triangle);

    }
    public static void showShapeDetails(Shape shape){
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
