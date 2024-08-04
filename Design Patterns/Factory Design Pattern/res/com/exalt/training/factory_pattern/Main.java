package com.exalt.training.factory_pattern;


import com.exalt.training.factory_pattern.factories.ShapeFactory;
import com.exalt.training.factory_pattern.products.Shape;

public class Main {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        Shape square = shapeFactory.getShape("square");
        Shape circle = shapeFactory.getShape("circle");
        
        square.draw();
        circle.draw();

    }
}