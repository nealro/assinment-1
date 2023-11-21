package com.name.module3;

public final class Circle extends TwoDShape {
    public final double PI = Math.PI;
    private final double radius;

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    //getArea calculates are of circle
    public double getArea() {
        return PI * radius * radius;
    }

    //toString prints circle radius
    public String toString() {
        return "Circle Radius = " + radius;
    }
}