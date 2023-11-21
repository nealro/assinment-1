package com.name.module4;

public class Triangle extends TwoDShape implements Rotate {
    //fields for triangle clas
    private double side1;
    private double side2;
    private double side3;
    //setter for width and height of triangle
    public Triangle(double width, double height) {
        super(width, height);
        this.height = height;
        this.width = width;
    }
    //setter for sides of triangle and sets height using herons formula
    public Triangle(double side1, double side2, double side3) {
        super();
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setHeight(heronsHeight());
    }
    //Uses herons formula to find height of triangle
    private double heronsHeight() {
        // Heron's formula for triangle area: Area = sqrt(s * (s - a) * (s - b) * (s - c))
        double s = (side1 + side2 + side3) / 2;
        return 2 / side1 * Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    //calculates area of triangle
    public double getArea() {
        return 0.5 * width * height;
    }
    //prints height of triangle
    public String toString() {
        return "Triangle Height = " + height;
    }

    @Override
    public void rotate90() {
        System.out.println("Rotating 90 degrees.");
    }

    @Override
    public void rotate180() {
        System.out.println("Rotating 180 degrees.");
    }

    @Override
    public void rotate(double degree) {
        System.out.println("Rotating " + degree + " degrees.");
    }
}
