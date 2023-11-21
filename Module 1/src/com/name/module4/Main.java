package com.name.module4;



import java.util.ArrayList;
import java.util.List;

public class Main {
    //creates an arraylist that contains cirlce and triangle shapes
    public static void main(String[] args) {
        List<TwoDShape> shapes = new ArrayList<>();
        shapes.add(new Circle(6.0));
        shapes.add(new Triangle(3.0, 7.0));
        //prints area and radius/height of shapes
        for (TwoDShape shape : shapes) {
            System.out.println("Area: " + shape.getArea());
            System.out.println(shape.toString());
            System.out.println("---------------");
        }
    }
}
