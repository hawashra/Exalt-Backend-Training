package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.Models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.exalt.training.restMaven.services.CarService;

import java.util.List;

@RestController
//@RequestMapping("/cars")

/**
 * Car controller,
 * contains methods that call the car service methods
 */

public class CarController {

    private final CarService carService;

    public CarController(final CarService carService) {
        this.carService = carService;
    }

    //cars
    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }
    //cars/{id}
    @GetMapping("/car/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id).orElseThrow();
    }

    //cars
    @PostMapping("/cars")
    public String addCar(@RequestBody Car car) {
        carService.addCar(car);
        return "Car created successfully";
    }
    //cars/{id}
    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "Car deleted successfully";
    }
    //cars/{id}
    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }
}
