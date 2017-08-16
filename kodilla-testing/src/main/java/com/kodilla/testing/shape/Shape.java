package com.kodilla.testing.shape;

import java.util.ArrayList;

public interface Shape {
    String getShapeName();
    double getField();
}

class Circle implements Shape {

    public String getShapeName() {
        return "Circle";
    }

    public double getField() {
        return 3.14 * 2*2;
    }
}

class Triangle implements Shape {

    public String getShapeName() {
        return "Triangle";
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
    private String shapeName;
    private double shapeField;
    ArrayList<Shape> shapeList = new ArrayList<>();

    public ShapeCollector() {
        this.shapeName = shapeName;
        this.shapeField = shapeField;
    }

    public void addFigure(Shape shape) {
        shapeList.add(shape);
    }

    public boolean removeFigure(Shape shape) {
        boolean result = false;
        if (shapeList.contains(shape)){
            shapeList.remove(shape);
            result = true;
        }
        return result;

    }

    public Shape getFigure(int n) {
        Shape shape = null;
        if (n >= 0 && n < shapeList.size()) {
            shape = shapeList.get(n);
        }
        return shape;
    }

    public void showFigures() {

    }

    public String getShapeName(Shape shape) {
        return shape.getShapeName();
    }

    public double getShapeField(Shape shape) {
        return shape.getField();
    }

    public int getFigureQuantity() {
        return shapeList.size();
    }
}

