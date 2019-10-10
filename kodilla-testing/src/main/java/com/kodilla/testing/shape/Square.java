package com.kodilla.testing.shape;

public class Square implements Shape{
    private String name;
    private double field;
    private double sideLength;


    public Square (double sideLength) {
        this.sideLength = sideLength;
    }

    private String getShapeName(){
        return name;
    };

    private double getField() {
        field = sideLength * sideLength;
        return field;
    }

}
