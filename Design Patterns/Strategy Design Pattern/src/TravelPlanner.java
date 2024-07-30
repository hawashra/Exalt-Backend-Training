import TravelStrategies.TravelStrategy;

public class TravelPlanner {
    private TravelStrategy travelStrategy;

    public TravelPlanner() {}

    public TravelPlanner(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
    public void setTravelStrategy(TravelStrategy travelStrategy) {
        this.travelStrategy = travelStrategy;
    }
    public void calculateTravelingRoute() {
        travelStrategy.calculateRoute();
    }
}
