package com.kodilla.testing.shape;

import java.util.ArrayList;

public class ShapeCollector {
    public addFigure(Shape shape);

    public removeFigure(Shape shape);

    public getFigure(int n);

    public showFigure();

    ArrayList<Shape> figures = new ArrayList<>();
    figures.add(new Circle(5.0));
    figures.add(new Square(4.0));
    figures.add(new Triangle(5.0, 6.0));


}
