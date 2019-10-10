package com.kodilla.testing.shape;

public class Circle implements Shape {
    private String name;
    private double field;
    private double radius;
    private double piNumber = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    private String getShapeName(){
        return name;
    };

    private double getField() {
        field = 2 * piNumber * radius;
        return field;
    }
}
