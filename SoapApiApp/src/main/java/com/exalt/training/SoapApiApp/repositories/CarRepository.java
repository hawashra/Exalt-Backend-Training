package com.exalt.training.SoapApiApp.repositories;

import com.exalt.training.SoapApiApp.models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
