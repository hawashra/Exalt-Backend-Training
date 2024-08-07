package com.exalt.training.restMaven.Repo;

import com.exalt.training.restMaven.Models.Car;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityResult;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepo extends JpaRepository<Car, Long> {
}
