package com.exalt.training.restMaven.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "car_id")
    private Car car;

    @ManyToOne
    @JoinColumn(name = "client_id") // foreign key
    private Client client;

    @Column
    private LocalDate startDate;
    @Column
    private LocalDate endDate;
    @Column
    private int reservationCost;

    public Reservation(Car car, Client client, LocalDate startDate, LocalDate endDate) {
        this.car = car;
        this.client = client;
        this.reservationCost = calculateCost();
        this.startDate = startDate;
        this.endDate = endDate;
    }

    private int calculateCost() {
        return (int) (startDate.until(endDate).getDays() * car.getReservationCostPerDay());
    }
}
