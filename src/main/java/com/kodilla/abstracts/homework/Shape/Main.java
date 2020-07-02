package com.kodilla.abstracts.homework.Shape;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(4, 5);
        rectangle.about();
        Shape square = new Square(5);
        square.about();
        Shape hexagon = new Hexagon(9);
        hexagon.about();
        Shape cricle = new Circle(5);
        cricle.about();


    }
}
