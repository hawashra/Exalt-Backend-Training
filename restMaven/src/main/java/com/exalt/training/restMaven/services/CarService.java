package com.exalt.training.restMaven.services;

import com.exalt.training.restMaven.Models.Car;
import com.exalt.training.restMaven.Repo.CarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    private final CarRepo carRepo;

    public CarService(CarRepo carRepo) {
        this.carRepo = carRepo;
    }

    public List<Car> getCars() {
        return carRepo.findAll();
    }
    public Optional<Car> getCarById(Long id) {
        return carRepo.findById(id);
    }

    public Car addCar(Car car) {
        return carRepo.save(car);
    }

    public String deleteCar(Long id) {
        carRepo.deleteById(id);
        return "Car deleted successfully";
    }

    public Car updateCar(Long id, Car carInfo) {

        if (carRepo.findById(id).isPresent()) {
            Car car = carRepo.findById(id).get();

            car.setId(carInfo.getId());
            car.setMake(carInfo.getMake());
            car.setModel(carInfo.getModel());
            car.setYear(carInfo.getYear());
            carRepo.save(car);

            return car;
        }
        return null;
    }
}
