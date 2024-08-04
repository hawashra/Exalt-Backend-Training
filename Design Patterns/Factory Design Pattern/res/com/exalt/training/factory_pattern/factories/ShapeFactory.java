package com.exalt.training.factory_pattern.factories;

import com.exalt.training.factory_pattern.products.*;


/**
 * The creator class contains the factory method (for product creation).
 * But that's not the only responsibility of the creator class (ShapeFactory),
 * in real world, the creator class can have core business logic related to the
 * products.
 */

public class ShapeFactory {

    /*
        the getShape() returns an instance of a class that implements the Shape
        interface. We don't care what is the type of the Shape, as we
        would be calling methods that exist in every shape in this particular class,
        and the implementation is inside each Shape's class.

    */
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
