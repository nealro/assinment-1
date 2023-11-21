package com.name.module2;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(5.0));
        shapes.add(new Triangle(4.0, 3.0));

        for (TwoDShape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println(shape.toString());
            System.out.println("---------------");
        }
    }
}
