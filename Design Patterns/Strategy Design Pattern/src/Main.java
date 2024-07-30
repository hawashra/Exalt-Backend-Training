import TravelStrategies.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
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