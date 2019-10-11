package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double height;
    private double sideLength;

    public Triangle(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return "Triangle";
    }

    @Override
    public double getField() {
        return height * sideLength / 2;
    }
}
