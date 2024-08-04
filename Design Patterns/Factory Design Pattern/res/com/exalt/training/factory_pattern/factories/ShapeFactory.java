package com.exalt.training.factory_pattern.factories;

import com.exalt.training.factory_pattern.products.*;


public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType.equalsIgnoreCase("Square")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("Circle")) {
            return new Circle();
        }
        return null; // no such shape is supported yet.
    }
}
