package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
        return "Circle";
    }

    @Override
    public double getField() {
        return 2 * radius * Math.PI;
    }
}
