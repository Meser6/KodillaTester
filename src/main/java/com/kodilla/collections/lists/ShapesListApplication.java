package com.kodilla.collections.lists;

import com.kodilla.collections.interfaces.Square;

import java.util.ArrayList;

public class ShapesListApplication {
    public static void main(String[] args) {
        ArrayList<Square> shapes = new ArrayList<>();
        shapes.add(new Square(10));
        shapes.add(new Square(5));
        shapes.add(new Square(1));

        for (Square square : shapes) {
            if (square.getArea() > 20) {
                System.out.println(square + " have area: " + square.getArea());
            }
        }
    }
}
