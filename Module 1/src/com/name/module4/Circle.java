package com.name.module4;

public final class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private final double radius;
    //setter for radius
    public Circle(double radius) {
        super();
        this.radius = radius;
    }
    //getter for are
    public double getArea() {
        return PI * radius * radius;
    }
    //prints area
    public String toString() {
        return "Circle Radius = " + radius;
    }
}