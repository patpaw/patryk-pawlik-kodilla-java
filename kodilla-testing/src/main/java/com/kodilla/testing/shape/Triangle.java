package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double field;
    private double height;
    private double sideLength;

    public Triangle(double height, double sideLength) {
        this.height = height;
        this.sideLength = sideLength;
    }

    private String getShapeName(){
        return name;
    };

    private double getField() {
        field = 0.5 * height * sideLength;
        return field;
    }
}
