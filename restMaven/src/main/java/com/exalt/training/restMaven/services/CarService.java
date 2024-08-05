package com.exalt.training.restMaven.services;

import com.exalt.training.restMaven.Models.Car;
import com.exalt.training.restMaven.Repo.CarRepo;
import com.exalt.training.restMaven.Repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CarService {

    @Autowired
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



}
