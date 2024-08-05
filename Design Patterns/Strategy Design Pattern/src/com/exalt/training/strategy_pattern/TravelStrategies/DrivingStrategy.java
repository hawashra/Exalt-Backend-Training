package com.exalt.training.strategy_pattern.TravelStrategies;

public class DrivingStrategy implements TravelStrategy {

    @Override
    public void calculateRoute() {
        System.out.println("Calculating Route for Driving");
    }
}