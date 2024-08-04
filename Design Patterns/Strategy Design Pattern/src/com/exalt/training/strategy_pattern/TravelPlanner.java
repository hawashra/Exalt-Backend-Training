package com.exalt.training.strategy_pattern;

import com.exalt.training.strategy_pattern.TravelStrategies.TravelStrategy;

public class TravelPlanner {

    // travel strategy field
    private TravelStrategy travelStrategy;

    public TravelPlanner() {}

    public TravelPlanner(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }

    /* call the calculateRoute() method from the travelStrategy instance,
        the instance can be changed to a different strategy during runtime.
     */
    public void calculateTravelingRoute() {
        travelStrategy.calculateRoute();
    }
}
