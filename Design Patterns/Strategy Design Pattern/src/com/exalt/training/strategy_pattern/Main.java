package com.exalt.training.strategy_pattern;

import com.exalt.training.strategy_pattern.TravelStrategies.*;


public class Main {
    public static void main(String[] args) {

        TravelPlanner travelPlanner = new TravelPlanner();
        travelPlanner.setTravelStrategy(new WalkingStrategy());
        travelPlanner.calculateTravelingRoute();

        travelPlanner.setTravelStrategy(new BikingStrategy());
        travelPlanner.calculateTravelingRoute();

        travelPlanner.setTravelStrategy(new DrivingStrategy());
        travelPlanner.calculateTravelingRoute();

    }
}