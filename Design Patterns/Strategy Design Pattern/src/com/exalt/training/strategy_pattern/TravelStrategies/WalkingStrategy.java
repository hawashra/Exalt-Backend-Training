package com.exalt.training.strategy_pattern.TravelStrategies;

public class WalkingStrategy implements TravelStrategy {
    @Override
    public void calculateRoute() {
        System.out.println("Calculating Route for Walking");
    }
}
