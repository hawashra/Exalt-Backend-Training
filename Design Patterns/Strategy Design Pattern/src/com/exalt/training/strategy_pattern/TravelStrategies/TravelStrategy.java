package com.exalt.training.strategy_pattern.TravelStrategies;

/**
 Each strategy will implement this interface and implement the logic for the
 calculateRoute() method. The strategy can be changed during runtime.

 */

public interface TravelStrategy {
    void calculateRoute();
}

