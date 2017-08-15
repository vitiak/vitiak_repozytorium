package com.kodilla.testing.shape;

import java.util.ArrayList;

public interface Shape {
    String getShapeName(){}
    double getField() {}
}

class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return 3.14 * 2*2;
    }
}

class Rectangle implements Shape {

    public String getShapeName() {
        return "Rectangle";
    }

    public double getField() {
        return 2 * 2 / 2;
    }
}

class Square implements Shape {

    public String getShapeName() {
        return "Square";
    }

    public double getField() {
        return 2 * 2;
    }
}

class ShapeCollector {
    private Shape shape;

    ArrayList<Shape> shapeList = new ArrayList<Shape>();
    public void addFigure(Shape shape) {

    }

    public void removeFigure(Shape shape) {

    }

    public Shape getFigure(int n) {
        return null;
    }

    public void showFigures() {

    }
}

