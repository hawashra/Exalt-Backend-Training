package com.exalt.training.restMaven.Controller;

import com.exalt.training.restMaven.Models.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.exalt.training.restMaven.services.CarService;

import java.util.List;


@RestController
//@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carService.getCars();
    }

    @GetMapping("/cars/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id).orElseThrow();
    }

    @PostMapping("/cars")
    public String addCar(@RequestBody Car car) {
        carService.addCar(car);
        return "Car created successfully";
    }

    @DeleteMapping("/cars/{id}")
    public String deleteCar(@PathVariable Long id) {
        carService.deleteCar(id);
        return "Car deleted successfully";
    }

    @PutMapping("/cars/{id}")
    public Car updateCar(@PathVariable Long id, @RequestBody Car car) {
        return carService.updateCar(id, car);
    }


}
