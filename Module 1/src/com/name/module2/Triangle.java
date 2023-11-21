package com.name.module2;

public class Triangle extends TwoDShape  {
    private double side1;
    private double side2;
    private double side3;

    public Triangle(double width, double height) {
        super(width, height);
        this.height = height;
        this.width = width;
    }

    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
    }

    private double heronsHeight() {
        // Heron's formula for triangle area: Area = sqrt(s * (s - a) * (s - b) * (s - c))
        double s = (side1 + side2 + side3) / 2;
        return 2 / side1 * Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    //getArea calculates are of triangle
    public double getArea() {
        return 0.5 * width * height;
    }
        //toString used to print triangle height
    public String toString() {
        return "Triangle Height = " + height;
    }
}
