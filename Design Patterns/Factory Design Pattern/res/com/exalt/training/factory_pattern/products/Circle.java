package com.exalt.training.factory_pattern.products;

public class Circle implements Shape {
    private double radius;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    @Override
    public void draw() {
        System.out.println("Drawing shapes.Circle");
    }
}
