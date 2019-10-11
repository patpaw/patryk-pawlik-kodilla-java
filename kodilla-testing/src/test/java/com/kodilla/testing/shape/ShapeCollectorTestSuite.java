package com.kodilla.testing.shape;

import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {
    @Test
    public void testAddFigure () {
        //Given
        ShapeCollector underTest = new ShapeCollector();
        Circle circle = new Circle(5);
        //When
        underTest.addFigure(circle);
        //Then
        Shape shape = underTest.getFigure(0);
        Assert.assertEquals(circle, shape);
    }

    @Test
    public void testRemoveFigure () {
        //Given
        ShapeCollector underTest = new ShapeCollector();
        Circle circle = new Circle(5);
        underTest.addFigure(circle);
        //When
        underTest.removeFigure(circle);
        //Then
        Shape shape = underTest.getFigure(0);
        Assert.assertEquals(null, shape);
    }
}
