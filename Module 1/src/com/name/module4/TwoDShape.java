package com.name.module4;

public abstract class TwoDShape {
    //fields for TwoDShape
    double width;
    double height;
    color colour;
    //setter for height and width of shape
    public TwoDShape(double width, double height) {
        this.width = width;
        this.height = height;

    }

    public TwoDShape() {
    }

    //setters and getters for width and height of shape
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    //getter for area
    public abstract double getArea();

    //finds shape color
    public color color () {
        return colour;
    }
}

