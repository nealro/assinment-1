package com.name.module3;



import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(3.0));
        shapes.add(new Triangle(5.0, 7.0));

        for (TwoDShape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println(shape.toString());
            System.out.println("---------------");
        }
    }
}
