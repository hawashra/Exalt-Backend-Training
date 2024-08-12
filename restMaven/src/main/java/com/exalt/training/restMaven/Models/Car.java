package com.exalt.training.restMaven.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name = "cars")
public class Car {
    // Attributes
    private String make;
    private String model;
    private int year;
    private String color;
    private int reservationCostPerDay;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Constructor without id
    public Car(String make, String model, int year, String color, int reservationCostPerDay) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.color = color;
        this.reservationCostPerDay = reservationCostPerDay;
    }

}
