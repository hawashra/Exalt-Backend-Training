package com.exalt.training.restMaven.Repo;

import com.exalt.training.restMaven.Models.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepo extends JpaRepository<Car, Long> {
}
